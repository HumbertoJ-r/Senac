package novabelo.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    public static boolean cadastrar(Cliente c) throws SQLException {
        try {
            //Conexão com o banco
            Conexao conexao = new Conexao();
            conexao.conectar();

            //Instrução SQL que será executada
            String sql = "INSERT INTO cliente (nome, cpf, endereco, dataNasc, categoria, preco, telefone) VALUES(?,?,?,?,?,?,?);";

            //Usar a string e transformar em SQL usando PreparedStatement
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, c.getNome());
            query.setString(2, c.getCpf());
            query.setString(3, c.getEndereco());
            query.setString(4, c.getDataNasc());
            query.setString(5, c.getCategoria());
            query.setDouble(6, c.getPreco());
            query.setString(7, c.getTelefone());

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

    public static List<Cliente> listarTodos() {
        List<Cliente> lista = new ArrayList<Cliente>();

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM cliente";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            ResultSet resposta = consulta.executeQuery();

            while (resposta.next()) {
                Cliente c = new Cliente();
                c.setId(resposta.getInt("id"));
                c.setNome(resposta.getString("nome"));
                c.setCpf(resposta.getString("cpf"));
                c.setEndereco(resposta.getString("endereco"));
                c.setDataNasc(resposta.getString("dataNasc"));
                c.setCategoria(resposta.getString("categoria"));
                c.setPreco(resposta.getDouble("preco"));
                c.setTelefone(resposta.getString("telefone"));

                lista.add(c);

            }

            conexao.desconectar();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao listar os registro do banco de dados!");

        }
        return lista;

    }

    public static Cliente buscarPorNome(String nome) {

        Cliente c = new Cliente();

        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM cliente WHERE nome=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, nome);

            ResultSet resposta = consulta.executeQuery();
            if (resposta.next()) {
                c.setId(resposta.getInt("id"));
                c.setNome(resposta.getString("nome"));
                c.setCpf(resposta.getString("cpf"));
                c.setEndereco(resposta.getString("endereco"));
                c.setDataNasc(resposta.getString("dataNasc"));
                c.setCategoria(resposta.getString("categoria"));
                c.setPreco(resposta.getDouble("preco"));
                c.setTelefone(resposta.getString("telefone"));

            }
            conexao.desconectar();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao buscar o registro " + nome + "do banco de dados");
        }
        return c;
    }

    public static Cliente buscarPorId(int id) {

        Cliente c = new Cliente();

        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM cliente WHERE id=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);

            ResultSet resposta = consulta.executeQuery();
            if (resposta.next()) {
                c.setId(resposta.getInt("id"));
                c.setNome(resposta.getString("nome"));
                c.setCpf(resposta.getString("cpf"));
                c.setEndereco(resposta.getString("endereco"));
                c.setDataNasc(resposta.getString("dataNasc"));
                c.setCategoria(resposta.getString("categoria"));
                c.setPreco(resposta.getDouble("preco"));
                c.setTelefone(resposta.getString("telefone"));

            }
            conexao.desconectar();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao buscar o registro " + id + "do banco de dados");
        }
        return c;
    }

    public static boolean atualizar(Cliente c) {

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "UPDATE cliente SET nome=?, cpf=?, endereco=?, dataNasc=?, categoria=?, preco=?, telefone=? WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, c.getNome());
            consulta.setString(2, c.getCpf());
            consulta.setString(3, c.getEndereco());
            consulta.setString(4, c.getDataNasc());
            consulta.setString(5, c.getCategoria());
            consulta.setDouble(6, c.getPreco());
            consulta.setString(7, c.getTelefone());
            consulta.setInt(8, c.getId());

            consulta.execute();

            conexao.desconectar();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o registro do banco de dados");
            return false;
        }

    }

    public static boolean excluir(int id) {
        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "DELETE FROM cliente WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);

            consulta.execute();

            conexao.desconectar();
            return true;

        } catch (SQLException s) {

            JOptionPane.showMessageDialog(null, "Erro ao deletar registro no banco de dados!");
            return false;
        }

    }
}
