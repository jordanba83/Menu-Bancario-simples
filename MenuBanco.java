

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Bem vindo " + nome + " qual servico deseja usar!");



        int menu = 0;
        double saldo = 0;
        //lista para registra transacoes
        List<String> transacoes = new ArrayList<>();


        while (menu != 4) {

            System.out.println("===Menu===");
            System.out.println("1-Deposito");
            System.out.println("2-Saque");
            System.out.println("3-Extrato(Ultimas 5 transacoes)");
            System.out.println("4-encerrar o programa");
        System.out.println("Digite sua opcao: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:

                        System.out.println("Voce está na area de deposito por favor, digite o valor que será depositado : ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        saldo = saldo + valor;

                    transacoes.add("Depósito de R$ " + valor);

                        System.out.println("O valor " + valor + " foi depositado com sucesso! Seu saldo é R$: " + saldo);

                    break;
                case 2:

                    System.out.println("Voce esta na area de saques, por favor digite o valor que deseja retirar!");
                    double valorRetirado = sc.nextDouble();
                    if(valorRetirado < saldo) {

                        saldo -= valorRetirado;

                        transacoes.add("Saque de R$ " + valorRetirado);
                        System.out.println("Saque realizado! Saldo: R$ " + saldo);

                    }
                    else {
                        System.out.println("Saldo insuficiente!");
                    }

                    break;

                    case 3:
                        System.out.println("\n=== Extrato de " + nome + " ===");
                        if (transacoes.isEmpty()) {
                            System.out.println("Nenhuma transação registrada.");
                        } else {
                            int total = transacoes.size();
                            int inicio = Math.max(total - 5, 0); // pega no máximo 5 últimas
                            for (int i = inicio; i < total; i++) {
                                System.out.println(transacoes.get(i));
                            }
                            System.out.println("Saldo atual: R$ " + saldo);
                        }

                        break;

                        case 4:
                    System.out.println("Meu amigo(a) " + nome + " estamos encerrado o sistema até logo... ");
                    break;
                    default:
                        System.out.println("Por favor escolha uma opcao valida!!!");
                        break;
            }

        }


        sc.close();
    }

    
}
 
    

