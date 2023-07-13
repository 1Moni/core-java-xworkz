class Television{
static String name="Samsung";
static int minSound;
static int currentSound;
static int maxSound=10;
static boolean isConnected;
//method in local variable
public static boolean onOrOff(){
	System.out.println("Invoking onOrOff()");
	System.out.println("Paramter"+0);
	if(isConnected==false){
		isConnected=true;
    System.out.println("Television is Turned on..Enjoy");		
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Television is Turned off..");
	}
	return isConnected;
}
// increase Sound
public static void increaseSound(){
	System.out.println("Start of increaseSound()");
	if(isConnected==true){
		if(currentSound<maxSound){
			currentSound=currentSound+1;
			System.out.println("The current Sound is"+ currentSound);
			
	
	}else{
		System.out.println("Max Sound reached");
	}		
	}else{
		System.out.println("Connect madu firstu");
	}
	System.out.println("end of increaseSound");
	
}
	  

//decrease Sound
public static void decreaseSound(){
	//logic
	System.out.println("Invoking decreaseSound()");
	System.out.println("List of paramters "+2);
	if(isConnected==true){
		if(currentSound>minSound){
			currentSound=currentSound-1;
			System.out.println("The current Sound is"+ currentSound);
			
		
	}else{
		System.out.println("Minimum Sound reached");
	}	
	}else{
		System.out.println("Television is turned off...can't decrease Sound");
	}
	System.out.println("end of decreaseSound");
	
}
}




		


