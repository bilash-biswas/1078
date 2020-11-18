var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines=input.split(' ');
var N = parseInt(lines.shift());
var i;
if(N>1 && N<1000)
{
    for(i=1;i<=10;i++)
    {
        console.log(i+" x "+N+" = "+(i*N));
    }
}
