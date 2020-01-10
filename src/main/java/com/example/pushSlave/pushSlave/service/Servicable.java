package com.example.pushSlave.pushSlave.service;


import com.example.pushSlave.pushSlave.event.impl.BasicEvent;

import java.net.URISyntaxException;
import java.util.Set;

public interface Servicable {

    public String  processEvent(BasicEvent event);
}
