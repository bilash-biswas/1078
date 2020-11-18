import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int N = input.nextInt();
    int i;
    if(N>1 && N<1000)
    {
        for(i=1;i<=10;i++)
        {
            System.out.println(i+" x "+N+" = "+(i*N));
        }
    }
}
}
