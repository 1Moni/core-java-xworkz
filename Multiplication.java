class Multiplication{
public static void main(String args[]){
mul(5,5);
mul(78,9);
mul(20,30);
mul(70,5);
mul(45,9);
mul(12,8);
mul(67,5);
mul(10,56);
mul(341,24);
mul(558,46);

mul(5,5,10);
mul(78,9,67);
mul(20,30,55);
mul(70,5,98);
mul(45,9,90);
mul(12,8,34);
mul(67,5,78);
mul(10,56,98);
mul(341,24,45);
mul(558,46,65);
}
public static void mul(int c, int d){
System.out.println(c*d);

}
public static void mul(int c, int d,int e){
System.out.println(c*d*e);

}
}