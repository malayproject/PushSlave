package com.example.pushSlave.pushSlave.controller.impl;

import com.example.pushSlave.pushSlave.controller.IController;
import com.example.pushSlave.pushSlave.event.impl.BasicEvent;
import com.example.pushSlave.pushSlave.service.Servicable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.Set;

@RestController
public class BasicController implements IController {


    @Autowired
    Servicable service;


    @RequestMapping(value="/",method= RequestMethod.GET)
    @Override
    public String health() {
        System.out.println("api");
        return "API IS UP";
    }


    @RequestMapping("/pushEvent")
    @Override
    public String pushEvent( @RequestBody BasicEvent event) {

       return  service.processEvent(event);

    }
}

