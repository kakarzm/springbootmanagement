package com.lm.controller.plan.basic;

import com.lm.model.plan.basic.MajorBasic;
import com.lm.service.plan.basic.MajorService;
import com.lm.util.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by iii on 2019/2/18.
 */
@RestController
@RequestMapping("/majorbasic")
public class MajorController {
    @Autowired
    MajorService majorService;
    @ApiOperation(value="专业信息保存", notes="专业信息保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> save(MajorBasic majorBasic){
        JsonResult jr = new JsonResult("ok", majorService.save(majorBasic)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="专业信息查询", notes="专业信息查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getList(@RequestParam(value = "title", required=false, defaultValue = "") String title,
                                              @RequestParam(value = "pageNum", required=false, defaultValue = "1") int pageNum,
                                              @RequestParam(value = "pageSize", required=false, defaultValue = "3") int pageSize){
        System.out.println("=========>" + title) ;
        JsonResult jr = new JsonResult("ok", majorService.getList(title, pageNum, pageSize)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="专业信息删除", notes="专业信息删除")
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)                  //返回前台的method用delete
    public ResponseEntity<JsonResult> delete(@PathVariable String id){
        JsonResult jr = new JsonResult("ok", majorService.del(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="专业信息根据ID查询", notes="专业信息根据ID查询")
    @RequestMapping(value = "/searchbyid/{id}", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> searchid(@PathVariable String id){
        JsonResult jr = new JsonResult("ok",majorService.searchid(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="专业信息更新", notes="专业信息更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(MajorBasic majorBasic){
        JsonResult jr = new JsonResult("ok",majorService.update(majorBasic)) ;
        return  ResponseEntity.ok(jr);
    }
}
