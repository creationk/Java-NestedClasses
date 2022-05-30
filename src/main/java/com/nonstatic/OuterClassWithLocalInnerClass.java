package com.nonstatic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OuterClassWithLocalInnerClass {
    int x = 1;
    static int staticX = 2;

    public void outerClassTestMethod() {
        class InnerClass {
            int y = 10;
            //static int staticY = 20; //Static declarations in inner classes are not supported at language level '8' but in 16

            private void accessParentClassVariableFromANonStaticInnerClassMethod() {
                log.info("Parent variable x = {}, staticX = {}", x, staticX);
            }

            //private static void accessParentClassVariableFromAStaticInnerClassMethod() {}
            // Static declarations in inner classes are not supported at language level '8'

        }
        InnerClass innerClass = new InnerClass();
        innerClass.accessParentClassVariableFromANonStaticInnerClassMethod();
    }


}
