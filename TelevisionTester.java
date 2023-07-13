class TelevisionTester{
public static void main(String test[]){
	//invoking method only for users
	System.out.println("Main Started");
	boolean connected=Television.onOrOff();
	System.out.println("Is Television connected "+connected);
	Television.increaseSound();
	Television.increaseSound();
	Television.increaseSound();
	Television.increaseSound();
	Television.increaseSound();
	Television.increaseSound();
	boolean connected1=Television.onOrOff();
	System.out.println("Is Television connected "+connected1);
	Television.decreaseSound();
	Television.decreaseSound();
	Television.decreaseSound();
 System.out.println("Main Ended");


}


}