class Modulus{
public static void main(String args[]){
mod(36,5);
mod(55,9);
mod(68,6);
mod(256,9);
mod(102,8);
mod(203,6);
mod(450,5);
mod(750,9);
mod(866,6);

mod(36,5,8);
mod(55,9,12);
mod(68,6,13);
mod(256,9,34);
mod(102,8,22);
mod(203,6,45);
mod(450,5,65);
mod(750,9,34);
mod(866,6,76);
}
public static void mod(int a, int b){
System.out.println(a%b);
}
public static void mod(int a, int b,int c){
System.out.println(a%b%c);
}
}