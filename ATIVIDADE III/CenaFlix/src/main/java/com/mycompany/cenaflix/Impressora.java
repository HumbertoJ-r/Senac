
package com.mycompany.cenaflix;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class Impressora {
    
        public static void imprimir(String arquivo) {

        Desktop desktop = Desktop.getDesktop();

        try {
            File arquivoAImprimir = new File(arquivo);
            desktop.print(arquivoAImprimir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
    
}
