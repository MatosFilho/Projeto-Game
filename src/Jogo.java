import java.util.Scanner;

public class Jogo {
	public Scanner entrada = new Scanner(System.in);
	private Jogador jogador1;
    private Jogador jogador2;
    
	public Jogo(){
		iniciarJogadores();
		Partida();
	}
	
	public void iniciarJogadores(){
        System.out.println("Quem vai ser o Jogador 1 ?");
        if(escolherJogador() == 1)
            this.jogador1 = new Humano(1);
        else
            this.jogador1 = new Computador(1);
        
        System.out.println("----------------------");
        System.out.println("Quem vai ser o Jogador 2 ?");
        
        if(escolherJogador() == 1)
            this.jogador2 = new Humano(2);
        else
            this.jogador2 = new Computador(2);
        
    }
    
    public int escolherJogador(){
        int opcao=0;
        
        do{
            System.out.println("1. Humano");
            System.out.println("2. Computador\n");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            
            if(opcao != 1 && opcao != 2)
                System.out.println("Opção inválida! Tente novamente");
        }while(opcao != 1 && opcao != 2);
        
        return opcao;
    }
	
    public void Partida(){
    	System.out.println("----------------------");
    	System.out.println("Turno do jogador 1");
    	jogador1.jogar();
    	System.out.println("Turno do jogador 2");
    	jogador2.jogar();
    	if(jogador1.jogada == 1){
    		if(jogador2.jogada==1)
    			System.out.println("Empate");
    		else if(jogador2.jogada==2)
    			System.out.println("O jogador 2 venceu");
    		else
    			System.out.println("O jogador 1 venceu");
    	}
    	else if(jogador1.jogada == 2){
    		if(jogador2.jogada==2)
    			System.out.println("Empate");
    		else if(jogador2.jogada==3)
    			System.out.println("O jogador 2 venceu");
    		else
    			System.out.println("O jogador 1 venceu");
    	}
    	else{
    		if(jogador2.jogada==3)
    			System.out.println("Empate");
    		else if(jogador2.jogada==1)
    			System.out.println("O jogador 2 venceu");
    		else
    			System.out.println("O jogador 1 venceu");
    	}
    }
}
