class MedicalStoreTester{
public static void main(String args[]){
MedicalStore.addMedicineName("Paracetamol");
MedicalStore.addMedicineName("Dolo650");
MedicalStore.addMedicineName("Aspirin");
MedicalStore.addMedicineName("Citalopram");
MedicalStore.addMedicineName("Trazodone");
MedicalStore.addMedicineName("Neproxin");
MedicalStore.addMedicineName("Azithromycin");
MedicalStore.addMedicineName("Balypsa");
MedicalStore.addMedicineName("Clavam625");
MedicalStore.getAllMedicines();
boolean isUpdated= MedicalStore.updateMedicineName("Aspirin","SumoCold");
 System.out.println("Is medicineName Updated " + isUpdated);
 MedicalStore.getAllMedicines();
 int newLength=MedicalStore.deletemedicineNames("Dolo650");
System.out.println("Calling getAllmedicineNamesPostDeletion");
 MedicalStore.getAllmedicineNamesPostDeletion(newLength);

}
}