import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`);
    var N = input.nextInt();
    var i:Int;
    var b:Int
    if(N>1 && N<1000)
    {
        for(i in 1..10)
        {
            b=i*N
            println("$i x $N = $b")
        }
    }
}

