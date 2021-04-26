package data;

import model.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DataReader {
    private static final String CARPATH = "./resources/cars.txt";
    private static final String SCOOTERPATH = "./resources/electricScooters.txt";
    public List<Car> readCarsFromFile() {
        List<Car> listOfCars = new ArrayList<>();
        File carFile = new File(CARPATH);

        if (!carFile.exists()) {
            System.out.println("File not found, check path");
            return listOfCars;
        }

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(carFile);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(",");
                String idS = words[0].trim();
                String pricePerDayS = words[1].trim();
                String numberOfKmS = words[2].trim();
                String availabilityS = words[3].trim();
                String colourS = words[4].trim();
                String registrationPlate = words[5].trim();
                String type = words[6].trim();
                String model = words[7].trim();
                String gearTypeS = words[8].trim();
                String featuresS = words[9].trim();
                String numberOfSeatsS = words[10].trim();
                String numberOfDorsS = words[11].trim();
                String isElectricS = words[12].trim();
                String fuelTypeS = words[13].trim();

                int id = Integer.parseInt(idS);
                double pricePerDay = Double.parseDouble(pricePerDayS);
                int numberOfKm = Integer.parseInt(numberOfKmS);
                boolean availability = Boolean.parseBoolean(availabilityS);
                Colour colour = Colour.valueOf(colourS);
                GearType gearType = GearType.valueOf(gearTypeS);
                String[] featureArray = featuresS.split(";");
                List<String> features = Arrays.asList(featureArray);
                int numberOfSeats = Integer.parseInt(numberOfSeatsS);
                int numberOfDors = Integer.parseInt(numberOfDorsS);
                boolean isElectric = Boolean.parseBoolean(isElectricS);
                FuelType fuelType = FuelType.valueOf(fuelTypeS);

                Car car = new Car(id, pricePerDay, numberOfKm, availability, colour, registrationPlate,
                        type, model, gearType, features, numberOfSeats, numberOfDors, isElectric, fuelType);
                listOfCars.add(car);


            }
        } catch (IOException e) {

        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {

            }
        }
        return listOfCars;
    }

        public List<ElectricScooter> readElectricScooterFromFile() {
            List<ElectricScooter> listOfElectricScooter = new ArrayList<>();
            File scooterFile = new File(SCOOTERPATH);

            if (!scooterFile.exists()) {
                System.out.println("File not found, check path");
                return listOfElectricScooter;
            }
            FileReader fres = null;
            BufferedReader bres = null;
            try {
                fres = new FileReader(scooterFile);
                bres = new BufferedReader(fres);
                String line;
                while ((line = bres.readLine()) != null) {
                    String[] words = line.split(",");

                    String idS = words[0].trim();
                    String pricePerDayS = words[1].trim();
                    String numberOfKmS = words[2].trim();
                    String availabilityS = words[3].trim();
                    String colourS = words[4].trim();
                    String model = words[5].trim();
                    String batteryLevelS = words[6].trim();

                    int id = Integer.parseInt(idS);
                    double pricePerDay = Double.parseDouble(pricePerDayS);
                    int numberOfKm = Integer.parseInt(numberOfKmS);
                    boolean availability = Boolean.parseBoolean(availabilityS);
                    Colour colour = Colour.valueOf(colourS);
                    double batteryLevel = Double.parseDouble(batteryLevelS);

                    ElectricScooter electricScooter = new ElectricScooter(id, pricePerDay, numberOfKm, availability, colour, model, batteryLevel);
                    listOfElectricScooter.add(electricScooter);
                }
            }
            catch (IOException e) {

            }
            finally {
                try {
                    if (fres != null) {
                        fres.close();
                    }
                    if (bres != null) {
                        bres.close();
                    }
                } catch (IOException e) {

                }
            }
            return listOfElectricScooter;

        }

    }

