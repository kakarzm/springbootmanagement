package com.lm.controller.plan.basic;

import com.lm.model.plan.basic.CollegeB;
import com.lm.model.plan.basic.Basic;
import com.lm.service.plan.basic.CollegeService;
import com.lm.util.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iii on 2019/2/11.
 */
@RestController
@RequestMapping("/collegebasic")
public class CollegeController {
    @Autowired
    CollegeService collegeService;
    @ApiOperation(value="学校信息保存", notes="学校信息保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)                        //保存方法的路径是/collegebasic/save
    public ResponseEntity<JsonResult> save(CollegeB collegeb){                           //collegeB是类名 在这里用作一个数据类型 collegeb是该数据类型的一个变量
        JsonResult jr = new JsonResult("ok", collegeService.save(collegeb)) ;    //调用service里面的save方法
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="学校信息删除", notes="学校信息删除")
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)                  //返回前台的method用delete
    public ResponseEntity<JsonResult> delete(@PathVariable String id){
        JsonResult jr = new JsonResult("ok", collegeService.del(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="学校信息查询", notes="学校信息查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getList(@RequestParam(value = "title", required=false, defaultValue = "") String title,
                                              @RequestParam(value = "pageNum", required=false, defaultValue = "1") int pageNum,
                                              @RequestParam(value = "pageSize", required=false, defaultValue = "3") int pageSize){
        System.out.println("=========>" + title) ;
        JsonResult jr = new JsonResult("ok", collegeService.getList(title, pageNum, pageSize)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="学校信息更新", notes="学校信息更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(CollegeB collegeb){
        JsonResult jr = new JsonResult("ok",collegeService.update(collegeb)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="学校信息根据ID查询", notes="学校信息根据ID查询")
    @RequestMapping(value = "/searchbyid/{id}", method = RequestMethod.GET)
   public ResponseEntity<JsonResult> searchid(@PathVariable String id){
        JsonResult jr = new JsonResult("ok",collegeService.searchid(id)) ;
        return  ResponseEntity.ok(jr);
    }
}
