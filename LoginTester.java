class LoginTester{
	public static void main(String[] args) {
		Login.checkLogin("abc@gmail.com","java");
		Login.checkLogin("email@email.com","password");
		Login.checkLogin(1234567890,"java");
		Login.checkLogin(7653,"password");

	}
}