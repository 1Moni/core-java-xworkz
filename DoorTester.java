class DoorTester{
public static void main(String args[]){

Door door = new Door();
door.name = "Standard interior door";
door.height = "223cm";
door.price = 1690;
door.color = "white nd black";
door.doors();
System.out.println("Create 1st copy of the Door");
System.out.println(door.name + " " + door.height + " " + door.price + " " + door.color); 

Door door1 = new Door();
door1.name = "Revolving door";
door1.height = "245cm";
door1.price = 1250;
door1.color = "red";
door1.doors();
System.out.println("Create 2nd copy of the Door");
System.out.println(door1.name + " " + door1.height + " " + door1.price + " " + door1.color); 

Door door2 = new Door();
door2.name = "Patio door";
door2.height = "260cm";
door2.price = 1450;
door2.color = "Black";
door2.doors();
System.out.println("Create 3rd copy of the Door");
System.out.println(door2.name + " " + door2.height + " " + door2.price + " " + door2.color); 

Door door3 = new Door();
door3.name = "Garage door";
door3.height = "350cm";
door3.price = 2450;
door3.color = "Silver";
door3.doors();
System.out.println("Create 4th copy of the Door");
System.out.println(door3.name + " " + door3.height + " " + door3.price + " " + door3.color); 

Door door4 = new Door();
door4.name = "Barn door";
door4.height = "245cm";
door4.price = 4500;
door4.color = "Gold";
door4.doors();
System.out.println("Create 5th copy of the Door");
System.out.println(door4.name + " " + door4.height + " " + door4.price + " " + door4.color); 

Door door5 = new Door();
door5.name = "Bifold door";
door5.height = "345cm";
door5.price = 7000;
door5.color = "Brown";
door5.doors();
System.out.println("Create 6th copy of the Door");
System.out.println(door5.name + " " + door5.height + " " + door5.price + " " + door5.color); 

Door door6 = new Door();
door6.name = "Pocket door";
door6.height = "450cm";
door6.price = 4500;
door6.color = "Blue";
door6.doors();
System.out.println("Create 7th copy of the Door");
System.out.println(door6.name + " " + door6.height + " " + door6.price + " " + door6.color); 

Door door7 = new Door();
door7.name = "Dutch door";
door7.height = "350cm";
door7.price = 3500;
door7.color = "Pink";
door7.doors();
System.out.println("Create 8th copy of the Door");
System.out.println(door7.name + " " + door7.height + " " + door7.price + " " + door7.color); 

Door door8 = new Door();
door8.name = "Sliding glass door";
door8.height = "248cm";
door8.price = 3800;
door8.color = "Gold";
door8.doors();
System.out.println("Create 9th copy of the Door");
System.out.println(door8.name + " " + door8.height + " " + door8.price + " " + door8.color); 

Door door9 = new Door();
door9.name = "French doors";
door9.height = "246cm";
door9.price = 2500;
door9.color = "Maroon";
door9.doors();
System.out.println("Create 10th copy of the Door");
System.out.println(door9.name + " " + door9.height + " " + door9.price + " " + door9.color); 
}
}