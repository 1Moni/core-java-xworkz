class Substraction{
public static void main(String args[]){
sub(10,5);
sub(34,9);
sub(40,30);
sub(56,5);
sub(45,9);
sub(78,8);
sub(80,5);
sub(100,56);
sub(345,234);
sub(550,456);

sub(10,5,3);
sub(34,9,8);
sub(40,30,7);
sub(56,5,34);
sub(45,9,22);
sub(78,8,12);
sub(80,5,60);
sub(100,56,15);
sub(345,234,32);
sub(550,456,61);
}
public static void sub(int x, int y){
System.out.println(x-y);

}
public static void sub(int x, int y, int z){
System.out.println(x-y-z);


}
}