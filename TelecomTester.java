class TelecomTester{
public static void main(String args[]){
Telecom.addSimName("Airtel");
Telecom.addSimName("Jio");
Telecom.addSimName("Vadaphone");
Telecom.addSimName("TataDacomo");
Telecom.addSimName("BSNL");
Telecom.getAllSimNames();
boolean isUpdated= Telecom.updateSimName("Vadaphone","Idea");
 System.out.println("Is simName Updated " + isUpdated);
 Telecom.getAllSimNames();
 int newLength=Telecom.deletesimNames("TataDacomo");
System.out.println("Calling getAllsimNamesPostDeletion");
Telecom.getAllsimNamesPostDeletion(newLength);

System.out.println("getting searchsimItemByName");
Telecom.searchsimNameByName("BSNL");

}

}