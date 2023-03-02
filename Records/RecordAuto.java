package Records;

import Entity.*;

import java.util.Scanner;



public class RecordAuto {
    Scanner input = new Scanner(System.in);

    public motorbike registradeMotor() {
            System.out.println("---------------Cadastro Moto----------------\n");
            System.out.println("Digite o a marca da moto: ");
            String motorBrand = input.next();

            System.out.println("Digite o modelo: ");
            String motorModel = input.next();

            System.out.println("Qual é a cor da Moto : ");
            String motorColor = input.next();

            System.out.println("Digite a númeração da placa: ");
            String motorBoard = input.next();


            System.out.println("Quantas cilindradas (cm3) : ");

            String motorCilindrada = input.next();

            System.out.println("---------------Cadastro Moto----------------\n");


            System.out.println("------------Sucesso-----------------\n");
            System.out.println("Motorista Cadastrado\n");
            System.out.println("------------Sucesso-----------------");

            return new motorbike(motorBrand, motorModel, motorColor, motorBoard,motorCilindrada);

    }

    public Car RegistrateCar() {

            System.out.println("---------------Cadastro Carro----------------");
            System.out.println("Digite o a marca do veículo: ");
            String autoBrand = input.next();

            System.out.println("Digite o modelo do veículo: ");
            String autoModel = input.next();

            System.out.println("Qual é a cor do veículo : ");
            String autoColor = input.next();

            System.out.println("Digite a númeração da placa: ");
            String autoBoard = input.next();
            System.out.println("---------------Cadastro Carro----------------");


            System.out.println("------------Sucesso-----------------\n");
            System.out.println("Motorista Cadastrado\n");
            System.out.println("------------Sucesso-----------------");


            return new Car(autoBrand, autoModel, autoColor, autoBoard);

    }

    public Truck RegistrateTruck() {
            System.out.println("---------------Cadastro Caminhão----------------");
            System.out.println("Digite a marca do caminhão : ");
            String TruckMarca = input.next();

            System.out.println("Digite o modelo: ");
            String TruckModel = input.next();

            System.out.println("Qual a cor ?: ");
            String TruckColor = input.next();

            System.out.println("Digite o número da placa: ");
            String TruckBoard = input.next();

            System.out.println("Digite a categoria (leve/Medio/Pesado): ");
            String TruckCategory = input.next();
            System.out.println("---------------Cadastro Caminhão----------------\n");


            System.out.println("------------Sucesso-----------------\n");
            System.out.println("Motorista Cadastrado\n");
            System.out.println("------------Sucesso-----------------");


            return new Truck(TruckMarca, TruckModel, TruckColor, TruckBoard,
                     TruckCategory);
    }

}