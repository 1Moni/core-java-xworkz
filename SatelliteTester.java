class SatelliteTester{
public static void main(String args[]){

Satellite satellite = new Satellite();
satellite.name = "Hubble Space Telescope";
satellite.launchPlace = "NASA.";
satellite.launchYear = 1990;
satellite.founder = "Space Shuttle Discovery by NASA.";
satellite.forConnection();
System.out.println("Create 1st copy of the Satellite");
System.out.println(satellite.name + " " + satellite.launchPlace + " " + satellite.launchYear + " " + satellite.founder);

Satellite satellite1 = new Satellite();
satellite1.name = "International Space Station";
satellite1.launchPlace = "USA";
satellite1.launchYear = 1998;
satellite1.founder = "multiple space agencies";
satellite1.forConnection();
System.out.println("Create 2nd copy of the Satellite");
System.out.println(satellite1.name + " " + satellite1.launchPlace + " " + satellite1.launchYear + " " + satellite1.founder);

Satellite satellite2 = new Satellite();
satellite2.name = "GPS IIR-20 (USA-204) ";
satellite2.launchPlace = " USA by the U.S. Air Force.";
satellite2.launchYear = 2004;
satellite2.founder = "Cape Canaveral";
satellite2.forConnection();
System.out.println("Create 3rd copy of the Satellite");
System.out.println(satellite2.name + " " + satellite2.launchPlace + " " + satellite2.launchYear + " " + satellite2.founder);

Satellite satellite3 = new Satellite();
satellite3.name = "Terra (EOS AM-1) ";
satellite3.launchPlace = "California";
satellite3.launchYear = 1999;
satellite3.founder = "Vandenberg Air Force Base";
satellite3.forConnection();
System.out.println("Create 4th copy of the Satellite");
System.out.println(satellite3.name + " " + satellite3.launchPlace + " " + satellite3.launchYear + " " + satellite3.founder);

Satellite satellite4 = new Satellite();
satellite4.name = "Aqua (EOS PM-1)";
satellite4.launchPlace = "USA by NASA.";
satellite4.launchYear = 2002;
satellite4.founder = "Vandenberg Air Force Base";
satellite4.forConnection();
System.out.println("Create 5th copy of the Satellite");
System.out.println(satellite4.name + " " + satellite4.launchPlace + " " + satellite4.launchYear + " " + satellite4.founder);

Satellite satellite5 = new Satellite();
satellite5.name = "Landsat 8";
satellite5.launchPlace = "USGS";
satellite5.launchYear = 2013;
satellite5.founder = "Vandenberg Air Force Base";
satellite5.forConnection();
System.out.println("Create 6th copy of the Satellite");
System.out.println(satellite5.name + " " + satellite5.launchPlace + " " + satellite5.launchYear + " " + satellite5.founder);

Satellite satellite6 = new Satellite();
satellite6.name = "GOES-16";
satellite6.launchPlace = "USA";
satellite6.launchYear = 2016;
satellite6.founder = "USA by NOAA and NASA.";
satellite6.forConnection();
System.out.println("Create 7th copy of the Satellite");
System.out.println(satellite6.name + " " + satellite6.launchPlace + " " + satellite6.launchYear + " " + satellite6.founder);

Satellite satellite7 = new Satellite();
satellite7.name = "RADARSAT-2 ";
satellite7.launchPlace = "Canada";
satellite7.launchYear = 2007;
satellite7.founder = "Canadian Space Agency ";
satellite7.forConnection();
System.out.println("Create 8th copy of the Satellite");
System.out.println(satellite7.name + " " + satellite7.launchPlace + " " + satellite7.launchYear + " " + satellite7.founder);

Satellite satellite8 = new Satellite();
satellite8.name = "Sentinel-2A";
satellite8.launchPlace = "Europe";
satellite8.launchYear = 2015;
satellite8.founder = "European Space Agency";
satellite8.forConnection();
System.out.println("Create 9th copy of the Satellite");
System.out.println(satellite8.name + " " + satellite8.launchPlace + " " + satellite8.launchYear + " " + satellite8.founder);

Satellite satellite9 = new Satellite();
satellite9.name = "Chandrayaan-2";
satellite9.launchPlace = "India";
satellite9.launchYear = 2019;
satellite9.founder = "Indian Space Research Organisation (ISRO)";
satellite9.forConnection();
System.out.println("Create 10th copy of the Satellite");
System.out.println(satellite9.name + " " + satellite9.launchPlace + " " + satellite9.launchYear + " " + satellite9.founder);

}
}