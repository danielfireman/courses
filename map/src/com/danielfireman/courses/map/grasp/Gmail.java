package com.danielfireman.courses.map.grasp;

import java.io.IOException;

/** Implementation and use of a dummy Gmail Transport */
class Gmail implements Transport {
    public void send(Sendable msg) throws IOException {
        if (msg.getSender().contains("gmail.com")) {
            throw new IOException("Server not gmail.");
        }
        System.out.printf("Message Sent: %s\n", msg); 
    }

    static class WithSecurityInheritance extends Gmail {
        public void send(Sendable msg) throws IOException {
            // .. do security checks.
            System.out.println("Gmail security inheritance.");
            super.send(msg);
        }
    }

    static class WithSecurityComposition implements Transport {
        private Transport transport;
        WithSecurityComposition(Transport t) {
            this.transport = t;
        }
        public void send(Sendable msg) throws IOException {
            System.out.println("Gmail security composition.");
            this.transport.send(msg);
        }
    }
}