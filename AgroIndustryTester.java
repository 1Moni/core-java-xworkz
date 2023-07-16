class AgroIndustryTester{
public static void main(String args[]){

AgroIndustry agroIndustry = new AgroIndustry();
agroIndustry.name = "Dairy Processing Plant";
agroIndustry.purpose = "manufacturing of dairy products";
agroIndustry.establishedYear =  1866;
agroIndustry.product = "milk, cheese, and yogurt";
agroIndustry.toAgriculturePurpose();
System.out.println("Create 1st copy of the AgroIndustry");
System.out.println(agroIndustry.name + " " + agroIndustry.purpose + " " + agroIndustry.establishedYear + " " + agroIndustry.product); 

AgroIndustry agroIndustry1 = new AgroIndustry();
agroIndustry1.name = "Flour Mill";
agroIndustry1.purpose = "grinding of grains";
agroIndustry1.establishedYear = 1898;
agroIndustry1.product = "flour";
agroIndustry1.toAgriculturePurpose();
System.out.println("Create 2nd copy of the AgroIndustry");
System.out.println(agroIndustry1.name + " " + agroIndustry1.purpose + " " + agroIndustry1.establishedYear + " " + agroIndustry1.product); 

AgroIndustry agroIndustry2 = new AgroIndustry();
agroIndustry2.name = "Fruit Juice Factory";
agroIndustry2.purpose = "Production and processing of fruit juices";
agroIndustry2.establishedYear = 1899;
agroIndustry2.product = "fruit juices and beverages";
agroIndustry2.toAgriculturePurpose();
System.out.println("Create 3rd copy of the AgroIndustry");
System.out.println(agroIndustry2.name + " " + agroIndustry2.purpose + " " + agroIndustry2.establishedYear + " " + agroIndustry2.product); 

AgroIndustry agroIndustry3 = new AgroIndustry();
agroIndustry3.name = "Poultry Farm";
agroIndustry3.purpose = "Rearing and production of poultry";
agroIndustry3.establishedYear = 1992;
agroIndustry3.product = "chickens, ducks, and turkeys.";
agroIndustry3.toAgriculturePurpose();
System.out.println("Create 4th copy of the AgroIndustry");
System.out.println(agroIndustry3.name + " " + agroIndustry3.purpose + " " + agroIndustry3.establishedYear + " " + agroIndustry3.product); 

AgroIndustry agroIndustry4= new AgroIndustry();
agroIndustry4.name = "Organic Farm";
agroIndustry4.purpose = " Cultivation of organic crops ";
agroIndustry4.establishedYear = 1998;
agroIndustry4.product = " organic food ";
agroIndustry4.toAgriculturePurpose();
System.out.println("Create 5th copy of the AgroIndustry");
System.out.println(agroIndustry4.name + " " + agroIndustry4.purpose + " " + agroIndustry4.establishedYear + " " + agroIndustry4.product); 

AgroIndustry agroIndustry5 = new AgroIndustry();
agroIndustry5.name = "Fish Farm";
agroIndustry5.purpose = "Breeding and cultivation of fish ";
agroIndustry5.establishedYear = 1950;
agroIndustry5.product = "fish";
agroIndustry5.toAgriculturePurpose();
System.out.println("Create 6th copy of the AgroIndustry");
System.out.println(agroIndustry5.name + " " + agroIndustry5.purpose + " " + agroIndustry5.establishedYear + " " + agroIndustry5.product); 

AgroIndustry agroIndustry6 = new AgroIndustry();
agroIndustry6.name = "Spice Processing Unit";
agroIndustry6.purpose = " Processing and packaging of spices";
agroIndustry6.establishedYear =1980;
agroIndustry6.product = " pepper, turmeric, and cardamom";
agroIndustry6.toAgriculturePurpose();
System.out.println("Create 7th copy of the AgroIndustry");
System.out.println(agroIndustry6.name + " " + agroIndustry6.purpose + " " + agroIndustry6.establishedYear + " " + agroIndustry6.product); 

AgroIndustry agroIndustry7 = new AgroIndustry();
agroIndustry7.name = "Coffee Roastery";
agroIndustry7.purpose = "packaging of coffee beans";
agroIndustry7.establishedYear = 2002;
agroIndustry7.product = "coffee";
agroIndustry7.toAgriculturePurpose();
System.out.println("Create 8th copy of the AgroIndustry");
System.out.println(agroIndustry7.name + " " + agroIndustry7.purpose + " " + agroIndustry7.establishedYear + " " + agroIndustry7.product); 

AgroIndustry agroIndustry8 = new AgroIndustry();
agroIndustry8.name = "Sugar Refinery";
agroIndustry8.purpose = "Processing and refining of sugarcane";
agroIndustry8.establishedYear = 2004;
agroIndustry8.product = "Sugarcane";
agroIndustry8.toAgriculturePurpose();
System.out.println("Create 9th copy of the AgroIndustry");
System.out.println(agroIndustry8.name + " " + agroIndustry8.purpose + " " + agroIndustry8.establishedYear + " " + agroIndustry8.product); 

AgroIndustry agroIndustry9 = new AgroIndustry();
agroIndustry9.name = "Vegetable Canning Factory";
agroIndustry9.purpose = "preservation of vegetables ";
agroIndustry9.establishedYear = 2008;
agroIndustry9.product = "vegetables";
agroIndustry9.toAgriculturePurpose();
System.out.println("Create 10th copy of the AgroIndustry");
System.out.println(agroIndustry9.name + " " + agroIndustry9.purpose + " " + agroIndustry9.establishedYear + " " + agroIndustry9.product); 

}
}