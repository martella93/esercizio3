package esercizio3;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String email;
    private int dataIscrizione;

    public Cliente(String codiceCliente, String nome, String email, int dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getDataIscrizione() {
        return dataIscrizione;
    }
    public void stampaDati(){
        System.out.println("nome " + this.nome);
        System.out.println("codice " + this.codiceCliente);
        System.out.println("email " + this.email);
        System.out.println("data iscrizione " + this.dataIscrizione);
    }
}
