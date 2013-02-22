package abc

import collection.JavaConversions._
import collection.mutable.ListBuffer

class MySplitter{

  def splitBody(body: String): java.util.List[String] = {
    ListBuffer(body.split(" "): _*)
  }
}
 