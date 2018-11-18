package com.lm.controller.emp;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lm.common.EmailRunnable;
import com.lm.common.poi.PoiUtils;
import com.lm.model.Employee;
import com.lm.model.Position;
import com.lm.model.RespBean;
import com.lm.service.DepartmentService;
import com.lm.service.EmpService;
import com.lm.service.JobLevelService;
import com.lm.service.PositionService;

/**

 */
@RestController
@RequestMapping("/emp/basic")
public class EmpBasicController {
    @Autowired
    EmpService empService;
    @Autowired
    DepartmentService departmentService;
    @Autowired
    PositionService positionService;
    @Autowired
    JobLevelService jobLevelService;
    @Autowired
    ExecutorService executorService;

    @RequestMapping(value = "/basicdata", method = RequestMethod.GET)
    public Map<String, Object> getAllNations() {
        Map<String, Object> map = new HashMap<>();
        map.put("nations", empService.getAllNations());
        map.put("politics", empService.getAllPolitics());
        map.put("deps", departmentService.getDepByPid(-1L));
        map.put("positions", positionService.getAllPos());
        map.put("joblevels", jobLevelService.getAllJobLevels());
        map.put("workID", String.format("%08d", empService.getMaxWorkID() + 1));
        return map;
    }

    @RequestMapping("/maxWorkID")
    public String maxWorkID() {
        return String.format("%08d", empService.getMaxWorkID() + 1);
    }

    @RequestMapping(value = "/emp", method = RequestMethod.POST)
    public RespBean addEmp(Employee employee) {
        if (empService.addEmp(employee) == 1) {
            List<Position> allPos = positionService.getAllPos();
            for (Position allPo : allPos) {
                if (allPo.getId() == employee.getPosId()) {
                    employee.setPosName(allPo.getName());
                }
            }
            executorService.execute(new EmailRunnable(employee));
            return new RespBean("success", "添加成功!");
        }
        return new RespBean("error", "添加失败!");
    }

    @RequestMapping(value = "/emp", method = RequestMethod.PUT)
    public RespBean updateEmp(Employee employee) {
        if (empService.updateEmp(employee) == 1) {
            return new RespBean("success", "更新成功!");
        }
        return new RespBean("error", "更新失败!");
    }

    @RequestMapping(value = "/emp/{ids}", method = RequestMethod.DELETE)
    public RespBean deleteEmpById(@PathVariable String ids) {
        if (empService.deleteEmpById(ids)) {
            return new RespBean("success", "删除成功!");
        }
        return new RespBean("error", "删除失败!");
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public Map<String, Object> getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, @RequestParam(defaultValue = "") String keywords, Long politicId, Long nationId, Long posId, Long jobLevelId, String engageForm, Long departmentId, String beginDateScope) {
        Map<String, Object> map = new HashMap<>();
        List<Employee> employeeByPage = empService.getEmployeeByPage(page, size, keywords, politicId, nationId, posId, jobLevelId, engageForm, departmentId, beginDateScope);
        Long count = empService.getCountByKeywords(keywords, politicId, nationId, posId, jobLevelId, engageForm, departmentId, beginDateScope);
        map.put("emps", employeeByPage);
        map.put("count", count);
        return map;
    }

    @RequestMapping(value = "/exportEmp", method = RequestMethod.GET)
    public ResponseEntity<byte[]> exportEmp() {
        return PoiUtils.exportEmp2Excel(empService.getAllEmployees());
    }

    @RequestMapping(value = "/importEmp", method = RequestMethod.POST)
    public RespBean importEmp(MultipartFile file) {
        List<Employee> emps = PoiUtils.importEmp2List(file,empService.getAllNations(),empService.getAllPolitics(),departmentService.getAllDeps(),positionService.getAllPos(),jobLevelService.getAllJobLevels());
        if (empService.addEmps(emps) == emps.size()) {
            return new RespBean("success", "导入成功!");
        }
        return new RespBean("error", "导入失败!");
    }
}
