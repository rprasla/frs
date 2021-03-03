package com.company;

public class Passenger {
    public int id;
    private static int idCounter = 0;

    public static class Address {
        public String street;
        public String city;
        public String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    public Passenger(String street, String city, String state, String name, String phone, String email){
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }
    private Address address;
    private Contact contact;

    public class Contact {
        public String name;
        public String phone;
        public String email;

        public Contact(String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getContactDetails() {
            return name + "' " + phone + "' " + email;
        }

        public void updateContactDetails(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

}









}







