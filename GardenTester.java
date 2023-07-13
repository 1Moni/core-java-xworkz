class GardenTester{
public static void main(String args[]){
Garden.createFlowerName("Rose");
Garden.createFlowerName("Lilly");
Garden.createFlowerName("Jasmine");
Garden.createFlowerName("Hibscus");
Garden.createFlowerName("orchid");
Garden.createFlowerName("parijata");
Garden.createFlowerName("Desi");
Garden.getAllflowers();
boolean isUpdated= Garden.updateflowerName("Desi","Iris");
 System.out.println("Is flowerName Updated " + isUpdated);
 Garden.getAllflowers();
 
 int newLength=Garden.deleteflowerName("Hibscus");
 System.out.println("Calling getAllflowersPostDeletion");
 Garden.getAllflowerPostDeletion(newLength);
}
}