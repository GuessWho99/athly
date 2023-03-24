name := "backend"
organization := "org.athly"
version := "1.0-SNAPSHOT"

scalaVersion := "2.13.10"
libraryDependencies ++= Seq(guice, "com.google.inject" % "guice" % "5.1.0")

lazy val root = (project in file(".")).enablePlugins(PlayScala)
