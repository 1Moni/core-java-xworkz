class Division{
public static void main(String args[]){
div(4,2);
div(56,2);
div(43,3);
div(67,7);
div(25,5);
div(65,9);
div(98,98);
div(45,5);
div(88,8);
div(56,9);

div(4,2,1);
div(56,2,3);
div(43,3,6);
div(67,7,89);
div(25,5,76);
div(65,9,67);
div(98,98,1);
div(45,5,7);
div(88,8,90);
div(56,9,56);
}
public static void div(int m, int n){
System.out.println(m/n);

}
public static void div(int m, int n, int o){
System.out.println(m/n/o);
}
}