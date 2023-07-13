class MixerTester{
public static void main(String test[]){
	//invoking method only for users
	System.out.println("Main Started");
	boolean connected=Mixer.onOrOff();
	System.out.println("Is Mixer connected "+connected);
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	Mixer.increaseSpeed();
	
	boolean connected1=Mixer.onOrOff();
	System.out.println("Is Mixer Oven connected "+connected1);
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
	Mixer.decreaseSpeed();
 System.out.println("Main Ended");


}


}