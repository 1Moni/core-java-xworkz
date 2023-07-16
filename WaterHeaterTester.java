class WaterHeaterTester{
public static void main(String args[]){

WaterHeater waterHeater = new WaterHeater();
waterHeater.brandName = "Rheem";
waterHeater.capacity = "2L";
waterHeater.price = 1250;
waterHeater.color = "white";
waterHeater.toFilter();
System.out.println("Create 1st copy of the WaterHeater");
System.out.println(waterHeater.brandName + " " + waterHeater.capacity + " " + waterHeater.price + " " + waterHeater.color);

WaterHeater waterHeater1 = new WaterHeater();
waterHeater1.brandName = "AO Smith";
waterHeater1.capacity = "20L";
waterHeater1.price = 1450;
waterHeater1.color = "black";
waterHeater1.toFilter();
System.out.println("Create 1st copy of the WaterHeater");
System.out.println(waterHeater1.brandName + " " + waterHeater1.capacity + " " + waterHeater1.price + " " + waterHeater1.color);

WaterHeater waterHeater2 = new WaterHeater();
waterHeater2.brandName = "Bradford White";
waterHeater2.capacity = "12L";
waterHeater2.price = 2500;
waterHeater2.color = "pink";
waterHeater2.toFilter();
System.out.println("Create 2nd copy of the WaterHeater");
System.out.println(waterHeater2.brandName + " " + waterHeater2.capacity + " " + waterHeater2.price + " " + waterHeater2.color);

WaterHeater waterHeater3 = new WaterHeater();
waterHeater3.brandName = "Navien";
waterHeater3.capacity = "9L";
waterHeater3.price = 5000;
waterHeater3.color = "blue";
waterHeater3.toFilter();
System.out.println("Create 3rd copy of the WaterHeater");
System.out.println(waterHeater3.brandName + " " + waterHeater3.capacity + " " + waterHeater3.price + " " + waterHeater3.color);

WaterHeater waterHeater4 = new WaterHeater();
waterHeater4.brandName = "Rinnai";
waterHeater4.capacity = "8L";
waterHeater4.price = 5600;
waterHeater4.color = "Red";
waterHeater4.toFilter();
System.out.println("Create 4th copy of the WaterHeater");
System.out.println(waterHeater4.brandName + " " + waterHeater4.capacity + " " + waterHeater4.price + " " + waterHeater4.color);

WaterHeater waterHeater5 = new WaterHeater();
waterHeater5.brandName = "Noritz";
waterHeater5.capacity = "7L";
waterHeater5.price = 3700;
waterHeater5.color = "Gold";
waterHeater5.toFilter();
System.out.println("Create 5th copy of the WaterHeater");
System.out.println(waterHeater5.brandName + " " + waterHeater5.capacity + " " + waterHeater5.price + " " + waterHeater5.color);

WaterHeater waterHeater6 = new WaterHeater();
waterHeater6.brandName = "Bosch";
waterHeater6.capacity = "6L";
waterHeater6.price = 7000;
waterHeater6.color = "Silver";
waterHeater6.toFilter();
System.out.println("Create 6th copy of the WaterHeater");
System.out.println(waterHeater6.brandName + " " + waterHeater6.capacity + " " + waterHeater6.price + " " + waterHeater6.color);

WaterHeater waterHeater7 = new WaterHeater();
waterHeater7.brandName = "State Industries";
waterHeater7.capacity = "5L";
waterHeater7.price = 10000;
waterHeater7.color = "Multicolor";
waterHeater7.toFilter();
System.out.println("Create 1st copy of the WaterHeater");
System.out.println(waterHeater7.brandName + " " + waterHeater7.capacity + " " + waterHeater7.price + " " + waterHeater7.color);

WaterHeater waterHeater8 = new WaterHeater();
waterHeater8.brandName = "American Standard";
waterHeater8.capacity = "4L";
waterHeater8.price = 11500;
waterHeater8.color = "Brown";
waterHeater8.toFilter();
System.out.println("Create 8th copy of the WaterHeater");
System.out.println(waterHeater8.brandName + " " + waterHeater8.capacity + " " + waterHeater8.price + " " + waterHeater8.color);

WaterHeater waterHeater9 = new WaterHeater();
waterHeater9.brandName = "Whirlpool";
waterHeater9.capacity = "3L";
waterHeater9.price = 15000;
waterHeater9.color = "Maroon";
waterHeater9.toFilter();
System.out.println("Create 9th copy of the WaterHeater");
System.out.println(waterHeater9.brandName + " " + waterHeater9.capacity + " " + waterHeater9.price + " " + waterHeater9.color);

}
}