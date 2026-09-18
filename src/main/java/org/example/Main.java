package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("\n === Sistema de Consulta de Benefícios ===");
        System.out.println("\n Nome do colaborador: ");
        String nome = entrada.nextLine();


        System.out.println("Idade do colaborador: ");
        int idade = entrada.nextInt();


        System.out.println("Salário do colaborador: ");
        double salario = entrada.nextDouble();


        System.out.println("Tempo de empresa do colaborador (em meses): ");
        int tempo = entrada.nextInt();


        System.out.println("Quantidade de filhos do colaborador: ");
        int filhos = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Modalidade de trabalho do colaborador (presencial ou home office): ");
        String modalidade = entrada.nextLine();

        System.out.println("Utiliza veículo próprio (sim/não): ");
        String resp = entrada.nextLine();


        System.out.println("=== Relatório Final ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("\n Status Benefícios: ");


        if (salario <= 4000){
            System.out.println("\n- Direito ao Vale-Alimentação: Possui");
        }else{
            System.out.println("\n- Direito ao Vale-Alimentação: Não possui");
        }

        if (filhos >= 1){
            System.out.println("- Direito ao Auxílio-Creche: Possui");
        }else{
            System.out.println("- Direito ao Auxílio-Creche: Não possui");
        }

        if (tempo >= 3){
            System.out.println("- Elegibilidade para Plano de Saúde: Possui");
        }else{
            System.out.println("- Elegibilidade para Plano de Saúde: Não possui");
        }

        if (modalidade.equalsIgnoreCase("Home Office") || modalidade.equalsIgnoreCase("home office")) {
            System.out.println("- Direito ao Auxílio Home Office: Possui");
        }else{
            System.out.println("- Direito ao Auxílio Home Office: Não possui");
        }

        if (resp.equalsIgnoreCase("sim") || resp.equalsIgnoreCase("s")){
            System.out.println("- Direito ao Auxílio Combustível: Possui");
        }else {
            System.out.println("- Direito ao Auxílio Combustível: Não possui");
        }

        if (tempo >= 1) {
            System.out.println("- Participação na PLR: Possui");
        } else {
            System.out.println("- Participação na PLR: Não possui");
        }

        if (tempo >= 12) {
            System.out.println("- Elegibilidade para Bolsa de Estudos: Possui");
        } else {
            System.out.println("- Elegibilidade para Bolsa de Estudos: Não possui");
        }

    }
}
