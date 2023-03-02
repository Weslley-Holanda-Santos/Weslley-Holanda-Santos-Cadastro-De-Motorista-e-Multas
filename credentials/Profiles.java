package credentials;

import Records.*;
import DataStorage.Data;
import Entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Profiles {

    Scanner input = new Scanner(System.in);

    Data data = new Data();
    RecordDriver recordDriver = new RecordDriver();
    RecordAuto recordAuto = new RecordAuto();
    RecordPenalty recordPenalty = new RecordPenalty();


    ArrayList<DriverMotor> driverMotor = new ArrayList<>();
    ArrayList<DriverCar> DriverAuto = new ArrayList<>();
    ArrayList<DriverTruck> driverTruck = new ArrayList<>();
    ArrayList<motorbike> motorbikes = new ArrayList<>();
    ArrayList<Car> Autos = new ArrayList<>();
    ArrayList<Truck> trucks = new ArrayList<>();
    ArrayList<PenaltyMotor> penaltyMotor = new ArrayList<>();
    ArrayList<PenaltyAuto> penaltyAuto =new ArrayList<>();
    ArrayList<PenaltyTruck> penaltyTruck =new ArrayList<>();

public void ViewDriver(){

    int chose = 99;

    do {
        System.out.println("Selecione a opção que deseja acessar\n\n");
        System.out.println("Digite a opção: ");
        System.out.println("1 - Visualizar multas \n" +
                "2 - Visualizar multas totais dos veiculos \n" +
                "3 - Visualizar  multas totais da empresa \n" +

                "0 - Voltar para o menu anterior ");
        chose = input.nextInt();
        switch (chose) {

            case 1:
                data.ViewMotor(penaltyMotor);
                data.ViewAuto(penaltyAuto);
                data.viewTruck(penaltyTruck);
                break;
            case 2:
                data.totalInfractionMotor(penaltyMotor);
                data.totalInfractionAuto(penaltyAuto);
                data.totalInfractionTruck(penaltyTruck);
                break;
            case 3:
                data.totalInfraction(penaltyMotor, penaltyAuto, penaltyTruck);
                break;
        }
    }while (chose!=0);

}

public void viewAgent(){

    String name;
    String password;

    System.out.println("Digite o Usuario do TOken Agente:");
    name= input.next().toLowerCase();
    System.out.println("Digite a Senha do Token:");
    password= input.next();


    if(name.equals("wesley") || name.equals("kaua") || name.equals("lucas") && password.equals("123")) {

        int chose = 99;

        do {
            System.out.println("Selecione a opção que deseja acessar\n\n");
            System.out.println("Digite a opção: ");
            System.out.println("1 - Cadastrar motorista de Moto \n" +
                    "2 - Cadastrar motorista de automovel \n" +
                    "3 - Cadastrar motorista de caminhão \n" +
                    "4 - Cadastrar moto \n" +
                    "5 - Cadastrar automóvel \n" +
                    "6 - Cadastrar caminhão \n" +
                    "7 - Cadastrar multa moto \n" +
                    "8 - Cadastrar multa automovel \n" +
                    "9 - Cadastrar multa caminhão \n" +
                    "\n" +
                    "0 - Voltar para o Menu ");
            chose = input.nextInt();

            switch (chose) {

                case 1:
                    driverMotor.add(recordDriver.RegistrateMotor());
                    break;
                case 2:
                    DriverAuto.add(recordDriver.RegistrateCar());
                    break;
                case 3:
                    driverTruck.add(recordDriver.RegistrateTruck());
                    break;
                case 4:
                    motorbikes.add(recordAuto.registradeMotor());
                    break;
                case 5:
                    Autos.add(recordAuto.RegistrateCar());
                    break;
                case 6:
                    trucks.add(recordAuto.RegistrateTruck());
                    break;
                case 7:
                    penaltyMotor.add(recordPenalty.RegistrateInfractionMotor(driverMotor, motorbikes));
                    break;
                case 8:
                    penaltyAuto.add(recordPenalty.RegistrateInfractionAuto(DriverAuto, Autos));
                    break;

                case 9:
                    penaltyTruck.add(recordPenalty.RegistrateInfractionTruck(driverTruck, trucks));
                    break;
            }

        } while (chose != 0);
    }else{
        System.out.println("Usuario ou Senha incorreto");
    }

}

public void viewManager(){

    String name;
    String password;

    System.out.println("Digite o Usuario Do Token Gerente:");
    name= input.next().toLowerCase();
    System.out.println("Digite a Senha Do Token:");
    password= input.next();




    if(name.equals("weslley") && password.equals("1502")) {

        int chose = 99;

        do {
            System.out.println("Selecione a opção que deseja acessar\n\n");

            System.out.println("Digite a opção: ");
            System.out.println("1 - Cadastrar motorista da Moto \n" +
                    "2 - Cadastrar motorista de automovel \n" +
                    "3 - Cadastrar motorista de caminhão \n" +
                    "4 - Cadastrar moto \n" +
                    "5 - Cadastrar automóvel \n" +
                    "6 - Cadastrar caminhão \n" +
                    "7 - Cadastrar multa moto \n" +
                    "8 - Cadastrar multa automovel \n" +
                    "9 - Cadastrar multa caminhão \n" +
                    "10 - Visualizar multas de Motos \n" +
                    "11 - Visualizar multas em automóveis \n" +
                    "12 - Visualizar multas em caminhões \n" +
                    "13 - Descrição completa Motos multadas \n" +
                    "14 - Descrição completa automoveis multadas \n" +
                    "15 - Descrição completa caminhões multadas \n" +
                    "16 - Total multas de Motos \n"+
                    "17 - Total multas de automoveis \n"+
                    "18 - Total multas de caminhões \n"+
                    "19 - Total multas da empresa \n"+

                    "\n" +
                    "0 - Voltar para o menu");
            chose = input.nextInt();

            switch (chose) {

                case 1:
                    driverMotor.add(recordDriver.RegistrateMotor());
                    break;
                case 2:
                    DriverAuto.add(recordDriver.RegistrateCar());
                    break;
                case 3:
                    driverTruck.add(recordDriver.RegistrateTruck());
                    break;
                case 4:
                    motorbikes.add(recordAuto.registradeMotor());
                    break;
                case 5:
                    Autos.add(recordAuto.RegistrateCar());
                    break;
                case 6:
                    trucks.add(recordAuto.RegistrateTruck());
                    break;
                case 7:
                    penaltyMotor.add(recordPenalty.RegistrateInfractionMotor(driverMotor, motorbikes));
                    break;
                case 8:
                    penaltyAuto.add(recordPenalty.RegistrateInfractionAuto(DriverAuto, Autos));
                    break;

                case 9:
                    penaltyTruck.add(recordPenalty.RegistrateInfractionTruck(driverTruck, trucks));
                    break;

                case 10:
                    data.returnInfractionMotor(penaltyMotor);
                    break;
                case 11:
                    data.returnInfractionAuto(penaltyAuto);
                    break;
                case 12:
                    data.returnInfractionTruck(penaltyTruck);
                    break;
                case 13:
                    data.ViewMotor(penaltyMotor);
                    break;
                case 14:
                    data.ViewAuto(penaltyAuto);
                    break;
                case 15:
                    data.viewTruck(penaltyTruck);
                    break;
                case 16:
                    data.totalInfractionMotor(penaltyMotor);
                    break;
                case 17:
                    data.totalInfractionAuto(penaltyAuto);
                    break;
                case 18:
                    data.totalInfractionTruck(penaltyTruck);
                    break;
                case 19:
                    data.totalInfraction(penaltyMotor, penaltyAuto, penaltyTruck);
                    break;
            }

        } while (chose != 0);
    }else{
        System.out.println("Usuario ou Senha Incorreto");
    }
}



















}
