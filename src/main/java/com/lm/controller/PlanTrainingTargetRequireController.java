package com.lm.controller;

import com.lm.service.PlanTrainingTargetRequireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName PlanTrainingTargetRequireController
 * @Description TODO
 * @Author wn
 * @Date 2019/3/31 16:30
 * @Version 1.0
 **/
@RestController
@RequestMapping("/pttr")
public class PlanTrainingTargetRequireController {
    @Autowired
    private PlanTrainingTargetRequireService planTrainingTargetRequireService;
}
