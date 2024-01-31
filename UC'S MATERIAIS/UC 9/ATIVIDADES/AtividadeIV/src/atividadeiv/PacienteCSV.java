
package atividadeiv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PacienteCSV {
    
    private static String nomeArquivo = "./dados/Pacientes.csv";
    
    public static boolean AdicionarPaciente(Paciente p) throws IOException{
        try {
            //Verificar se o arquivo já existe
            boolean arquivoExiste = new File(nomeArquivo).exists();
            
            //Abrir o escritor para adicionar dados ao arquivo
            FileWriter escritor = new FileWriter(nomeArquivo, StandardCharsets.ISO_8859_1,true);
            if(!arquivoExiste){
               escritor.write("Data;Hora;Pressão Sistólica;Pressão Diastólica\n"); 
            }
            
            //Escrever os dados do filme no formato apropriado
            escritor.write(p.getData() + ";" + p.getHora() + ";" +
                    p.getPressaoAlta() + ";" + p.getPressaoBaixa() + "\n");
            
            //Escrever todos os dados do write (buffer) no arquivo imediamente
            escritor.flush();
            
            //Fechar a escrita
            escritor.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
}
