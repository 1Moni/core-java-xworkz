class StudentTester{
  public static void main(String args[]){
     
 
 Student student = new Student();
   
student.setStudentId(1);
student.setStudentName("moni");
student.setMarks(456);
student.setEmail("jaanu@gmail.com");
        student.setAdress("Mandya");
        student.setPhoneNumber(99027645);
        student.setSection("A section");
        student.setDob("16-04-2001");

System.out.println(student.getStudentName() + " " + student.getMarks() + " " + student.getEmail() + " " + student.getAdress()
+ " " +student.getStudentId() + " " + student.getPhoneNumber() + " " + student.getSection() + " " + student.getDob());



}
}