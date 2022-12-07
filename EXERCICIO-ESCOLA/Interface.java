
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int opcao;
        Menu menu = new Menu();
        ArrayList<Aluno> aluno = new ArrayList<Aluno>();
        ArrayList<Professor> professor = new ArrayList<Professor>();
        ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
        Tecnico  tecnico = new Tecnico();
        Bolsista bolsista = new Bolsista();



      do {
        menu.menu();
        opcao = leitor.nextInt();

          switch(opcao){
            case 1 :
              case 2 :
            break;
            case 3 :
            break;
            case 4 :
            System.out.println("Finalizando....");
            break;
              default:
          }
      }while(opcao != 4);
    }
  }




