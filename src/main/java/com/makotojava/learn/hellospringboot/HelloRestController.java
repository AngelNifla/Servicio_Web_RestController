package com.makotojava.learn.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hola, este es un Servicio web usando la anotación @RestController.";
  }
}
