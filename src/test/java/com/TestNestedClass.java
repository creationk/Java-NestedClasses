package com;

import com.nonstatic.OuterClassWithAnonymousInnerClass;
import com.nonstatic.OuterClassWithLocalInnerClass;
import com.nonstatic.OuterClassWithNonStaticInnerClass;
import com.staticinner.OuterClassWithStaticInnerClass;
import org.junit.jupiter.api.Test;

class TestNestedClass {

    @Test
    void testInvokeStaticInnerClassNonStaticMethod() {
        OuterClassWithStaticInnerClass o = new OuterClassWithStaticInnerClass();
        o.invokeStaticInnerClassNonStaticMethod();
    }

    @Test
    void testInvokeStaticInnerClassStaticMethod() {
        OuterClassWithStaticInnerClass o = new OuterClassWithStaticInnerClass();
        o.invokeStaticInnerClassStaticMethod();
    }

    @Test
    void testInvokeNonStaticInnerClassNonStaticMethod() {
        OuterClassWithNonStaticInnerClass o = new OuterClassWithNonStaticInnerClass();
        o.invokeNonStaticInnerClassNonStaticMethod();
    }

    @Test
    void testInvokeLocalClassMethod() {
        OuterClassWithLocalInnerClass o = new OuterClassWithLocalInnerClass();
        o.outerClassTestMethod();
    }

    @Test
    void testRunAnonymousInnerClassMethod() {
        OuterClassWithAnonymousInnerClass o = new OuterClassWithAnonymousInnerClass();
        o.runAnonymousClassMethod();
    }

}
