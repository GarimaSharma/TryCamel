import org.apache.camel.scala.dsl.builder.RouteBuilder

class Trying  {
  def createMyRouter() = new RouteBuilder{
   from("file://files/inbox/?noop=true").split(_.getIn().getBody(classOf[String]).split(" ")).process(new MyProcessor).to("file://files/outbox?fileName=split")
  }
}
