object Main {
  def main(args:Array[String]){ 
    var a=scala.io.StdIn.readInt()
    for(i <- 1 to 10){
      println(f"$i x $a = ${a*i}")
    }
    }
}
