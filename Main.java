package br.com.escola;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Thales");
        aluno1.setRa("1547");
        aluno1.setNotaAv1(40);
        aluno1.setNotaAv2(45);

        System.out.printf("Aluno1"+ aluno1.getNome()+"\n" +aluno1.getRa()); // get nao retorna nada (0)


        Aluno aluno2 = new Aluno("Ana","3569");
        System.out.printf("Aluno2" + aluno2.getNome()+"/n"+ aluno2.getRa());



        Aluno aluno3 = new Aluno ("Leonardo","55255",40.5f,45.8f );
        System.out.printf("Aluno3" + aluno3.getNome()+"\n"+ (aluno3.getRa()+"\n"+ aluno3.getNotaAv1()+"\n"+aluno3.getNotaAv2()));








    }
}