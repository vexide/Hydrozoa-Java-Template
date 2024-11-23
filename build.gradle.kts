plugins {
    id("java")
    id("dev.vexide.hydrozoa") version "0.1.0-alpha.1"
}

group = "dev.vrc"
version = "1.0-SNAPSHOT"

hydrozoa {
    entrypoint = "dev.vrc.Main"
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("dev.vexide:hydrozoa:0.1.0-alpha.1")
}

tasks.test {
    useJUnitPlatform()
}
