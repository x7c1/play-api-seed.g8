import sbt._
import Keys._
import sbt.Def.SettingList

object $app_prefix;format="Camel"$Settings {
  lazy val commons = new SettingList(Seq(
    scalaVersion := "2.12.6",
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xfuture",
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.1.2" % Test,
    ),
  ))
}
