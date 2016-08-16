package com.danielfireman.courses.map.grasp;

import java.io.IOException;
import java.util.Collections;

/** Implementation and use of a dummy SMS Transport */
class Sms implements Transport {
    public void send(Sendable msg) throws IOException {
        System.out.printf("SMS Sent: %s\n", msg); 
    }
}