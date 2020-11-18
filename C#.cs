using System.IO;
using System;

class Program
{
    static void Main()
    {
    int N,i;
    N=Convert.ToInt32(Console.ReadLine());
    if(N>1 && N<1000)
    {
        for(i=1;i<=10;i++)
        {
            Console.WriteLine(i+" x "+N+" = "+(i*N));
        }
    }
    }
}
