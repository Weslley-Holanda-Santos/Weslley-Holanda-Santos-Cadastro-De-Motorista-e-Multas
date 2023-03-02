package DataStorage;

import credentials.*;

import java.util.Scanner;

public class Menu {

    Profiles credentials =new Profiles();
    Scanner scanner=new Scanner(System.in);

    public void viewSystem() {
        int op;

        do {

            System.out.println("Seja bem vindo ao sistema de cadastro de Veículos e multas");
            System.out.println("Selecione o Token de Acesso: \n" +
                    "1 - Gerente \n" +
                    "2 - Agente \n" +
                    "3 - Motorista \n"+
                    "11- Sair do sistema");
            op = scanner.nextInt();

            if (op==1){

                credentials.viewManager();

            } else if(op==2){

                credentials.viewAgent();

            }else if(op==3){

                credentials.ViewDriver();

            }

        } while (op != 11);
    }

}
