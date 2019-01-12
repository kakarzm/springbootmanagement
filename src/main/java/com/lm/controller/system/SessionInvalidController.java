package com.lm.controller.system;

import com.lm.model.RespBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaka on 2018-11-20.
 */

@RestController
@RequestMapping("/session")
public class SessionInvalidController {

    @RequestMapping("/invalid")
    public RespBean sessionInvalid(){
        return new RespBean("error","session过期,请重新登陆") ;
    }
}
