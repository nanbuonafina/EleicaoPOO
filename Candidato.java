/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Candidato {
    private int num, votos;
    private String nome;
    
    public Candidato (int nu, String no) {
        num = nu;
        votos = 0;
        nome = no;
        
        //System.out.println("Quantidade de votos = " + votos);
    }
    
    public int getNum() { // lê o numero do canditato
        return num;
    }
    
    public int getVotos() { // lê a qntd. de votos do candidato
        return votos;
    }
    
    public String getNome() { // lê o nome do candidato
        return nome;
    }
    
    public void contVotos() {
        votos++;
    }
    
    public void exibir() {
        System.out.println("---===<<< CANDIDATO >>>===---");
        System.out.println("Numero: " + getNum() );
        System.out.println("Nome: " + getNome() );
        System.out.println("Votos: " + getVotos() );
    }
}