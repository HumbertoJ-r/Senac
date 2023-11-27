package senacgym;

// Fábrica para criar os objetos Exercicio
public class fabricaExercicios {
  
   
    
   exercicios criarExercicio(String tipo) {
        if (tipo.equalsIgnoreCase("corrida")) {
            return new exCorrida();
        } else if (tipo.equalsIgnoreCase("musculacao")) {
            return new exMusculacao();
        } else {
            return null;
        }
    }
}

