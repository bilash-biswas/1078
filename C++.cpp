#include<iostream>
#include<math.h>
#include<iomanip>
using namespace std;
int main()
{
   int N,i;
    cin>>N;
    if(N>1 && N<1000)
    {
        for(i=1;i<=10;i++)
        {
            cout<<i<<" x "<<N<<" = "<<i*N<<endl;
        }
    }
    return 0;
}
