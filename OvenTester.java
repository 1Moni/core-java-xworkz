class OvenTester{
public static void main(String test[]){
	//invoking method only for users
	System.out.println("Main Started");
	boolean connected=Oven.onOrOff();
	System.out.println("Is Oven connected "+connected);
	Oven.increaseHeat();
	Oven.increaseHeat();
	Oven.increaseHeat();
	
	boolean connected1=Oven.onOrOff();
	System.out.println("Is Oven connected "+connected1);
	Oven.decreaseHeat();
	Oven.decreaseHeat();
	Oven.decreaseHeat();
 System.out.println("Main Ended");


}


}