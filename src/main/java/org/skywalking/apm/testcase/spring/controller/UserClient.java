package org.skywalking.apm.testcase.spring.controller;

import org.skywalking.apm.testcase.spring.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "test", url = "http://localhost:18080/springclound-feign-case")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/rest/{id}")
    User getUserById(@RequestParam("id") String id);
}
