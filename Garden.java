class Garden{
static String flowerNames[]={null,null,null,null,null,null,null};
static int index;
public static boolean createFlowerName(String flowers){
boolean isAdded=false;
  if(flowers!= null){
flowerNames[index]=flowers;
index++;
isAdded=true;

}else{
System.out.println("Cannot add flower,as it is a null value");
}
return isAdded;

}
//method
public static void getAllflowers(){
System.out.println("Invoking getAllflowers");
for(int flower=0;flower<flowerNames.length;flower++){
String reference=flowerNames[flower];
System.out.println(" Type of flower " + reference);// + " at index value "+ flower);

}
System.out.println("End of getAllflowers");

}
public static boolean updateflowerName(String existingflowerName,String updateflowerName){
	boolean isUpdated=false;
	for(int flower=0;flower<flowerNames.length;flower++){
		if(flowerNames[flower].equals (existingflowerName)){
			flowerNames[flower]=updateflowerName;
			isUpdated=true;
			
		}
		
	}
	return isUpdated;
	
	
}
public static int deleteflowerName(String flowerNames){
	System.out.println("invoking editflowerNames");
	System.out.println("No of Parameter:2,type of parameter: String,String");
	boolean isDeleted=false;
	int flowers;
	int noOfElements=flowerNames.length;
	for(flowers =0;flowers<flowerName.length;flowers++){
		if(flowerNames[flowers].equals(deleteflowerName)){
			break;
		}
	}
	if(flowers<noOfElements){
		noOfElements=noOfElements-1;
		for(int newflowers=flowers;newflowers<noOfElements;newflowers++){
			flowerName[newflowers]=flowerName[flowers+1];
			
		}
		
	}
	System.out.println(noOfElements);
	return noOfElements;
	
}
public static void getAllflowersPostDeletion(int newLength){
	for(int flowers=0;flowers<newLength;flowers++){
		System.out.println(flowerName[flowers]);
	}
	
}
}