public class Main {
    public static void main(String[] args) {
        material m4 = new material();
        m4.nome = "Agenda";
        m4.marca = "Tilibra";
        m4.preço = "50.00f";


       m4.estoque(5);
        System.out.println(" - Produto: "+m4.nome+"\n - Marca: "+m4.marca+"\n - Preço: "+m4.preço+"\n - Estoque Atual: "+m4.quantidade);
    }


}