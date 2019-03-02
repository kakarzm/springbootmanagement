package com.lm.controller.plan.basic;

import com.github.pagehelper.PageHelper;
import com.lm.model.RespBean;
import com.lm.model.plan.basic.TbEntityIndustryCertificate;
import com.lm.service.plan.basic.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/certificate/basic")
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @RequestMapping(value = "/certificate",method = RequestMethod.POST)
    public RespBean addCertificate(TbEntityIndustryCertificate certificate){
        if (certificateService.add(certificate)==1){
            return new RespBean("success", "添加成功!");
        }
        return new RespBean("error", "添加失败!");
    }

    @RequestMapping(value = "/certificate",method = RequestMethod.PUT)
    public RespBean updateCertificate(TbEntityIndustryCertificate certificate){
        if (certificateService.update(certificate)==1){
            return new RespBean("success", "更新成功!");
        }
        return new RespBean("error", "更新失败!");
    }

    @RequestMapping(value = "/certificate/{ids}",method = RequestMethod.DELETE)
    public RespBean updateCertificate(@PathVariable String ids){
        System.out.println(ids);
        if (certificateService.delete(ids)){
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }

    @RequestMapping(value = "/certificate", method = RequestMethod.GET)
    public Map<String, Object> getCertificateByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, @RequestParam(defaultValue = "") String keywords,
                                                    Integer industryCertificateDept,
                                                    Integer industryCertificateProfession,
                                                    Integer industryCertificateIdentificationSite,
                                                    Integer industryCertificateOrganization,
                                                    Integer industryCertificateAuthenticationType) {
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page,size);
        System.out.println(page+" "+size+" "+industryCertificateDept);
        List<TbEntityIndustryCertificate> certificateByPage = certificateService.getCertificateByPage(page, size, keywords,
                industryCertificateDept,
                industryCertificateProfession,
                industryCertificateIdentificationSite,
                industryCertificateOrganization,
                industryCertificateAuthenticationType);
        Long count = certificateService.getCountByKeywords(keywords, industryCertificateDept,
                industryCertificateProfession,
                industryCertificateIdentificationSite,
                industryCertificateOrganization,
                industryCertificateAuthenticationType);
        map.put("cers", certificateByPage);
        map.put("count", count);
        return map;
    }
}
