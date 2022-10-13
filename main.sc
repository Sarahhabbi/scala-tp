import scala.io.Source
import java.io.File

val filename = "/Users/habbi/Documents/EFREI/Scala/tp_2/scala-tp/test_file.csv"
val file = new File(filename)
val readBuffer = Source.fromFile(filename)
readBuffer.getLines().foreach(line => println(line))
readBuffer.close()
