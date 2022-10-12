import scala.io.Source

val filename = "/Users/habbi/Documents/EFREI/Scala/tp_2/test_file.csv"
val scalaFileContents = {
  Source
    .fromFile(filename)
    .getLines()
}

scalaFileContents.map(line => println(line)).toList
