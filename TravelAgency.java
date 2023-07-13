class TravelAgency{
static String touristPlaces[] = {null,null,null,null,null,null,null,null};
static int index;
public static boolean saveTouristPlace(String touristPlace){
boolean isSaved = false;
if(touristPlaces != null){
touristPlaces[index] = touristPlace;
index++;
isSaved = true;
}else{
System.out.println("Cannot add touristPlaces,as it is a null value");
}
return isSaved;
}
//Method
public static void  getAllTouristPlace(){
System.out.println("Invoking getAllTouristPlace");
for(int touristPlace =0;touristPlace<touristPlaces.length;touristPlace++){
String reference = touristPlaces[touristPlace];
System.out.println("Type of touristPlace " + reference);// + " at index value " + touristPlace);
}
System.out.println("End of getAllTouristPlace");
}
public static boolean updateTouristPlace(String existingTouristPlace , String updateTouristPlace){
boolean isUpdated = false;
for(int touristPlace=0 ; touristPlace < touristPlaces.length ; touristPlace++){
if(touristPlaces[touristPlace].equals(existingTouristPlace)){
touristPlaces[touristPlace] = updateTouristPlace;
          isUpdated = true;
}
}
return isUpdated;
}
public static int deletetouristPlaces(String deletetouristPlaces){
	System.out.println("invoking edittouristPlaces");
	System.out.println("No of Parameter:2,type of parameter: String,String");
	boolean isDeleted=false;
	int touristPlace;
	int noOfElements=touristPlaces.length;
	for( touristPlace=0;touristPlace<touristPlaces.length;touristPlace++){
		if(touristPlaces[touristPlace].equals(deletetouristPlaces)){
			break;
		}
	}
	if(touristPlace<noOfElements){
		noOfElements=noOfElements-1;
		for(int newtouristPlace=touristPlace;newtouristPlace<noOfElements;newtouristPlace++){
			touristPlaces[newtouristPlace]=touristPlaces[newtouristPlace+1];
			
		}
		
	}
	System.out.println(noOfElements);
	return noOfElements;
	
}
public static void getAlltouristPlacesPostDeletion(int newLength){
	for(int touristPlace=0;touristPlace<newLength;touristPlace++){
		System.out.println(touristPlaces[touristPlace]);
	}
	
}
}
