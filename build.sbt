name := "rfp-jug"
version := "0.1"
scalaVersion := "2.12.3"

resolvers += "Spring Milestone" at "https://repo.spring.io/milestone/"

libraryDependencies ++= {

  Seq(
    "org.springframework.boot" % "spring-boot-starter" % "2.0.0.M3",
    "org.springframework.boot" % "spring-boot-starter-undertow" % "2.0.0.M3",
    "org.springframework.boot" % "spring-boot-starter-webflux" % "2.0.0.M3",
    "org.springframework" % "spring-webmvc" % "5.0.0.RC3",
    "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.1"
  )
}