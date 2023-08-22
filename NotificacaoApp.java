package GeradorDeNotaFiscal.src.br.poo.gerenciadornot;

public class NotificacaoApp extends Notificacao {

    @Override
    public void gerar(String notificacao) {
        System.out.println(notificacao + " no app");
    }
}
