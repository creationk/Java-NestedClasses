package com.nonstatic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OuterClassWithAnonymousInnerClass {
    int x = 1;
    static int staticX = 2;

    Interface i = new Interface() {
        @Override
        public void run() {
            log.info("In anonymous inner class");
        }
    };

    public void runAnonymousClassMethod() {
        i.run();
    }

}

interface Interface {
    void run();
}