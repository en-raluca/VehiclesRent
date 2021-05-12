package data;

import model.Car;
import model.Client;
import model.Rent;
import model.Vehicle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class DataWriter {
    public void generateRentFile(Rent rent, Vehicle vehicle, Client client, Car car){
        String directoryName = "./rentDir";
        String fileName = "/Rent.txt";

    File dir = new File(directoryName);
        if (!dir.exists()){
        dir.mkdir();
    }
    File file = new File(dir, fileName);
        if(!file.exists()){
        try{
            file.createNewFile();
        }
        catch (IOException ex){
            System.out.println("The file was not created");
        }
    }
    FileWriter fw = null;
    BufferedWriter bw = null;
    try{
        fw = new FileWriter(file);
        bw = new BufferedWriter(fw);
        bw.write("Hello, " + client.getName() + " "+ client.getSurName());
        bw.newLine();
        bw.newLine();
        bw.write("Today " + rent.getReservationDate() + " you have successfully booked the vehicle "+ car.getType() + " "+car.getModel());
        bw.newLine();
        bw.write("The booking information are:");
        bw.newLine();
        bw.write("The reservation with ID is: " + rent.getReservationId()+".");
        bw.newLine();
        bw.write("Your ID is: " + rent.getClientId()+".");
        bw.newLine();
        bw.write("The vehicle you selected ID is: " + vehicle.getId()+ " and has the registration plate : "+car.getRegistrationPlate()+".");
        bw.newLine();
        bw.write("You booked the vehicle for " + rent.getDaysNumber() +" days "+", starting from: " + rent.getStartDate()+".");
        bw.newLine();
        bw.write("Your total cost is " + rent.getTotalPrice() + "EUR");
        bw.newLine();
        bw.newLine();
        bw.write("Thank you for renting from us.");
        bw.newLine();

        bw.flush();
    }
        catch (IOException e){
        System.out.println("Failed to write to file");
    }
    finally{
        try {
            if(fw != null){
                fw.close();
            }
            if(bw != null) {
                bw.close();
            }
        }
        catch (IOException e){

        }
    } }
}

