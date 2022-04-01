fn main(){
   let mut line2 = String::new();
   std::io::stdin().read_line(&mut line2).unwrap();
   let num2: f64 = line2.trim().parse().ok().expect("Try");

   println!("VOLUME = {:.3}", (4.0/3.0)*3.14159 * num2 * num2 * num2);
   
}
