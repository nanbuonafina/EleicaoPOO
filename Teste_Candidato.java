public class Teste_Candidato {
    
    public static void main(String[] args) {
        Candidato cc; // construtor
        
        cc = new Candidato(123, "Joao");
        cc.exibir();
        
        cc.contVotos();
        cc.exibir();
    }
}