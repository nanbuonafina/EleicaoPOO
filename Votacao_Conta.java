import java.util.ArrayList;
import java.util.Scanner;

public class Votacao_Conta {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); // construtor do scanner
        
        ArrayList <Candidato> lista; // definindo o tipo do array
        lista = new ArrayList();
        
        Candidato cc; // construtor do candidato
        int opc = 0, nu, qtdC, qtdE; 
        int votoNul = 0;
        String no;
        
        do {
            System.out.println("---===<<< MENU >>>===---");
            System.out.println("1 - Cadastrar candidato \r\n"
                    + "2 - Iniciar votação\r\n"
                    + "3 - Finalizar programa\n");
            
            System.out.println("Digite a sua opção: ");
            opc = leia.nextInt();
            
            switch ( opc ) {
                case 1: System.out.println("---===<<< CADASTRAMENTO >>>===---");
                        System.out.println("Informe quantos candidatos serão cadastrados: ");
                        qtdC = leia.nextInt(); // lê a quantidade de candidatos
                        
                        for (int i = 0; i < qtdC; i++) {
                            System.out.println("Informe o numero do candidato: ");
                            nu = leia.nextInt();
                            System.out.println("Informe o nome do candidato: ");
                            no = leia.next();
                            
                            cc = new Candidato(nu, no);
                            lista.add(cc);
                        }
                        break;
                case 2: System.out.println("---===<<< VOTACAO >>>===---");
                        System.out.println("Informe quantos eleitores irão votar: ");
                        qtdE = leia.nextInt();
                        
                        for (int i = 0; i < qtdE; i++) {
                            System.out.println("Informe o numero do seu candidato: ");
                            nu = leia.nextInt(); // lê o numero do candidato
                            boolean encontrou = false;
                            
                            for (int j = 0; j < lista.size(); j++) {
                                cc = lista.get(j); // itera sobre todos os candidatos na lista
                                if (cc.getNum() == nu) {
                                    cc.contVotos();
                                    encontrou = true;
                                }     
                            }
                            if (!encontrou) {
                                    votoNul += 1;
                                }
                        }
                        
                        for (int i = 0; i < lista.size(); i++) {
                            cc = lista.get(i);
                            cc.exibir();
                        }
                        
                        System.out.println("---===<<< VOTOS NULOS >>>===---");
                        System.out.println("Votos nulos: " + votoNul);
                        break;
                case 3: System.out.println("---===<<< SAIR >>>===---");
                        System.out.println("Finalizando programa...");
                        break;
                default: System.out.println("Opção inválida!");
            }
        } while(opc != 3);
        
        cc = null;
		leia.close();
		leia = null;
		System.out.println("Fim do programa.");
    } 
}