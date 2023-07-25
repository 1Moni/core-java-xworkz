class TicketBookingTester{
public static void main(String args[]){
TicketBooking ticketBooking = new TicketBooking();
ticketBooking.setBookingId(1);
ticketBooking.setNoOfSeats(4);
ticketBooking.setSource("Mandya");
ticketBooking.setDestination("Banglore");
ticketBooking.setDate("12-7-23");
ticketBooking.setTimings("3pm");
ticketBooking.setPrice("150Rs");
ticketBooking.setClasss("Slepper Coach");
ticketBooking.setBookingType("Online");
ticketBooking.setTransportName("SRS");
System.out.println(ticketBooking.getBookingId() + " "+ ticketBooking.getNoOfSeats() + " "+ ticketBooking.getSource() + " "+ ticketBooking.getDestination() + " "+ ticketBooking.getDate() + " "+ ticketBooking.getTimings() + " "+ ticketBooking.getPrice() + " "+ ticketBooking.getClass() + " "+ ticketBooking.getBookingType() + " "+ ticketBooking.getTransportName());







}





}