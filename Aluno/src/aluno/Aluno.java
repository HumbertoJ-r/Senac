
package aluno;

public class Aluno {
    String nome;
    int matricula;
    String cpf;
    int idade;
    float nota1;
    float nota2;
    float media;
    
    public void descrever2(){
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println();
        
    }
    
    public float calcularMedia(float num1, float num2){
        return (num1 + num2)/2;
    }
    
    public void descrever(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: " + matricula);
        System.out.println("CPF do aluno: " + cpf);
        System.out.println("Idade do aluno: " + idade);
        System.out.println();
    }
    
public void mostrarNome(){
    System.out.println("O aluno se chama: " + nome);
}
 
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno();
       Aluno aluno2 = new Aluno();
       Aluno aluno3 = new Aluno();
       
       aluno1.nome = "Celso Medeiros";
       aluno1.nota1 = (float) 9.7;
       aluno1.nota2 = (float) 6.5;
       
       System.out.println("Mostrar Alunos:");
       aluno1.descrever2();
       System.out.println("a media do aluno é: " + aluno1.calcularMedia(aluno1.nota1, aluno1.nota2));
       
       aluno1.nome = "Celso Medeiros";
       aluno1.matricula = 1;
       aluno1.cpf = "001.345.780-90";
       aluno1.idade = 23;
       
       aluno2.nome="Camila Alves";
       aluno2.matricula=2;
       aluno2.cpf = "001.345.780-90";
       aluno2.idade = 32;
       
       aluno3.nome="Joana Carneiro";
       aluno3.matricula=3;
       aluno3.cpf="001.900.078-90";
       aluno3.idade=17;
       
       System.out.println();
       aluno1.descrever();
       aluno2.descrever();
       aluno3.descrever();
       
       
       
       
       System.out.println("Mostrar Alunos: ");
       System.out.println();
       System.out.println("Nome do aluno1: " + aluno1.nome);
       System.out.println("Marticula do aluno1: " + aluno1.matricula);
       System.out.println("CPF do aluno1: " + aluno1.cpf);
       System.out.println("Idade aluno1: " + aluno1.idade);
       
       System.out.println();
       
       System.out.println("Nome do aluno2: " + aluno2.nome);
       System.out.println("Marticula do aluno2: " + aluno2.matricula);
       System.out.println("CPF do aluno2: " + aluno2.cpf);
       System.out.println("Idade aluno2: " + aluno2.idade);
       
       System.out.println();
       
       System.out.println("Nome do aluno3: " + aluno3.nome);
       System.out.println("Marticula do aluno3: " + aluno3.matricula);
       System.out.println("CPF do aluno3: " + aluno3.cpf);
       System.out.println("Idade aluno3: " + aluno3.idade);
       
       
    }
    
}
