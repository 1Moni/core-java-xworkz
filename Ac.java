class Ac{
static String name="Haire";
static int minTemperature;
static int currentTemperature;
static int maxTemperature=10;
static boolean isConnected;
//method in local variable
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Paramter"+0);
	if(isConnected==false){
		isConnected=true;
    System.out.println("Ac is Turned on..Enjoy");		
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Ac is Turned off..");
	}
	return isConnected;
}
// increase Temperature
public static void increaseTemperature(){
	System.out.println("Start of increaseTemperature()");
	if(isConnected==true){
		if(currentTemperature<maxTemperature){
			currentTemperature=currentTemperature + 1;
			System.out.println("The current Temperature is"+ currentTemperature);
			
	
	}else{
		System.out.println("Max Temperature reached");
	}		
	}else{
		System.out.println("Ac is turned on");
	}
	System.out.println("end of increaseTemperature");
	
}
	  

//decrease Temperature
public static void decreaseTemperature(){
	//logic
	System.out.println("Invoking decreaseTemperature()");
	System.out.println("List of paramters "+2);
	if(isConnected==true){
		if(currentTemperature>minTemperature){
			currentTemperature=currentTemperature-1;
			System.out.println("The current Temperature is"+ currentTemperature);
			
		
	}else{
		System.out.println("Minimum Temperature reached");
	}	
	}else{
		System.out.println("Ac is turned off...can't decrease Temperature");
	}
	System.out.println("end of decreaseTemperature");
	
}
}




		


