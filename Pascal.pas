var
    a : double;
    x : double;

begin
    read(a);
    x := (4 / 3.0) * 3.14159 * a * a * a;
    writeln('VOLUME = ', x:-1:3);
end.
