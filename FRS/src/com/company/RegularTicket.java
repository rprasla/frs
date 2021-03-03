package com.company;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnr, String from, String to, String departureDateTime,
                         String arriavalDateTime, String seatNo, float price, boolean cancelled,
                         Flight flight, Passenger passenger, String specialServices){
        super(pnr, from, to, departureDateTime, arriavalDateTime, seatNo, price, cancelled, flight, passenger);
        this.specialServices = specialServices;
    }

    public String getSpecialServices(){
        return specialServices;
    }

    public void setSpecialServices(String specialServices){

    }



}
