package Cenaflix.model;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmesDao {

    public static boolean cadastrar(Filmes f) throws SQLException {
        try {
            //Conexão com o banco
            Conexao conexao = new Conexao();
            conexao.conectar();

            //Instrução SQL que será executada
            String sql = "INSERT INTO filmes(nome, datalancamento, categoria) VALUES(?,?,?);";

            //Usar a string e transformar em SQL usando PreparedStatement
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, f.getNome());
            query.setString(2, f.getDataDeLancamento());
            query.setString(3, f.getCategoria());
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

    public static List<Filmes> listarTodos() {
        List<Filmes> lista = new ArrayList<Filmes>();

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM filmes";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            ResultSet resposta = consulta.executeQuery();

            while (resposta.next()) {
                Filmes f = new Filmes();
                f.setId(resposta.getInt("id"));
                f.setNome(resposta.getString("nome"));
                f.setDataDeLancamento(resposta.getString("datalancamento"));
                f.setCategoria(resposta.getString("categoria"));

                lista.add(f);

            }

            conexao.desconectar();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao listar os registro do banco de dados!");

        }
        return lista;

    }

    public static Filmes buscarPorId(int id) {

        Filmes f = new Filmes();

        try {

            Conexao conexao = new Conexao();
            conexao.conectar();

            String sql = "SELECT * FROM filmes WHERE id=?";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setInt(1, id);

            ResultSet resposta = consulta.executeQuery();
            if (resposta.next()) {
                f.setId(resposta.getInt("id"));
                f.setNome(resposta.getString("nome"));
                f.setDataDeLancamento(resposta.getString("datalancamento"));
                f.setCategoria(resposta.getString("categoria"));

            }
            conexao.desconectar();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao buscar o registro " + id + "do banco de dados");
        }
        return f;
    }

    public static boolean atualizar(Filmes f) {

        try {
            Conexao conexao = new Conexao();
            conexao.conectar();


            

            
            
            
            String sql = "UPDATE filmes SET nome=?, datalancamento=?, categoria=? WHERE id=?;";
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
            consulta.setString(1, f.getNome());
            consulta.setString(2, f.getDataDeLancamento());
            consulta.setString(3, f.getCategoria());
            consulta.setInt(4,f.getId());

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

            String sql = "DELETE FROM filmes WHERE id=?;";
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
