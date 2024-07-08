
package atividadeiv;

public class Paciente {
    
    private String data;
    private String hora;
    private int PressaoAlta;
    private int PressaoBaixa;
    
     public Paciente(String data, String hora, int PressaoAlta, int PressaoBaixa) {
        this.data = data;
        this.hora = hora;
        this.PressaoAlta = PressaoAlta;
        this.PressaoBaixa = PressaoBaixa;
    }

    public Paciente() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPressaoAlta() {
        return PressaoAlta;
    }

    public void setPressaoAlta(int PressaoAlta) {
        this.PressaoAlta = PressaoAlta;
    }

    public int getPressaoBaixa() {
        return PressaoBaixa;
    }

    public void setPressaoBaixa(int PressaoBaixa) {
        this.PressaoBaixa = PressaoBaixa;
    }

   
}
