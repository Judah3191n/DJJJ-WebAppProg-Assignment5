package com.Assignment5DJJJ.Assignment5DJJJ;

public class User {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String creditCard;
    private String password;

    public User(String name, String password, String email, String address, String phoneNumber) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setCreditCard(generateCreditCard());
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public String getPassword() {
        return password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    static String generateCreditCard() {
        String cardNumber = "";
        for (int i = 0; i < 16; i++) {
            cardNumber += Integer.toString((int) (Math.random() * 10));
        }

        return cardNumber;
    }
}
