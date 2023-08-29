package GeradorDeNotaFiscal.src.br.poo.gerenciadornot;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NotificacaoEmail n = new NotificacaoEmail("luiz@gmail.com");
        NotificacaoApp n1 = new NotificacaoApp();
        NotificacaoPush n2 = new NotificacaoPush();


        boolean b = true;
        while (b) {
            System.out.println("escolha o tipo de notificação:");
            System.out.println("1 - app");
            System.out.println("2 - email");
            System.out.println("3 - push");
            System.out.println("outro número - fechar");
            int p = sc.nextInt();

            if (p == 1) {
                n1.gerar(n.getNotificacao());
            } else if (p == 2) {
                n.gerar(n.getNotificacao());
            } else if (p == 3){
                n2.gerar(n.getNotificacao());
            } else {
                b = false;
            }
        }
    }
}
