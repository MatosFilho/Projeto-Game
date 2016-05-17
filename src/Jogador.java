public abstract class Jogador {
    protected int jogador;
    protected int jogada;

    public Jogador(int jogador){
        this.jogador = jogador;
    }
    
    public abstract void jogar();
    
}