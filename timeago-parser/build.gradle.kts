/*
 * SPDX-FileCopyrightText: 2025 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */


plugins {
    `java-library`
    `maven-publish`
}

group = rootProject.group
version = rootProject.version

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            groupId = "com.github.EkVairagi"
            artifactId = "timeago-parser"
            version = rootProject.version.toString()
        }
    }
}

dependencies {
    implementation(libs.google.jsr305)
}
