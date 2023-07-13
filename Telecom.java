class Telecom{
static String simNames[]={null,null,null,null,null};
static int index;
public static boolean addSimName(String sim){
boolean isAdded=false;
if(sim != null){
simNames[index]=sim;
index++;
isAdded=true;
}else{
System.out.println("cannot add sim,as it is a null value");
}
return isAdded;
}
public static void getAllSimNames(){
System.out.println("Invoking getAllSimName");
for(int sim =0;sim<simNames.length;sim++){
String reference=simNames[sim];
System.out.println("Type of sim " + reference);// + " at index value " + sim);
}

System.out.println("end of getAllSimName");
}
public static boolean updateSimName(String existingSimName,String updatesimName){
	boolean isUpdated=false;
	for(int sim=0;sim<simNames.length;sim++){
		if(simNames[sim].equals(existingSimName)){
			simNames[sim]=updatesimName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int deletesimNames(String deletesimNames){
	System.out.println("invoking editsimNames");
	System.out.println("No of Parameter:2,type of parameter: String,String");
	boolean isDeleted=false;
	int sim;
	int noOfElements=simNames.length;
	for(sim =0;sim<simNames.length;sim++){
		if(simNames[sim].equals(deletesimNames)){
			break;
		}
	}
	if(sim<noOfElements){
		noOfElements=noOfElements-1;
		for(int newsim=sim;newsim<noOfElements;newsim++){
			simNames[newsim]=simNames[newsim+1];
			
		}
		
	}
	System.out.println(noOfElements);
	return noOfElements;
	
}
public static void getAllsimNamesPostDeletion(int newLength){
	for(int sim=0;sim<newLength;sim++){
		System.out.println(simNames[sim]);
	}
	
}
}

	
	
}
