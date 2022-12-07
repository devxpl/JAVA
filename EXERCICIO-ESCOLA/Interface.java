
import java.util.Scanner;

public class Interface {
public static void main(String[] args) {
    int opcao;

        Menu menu = new Menu();
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();
        Scanner leitor = new Scanner(System.in);

      do {
        menu.menu();
        opcao = leitor.nextInt();

          switch(opcao){
            case 1 :

            break;
            case 2 :


            case 3 :

            case 4 :
            System.out.println("Finalizando....");
            break;
              default:
          }
      }while(opcao != 4);
    }
  }




