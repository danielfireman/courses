package com.danielfireman.courses.map.grasp;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Sends messages using many transports.
 */
class Gateway implements Transport {
    List<Transport> transports = new LinkedList<>();

    Gateway() {
        this.transports.add(new Gmail());
        this.transports.add(new Gmail.WithSecurityInheritance());
        this.transports.add(new Sms());
        this.transports.add(new Gmail.WithSecurityComposition(new Gmail()));
    }

    public void send(Sendable msg) throws IOException {
        for (Transport t: transports) {
            t.send(msg);
        }
    }

    public static void main(String []args) {
        Sendable mail = new Email(
            "Hello mom", "Hi mom", "me@mymail.com", Collections.singletonList("mommy@mymail.com"));
        Gateway gateway = new Gateway();
        try {
            gateway.send(mail);
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}