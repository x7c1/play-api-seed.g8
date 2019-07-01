import sbt._
import Keys._
import sbt.Def.SettingList

object $app_prefix;format="Camel"$Settings {
  lazy val commons = new SettingList(Seq(
    // https://mvnrepository.com/artifact/org.scala-lang/scala-library
    scalaVersion := "2.13.0",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfuture",
    ),
    organization := "$organization$",
    libraryDependencies ++= Seq(
      // https://mvnrepository.com/artifact/org.scalatest/scalatest
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    ),
  ))
}
