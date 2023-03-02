package Records;

import Entity.*;

import java.util.Scanner;

public class RecordDriver {


    public DriverMotor RegistrateMotor() {



        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do motorista da moto : ");
            String nameDriver = scanner.next();

            System.out.println("Qual a Idade do Motorista: ");
            String ageDriver = scanner.next();

            System.out.println("Digite a CNH do Motorista: ");
            String cnhDriver = scanner.next();

            System.out.println("------------Sucesso-----------------\n");
            System.out.println("Motorista Cadastrado\n");
            System.out.println("------------Sucesso-----------------");



            return new DriverMotor(nameDriver, ageDriver, cnhDriver);
        }

    public DriverCar RegistrateCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do motorista do Veiculo : ");
        String nameDriver = scanner.next();

        System.out.println("Qual a Idade do motorista  : ");
        String ageDriver = scanner.next();

        System.out.println("Digite a CNH do motorista: ");
        String cnhDriver = scanner.next();

        System.out.println("------------Sucesso-----------------\n");
        System.out.println("Motorista Cadastrado\n");
        System.out.println("------------Sucesso-----------------");

        return new DriverCar(nameDriver, ageDriver, cnhDriver);
    }

    public DriverTruck RegistrateTruck() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do motorista do caminhão: ");
        String nameDriver = scanner.next();

        System.out.println("Qual a Idade do motorista:");
        String ageDriver = scanner.next();

        System.out.println("Digite a CNH do motorista: ");
        String cnhDriver = scanner.next();

        System.out.println("------------Sucesso-----------------\n");
        System.out.println("Motorista Cadastrado\n");
        System.out.println("------------Sucesso-----------------");

        return new DriverTruck(nameDriver, ageDriver, cnhDriver);
    }


}
