//* Criar uma Classe Carro que possua:
//-No mínimo 5 atributos;
//-Dois métodos Acelerar e Freiar;
//-Não esquecer de criar um construtor padrão sempre;
//-Não esquecer de colocar o @Override da mesma forma que o exemplo postado no dia 30 de novembro;
//-Na subClasse:
//-Criar no mínimo 3 objetos (utilizando os atributos e métodos criados na superClasse e fazer o código para imprimi-los no console);

public class ExercicioCarro {
    public static void main(String[] args) throws Exception {
      
        Carro carro1 = new Carro();
        carro1.marca = "Civic";
        carro1.velocidadeMax = 240;
        carro1.anoVeiculo = 2020;
        carro1.combustivel = "Gasolina";
        carro1.cor = "Branco";
        carro1.acelerar(240);
        
        Carro carro2 = new Carro();
        carro2.marca = "S10";
        carro2.velocidadeMax = 220;
        carro2.anoVeiculo = 2019;
        carro2.combustivel = "Diesel";
        carro2.cor = "Preto";
        carro2.acelerar(160);
        carro2.freiar(30);
        
        Carro carro3 = new Carro();
        carro3.marca = "Polo";
        carro3.velocidadeMax = 200;
        carro3.anoVeiculo = 2021;
        carro3.combustivel = "Alcool";
        carro3.cor = "Vermelho";
        carro3.acelerar(140);
        carro3.freiar(60);

        System.out.println("=== LISTA DE CARROS NA CORRIDA ===");
        System.out.println(" - Marca: "+carro1.marca+"\n - Cor: "+carro1.cor+"\n - Ano do Veiculo: "+carro1.anoVeiculo+"\n - Combustivel: "+carro1.combustivel+"\n - Velocidade Maxima: "+carro1.velocidadeMax+"\n - Velocidade Atual : "+carro1.acelerar);
        if (carro1.acelerar >= carro1.velocidadeMax) {
            carro1.freiar(40);
            System.out.println(" - Reduzindo... :  " + carro1.acelerar+"KMH");
            carro1.freiar(50);
            System.out.println(" - Reduzindo... :  " + carro1.acelerar+"KMH");
        }

        System.out.println("\n");
        System.out.println(" - Marca: "+carro2.marca+"\n - Cor: "+carro2.cor+"\n - Ano do Veiculo: "+carro2.anoVeiculo+"\n - Combustivel: "+carro2.combustivel+"\n - Velocidade Maxima: "+carro2.velocidadeMax+"\n - Velocidade Atual : "+carro2.acelerar);
        System.out.println("\n");
        System.out.println(" - Marca: "+carro3.marca+"\n - Cor: "+carro3.cor+"\n - Ano do Veiculo: "+carro3.anoVeiculo+"\n - Combustivel: "+carro3.combustivel+"\n - Velocidade Maxima: "+carro3.velocidadeMax+"\n - Velocidade Atual : "+carro3.acelerar);
    }
}





