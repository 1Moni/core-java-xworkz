class MetroTester{
public static void main(String args[]){
Metro.addStationName("RajajiNagar");
Metro.addStationName("VijayNagar");
Metro.addStationName("Kengeri");
Metro.addStationName("Yashwanthpura");
Metro.addStationName("majestic");
Metro.addStationName("RR Nagar");
Metro.addStationName("Maleshwaram");
Metro.getAllStationName();
boolean isUpdated= Metro.updateStationName("Kengeri","BalaGangadaranataSwamy");
 System.out.println("Is stationName Updated " + isUpdated);
 Metro.getAllStationName();
int newLength=Metro.deletestationNames("RR Nagar");
System.out.println("Calling getAllstationNamesPostDeletion");
Metro.getAllstationNamesPostDeletion(newLength);

}
}