import java.util.Scanner;

public class Humano extends Jogador{
    public Scanner entrada = new Scanner(System.in);
    
    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
        System.out.println("Jogador 'Humano' criado!");
    }
    
    @Override
    public void jogar(){
    	int num;
    	do{
    		num = menu();
    	}while(num<1 && num>3);
    	this.jogada = num;
    }
    
    public int menu(){
    	int opcao;
    	System.out.println("Escolha a opção:");
    	System.out.println("1 - Pedra");
    	System.out.println("2 - Papel");
    	System.out.println("3 - Tesoura");
    	System.out.printf("Sua opção: ");
    	opcao = entrada.nextInt();
    	return opcao;
    }
}