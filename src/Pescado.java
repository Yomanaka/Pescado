import java.time.LocalDate;
public class Pescado {
    private String nome ;
    private Especie especie;
    private double peso;
    private double precoCompra;
    private double precoVenda;
    private LocalDate entrada;
    //criação do "tipo" Especie e definição de seus valores
    public static enum Especie{
        PEIXEDOCE, PEIXEMAR, MARISCO,CRUSTACEO
    }

    //inicio dos builders
    public Pescado(String nome,Especie especie,double peso, double precoCompra){
        setEspecie(especie);
        setNome(nome);
        setPeso(peso);
        setPrecoCompra(precoCompra);
        setPrecoVenda(precoCompra * 2);
        setEntrada(LocalDate.now());
    }
    // Método getters para a especie
    public Especie getEspecie() {
        return this.especie;
    }
    // Método getters para o nome
    public String getNome() {
        return this.nome;
    }
    // Método getters para o peso
    public double getPeso() {
        return this.peso;
    }
    // Método getters para o preço da compra

    public double getPrecoCompra() {
        return this.precoCompra;
    }
    // Método getters para o preço da venda

    public double getPrecoVenda() {
        return this.precoVenda;
    }
    //Método para preenchimento automático da data


    public LocalDate getEntrada() {
        return this.entrada;
    }

    // Método setters para a especie com a prevenção
    public void setEspecie(Especie especie) {
        if(especie == null) throw new IllegalArgumentException("Especie não pode ser nulo");
        this.especie = especie;
    }
    // Método setters para o nome com a prevenção
    public void setNome(String nome) {
        if(nome == null || nome.isBlank()) throw new IllegalArgumentException("Peixe não pode ser nulo");
        this.nome = nome;
    }
    // Método setters para o peso com a prevenção

    public void setPeso(double peso) {
        if(peso <= 0) throw new IllegalArgumentException("Peixe não pode pesar 0 ou menos");
        this.peso = peso;
    }

    public void setPrecoCompra(double precoCompra) {
        if(precoCompra <= 0) throw new IllegalArgumentException("Peixe não pode custar 0 ou menos");
        this.precoCompra = precoCompra;
    }

    public void setPrecoVenda(double precoVenda) {
        if(precoVenda < precoCompra) throw new IllegalArgumentException("Peixe não pode ser vendido por menos que foi comprado");
        this.precoVenda = precoVenda;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }
}