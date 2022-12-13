import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Urna> listacandidato;
        listacandidato = new ArrayList<Urna>();
        Scanner leitor = new Scanner(System.in);
        Urna urna = new Urna();
        int op;

        do {
            System.out.println(" CADASTRAR - 1 ");
            System.out.println(" CONSULTAR - 2 ");
            op = leitor.nextInt();
            Urna.clearBuffer(leitor);

            if (op == 1) {
                System.out.println("NOME DO CANDIDATO:");
                urna.setNome(leitor.nextLine());

                System.out.println("PARTIDO CANDIDATO:");
                urna.setPartido(leitor.nextLine());

                System.out.println("NUMERO CANDIDATO:");
                urna.setNumero(leitor.next());
                Urna.clearBuffer(leitor);

                System.out.println("CONFIRMAR VOTO:");
                urna.setVotos(leitor.nextLine());
                listacandidato.add(urna);

            } else if (op == 2) {
                System.out.println("DIGITE O NOME DO CANDIDATO A PESQUISAR");
                String procurar = leitor.nextLine();

                boolean encontrou = false;

                for (int contador = 0; contador < listacandidato.size(); contador++){
                    String consultanome = urna.getNome();

                    if(consultanome.equals(procurar)){
                        encontrou = true;
                    }
                }
                if(encontrou){
                    System.out.println("encontrou\n");
                    for (int contador = 0; contador < listacandidato.size(); contador++){
                        System.out.println(""+listacandidato.get(contador).getNome()+","+listacandidato.get(contador).getNumero()+","+listacandidato.get(contador).getPartido()+","+listacandidato.get(contador).getVotos());
                    }

                }else{
                    System.out.println("não encontrou");
                }
            }
        } while (op != 4);
    }
}