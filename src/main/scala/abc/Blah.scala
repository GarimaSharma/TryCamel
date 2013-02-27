package abc

import org.apache.camel.impl.DefaultCamelContext
import org.apache.camel.util.jndi.JndiContext

object Blah extends App {
  val context: JndiContext = new JndiContext()
  context.bind("mySplitter", new MySplitter())
  val c = new DefaultCamelContext(context)
  c.addRoutes(new Trying)

  c.start()
  while (true) {}
}