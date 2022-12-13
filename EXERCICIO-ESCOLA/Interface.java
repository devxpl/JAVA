
import java.util.Scanner;

public class Interface {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int opcao;
        Menu menu = new Menu();
        Professor professor = new Professor();
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
                      professor.receberAumento();
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
                      menu.buscarAluno();
              break;
              case 8 :
                      menu.buscarProfessor();
              break;
              case 9 :
                     menu.buscarFuncionarios();
              break;
              case 10 :
                  System.out.println("Finalizando....");
             break;
              default:
          }
      }while(opcao != 10);
    }
  }




