class AcTester{
public static void main(String test[]){
	//invoking method only for users
	System.out.println("Main Started");
	boolean connected=Ac.onOrOff();
	System.out.println("Is Ac connected "+connected);
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	Ac.increaseTemperature();
	boolean connected1=Ac.onOrOff();
	System.out.println("Is Ac connected "+connected1);
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
	Ac.decreaseTemperature();
 System.out.println("Main Ended");


}


}