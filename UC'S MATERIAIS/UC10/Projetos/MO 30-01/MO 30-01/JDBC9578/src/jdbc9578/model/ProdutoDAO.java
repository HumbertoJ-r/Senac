package jdbc9578.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    //TO DO: CRUD!
    
    //Cadastrando no banco de dados ===> INSERT -> 'C'rud
    public static boolean cadastrar(Produto p) throws SQLException {
        try {
            //Conexão com o banco
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();
            
            //Instrução SQL que será executada
            String sql = "INSERT INTO produto(nome, preco, quantidade, estado, categoria, vendido, numeroNotaFiscal, dataDaCompra) VALUES(?,?,?,?,?,?,?,?);";
            
            //Usar a string e transformar em SQL usando PreparedStatement
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, p.getNome());
            query.setDouble(2, p.getPreco());
            query.setInt(3, p.getQuantidade());
            query.setString(4, p.getEstado());
            query.setString(5, p.getCategoria());
            query.setBoolean(6, p.isVendido());
            query.setString(7, p.getNumeroNotaFiscal());
            query.setString(8, p.getDataDaCompra());
            
            //Executar a instrução SQL
            query.execute();
            
            //Desconectar do banco
            conexao.desconectar();
            return true;
        }catch (SQLException se) {
            System.out.println("Erro ao cadastrar registro no banco de dados");
            return false;
        }
    }
}
