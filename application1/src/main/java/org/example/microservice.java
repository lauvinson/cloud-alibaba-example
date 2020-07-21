package org.example;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class microservice {

    @Reference
    private ConsumerService consumerService;

    @GetMapping("/service")
    public String service(){
        return "test" + consumerService.service();
    }
}
