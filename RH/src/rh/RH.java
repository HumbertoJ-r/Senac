
package rh;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class RH {

    
    public static void main(String[] args) {
    
       Scanner scanner = new Scanner (System.in);
       List<funcionarios> funcionarios = new ArrayList();
       
       for (int i = 0; i < 2; i++) {
           System.out.println("Digite o tipo do funcionario (Assalariado/Horista) ");
           String tipo = scanner.nextLine();
           
           System.out.println("Digite o nome: ");
           String nome = scanner.nextLine();
           
           System.out.println("Digite o CPF: ");
           String cpf = scanner.nextLine();
           
           System.out.println("Digite o endereco: ");
           String endereco = scanner.nextLine();
           
           System.out.println("Digite o telefone: ");
           String telefone = scanner.nextLine();
                      
           System.out.println("Digite o setor: ");
           String setor = scanner.nextLine();
           
           
           if (tipo.equalsIgnoreCase("Assalariado")){
               System.out.println("Digite o salario mensal: ");
               double salarioMensal = scanner.nextDouble();
               scanner.nextLine();
               funcionarios.add(new Assalariados (nome, cpf, endereco, telefone, setor, salarioMensal));
                   
           }
           
           else if (tipo.equalsIgnoreCase("Horista")) {
               System.out.println("Digite as horas trabalhadas: ");
               double horasTrabalhadas = scanner.nextDouble();
               System.out.println("Digite o valor das horas trabalhadas: ");
               double valorHoras = scanner.nextDouble();
               scanner.nextLine();
               funcionarios.add(new Horistas(nome, cpf, endereco, telefone, setor, horasTrabalhadas, valorHoras));
           }
       }        
       System.out.println("Dados dos funcionarios: ");
       for (funcionarios funcionario : funcionarios) {
           funcionario.mostrarDados();
           System.out.println("Salario: " + funcionario.calcularSalario());
           System.out.println();
       }
       
       System.out.println("Digite o percentual de aumento: ");
       double percentualAumento = scanner.nextDouble ();
       for (funcionarios funcionario : funcionarios){
           funcionario.aplicarAumento();
       }
        
       System.out.println("Dados dos funcionarios apos o aumento: ");
           for (funcionarios funcionario : funcionarios){
           funcionario.mostrarDados();
           System.out.println("Salario apos aumento: " + funcionario.aplicarAumento());
           System.out.println();
       }
    }
    
}
