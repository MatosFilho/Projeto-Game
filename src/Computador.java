import java.util.Random;

public class Computador extends Jogador{
	Random numero = new Random();
	
    public Computador(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
        this.jogada = numero.nextInt(3) + 1;
    }
    
    @Override
    public void jogar(){
    	this.jogada = numero.nextInt(3) + 1;
    }
}