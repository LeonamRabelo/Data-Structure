package Ordenacao;

public class Pessoa{
    private String nome;
    private int matricula;
    private float nota;

    public Pessoa(String nome, int matricula, float nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public float getNota(){
        return nota;
    }

    public void setNome(String n){
        nome = n;
    }

    public void setMatricula(int m){
        matricula = m;
    }

    public void setNota(float n){
        nota = n;
    }

}