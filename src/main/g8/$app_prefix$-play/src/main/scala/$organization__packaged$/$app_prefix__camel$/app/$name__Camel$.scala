package $organization$.$app_prefix$.app

import $organization$.$app_prefix$.domain.Greeting

object $name;format="Camel"$ extends App {
  val message = Greeting messageFor "$name;format="Camel"$"
  println(message)
}

