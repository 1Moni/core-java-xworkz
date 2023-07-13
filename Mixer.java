class Mixer{
static String name="Preethi";
static int minSpeed;
static int currentSpeed;
static int maxSpeed=3;
static boolean isConnected;
//method in local variable
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Paramter"+0);
	if(isConnected==false){
		isConnected=true;
    System.out.println("Mixer is Turned on..Enjoy");		
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Mixer is Turned off..");
	}
	return isConnected;
}
// increase Speed
public static void increaseSpeed(){
	System.out.println("Start of increaseSpeed()");
	if(isConnected==true){
		if(currentSpeed < maxSpeed){
			currentSpeed=currentSpeed+ 1;
			System.out.println("The current Speed is"+ currentSpeed);
			
	
	}else{
		System.out.println("Max speed reached");
	}		
	}else{
		System.out.println("Mixer is Connected");
	}
	System.out.println("end of increaseSpeed");
	
}
	  

//decrease Speed
public static void decreaseSpeed(){
	//logic
	System.out.println("Invoking decreaseSpeed()");
	System.out.println("List of paramters "+2);
	if(isConnected==true){
		if(currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("The current Speed is"+ currentSpeed);
			
		
	}else{
		System.out.println("Minimum Speed reached");
	}	
	}else{
		System.out.println("Mixer is turned off...can't decrease Speed");
	}
	System.out.println("end of decreaseSpeed");
	
}
}




		


