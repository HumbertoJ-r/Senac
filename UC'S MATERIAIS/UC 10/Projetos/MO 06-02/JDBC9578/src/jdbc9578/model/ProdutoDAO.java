package jdbc9578.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        } catch (SQLException se) {
            System.out.println("Erro ao cadastrar registro no banco de dados");
            return false;
        }
    }

    //Buscar/Listagem de dados do banco ==> SELECT -> c'R'ud
    public static List<Produto> listarTodos() {
        //Declaração da variável lista que será retornada
        List<Produto> lista = new ArrayList<Produto>();

        try {
            //Conectar ao banco
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            //Instrução SQL
            String sql = "SELECT * FROM produto";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            //Executar a instrução SQL e pegar os resultados
            //ResultSet -> Classe do Java que armazena os resultados de uma QUERY (busca) feita em SQL
            ResultSet resposta = consulta.executeQuery();

            while (resposta.next()) {
                Produto p = new Produto();

                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setPreco(resposta.getDouble("preco"));
                p.setQuantidade(resposta.getInt("quantidade"));
                p.setEstado(resposta.getString("estado"));
                p.setCategoria(resposta.getString("categoria"));
                p.setVendido(resposta.getBoolean("vendido"));
                p.setNumeroNotaFiscal(resposta.getString("numeroNotaFiscal"));
                p.setDataDaCompra(resposta.getString("dataDaCompra"));

                lista.add(p);
            }

            //Desconectar do banco
            conexao.desconectar();
        } catch (SQLException e) {
            System.out.println("Erro ao listar os registros do banco de dados!");
        }
        return lista;
    }

    //Buscar o produto por ID! para que possa ser atualizado
    public static Produto buscarPorId(int id) {
        Produto p = new Produto();

        try {
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            //Instrução SQL
            String sql = "SELECT * FROM produto WHERE id=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);
            
            //Executar a instrução SQL
            ResultSet resposta = consulta.executeQuery();
            
            if (resposta.next()) {
                p.setId(resposta.getInt("id"));
                p.setNome(resposta.getString("nome"));
                p.setPreco(resposta.getDouble("preco"));
                p.setQuantidade(resposta.getInt("quantidade"));
                p.setEstado(resposta.getString("estado"));
                p.setCategoria(resposta.getString("categoria"));
                p.setVendido(resposta.getBoolean("vendido"));
                p.setNumeroNotaFiscal(resposta.getString("numeroNotaFiscal"));
                p.setDataDaCompra(resposta.getString("dataDaCompra"));
            }
            
            //Desconectar do banco
            conexao.desconectar();
        }catch(SQLException e) {
            System.out.println("Erro ao buscar o registro " + id + " do banco de dados");
        }
        return p;
    }

    //Atualizar os dados/informações de uma linha do banco ===> UPDATE -> cr'U'd
    public static boolean atualizar(Produto p) {
        try {
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            //Instrução SQL
            String sql = "UPDATE produto SET nome=?, preco=?, quantidade=?, estado=?, categoria=?, vendido=?, numeroNotaFiscal=?, dataDaCompra=? WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            //Passar as informações do objeto para a consulta
            consulta.setString(1, p.getNome());
            consulta.setDouble(2, p.getPreco());
            consulta.setInt(3, p.getQuantidade());
            consulta.setString(4, p.getEstado());
            consulta.setString(5, p.getCategoria());
            consulta.setBoolean(6, p.isVendido());
            consulta.setString(7, p.getNumeroNotaFiscal());
            consulta.setString(8, p.getDataDaCompra());
            consulta.setInt(9, p.getId());

            //Executar a instrução
            consulta.execute();

            //Desconectar do Banco
            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o registro do banco de dados");
            return false;
        }
    }

    //Deletar dados do banco ==> DELETE -> cru'D'
    public static boolean excluir(int id) {
        try {
            //Conectar ao banco
            ConexaoJDBC conexao = new ConexaoJDBC();
            conexao.conectar();

            //Instrução SQL
            String sql = "DELETE FROM produto WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            //Passar Informações do objeto para a consulta
            consulta.setInt(1, id);

            //Executa a instrução SQL
            consulta.execute();

            //Desconectar do banco
            conexao.desconectar();
            return true;
        } catch (SQLException s) {
            System.out.println("Erro ao deletar registro no banco de dados!");
            return false;
        }
    }
}
