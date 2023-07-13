class IceCream1{
static String flavors[] = {null,null,null,null,null,null};
static int index;
public static boolean createFlavor(String flavor){
boolean isCreated = false;
if(flavors != null){
flavors[index] = flavor;
index++;
isCreated = true;
}else{
System.out.println("Cannot add flavor,as it is a null value");
}
return isCreated;
}
//Method
public static void getAllFlavor(){
System.out.println("Invoking getAllFlavor");
for(int flavor=0 ; flavor<flavors.length ; flavor++){
String reference = flavors[flavor];
System.out.println("Type of flavor " + reference);// + " at index value " + flavor);
}
System.out.println("End of getAllFlavor");
}
public static boolean updateFlavor(String existingFlavor , String updateFlavor){
boolean isUpdated = false;
for(int flavor=0 ; flavor < flavors.length ; flavor++){
if(flavors[flavor].equals(existingFlavor)){
flavors[flavor] = updateFlavor;
          isUpdated = true;
}
}
return isUpdated;
}
public static int deleteflavors(String deleteflavors){
	System.out.println("invoking editFlavors");
	System.out.println("No of Parameter:2,type of parameter: String,String");
	boolean isDeleted=false;
	int flavor;
	int noOfElements=flavors.length;
	for(flavor =0;flavor<flavors.length;flavor++){
		if(flavors[flavor].equals(deleteflavors)){
			break;
		}
	}
	if(flavor<noOfElements){
		noOfElements=noOfElements-1;
		for(int newflavor=flavor;newflavor<noOfElements;newflavor++){
			flavors[newflavor]=flavors[newflavor+1];
			
		}
		
	}
	System.out.println(noOfElements);
	return noOfElements;
	
}
public static void getAllFlavorsPostDeletion(int newLength){
	for(int flavor=0;flavor<newLength;flavor++){
		System.out.println(flavors[flavor]);
	}
	
}
}

