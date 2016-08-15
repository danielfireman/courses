package com.danielfireman.courses.map.grasp;

/** Message data holder. */
class Email implements Sendable {
    String subject;
    String content;
    String sender;
    Iterable<String> receivers;

    Email(String subject, String content, String sender, Iterable<String> receivers) {
        this.subject = subject;
        this.content = content;
        this.sender = sender;
        this.receivers = receivers;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public String getSender() {
        return this.sender;
    }

    @Override
    public Iterable<String> getReceivers() {
        return this.receivers;
    }

    @Override
    public String toString() {
        return stringfy();
    } 
}