
lazy val `$app_prefix$-play` = project.
  settings($app_prefix;format="Camel"$Settings.common:_*).
  dependsOn(`$app_prefix$-domain`)

lazy val `$app_prefix$-domain` = project.
  settings($app_prefix;format="Camel"$Settings.common:_*)

lazy val root = Project("$app_prefix$-root", file("."))
