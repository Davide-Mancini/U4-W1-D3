package entities;

public class Cliente {
    //ATTRIBUTI
   private int codiceCliente;
   private String nomeCognome;
   private String email;
   private String data;

    @Override
    public String toString() {
        return "Cliente{" +
                "codiceCliente=" + codiceCliente +
                ", nomeCognome='" + nomeCognome + '\'' +
                ", email='" + email + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    //COSTRUTTORE
    public Cliente(int codiceCliente, String nomeCognome, String email, String data){
        this.codiceCliente=codiceCliente;
        this.nomeCognome=nomeCognome;
        this.email=email;
        this.data=data;

    }
}
