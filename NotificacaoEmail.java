package GeradorDeNotaFiscal.src.br.poo.gerenciadornot;

public class NotificacaoEmail extends Notificacao {

    private String email;

    public NotificacaoEmail(String email) {
        super();
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void gerar(String notificacao) {
        System.out.println(notificacao + " no email: " + email);
    }
}
