package model;


import java.util.Objects;

public class Client {
    private String surName;
    private String name;
    private String personalSecurityNumber;
    private int id;
    private String adress;
    private int phoneNumber;
    private String email;
    private boolean hasDriverLicence;


    public Client(String surName, String name, String personalSecurityNumber, int id, String adress, int phoneNumber, String email, boolean hasDriverLicence) {
        this.surName = surName;
        this.name = name;
        this.personalSecurityNumber = personalSecurityNumber;
        this.id = id;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hasDriverLicence = hasDriverLicence;
    }


    public String getSurName() {return surName;}
    public void setSurName(String surName) {this.surName = surName;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getPersonalSecurityNumber() {return personalSecurityNumber;}
    public void setPersonalSecurityNumber(String personalSecurityNumber) {this.personalSecurityNumber = personalSecurityNumber;}

    public int getId() {return id;}
    public void setId(int userNumber) {this.id = id;}

    public String getAdress() {return adress;}
    public void setAdress(String adress) {this.adress = adress;}

    public int getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(int phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public boolean isHasDriverLicence() {return hasDriverLicence;}
    public void setHasDriverLicence(boolean hasDriverLicence) {this.hasDriverLicence = hasDriverLicence;}


    @Override
    public String toString() {
        return "The Client " + surName  + name + " with personal security number " + personalSecurityNumber  +
                ", ID " + id + ", adress " + adress  +", phone number +40" + phoneNumber +", email " + email + ", has Driver Licence " +
                hasDriverLicence ;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime * personalSecurityNumber.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        if(client.getPersonalSecurityNumber()==this.personalSecurityNumber){
            return true;
        }
        else return false;
    }
}
