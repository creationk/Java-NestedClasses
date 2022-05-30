package com.staticinner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OuterClassWithStaticInnerClass {
    int x = 1;
    static int staticX = 2;

    private static class StaticNestedClass {
        int y = 10;
        static int staticY = 20;

        private void accessParentClassVariableFromANonStaticInnerClassMethod() {
            log.info("Parent variable x = {}, staticX = {}", "not accessible", staticX);
            log.info("Variable y = {}, staticY = {}", y, staticY);
        }

        private static void accessParentClassVariableFromAStaticInnerClassMethod() {
            log.info("Parent variable x = {}, staticX = {}", "not accessible", staticX);
            log.info("Variable y = {}, staticY = {}", "not accessible", staticY);
        }
    }

    public void invokeStaticInnerClassStaticMethod() {
        log.info("invoking StaticInnerClass Static Method");
        StaticNestedClass.accessParentClassVariableFromAStaticInnerClassMethod();
    }

    public void invokeStaticInnerClassNonStaticMethod() {
        log.info("invoking StaticInnerClass non Static Method");
        StaticNestedClass nestedClass = new StaticNestedClass();
        nestedClass.accessParentClassVariableFromANonStaticInnerClassMethod();
    }

}
