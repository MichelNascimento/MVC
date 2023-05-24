package br.fatecrl.mvc.models;

public class Navio {
    private String tipo;
    private String nome;
    private int imo;

    public Navio(String tipo, String nome, int imo){
        this.tipo = tipo;
        this.nome = nome;
        this.imo = imo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getImo() {
        return imo;
    }
    public void setImo(int imo) {
        this.imo = imo;
    }    
}
