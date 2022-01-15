plugins {
    kotlin("jvm") version "1.6.10"
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":cpp-core"))
}

application {
    val getMainClass = javaClass.getMethod("getMainClass")
    val mainClass = getMainClass.invoke(this) as Property<String>
    mainClass.set("app.Main")
}