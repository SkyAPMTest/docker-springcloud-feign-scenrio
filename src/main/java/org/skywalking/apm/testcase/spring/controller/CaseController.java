package org.skywalking.apm.testcase.spring.controller;

import javax.servlet.http.HttpServletRequest;
import org.skywalking.apm.testcase.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaseController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = {"/case/spring_cloud_fegin"})
    public ModelAndView asyncCase(HttpServletRequest request) {
        User user = userClient.getUserById("1");
        ModelAndView modelAndView = new ModelAndView("success");
        return modelAndView;
    }

}
