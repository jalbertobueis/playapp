name := """wedding"""

version := "1.0-SNAPSHOT"

resolvers += "release repository" at  "http://hakandilek.github.com/maven-repo/releases/"

resolvers += "snapshot repository" at "http://hakandilek.github.com/maven-repo/snapshots/"


lazy val root = (project in file(".")).enablePlugins(PlayJava)


scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.springframework" % "spring-context" % "3.2.2.RELEASE",
  "javax.inject" % "javax.inject" % "1",
  "org.springframework.data" % "spring-data-jpa" % "1.3.2.RELEASE",
  "org.springframework" % "spring-expression" % "3.2.2.RELEASE",
  "org.hibernate" % "hibernate-entitymanager" % "3.6.10.Final",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
)


