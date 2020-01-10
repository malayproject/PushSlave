package com.example.pushSlave.pushSlave.controller;


import com.example.pushSlave.pushSlave.event.impl.BasicEvent;

import java.util.Set;

public interface IController {

    public String health();

    public String pushEvent(BasicEvent event);

}
