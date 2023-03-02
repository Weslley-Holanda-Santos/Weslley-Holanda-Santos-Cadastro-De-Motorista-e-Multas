package DataStorage;
;
import Entity.*;
import java.util.ArrayList;

public class Data {

    public DriverCar returnDriverCar(String nameDriver, ArrayList<DriverCar> drivers) {

        for (int i = 0; i <= drivers.size(); i++) {
            if (nameDriver.equals(drivers.get(i).getName())) {
                System.out.println("==================Sucesso======================\n");
                System.out.println("Multa vinculada ao motorista do automovel com sucesso");
                System.out.println("==================Sucesso======================\n");
                return drivers.get(i);

            }
        }
        System.out.println("----------ERROR NULLL----------\n");
        System.out.println("Motorista não encontrado");
        System.out.println("----------ERROR NULLL----------\n");
        return null;
    }

    public DriverTruck returnDriverTruck(String nameDriver, ArrayList<DriverTruck> drivers) {

        for (int i = 0; i <= drivers.size(); i++) {
            if (nameDriver.equals(drivers.get(i).getName())) {
                System.out.println("==================Sucesso======================\n");
                System.out.println("Multa vinculada ao motorista do caminhão com sucesso");
                System.out.println("==================Sucesso======================\n");
                return drivers.get(i);

            }
        }
        System.out.println("----------ERROR NULLL----------\n");
        System.out.println("Motorista não encontrado");
        System.out.println("----------ERROR NULLL----------\n");
        return null;
    }


    public DriverMotor returnDriver(String nameMotor, ArrayList<DriverMotor> motors) {

        for (int i = 0; i <= motors.size(); i++) {
            if (nameMotor.equals(motors.get(i).getName())) {
                System.out.println("==================Sucesso======================\n");
                System.out.println("Multa vinculada ao motorista da moto com sucesso");
                System.out.println("==================Sucesso======================\n");
                return motors.get(i);

              }
            }
        System.out.println("----------ERROR NULLL----------\n");
        System.out.println("Motorista não encontrado");
        System.out.println("----------ERROR NULLL----------\n");
        return null;
    }


    public motorbike returnMotorBike(String boardBike, ArrayList<motorbike> motorbikes) {

            for (int i = 0; i <= motorbikes.size(); i++) {
                if (boardBike.equals(motorbikes.get(i).getBoard())) {
                    System.out.println("==================Sucesso======================\n");
                    System.out.println("Multa vinculada a moto com sucesso");
                    System.out.println("==================Sucesso======================\n");
                    return motorbikes.get(i);
                }
            }
        System.out.println("----------ERROR NULLL----------\n");
        System.out.println("Moto não encontrado");
        System.out.println("----------ERROR NULLL----------\n");
        return null;
    }

    public Car returnAuto(String boardAuto, ArrayList<Car> Autos) {

        for (int i = 0; i <= Autos.size(); i++) {
            if (boardAuto.equals(Autos.get(i).getBoard())) {
                System.out.println("==================Sucesso======================\n");
                System.out.println("Multa vinculada ao automovel com êxito\n");
                System.out.println("==================Sucesso======================");
                return Autos.get(i);
            }
        }
        System.out.println("----------ERROR NULLL----------\n");
        System.out.println("Caminhão não encontrado\n");
        System.out.println("----------ERROR NULLL----------");
        return null;
    }

    public Truck returnTruck(String boardTruck, ArrayList<Truck> trucks) {

        for (int i = 0; i <= trucks.size(); i++) {
            if (boardTruck.equals(trucks.get(i).getBoard())) {
                System.out.println("==================Sucesso======================\n");
                System.out.println("Multa vinculada ao caminhão com êxito\n");
                System.out.println("========================================");
                return trucks.get(i);
            }
        }
        System.out.println("----------ERROR NULLL----------\n");
        System.out.println("Caminhão não encontrado");
        System.out.println("----------ERROR NULLL----------\n");
        return null;
    }

    public void returnInfractionMotor(ArrayList<PenaltyMotor> infraction) {

            for (int i = 0; i < infraction.size(); i++) {
                System.out.println("-------------------Detalhes Infração Moto----------------------------\n");
                System.out.println("Nome do motorista: " + infraction.get(i).getDriverMotor().getName());

                System.out.println("Moto com placa: " + infraction.get(i).getMotorbike().getBoard());
                System.out.println("Tipo de infração: " + infraction.get(i).infraction);
                System.out.println("Valor da multa: " + infraction.get(i).priceInfraction);
            }
            System.out.println("-------------------Detalhes Infração Moto----------------------------\n");
        }



    public void returnInfractionAuto(ArrayList<PenaltyAuto> infractionAuto) {

            for (int i = 0; i < infractionAuto.size(); i++) {
                System.out.println("----------------------Infração Automovel--------------------------------");
                System.out.println("Nome do motorista: " + infractionAuto.get(i).getDriverCar().getName());

                System.out.println("Automóvel com placa: " + infractionAuto.get(i).getCar().getBoard());
                System.out.println("Tipo de infração: " + infractionAuto.get(i).infraction);
                System.out.println("Valor da multa: " + infractionAuto.get(i).priceInfraction);

            }
            System.out.println("----------------------Infrações Automovel--------------------------------");

    }


    public void returnInfractionTruck(ArrayList<PenaltyTruck> infractionTruck) {

            for (int i = 0; i < infractionTruck.size(); i++) {
                System.out.println("----------------------Infração Caminhão--------------------------------");
                System.out.println("Nome do motorista: " + infractionTruck.get(i).getDriverTruck().getName());

                System.out.println("Truck com placa: " + infractionTruck.get(i).getTruck().getBoard());
                System.out.println("Tipo de infração: " + infractionTruck.get(i).infraction);
                System.out.println("Valor da multa: " + infractionTruck.get(i).priceInfraction);

            }
            System.out.println("----------------------Infração Caminhão--------------------------------");

        }


    public void ViewMotor(ArrayList<PenaltyMotor>InfractionM) {

            for (int i = 0; i < InfractionM.size(); i++) {
                System.out.println("---------Motorista--------");
                System.out.println("Nome do motorista: " + InfractionM.get(i).getDriverMotor().getName());
                System.out.println("idade do motorista: " + InfractionM.get(i).getDriverMotor().getAge());
                System.out.println("Cnh: " + InfractionM.get(i).getDriverMotor().getCnh());
                System.out.println("-----------motorbike-----------");
                System.out.println(InfractionM.get(i).getMotorbike().getBrand());
                System.out.println(InfractionM.get(i).getMotorbike().getModel());
                System.out.println(InfractionM.get(i).getMotorbike().getColor());
                System.out.println(InfractionM.get(i).getMotorbike().getBoard());
                System.out.println(InfractionM.get(i).getMotorbike().getCapacity());
                System.out.println("Tipo de infração: " + InfractionM.get(i).infraction);
                System.out.println("Valor da multa: " + InfractionM.get(i).priceInfraction);

            }
            System.out.println("--------------------------");
    }

    public void ViewAuto(ArrayList<PenaltyAuto>InfractionA) {

            for (int i = 0; i < InfractionA.size(); i++) {
                System.out.println("----------Motorista----------");
                System.out.println("Nome do motorista: " + InfractionA.get(i).getDriverCar().getName());
                System.out.println("idade do motorista: " + InfractionA.get(i).getDriverCar().getAge());
                System.out.println("Cnh: " + InfractionA.get(i).getDriverCar().getCnh());
                System.out.println("----------Carro-----------");
                System.out.println(InfractionA.get(i).getCar().getBrand());
                System.out.println(InfractionA.get(i).getCar().getModel());
                System.out.println(InfractionA.get(i).getCar().getColor());
                System.out.println(InfractionA.get(i).getCar().getBoard());
                System.out.println("Tipo de infração: " + InfractionA.get(i).infraction);
                System.out.println("Valor da multa: " + InfractionA.get(i).priceInfraction);

            }
        System.out.println("------------------------------");
    }


    public void viewTruck(ArrayList<PenaltyTruck>InfractionT) {

            for (int i = 0; i < InfractionT.size(); i++) {
                System.out.println("----------Motorista-----------");
                System.out.println("Nome do motorista: " + InfractionT.get(i).getDriverTruck().getName());
                System.out.println("idade do motorista: " + InfractionT.get(i).getDriverTruck().getAge());
                System.out.println("Cnh: " + InfractionT.get(i).getDriverTruck().getCnh());
                System.out.println("-----------Caminhão-----------");
                System.out.println(InfractionT.get(i).getTruck().getBrand());
                System.out.println(InfractionT.get(i).getTruck().getModel());
                System.out.println(InfractionT.get(i).getTruck().getColor());
                System.out.println(InfractionT.get(i).getTruck().getBoard());
                System.out.println(InfractionT.get(i).getTruck().getCategory());
                System.out.println("Tipo de infração: " + InfractionT.get(i).infraction);
                System.out.println("Valor da multa: " + InfractionT.get(i).priceInfraction);

            }
        System.out.println("------------------------------");
        }


    public void totalInfractionMotor(ArrayList<PenaltyMotor>InfractionTM) {

        Double tot = 0.0;
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < InfractionTM.size(); i++) {

            tot+=InfractionTM.get(i).priceInfraction;

        }
        System.out.println("o total de Multas das Motos esta no valor de: " + tot);
        System.out.println("-------------------Saldo Devedor-----------------------------");
    }

    public void totalInfractionAuto(ArrayList<PenaltyAuto>InfractionTA) {

        Double tot = 0.0;
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < InfractionTA.size(); i++) {

            tot+=InfractionTA.get(i).priceInfraction;

        }
        System.out.println("o total de Multas dos Automoveis esta no valor de: " + tot);
        System.out.println("---------------------Saldo Devedor---------------------------");
    }

    public void totalInfractionTruck(ArrayList<PenaltyTruck>InfractionTT) {

        Double tot = 0.0;
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < InfractionTT.size(); i++) {

            tot+=InfractionTT.get(i).priceInfraction;

        }
        System.out.println("o total de multas dos caminhões esta no valor de: " + tot);
        System.out.println("------------------------Saldo Devedor----------------------------");
    }


    public void totalInfraction(ArrayList<PenaltyMotor>infractionM, ArrayList<PenaltyAuto>InfractionA,
                                ArrayList<PenaltyTruck>InfractionC){
        Double result=0.0;
        System.out.println("------------------------------------------------------------");

        Double totM = 0.0;
        for (int i = 0; i < infractionM.size(); i++) {

            totM+=infractionM.get(i).priceInfraction;

        }


        Double totA = 0.0;
        for (int i = 0; i < InfractionA.size(); i++) {

            totA+=InfractionA.get(i).priceInfraction;
        }

        Double totC = 0.0;

        for (int i = 0; i < InfractionC.size(); i++) {

            totC+=InfractionC.get(i).priceInfraction;

        }

         result=totM+totA+totC;

        System.out.println("o total de multas da empresa atualmente é: " + result);

        System.out.println("--------------------Saldo Devedor----------------------------");


    }

}



