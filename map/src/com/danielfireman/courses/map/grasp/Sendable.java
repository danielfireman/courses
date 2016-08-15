package com.danielfireman.courses.map.grasp;

/** Abstracts "something" that could be sent.  */
interface Sendable {

    /** @return message subject. UTF-8 encoded and sanitized. */
    String getSubject();
    /** @return message content. UTF-8 encoded and sanitized. */
    String getContent();
    /** @return message sender. */
    String getSender();
    /** @return message receivers, with no preferred order. */
    Iterable<String> getReceivers();

    /** String version of the message to be printed. */
    default String stringfy() {
        return String.format(
            "From:%s To:%s Subject:\"%s\" Content:\"%s\"\n",
            getSender(), getReceivers(), getSubject(), getContent());
    }
}