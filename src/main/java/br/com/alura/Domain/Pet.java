package br.com.alura.Domain;

public class Pet {
    private Long id;
    private String tipo;
    private String raca;
    private String nome;
    private float peso;
    private String cor;
    private Integer idade;

    public Pet() {

    }
    public Pet(String tipo, String raca, String nome, float peso, String cor, Integer idade){
        this.cor = cor;
        this.idade = idade;
        this.peso = peso;
        this.nome = nome;
        this.raca = raca;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }
    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }
}
