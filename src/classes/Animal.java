package classes;

public class Animal {
    private String raca;
    private String idade;
    private String cor;
    private double tamanho;
    private double peso;
    private char genero;

    public Animal(String raca, 
    String idade, 
    String cor, 
    double tamanho, 
    double peso, 
    char genero) {
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.tamanho = tamanho;
        this.peso = peso;
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public String getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    
}

