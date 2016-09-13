package com.danielfireman.courses.map.wrappers;

class Path {
    String p;
    Path(String p) {
        this.p = p;
    }
    String get() {
        return this.p;
    }
    String getTipo() {
        return this.p.substring(this.p.lastIndexOf(".") + 1);
    }
}