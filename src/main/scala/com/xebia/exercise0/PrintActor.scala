package com.xebia
package exercise0

import akka.actor.{Actor, Props}

object PrintActor {
  //TODO define messages for print actor here (Print)
  //TODO define props and name for PrintActor here
}

class PrintActor extends Actor {
  import PrintActor._

  def receive = {
    //TODO handle the Print message here by println'ing the text in the Print message
  }

}
