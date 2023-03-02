package Records;

import DataStorage.*;
import Entity.*;


import java.util.ArrayList;
import java.util.Scanner;

public class RecordPenalty {

    Data data = new Data();


    public PenaltyMotor RegistrateInfractionMotor(ArrayList<DriverMotor> DriverM, ArrayList<motorbike> motorbikes) {

                return RegistrateInfractionM(DriverM, motorbikes);
        }


      public PenaltyAuto RegistrateInfractionAuto(ArrayList<DriverCar> DriverA, ArrayList<Car> autos) {

        return RegistrateInfractionA(DriverA,autos);

      }

    public PenaltyTruck RegistrateInfractionTruck(ArrayList<DriverTruck> DriverT, ArrayList<Truck> Truck) {

        return RegistrateT(DriverT,Truck);

    }


    public PenaltyMotor RegistrateInfractionM(ArrayList<DriverMotor> drivers, ArrayList<motorbike> motorbikes) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual o nome do Motorista que Tomou a multa?");
            String nameDriver = scanner.next();
            System.out.println("Qual a placa da Moto?");
            String BoardMotor = scanner.next();
            System.out.println("Qual o tipo da infração ? \n 1-leve \n 2- média \n 3-grave");
            String InfractionMotor = "Não informado";
            String multa = scanner.next();
            if (multa.equals("1")) {
                InfractionMotor = "Leve";
            } else if (multa.equals("2")) {
                InfractionMotor = "Média";
            } else if (multa.equals("3")) {
                InfractionMotor = "Grave";

            } else {
                System.out.println("Infração Não Informada...");
            }
            System.out.println("Qual o valor da multa(Infração)?");
            Double InfractionPrice = scanner.nextDouble();
            DriverMotor driver = data.returnDriver(nameDriver, drivers);
            motorbike motorbike = data.returnMotorBike(BoardMotor, motorbikes);
            return new PenaltyMotor(driver, motorbike, InfractionMotor, InfractionPrice);
        }



    public PenaltyAuto RegistrateInfractionA(ArrayList<DriverCar> motorista, ArrayList<Car> automoveis){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do motorista que levou a multa?");
        String nameDriver = scanner.next();

        System.out.println("Qual a placa do car?");
        String BoardAuto = scanner.next();

        System.out.println("Qual o tipo da infração ? \n 1-leve \n 2- média \n 3-grave");
        String InfractionAuto="Não informado";
        String Infraction=scanner.next();
        if(Infraction.equals("1")){
            InfractionAuto="Leve";
        }else if(Infraction.equals("2")){
            InfractionAuto="Média";
        }else if(Infraction.equals("3")){
            InfractionAuto="Grave";

        }else{
            System.out.println("Infração Não Informada...\"");
        }

        System.out.println("Qual o valor da multa(Infração)?");
        Double InfractionPrice = scanner.nextDouble();


        DriverCar driverCar = data.returnDriverCar(nameDriver,motorista);
        Car car = data.returnAuto(BoardAuto, automoveis);

        return new PenaltyAuto(driverCar, car, InfractionAuto,InfractionPrice);
    }

    public PenaltyTruck RegistrateT(ArrayList<DriverTruck> driver, ArrayList<Truck> Truck){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome do motorista que levou a multa?");
        String NameDriver = scanner.next();

        System.out.println("Qual a placa do Caminhão?");
        String BoardTruck = scanner.next();

        System.out.println("Qual o tipo da infração ? \n 1-leve \n 2- média \n 3-grave");
        String InfractionTruck="Não informado";
        String Infraction=scanner.next();
        if(Infraction.equals("1")){
            InfractionTruck="Leve";
        }else if(Infraction.equals("2")){
            InfractionTruck="Média";
        }else if(Infraction.equals("3")){
            InfractionTruck="Grave";

        }else{
            System.out.println("Infração não informado");
        }

        System.out.println("Qual o valor da multa(Infração)?");
        Double InfractionPrice = scanner.nextDouble();


        DriverTruck driverTruck = data.returnDriverTruck(NameDriver,driver);
        Truck truck = data.returnTruck(BoardTruck, Truck);

        return new PenaltyTruck(driverTruck, truck, InfractionTruck,InfractionPrice);
    }

}
