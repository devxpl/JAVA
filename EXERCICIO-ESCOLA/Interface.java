
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
                      menu.listarAlunos();
              break;
              case 2 :
                      menu.cadastroProfessor();
                      menu.listarProfessores();
              break;
              case 3 :
                      menu.cadastroFuncionario();
                      menu.listarFuncionarios();
               break;
              case 4 :
                        //* listarAlunos cadastrados no sistema
              break;
              case 5 :
                       //* listarProfessores  cadastrados no sistema
              break;
              case 6 :
                      //* listarFuncionarios  cadastrados no sistema
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




