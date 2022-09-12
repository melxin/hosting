plugins {
    java
    kotlin("jvm") version "1.6.21"
    id("org.jetbrains.kotlin.plugin.lombok") version "1.6.21"
}

group = "com.openosrs"
version = "2.0.5.6"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":deobfuscator"))
    implementation(gradleApi())
    implementation(group = "org.jetbrains", name = "annotations", version = "22.0.0")
    implementation(group = "org.ow2.asm", name = "asm", version = "9.0")
    implementation(group = "org.ow2.asm", name = "asm-util", version = "9.0")
    annotationProcessor(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)
    compileOnly(group = "javax.annotation", name = "javax.annotation-api", version = "1.3.2")
    compileOnly(group = "org.projectlombok", name = "lombok", version = ProjectVersions.lombokVersion)
    implementation(group = "com.google.code.gson", name = "gson", version = "2.8.6")
    implementation(group = "com.google.guava", name = "guava", version = "30.1.1-jre")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}