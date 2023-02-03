import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nome_cliente;
    private BigDecimal salario;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###,###,###,###.00");
        return
                "{ nome = " + getNome_cliente()  +
                        ", agencia = " + getAgencia()  +
                        ", salario = " + df.format(getSalario().setScale(2, BigDecimal.ROUND_HALF_EVEN)) +
                        ", Numero da conta = " + getNumero()+" }";
    }
}
