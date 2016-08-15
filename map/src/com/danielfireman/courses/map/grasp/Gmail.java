package com.danielfireman.courses.map.grasp;

import java.io.IOException;
import java.util.Collections;

/** Implementation and use of a dummy Gmail Transport */
class Gmail {
    static class GmailTransport implements Transport {
         public void send(Sendable msg) throws IOException {
            if (msg.getSender().contains("gmail.com")) {
                throw new IOException("Server not gmail.");
            }
            System.out.printf("Message Sent: %s\n", msg); 
        }
    }

    public static void main(String []args) {
        Sendable mail = new Email("Hello mom", "Hi mom", "me@mymail.com", Collections.singletonList("mommy@mymail.com"));
        Transport gmail = new GmailTransport();
        try {
            gmail.send(mail);
        } catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}