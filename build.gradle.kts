plugins {
    id("java")
}

group = "bug"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.github.librepdf:openpdf:2.0.2")
//    implementation("com.github.librepdf:openpdf:1.4.2")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}