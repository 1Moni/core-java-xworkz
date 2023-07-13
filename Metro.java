class Metro{
static String stationNames[]={null,null,null,null,null,null,null};
static int index;
public static boolean addStationName(String stations){
boolean isAdded=false;
if(stations!=null){ 
stationNames[index]=stations;
index++;
isAdded=true;

}else{
System.out.println("cannot add station,it is a null value");
}
return isAdded;
}
public static void getAllStationName(){
System.out.println("Invoking getAllStationName");
for(int station=0;station<stationNames.length;station++){
String reference=stationNames[station];
System.out.println("Type of station " + reference);// + " at index value "+ station);
}
System.out.println("end of getAllStationName");

}
public static boolean updateStationName(String existingStationName,String updateStationName){
	boolean isUpdated=false;
	for(int station=0;station<stationNames.length;station++){
		if(stationNames[station].equals (existingStationName)){
			stationNames[station]=updateStationName;
			isUpdated=true;
			
		}
		
	}
	return isUpdated;

}
public static int deletestationNames(String deletestationNames){
	System.out.println("invoking editstationNames");
	System.out.println("No of Parameter:2,type of parameter: String,String");
	boolean isDeleted=false;
	int stations;
	int noOfElements=stationNames.length;
	for(stations =0;stations<stationNames.length;stations++){
		if(stationNames[stations].equals(deletestationNames)){
			break;
		}
	}
	if(stations<noOfElements){
		noOfElements=noOfElements-1;
		for(int newstations=stations;newstations<noOfElements;newstations++){
			stationNames[newstations]=stationNames[newstations+1];
			
		}
		
	}
	System.out.println(noOfElements);
	return noOfElements;
	
}
public static void getAllstationNamesPostDeletion(int newLength){
	for(int stations=0;stations<newLength;stations++){
		System.out.println(stationNames[stations]);
	}
	
}
}

