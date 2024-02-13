package org.vniizht.appteacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("demo")
    String getDemo(){
        return "demo.html";
    }
}
