
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int opcao;
        Menu menu = new Menu();
        Tecnico  tecnico = new Tecnico();
        Bolsista bolsista = new Bolsista();

      do {
        menu.menu();
        opcao = leitor.nextInt();

          switch(opcao){
              case 1 :
                      menu.cadastroAluno();
              break;
              case 2 :
                      menu.cadastroProfessor();
              break;
              case 3 :
                      menu.cadastroFuncionario();
               break;
              case 4 :
                      menu.listarAlunos();
              break;
              case 5 :
                      menu.listarProfessores();
              break;
              case 6 :
                      menu.listarFuncionarios();
              break;
              case 7 :
                      //* buscarAluno cadastrado no sistema
              break;
              case 8 :
                       //* buscarProfessor cadastrado no sistema
              break;
              case 9 :
                       //* buscarFuncionarios cadastrado no sistema
              break;
              case 10 :
                  System.out.println("Finalizando....");
             break;
              default:
          }
      }while(opcao != 10);
    }
  }




