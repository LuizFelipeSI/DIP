package GeradorDeNotaFiscal.src.br.poo.gerenciadornot;

public class NotificacaoPush extends Notificacao {

    @Override
    public void gerar(String notificacao) {
        System.out.println(notificacao + " no push");
    }
}
