import java.util.Scanner;

public class Urna {

    String nome,partido;
    String numero,votos;


    // pegar - > getNomeVariavel
    public String getVotos() {
        return votos;
    }

    // modificar -> setNomeVariavel
    public void setVotos(String votos) {
        this.votos = votos;
    }

    // pegar - > getNomeVariavel
    public String getNome() {
        return nome;
    }

    // modificar -> setNomeVariavel
    public void setNome(String nome) {
        this.nome = nome;
    }

    // pegar - > getNomeVariavel
    public String getPartido() {
        return partido;
    }

    // modificar -> setNomeVariavel
    public void setPartido(String partido) {
        this.partido = partido;
    }

    //pegar - > getNomeVariavel
    public String getNumero() {
        return numero;
    }

    // modificar -> setNomeVariavel
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static void clearBuffer(Scanner scanner) {
        Scanner leitor =new Scanner(System.in);
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}