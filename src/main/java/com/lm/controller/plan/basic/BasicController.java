package com.lm.controller.plan.basic;

import com.lm.model.plan.basic.Basic;
import com.lm.service.plan.basic.BasicService;
import com.lm.util.JsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 *

 */
@RestController
@RequestMapping("/planbasic")
public class BasicController {

    @Autowired
    BasicService basicService;

    @ApiOperation(value="保存", notes="保存")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> save(Basic basic){

        JsonResult jr = new JsonResult("ok", basicService.save(basic)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="查询", notes="查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getList(@RequestParam(value = "title", required=false, defaultValue = "") String title,
                                              @RequestParam(value = "pageNum", required=false, defaultValue = "1") int pageNum,
                                              @RequestParam(value = "pageSize", required=false, defaultValue = "3") int pageSize){
        System.out.println("=========>" + title) ;
        JsonResult jr = new JsonResult("ok", basicService.getList(title, pageNum, pageSize)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="删除", notes="删除")
    @RequestMapping(value = "/del/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> delete(@PathVariable String id){
        JsonResult jr = new JsonResult("ok", basicService.del(id)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="更新", notes="更新")
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(@RequestBody Basic basic){
        JsonResult jr = new JsonResult("ok", basicService.update(basic)) ;
        return  ResponseEntity.ok(jr);
    }

    @ApiOperation(value="获取详情", notes="获取详情")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getDetail(@PathVariable String id){
        JsonResult jr = new JsonResult("ok", basicService.getDetail(id)) ;
        return  ResponseEntity.ok(jr);
    }


}
