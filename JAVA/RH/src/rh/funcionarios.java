
package rh;


import java.util.Scanner;

public abstract class funcionarios {


    
private String Nome;
private String Cpf;
private String Endereco;
private String Telefone;
private String Setor;

    

    public funcionarios(String Nome, String Cpf, String Endereco, String Telefone, String Setor) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Setor = Setor;
      
    }

   public abstract double calcularSalario();
   
   public void mostrarDados() {
       
       System.out.println("Nome " + Nome);
       System.out.println("CPF " + Cpf);
       System.out.println("Endereco " + Endereco);
       System.out.println("Telefone " + Telefone);
       System.out.println("Setor " + Setor);
       
      
    }
   
   public void aplicarAumento(double percentualAumento) {
        double salarioAnterior = calcularSalario();
        double aumento = (percentualAumento / 100) * salarioAnterior;
        double novoSalario = salarioAnterior + aumento;
        System.out.println("=====================================");
        System.out.println("Salario anterior: " + calcularSalario());
        System.out.println("Percentual de aumento: " + percentualAumento +"%");
        System.out.println("Aumento salarial: R$" + aumento);
        System.out.println("Salario novo depois do aumento: R$" + novoSalario);
        System.out.println("=====================================");
        
   }

    

    
}
