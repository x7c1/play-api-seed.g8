package $organization$.$app_prefix$.lib

object $app_prefix;format="Camel"$Library {
  def createMessageFor(name: String) = s"hello, \$name!"
}

