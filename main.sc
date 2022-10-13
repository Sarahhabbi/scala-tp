import scala.io.Source

val filename = "/Users/habbi/Documents/EFREI/Scala/tp_2/scala-tp/test_file.csv"
val scalaFileContents = {
  Source
    .fromFile(filename)
    .getLines()
}

scalaFileContents.foreach(line => println(line))
