package testeempresa;

import java.util.Scanner;

public class TesteEmpresa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empresa novaEmpresa;
        
        novaEmpresa = new Empresa("XYZ S.A.", "13.522.667/0001-07", 3);

        Funcionario joao = new Funcionario("João", "Gerente", LocalDate.of(1980, 10, 10), 2000.5);

        novaEmpresa.gerente = joao;

        novaEmpresa.funcionarios[0] = joao;
        novaEmpresa.funcionarios[1] = new Funcionario("Maria", "Vendas", LocalDate.of(1990, 10, 15), 1500);
        novaEmpresa.funcionarios[2] = new Funcionario("Joaquim", "Vendedor", LocalDate.of(1997, 1, 30), 1500);

        System.out.println("A empresa " + novaEmpresa.nome + "conta com " + novaEmpresa.gerente.nome + " na gerência" + " e possui " + novaEmpresa.funcionarios.length + "funcionarios: ");

        for (int i = 0; i & lt; novaEmpresa.funcionarios.length;i++){
     
        System.out.println("\t" + novaEmpresa.funcionarios[i].nome + "(" + novaEmpresa.funcionarios[i].cargo + ")");
        }

    }
}
