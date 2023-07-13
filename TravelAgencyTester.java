class TravelAgencyTester{
public static void main(String args[]){
TravelAgency.saveTouristPlace("Hampi");
TravelAgency.saveTouristPlace("Goa");
TravelAgency.saveTouristPlace("Halebidu");
TravelAgency.saveTouristPlace("ShravanaBelagola");
TravelAgency.saveTouristPlace("Beluru");
TravelAgency.saveTouristPlace("Thajmahal");
TravelAgency.saveTouristPlace("Mangalore");
TravelAgency.saveTouristPlace("Ooty");

TravelAgency.getAllTouristPlace();
boolean isUpdated=TravelAgency.updateTouristPlace("Thajmahal","Udupi");
System.out.println("Is touristplace name updated"+ isUpdated);
TravelAgency.getAllTouristPlace();
int newLength=TravelAgency.deletetouristPlaces("Beluru");
System.out.println("Calling getAllmedicineNamesPostDeletion");
TravelAgency.getAlltouristPlacesPostDeletion(newLength);
}
}
