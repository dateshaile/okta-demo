package io.okta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OktaController {

    @GetMapping("/public")
    public String publicMsg(){
        return "Public...";
    }

    @GetMapping("/protected")
    public String protectedMsg(){
        return "Protected...";
    }

}
