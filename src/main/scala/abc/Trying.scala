package abc

import org.apache.camel.builder.RouteBuilder

class Trying extends RouteBuilder{
  def configure() {
    from("file://files/inbox/").split().method("mySplitter", "splitBody").process(new MyProcessor).to("file://files/outbox?fileName=splitted-${in.body}")
  }
}