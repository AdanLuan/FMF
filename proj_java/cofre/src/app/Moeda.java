
public class Moeda implements Moedas {
    private String nome;
    private float valor;
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getValor() {
        return valor;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;

    }

    @Override
    public void setValor(float valor) {
        this.valor = valor;

    }

    public Moeda(String nome,float valor){
        this.nome = nome;
        this.valor = valor;
    }
}