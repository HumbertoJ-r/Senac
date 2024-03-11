package jdbc9578.main;

import java.sql.SQLException;
import jdbc9578.model.Produto;
import jdbc9578.model.ProdutoDAO;
import jdbc9578.view.ProdutoCadastro;

public class JDBC9578 {
    public static void main(String[] args) throws SQLException {
        ProdutoCadastro pc = new ProdutoCadastro();
        pc.setVisible(true);
        
        //Produto p = new Produto(0, "Teste SQL e Java", 650.00, 1, "Novo", "Memória RAM", true, "222222", "2024-01-30");
        
        //ProdutoDAO.cadastrar(p);
    }
}
