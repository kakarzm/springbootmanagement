package com.lm.controller.plan.basic;

import com.lm.model.plan.basic.Training;
import com.lm.service.plan.basic.TrainingProjectService;
import com.lm.util.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iii on 2019/2/25.
 */
@RestController
@RequestMapping("/trainingProject")
public class TrainingProjectController {
    @Autowired
    TrainingProjectService traningProjectService;
    @ApiOperation(value="培养目标保存", notes="培养目标保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> save(Training training){
        System.out.println(training.getCollege());
        JsonResult jr = new JsonResult("ok", traningProjectService.save(training)) ;
        for (int i = 0; i < training.getTrainingRequires().length; i++) {
            System.out.println(training.getTrainingRequires()[i]);
        }
        return ResponseEntity.ok(jr);
    }

    @ApiOperation(value="培养目标查询", notes="培养目标查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getList(@RequestParam(value = "title", required=false, defaultValue = "") String title,
                                              @RequestParam(value = "pageNum", required=false, defaultValue = "1") int pageNum,
                                              @RequestParam(value = "pageSize", required=false, defaultValue = "3") int pageSize){
        JsonResult jr = new JsonResult("ok", traningProjectService.getList(title, pageNum, pageSize)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="培养目标删除", notes="培养目标删除")
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)                  //返回前台的method用delete
    public ResponseEntity<JsonResult> delete(@PathVariable String id){
        JsonResult jr = new JsonResult("ok", traningProjectService.del(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="培养目标根据ID查询", notes="培养目标根据ID查询")
    @RequestMapping(value = "/searchbyid/{id}", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> searchid(@PathVariable String id){
        JsonResult jr = new JsonResult("ok",traningProjectService.searchid(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="培养目标更新", notes="培养目标更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(Training training){
        JsonResult jr = new JsonResult("ok",traningProjectService.update(training)) ;
        return  ResponseEntity.ok(jr);
    }

}
