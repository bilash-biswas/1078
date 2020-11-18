var
N:int64;
i:integer;
begin
   read(N);
   if((N>1) and (N<1000))then
      for i:=1 to 10 do
         writeln(i,' x ',N,' = ',i*N);


end.
