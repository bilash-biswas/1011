import 'dart:io';
void main(){
  double PI,r,volume;
  PI = 3.14159;
  r = double.parse(stdin.readLineSync());
  volume = (4 / 3) * PI * r * r * r;

  var num = volume.toStringAsFixed(3);
  print("VOLUME = $num");
}
