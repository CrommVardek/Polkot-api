import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktor_version = "1.5.4"
val polkaj_version = "0.3.0"

plugins {
    kotlin("jvm") version "1.4.32"
}

group = "polkot"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    // polkaj public repo
    maven( url = "https://dl.bintray.com/emerald/polkaj")
    // required for com.github.multiformats:java-multibase library
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("io.ktor:ktor-client-websockets:$ktor_version")
    implementation("io.emeraldpay.polkaj:polkaj-scale:$polkaj_version")

    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.17"
}