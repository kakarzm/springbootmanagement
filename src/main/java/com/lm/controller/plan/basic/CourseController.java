package com.lm.controller.plan.basic;

import com.lm.model.plan.basic.CourseB;
import com.lm.service.plan.basic.CourseService;
import com.lm.util.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iii on 2019/2/18.
 */
@RestController
@RequestMapping("/coursebasic")
public class CourseController {
    @Autowired
    CourseService courseService;
    @ApiOperation(value="课程信息保存", notes="课程信息保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> save(CourseB courseb){
        JsonResult jr = new JsonResult("ok", courseService.save(courseb)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="课程信息查询", notes="课程信息查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getList(@RequestParam(value = "title", required=false, defaultValue = "") String title,
                                              @RequestParam(value = "pageNum", required=false, defaultValue = "1") int pageNum,
                                              @RequestParam(value = "pageSize", required=false, defaultValue = "3") int pageSize){
        System.out.println("=========>" + title) ;
        JsonResult jr = new JsonResult("ok", courseService.getList(title, pageNum, pageSize)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="课程信息删除", notes="课程信息删除")
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)                  //返回前台的method用delete
    public ResponseEntity<JsonResult> delete(@PathVariable String id){
        JsonResult jr = new JsonResult("ok", courseService.del(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="课程信息根据ID查询", notes="课程信息根据ID查询")
    @RequestMapping(value = "/searchbyid/{id}", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> searchid(@PathVariable String id){
        JsonResult jr = new JsonResult("ok",courseService.searchid(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="课程信息更新", notes="课程信息更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(CourseB courseB){
        JsonResult jr = new JsonResult("ok",courseService.update(courseB)) ;
        return  ResponseEntity.ok(jr);
    }
}


