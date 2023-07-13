class SuperMarket{
/*//show 5 vegetables
static String vegetable1="Potato";
static String vegetable2="Carrot";
static String vegetable3="Beans";
static String vegetable4="Capsicum";
static String vegetable5="Onion";
// biscuits 10
static String biscuit1="Dark Fantacy";
static String biscuit2="Oreo";
static String biscuit3="Horlicks";
static String biscuit4="Burbon";
static String biscuit5="Gooday";
static String biscuit6="Unibic";
static String biscuit7="Mom's Magic";
static String biscuit8="Miliky Bicis";
static String biscuit9="Britania";
static String biscuit10="marie light";
// perfumes 10
static String perfume1="Fogg";
static String perfume2="Eva";
static String perfume3="Axe";
static String perfume4="Set Wet";
static String perfume5="Ks";
static String perfume6="Foog Googly";
static String perfume7="Engage";
static String perfume8="Envy ";
static String perfume9="Secret";
static String perfume10="Bella Vita";
// Groceries10
static String grocerie1="Oil";
static String grocerie2="Toor Dal";
static String grocerie3="Ragi";
static String grocerie4="Wheat";
static String grocerie5="Rice";
static String grocerie6="Gram Flor";
static String grocerie7="Tea";
static String grocerie8="Peper";
static String grocerie9="Ghee";
static String grocerie10="Dry Fruits";


public static void main(String args[]){
System.out.println("Main Started");
System.out.println("List of vegetable are:");
System.out.println("1st Rack "+vegetable1);
System.out.println("2nd Rack "+vegetable2);
System.out.println("3rd Rack "+vegetable3);
System.out.println("4th Rack "+vegetable4);
System.out.println("5th Rack "+vegetable5);

System.out.println("List of Biscuits are:");
System.out.println("1st Rack "+biscuit1);
System.out.println("2nd Rack "+biscuit2);
System.out.println("3rd Rack "+biscuit3);
System.out.println("4th Rack "+biscuit4);
System.out.println("5th Rack "+biscuit5);
System.out.println("6th Rack "+biscuit6);
System.out.println("7th Rack "+biscuit7);
System.out.println("8th Rack "+biscuit8);
System.out.println("9th Rack "+biscuit9);
System.out.println("10th Rack "+biscuit10);

System.out.println("List of perfumes are:");
System.out.println("1st Rack "+perfume1);
System.out.println("2nd Rack "+perfume2);
System.out.println("3rd Rack "+perfume3);
System.out.println("4th Rack "+perfume4);
System.out.println("5th Rack "+perfume5);
System.out.println("6th Rack "+perfume6);
System.out.println("7th Rack "+perfume7);
System.out.println("8th Rack "+perfume8);
System.out.println("9th Rack "+perfume9);
System.out.println("10th Rack "+perfume10);

System.out.println("List of Groceries are :");
System.out.println("1st Rack "+grocerie1);
System.out.println("2nd Rack "+grocerie2);
System.out.println("3rd Rack "+grocerie3);
System.out.println("4th Rack "+grocerie4);
System.out.println("5th Rack "+grocerie5);
System.out.println("6th Rack "+grocerie6);
System.out.println("7th Rack "+grocerie7);
System.out.println("8th Rack "+grocerie8);
System.out.println("9th Rack "+grocerie9);
System.out.println("10th Rack "+grocerie10);
System.out.println("Main Ended");*/

static String vegetables[]= {"Potato", "Carrot", "Beans" , "Brinjal" , "Onion"};
static String biscuits [] = {"Oreo" , "Dark Fantacy" , "Horlicks" , "Burbon" , "Gooday" , "Unibic" , "Mom's Magic" , "Miliky Bicis" , "Britania" , "marie light"};
static String perfumes [] = {"Fogg", "Eva" , "Axe" , "Set Wet" , "Ks" , "Foog Googly" , "Engage" , "Envy" , "Secret" , "Bella Vita"};
static String groceries [] = {"Oil","Toor Dal","Ragi","Wheat","Rice","Gram Flor","Paper","Tea","Ghee","Dry Fruits"};
static String cosmetics[]={"Cream","Powder","LipStick","EyeLiner","EyeShadow","Foundation","Mascara","Blush","Serum","Primer","Lotion","FacePack","FaceWash","FacePuff","HairGel","HairSpray","HairBrush","HairComb","Stickers","Mirror","LipLiner","NailPolish","Bronzer","Brightner","LipPencil"};
public static void main(String market[])
	{
		System.out.println("Main Started");
		getVegetables();
		getBiscuits();
		getGroceries();
		getPerfumes();
		getCosmetics();
	}
    //System.out.println(vegetables[0] + " " + vegetables[1] + " " + vegetables[2] + " " + vegetables[3] + " " + vegetables[4]);
	public static void getVegetables(){
		System.out.println("Inside getVegetables");
		for(String vegetable:vegetables){
			System.out.println(vegetable);	
		}	
	}
	
	//System.out.println("List of perfumes are");
	//System.out.println(perfumes[0] + " " + perfumes[1] + " " + perfumes[2] + " " + perfumes[3] + " " + perfumes[4] + " " + perfumes[5] + " " + perfumes[6] + " " + perfumes[7] + " " + perfumes[8] + " " + perfumes[9] );
	
	// public static void main(String perfumes[]){
	// System.out.println("Main Started");
	// System.out.println("List of perfumes are");
	// getPerfumes();
	// }
	public static void getPerfumes(){
		System.out.println("Inside getPerfumes");
		for(String perfume:perfumes){
			System.out.println(perfume);	
		}	
	}
	
	
	//(System.out.println("List of groceries are");
	//System.out.println(groceries[0] + " " + groceries[1] + " " + groceries[2] + " " + groceries[3] + " " + groceries[4] + " " + groceries[5] + " " + groceries[6] + " " + groceries[7] + " " + groceries[8] + " " + groceries[9]);
	
	
	// System.out.println("Main Started");
	
	// System.out.println("List of groceries are");
	
	// getGroceries();
	// }
	public static void getGroceries(){
		System.out.println("Inside getGroceries");
		for(String grocerie:groceries){
			System.out.println(grocerie);	
		}	
	}
	
	
	
	//System.out.println("List of biscuits are");
	//System.out.println(biscuits[0] + " " + biscuits[1] + " " + biscuits[2] + " " + biscuits[3] + " " + biscuits[4] + " " + biscuits[5] + " " + biscuits[6] + " " + biscuits[7] + " " + biscuits[8] + " " + biscuits[9]);
	// public static void main(String biscuits[]){
	// System.out.println("Main Started");
	// System.out.println("List of perfumes are");
	// getBiscuits();
	// }
	public static void getBiscuits(){
		System.out.println("Inside getBiscuits");
		for(String biscuit:biscuits){
			System.out.println(biscuit);	
		}	
	}
	
	
	//System.out.println("List Of cosmetics are");
	//System.out.println(cosmetics[0] + " " + cosmetics[1] + " " + cosmetics[2] + " " + cosmetics[3] + " " + cosmetics[4] + " " + cosmetics[5] + " " + cosmetics[6] + " " + cosmetics[7] + " " + cosmetics[8] + " " + cosmetics[9] + " " + cosmetics[10] + " " + cosmetics[11] + " " + cosmetics[12] + " " + cosmetics[13] + " " + cosmetics[14] + " " + cosmetics[15] + " " + cosmetics[16] + " " + cosmetics[17] + " " + cosmetics[18] + " " + cosmetics[19] + " " + cosmetics[20] + " " + cosmetics[21] + " " + cosmetics[22] + " " + cosmetics[23] + " " +cosmetics[24]);
	// public static void main(String cosmetics[]){
	// System.out.println("Main Started");
	// System.out.println("List of cosmetics are");
	// getCosmetics();
	// }
	public static void getCosmetics(){
		System.out.println("Inside getCosmetics");
		for(String cosmetic:cosmetics){
			System.out.println(cosmetic);	
		}	
	}
	

}







