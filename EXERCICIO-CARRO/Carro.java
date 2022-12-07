public class Carro {
    String cor;
    String marca;
    String combustivel;
    int velocidadeMax;
    int acelerar;
    int anoVeiculo;
Carro(){

}
    public Carro(String cor, String marca, String combustivel, int velocidadeMax, int anoVeiculo , int acelerar) {
        this.cor = cor;
        this.marca = marca;
        this.combustivel = combustivel;
        this.velocidadeMax = velocidadeMax;
        this.anoVeiculo = anoVeiculo;
        this.acelerar = acelerar;
    }

    void acelerar(int velocidade){
    acelerar += velocidade;
    }

    void freiar(int reduzir) {
        
        acelerar -=reduzir;
    
    }

@Override
public String toString(){return this.cor+" "+this.marca+" "+this.combustivel+" "+this.velocidadeMax+" "+this.anoVeiculo+" "+this.acelerar;}

}
