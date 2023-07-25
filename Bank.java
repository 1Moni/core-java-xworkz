class Bank{
private int bankId;
private String bankName;
private String bankBranch;
private String branchCode;
private String address;
private long helplineNo;
private String branchManager;
private String ifscCode;
private String miscCode;
private int noOfLockers;
private int noOfEmployes;
private String timings;
private String websiteDetails;
//setter and getter
public void setBankId(int bankId){
this.bankId=bankId;
}
public int getBankId(){
	return bankId;
}
public void setBankName(String bankName){
this.bankName=bankName;
}
public String getBankName(){
	return bankName;
}
public void setBankBranch(String bankBranch){
this.bankBranch=bankBranch;
}
public String getBankBranch(){
	return bankBranch;
}
public void setBranchCode(String branchCode){
	this.branchCode=branchCode;
}
public String getBranchCode(){
	return branchCode;
}
public void setAddress(String address){
	this.address=address;
}
public String getAddress(){
	return address;
}
public void setHelplineNo(long helplineNo){
	this.helplineNo=helplineNo;
}
public long getHelplineNO(){
	return helplineNo;
}
public void setBranchManager(String branchManager){
	this.branchManager=branchManager;
}
public String getBranchManager(){
	return branchManager;
}
public void setIfscCode(String ifscCode){
	this.ifscCode=ifscCode;
}
public String getIfscCode(){
	return ifscCode;
}
public void setMiscCode(String miscCode){
	this.miscCode=miscCode;
}
public String getMiscCode(){
	return miscCode;
}
public void setNoofLockers(int noOfLockers){
	this.noOfLockers=noOfLockers;
}
public int getNoOfLockers(){
	return noOfLockers;
}
public void setNoOfEmployes(int noOfEmployes){
	this.noOfEmployes=noOfEmployes;
}
public int getNoOfEmployes(){
	return noOfEmployes;
}
public void setTimings(String timings){
	this.timings=timings;
}
public String getTimings(){
	return timings;
}
public void setWebsiteDetails(String websiteDetails){
	this.websiteDetails=websiteDetails;
}
public String getWebsiteDetails(){
	return websiteDetails;
}
}