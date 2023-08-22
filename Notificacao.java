package GeradorDeNotaFiscal.src.br.poo.gerenciadornot;

public class Notificacao implements Acoes {

    private String notificacao = "notificação enviada";

    public Notificacao() {
    }

    public String getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
    }

    @Override
    public void gerar(String notificacao) {
    }
}
