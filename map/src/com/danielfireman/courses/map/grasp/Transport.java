package com.danielfireman.courses.map.grasp;

import java.io.IOException;

interface Transport {
    void send(Sendable msg) throws IOException;
}