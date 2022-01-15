#include "com_gh_tool_CppExample.h"
#include "utils.h"

JNIEXPORT void JNICALL Java_com_gh_tool_CppExample_sayHello (JNIEnv *, jobject) {
    Utils utils;
    utils.sayHello();
}