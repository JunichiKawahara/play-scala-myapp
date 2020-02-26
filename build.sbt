name := """play-scala-myapp"""
organization := "jp.ch-mk"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

libraryDependencies += "com.h2database" % "h2" % "1.4.200"
libraryDependencies += evolutions
libraryDependencies += jdbc

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "jp.ch-mk.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "jp.ch-mk.binders._"
