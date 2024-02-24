// Classe para simular uma calculadora de numeros inteiros
// Autora: Maria Eduarda Meirelles Sanches
// Data: 23/02/2024

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Insira o primeiro número inteiro da operação: ");
        int numero_um = input.nextInt();
        System.out.printf("Insira o segundo número inteiro da operação: ");
        int numero_dois = input.nextInt();
        System.out.printf("""
                Qual vai ser a operação:
                [1] - Soma
                [2] - Subtração
                [3] - Multiplicação
                [4] - Divisão
                """);
        int opção = input.nextInt();
        if (opção == 1){
            System.out.println("Resultado: "+soma(numero_um,numero_dois));
        }
        else if (opção == 2){
            System.out.println("Resultado: "+subtracao(numero_um,numero_dois));
        }
        else if (opção == 3){
            System.out.println("Resultado: "+multiplicacao(numero_um,numero_dois));
        }
        else if (opção == 4){
            System.out.println("Resultado: "+divisao(numero_um,numero_dois));
        }

    }
    //Métodos
    //Realiza  a operação de soma
    public static int soma(int numeroUm, int numeroDois){
        int resultado = numeroUm - numeroDois;
        return resultado;
    }
    //Realiza  a operação de subtração
    public static int subtracao(int numeroUm, int numeroDois){
        int resultado = numeroUm + numeroDois;
        return resultado;
    }
    //Realiza  a operação de multiplicação
    public static int multiplicacao(int numeroUm, int numeroDois){
        int resultado = numeroUm * numeroDois;
        return resultado;
    }
    //Realiza  a operação de divisão
    public static int divisao(int numeroUm, int numeroDois){
        int resultado = numeroUm / numeroDois;
        return resultado;
    }
}
