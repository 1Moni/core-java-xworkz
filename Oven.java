class Oven{
static String name="Lg";
static int minHeat;
static int currentHeat;
static int maxHeat=5;
static boolean isConnected;
//method in local variable
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Paramter"+0);
	if(isConnected==false){
		isConnected=true;
    System.out.println("Oven is Turned on");		
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Oven is Turned off..");
	}
	return isConnected;
}
// increase Heat
public static void increaseHeat(){
	System.out.println("Start of increaseHeat()");
	if(isConnected==true){
		if(currentHeat < maxHeat){
			currentHeat=currentHeat+ 1;
			System.out.println("The current Heat is"+ currentHeat);
			
	
	}else{
		System.out.println("Max Heat reached");
	}		
	}else{
		System.out.println("Oven is Connected");
	}
	System.out.println("end of increaseHeat");
	
}
	  

//decrease Heat
public static void decreaseHeat(){
	//logic
	System.out.println("Invoking decreaseHeat()");
	System.out.println("List of paramters "+2);
	if(isConnected==true){
		if(currentHeat>minHeat){
			currentHeat=currentHeat-1;
			System.out.println("The current Heat is"+ currentHeat);
			
		
	}else{
		System.out.println("Minimum Heat reached");
	}	
	}else{
		System.out.println("Oven is turned off...can't decrease Heat");
	}
	System.out.println("end of decreaseHeat");
	
}
}




		


