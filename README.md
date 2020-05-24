# JPro Sound

[![Build Status](https://travis-ci.com/JPro-one/jpro-sound.svg?branch=master)](https://travis-ci.com/jpro-one/jpro-sound)

Maven:
```
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>bintray-sandec-repo</id>
        <name>bintray</name>
        <url>https://sandec.bintray.com/repo</url>
    </repository>
</repositories>

TODO
```

Gradle:
```
repositories {
    maven {
        url  "https://sandec.bintray.com/repo" 
    }
}

TODO
```



Local build:
```
./gradlew publishToMavenLocal
```

New release:
```
./gradlew bintrayUpload
```