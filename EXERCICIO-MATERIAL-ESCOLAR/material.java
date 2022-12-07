public class material {
  String nome;
  String marca;
  String preço;
  int quantidade= 10;
  material(){

  }
    public material(String nome, String marca, String preço) {
        this.nome = nome;
        this.marca = marca;
        this.preço = preço;
    }
    void estoque (int comprado){
      quantidade -=comprado;
    }
    @Override
    public String toString(){return this.nome+" "+this.marca+" "+this.preço;}


}
