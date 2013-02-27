package abc

import org.apache.camel.{Message, Exchange, Processor}

class MyProcessor extends Processor{
  def process(exchange: Exchange) {
    val in: Message = exchange.getIn()
    val body: AnyRef = in.getBody()
    println("#"*80)
    in.setBody(body+", I am so awesome"+(System.currentTimeMillis / 1000))
  }
}
