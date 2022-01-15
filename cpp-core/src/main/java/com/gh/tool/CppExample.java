package com.gh.tool;

public class CppExample {
    static {
        NativeLoader.loadLibrary(CppExample.class.getClassLoader(), "jvm-application-with-jni-library/cpp-core");
    }

    public native void sayHello();
}