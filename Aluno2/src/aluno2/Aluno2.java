package aluno2;

public class Aluno2 {

    public static void main(String[] args) {
        /*Aluno1 aluno1 = new Aluno1("João da Silva", 001, "TDS");
        Aluno1 aluno2 = new Aluno1("Jorge Aguiar", 002, "TDS");
        Aluno1 aluno3 = new Aluno1("Camila Santos", 003, "TDS");*/
        Aluno1 aluno4 = new Aluno1();

        aluno4.getNome = "Celso Medeiros";
        aluno4.nota1 = (float) 9.7;
        aluno4.nota2 = (float) 6.5;
        
        System.out.println("Mostrar Aluno: \n");
        System.out.println("O nome do aluno é: "+aluno4.nome);
        System.out.println("A nota do aluno é: "+aluno4.nota1);
        System.out.println("A nota do aluno é: "+aluno4.nota2);
        /*
        System.out.println("Nome do aluno1: " + aluno1.nome);
        System.out.println("Nome do aluno2:" + aluno2.nome);
        System.out.println("Nome do aluno3: " + aluno3.nome);*/
    }

}
