package exemplo;

import java.sql.SQLException;

public class Exemplo {
    public static void main(String[] args) throws SQLException {
     ConexaoJDBC jdbc = new ConexaoJDBC();
     jdbc.conectar();
     jdbc.desconectar();
    }
    
}
