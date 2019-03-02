package com.lm.controller.plan.basic;

import com.github.pagehelper.PageHelper;
import com.lm.model.RespBean;
import com.lm.model.plan.basic.TbEntityCompanyNeed;
import com.lm.service.plan.basic.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/company/basic")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/basicdata", method = RequestMethod.GET)
    public Map<String, Object> getAllBasicData() {
        Map<String, Object> map = new HashMap<>();
        map.put("professions",companyService.getProfessions());
        return map;
    }

    @RequestMapping(value = "/company",method = RequestMethod.POST)
    public RespBean addCompany(TbEntityCompanyNeed companyNeed){
        if (companyService.add(companyNeed)==1){
            return new RespBean("success", "添加成功!");
        }
        return new RespBean("error", "添加失败!");
    }

    @RequestMapping(value = "/company",method = RequestMethod.PUT)
    public RespBean updateCompany(TbEntityCompanyNeed companyNeed){
        if (companyService.update(companyNeed)==1){
            return new RespBean("success", "更新成功!");
        }
        return new RespBean("error", "更新失败!");
    }

    @RequestMapping(value = "/company/{ids}",method = RequestMethod.DELETE)
    public RespBean updateCompany(@PathVariable String ids){
        System.out.println(ids);
        if (companyService.delete(ids)){
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }

    @RequestMapping(value = "/company", method = RequestMethod.GET)
    public Map<String, Object> getCompanyByPage(@RequestParam(defaultValue = "1") Integer page,
                                                    @RequestParam(defaultValue = "10") Integer size,
                                                    @RequestParam(defaultValue = "") String keywords) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page,size);
        List<TbEntityCompanyNeed> CompanyByPage = companyService.getCompanyByPage(page, size, keywords);
        Long count = companyService.getCountByKeywords(keywords);
        map.put("companys", CompanyByPage);
        map.put("count", count);
        return map;
    }
}
