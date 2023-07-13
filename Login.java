class Login{
	static long phno=1234567890;
	static String emailId="abc@gmail.com";
	static String strPw="java";
	public static boolean checkLogin(String em, String pw){
		if(em==emailId&&pw==strPw){
			System.out.println("corrrect login details");
			return true;
		}
		else {
			System.out.println("Wrong login details. try again");
			return false;
		}
	}
	public static boolean checkLogin(long ph, String pw){
		if(ph==phno&&pw==strPw){
			System.out.println("corrrect login details");
			return true;
		}
		else {
			System.out.println("Wrong login details. try again");
			return false;
		}
	}
}