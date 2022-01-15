package app

import kotlin.jvm.JvmStatic
import com.gh.tool.CppExample

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val cppExample = CppExample()
        cppExample.sayHello()
    }
}