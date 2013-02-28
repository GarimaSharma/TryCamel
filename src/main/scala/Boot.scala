import org.apache.camel.impl.DefaultCamelContext
import org.apache.camel.util.jndi.JndiContext

object Boot extends App {
  val jndiContext: JndiContext = new JndiContext()
  jndiContext.bind("mySplitter", new MySplitter())
  val camelContext = new DefaultCamelContext(jndiContext)
  val router = new FileRouteCreator
  val routeBuilder = router.create
  camelContext.addRoutes(routeBuilder)

  camelContext.start()
  while (true) {}

  camelContext.stop()
}