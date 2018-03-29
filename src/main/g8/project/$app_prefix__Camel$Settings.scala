import sbt._
import Keys._
import sbt.Def.SettingList

object $app_prefix;format="Camel"$Settings {
  lazy val commons = new SettingList(Seq(
    scalaVersion := "2.12.4",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfuture",
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.4" % Test,
    ),
  ))
}
