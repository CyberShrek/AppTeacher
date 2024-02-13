package org.vniizht.appteacher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Validated
public class IndexController {

    @GetMapping()
    String index(){
        return "/index.html";
    }

    // Возвращает страницу с обучением по context root приложения.
    // Context root должен быть точно таким же как на сервере приложений.
    @GetMapping("/app/{contextRoot}")
    String initializeTeacher(@PathVariable
                             String contextRoot){


        return "/appteacher.html";
    }

//    @GetMapping("index")
//    String index(){
//
//        System.out.println(1);
//
////        ModelAndView indexPage = new ModelAndView("index");
//
//        return "index.html";
//    }
}
