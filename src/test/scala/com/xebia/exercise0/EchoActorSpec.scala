package com.xebia
package exercise0

import org.specs2.mutable.Specification

import spray.testkit.Specs2RouteTest

import TestSupport._

class EchoActorSpec extends Specification {

  "The EchoActor" should {
    "Reply with the same text that was send" in new AkkaTestkitContext() {
      // You can use the TestKit here, it is provided by the AkkaTestkitContext
      // The ImplicitSender is also available so you can expect responses to be sent to the testActor
      // which can be asserted with the TestKit expect... methods.
      //

      import EchoActor._

//TODO make this test work, uncomment the commented lines below

      val echoActor = system.actorOf(props, name)

      echoActor ! "echo"

      expectMsg("echo")

      expectNoMsg()

    }
  }
}
