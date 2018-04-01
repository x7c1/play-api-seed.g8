
lazy val `$app_prefix$-play` = project.
  settings($app_prefix;format="Camel"$Settings.commons).
  settings(libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  )).
  enablePlugins(PlayScala).
  dependsOn(`$app_prefix$-domain`)

lazy val `$app_prefix$-domain` = project.
  settings($app_prefix;format="Camel"$Settings.commons)

lazy val root = Project("$app_prefix$-root", file("."))
