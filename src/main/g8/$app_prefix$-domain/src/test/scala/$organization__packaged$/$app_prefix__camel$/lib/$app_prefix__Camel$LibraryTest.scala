package $organization$.$app_prefix$.lib

import org.scalatest.{FunSpec, Matchers}

class $app_prefix;format="Camel"$LibraryTest extends FunSpec with Matchers {

  describe($app_prefix;format="Camel"$Library.getClass.getSimpleName){
    it("should create message"){
      val message = $app_prefix;format="Camel"$Library createMessageFor "earthlings"
      message should be("hello, earthlings!")
    }
  }
}

