class BankTester{
public static void main(String args[]){
Bank bank=new Bank();
bank.setBankId(2);
bank.setBankName("Bank of baroda");
bank.setBankBranch("SR Patna");
bank.setBranchCode("BBAP");
bank.setAddress("Personal Bk Branch Mg Road");
bank.setHelplineNo(8014589l);
bank.setBranchManager("Sagar");
bank.setIfscCode("BARBOPBBBA");
bank.setMiscCode("560012015");
bank.setNoofLockers(10);
bank.setNoOfEmployes(200);
bank.setTimings("9am-6pm");
bank.setWebsiteDetails("www.baroda.com");
System.out.println(bank.getBankId() + " "+ bank.getBankName() + " "+ bank.getBankBranch() + " "+ bank.getBranchCode() + " "+ bank.getAddress() + " "+ bank.getHelplineNO() + " "+ bank.getBranchManager() + " "+ bank.getIfscCode() + " "+ bank.getMiscCode() + " "+ bank.getNoOfLockers() + " "+ bank.getNoOfEmployes() + " "+ bank.getTimings() + " "+ bank.getWebsiteDetails());
// System.out.println(bank.getBankName());
 
// System.out.println(bank.getBankBranch());
// System.out.println(bank.getAccountType());


}

}