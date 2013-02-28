//import java.io.File
//import org.apache.camel.builder.RouteBuilder
//import org.apache.camel.Exchange
//import org.apache.camel.test.junit4.CamelTestSupport
//import org.junit.Test
//import org.apache.camel.scala.dsl.builder.RouteBuilderSupport
//
//class TestBlah extends CamelTestSupport with RouteBuilderSupport {
//
//  override def createRouteBuilder(): RouteBuilder = new FileRouteCreator().create()
//
//  @Test
//  def testFilterRoute() {
//    template.sendBodyAndHeader("file:files/inbox", "Hello World how are you", Exchange.FILE_NAME, "hello")
//    Thread.sleep(3000)
//    val target = new File("files/outbox/split")
//    assert(target.exists())
//  }
//}
