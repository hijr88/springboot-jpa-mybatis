1. querydsl 의존성 설정
```gradel
plugins {
    id "com.ewerk.gradle.plugins.querydsl" version "1.0.10"
}
```
```gradle
dependencies {
    implementation 'com.querydsl:querydsl-jpa'
}
```
```gradle
//querydsl
def querydslDir = "$buildDir/generated/querydsl"

querydsl {
    jpa = true
    querydslSourcesDir = querydslDir
}
sourceSets {
    main.java.srcDir querydslDir
}
configurations {
    querydsl.extendsFrom compileClasspath
}
compileQuerydsl {
    options.annotationProcessorPath = configurations.querydsl
}
```
2. application.yml 에서 datasource 작성
3. Entity, Repository, Custom(querydsl) 작성후 테스트 실행
  - mybatis랑 충돌나는지 @AutoConfigureMybatis를 붙여야 함
