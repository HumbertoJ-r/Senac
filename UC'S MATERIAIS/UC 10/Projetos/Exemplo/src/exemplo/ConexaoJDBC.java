package exemplo;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexaoJDBC {
     
    private Connection conexao;
     
     
     public void conectar() throws SQLException{
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             conexao = DriverManager.getConnection("jdbc:mysql://localhost/cenaflix","root","erick031119");
             System.out.println("Sucesso de conexao");
         } catch(ClassNotFoundException e){
             System.out.println("Falha ao carregar a classe de conexão");
           
         } catch(SQLException ex){
             System.out.println("Falha ao conectar com o banco. Erro de SQL");
         }
     }
     
     public void desconectar() {
         try{
             if(conexao != null && !conexao.isClosed()){
                 conexao.close();
                 System.out.println("Desconectado com Sucesso");
             }
         }catch (SQLException e){
             System.out.println("Erro ao desconectar");
         }
     }
}
