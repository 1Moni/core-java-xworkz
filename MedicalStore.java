class MedicalStore{
static String medicineNames[]={null,null,null,null,null,null,null,null,null};
static int index;
public static boolean addMedicineName(String medicines){
boolean isAdded=false;
if(medicines !=null){
medicineNames[index]=medicines;
index++;
isAdded=true;

}else{
System.out.println("Cannot add medicine,as it is a null value");
}
return isAdded;

}
//method
public static void getAllMedicines(){
System.out.println("Invoking getAllMedicines");
for(int medicine=0;medicine<medicineNames.length;medicine++){
String reference=medicineNames[medicine];
System.out.println(" Type of medicine " + reference);// +" at index value "+ medicine);

}
System.out.println("End of getAllMedicines");

}
public static boolean updateMedicineName(String existingMedicineName,String updateMedicineName){
	boolean isUpdated=false;
	for(int medicine=0;medicine<medicineNames.length;medicine++){
		if(medicineNames[medicine].equals (existingMedicineName)){
			medicineNames[medicine]=updateMedicineName;
			isUpdated=true;
			
		}
		
	}
	return isUpdated;
}
public static int deletemedicineNames(String deletemedicineNames){
	System.out.println("invoking editmedicineNames");
	System.out.println("No of Parameter:2,type of parameter: String,String");
	boolean isDeleted=false;
	int medicines;
	int noOfElements=medicineNames.length;
	for( medicines=0;medicines<medicineNames.length;medicines++){
		if(medicineNames[medicines].equals(deletemedicineNames)){
			break;
		}
	}
	if(medicines<noOfElements){
		noOfElements=noOfElements-1;
		for(int newmedicines=medicines;newmedicines<noOfElements;newmedicines++){
			medicineNames[newmedicines]=medicineNames[newmedicines+1];
			
		}
		
	}
	System.out.println(noOfElements);
	return noOfElements;
	
}
public static void getAllmedicineNamesPostDeletion(int newLength){
	for(int medicines=0;medicines<newLength;medicines++){
		System.out.println(medicineNames[medicines]);
	}
	
}
}










