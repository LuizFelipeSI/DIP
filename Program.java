package GeradorDeNotaFiscal.src.br.poo.gerenciadornot;

public class Program {

    public static void main(String[] args) {


        NotificacaoEmail n = new NotificacaoEmail("luiz@gmail.com");
        NotificacaoApp n1 = new NotificacaoApp();
        NotificacaoPush n2 = new NotificacaoPush();

        n.gerar(n.getNotificacao());
        n1.gerar(n.getNotificacao());
        n2.gerar(n.getNotificacao());
    }
}
