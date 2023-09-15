package br.com.escola;

public class Aluno { //atributos

    private String nome;
    private String ra;
    private float notaAv1;
    private float notaAv2;



    public Aluno(String nome, String ra, float notaAv1, float notaAv2) { // atalho para construtor (Alt + Insert)

        // this= diferenciador do java identificando que ela é da classe
        this.nome = nome;
        this.ra = ra;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;

    }
    // esse construtor não tem nada, ele esta vazio
    public Aluno() {

        /*this.nome= "";
        this.ra= "" ;
        this.notaAv1 = 0;
        this.notaAv2 = 0;*/
}
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() { //get retorna
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public float getNotaAv1() {
        return notaAv1;
    }

    public float getNotaAv2() {
        return notaAv2;
    }



    public void setNome(String nome) { //set atribui
        this.nome = nome;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNotaAv1(float notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(float notaAv2) {
        this.notaAv2 = notaAv2;
    }
}





