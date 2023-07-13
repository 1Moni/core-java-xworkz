class IceCream1Tester{
public static void main(String args[]){
IceCream1.createFlavor("Pista");
IceCream1.createFlavor("Strawberry");
IceCream1.createFlavor("ButterScah");
IceCream1.createFlavor("Chocolate");
IceCream1.createFlavor("BlackCurrent");
IceCream1.createFlavor("Mango");

IceCream1.getAllFlavor();
boolean isUpdated=IceCream1.updateFlavor("Pista","Badam");
System.out.println("Is flavor name updated"+ isUpdated);
IceCream1.getAllFlavor();
int newLength=IceCream1.deleteflavors("Mango");
System.out.println("Calling getAllFlavorPostDeletion");
IceCream1.getAllFlavorsPostDeletion(newLength);
}
}