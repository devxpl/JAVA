import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    ArrayList<Alunos> alunolista = new ArrayList<>();
    ArrayList<Professor> professorlista = new ArrayList<>();
    ArrayList<Funcionario> funcionariolista = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

public Menu() {
    }
public void menu(){
     System.out.println(" 1 - Cadastrar Aluno");
     System.out.println(" 2 - Cadastrar Professor");
     System.out.println(" 3 - Cadastrar Funcionario");
     System.out.println(" 4 - Lista Alunos");
     System.out.println(" 5 - Lista Professores");
     System.out.println(" 6 - Lista Funcionarios");
     System.out.println(" 7 - Buscar Aluno");
     System.out.println(" 8 - Buscar Professor");
     System.out.println(" 9 - Buscar Funcionario");
     System.out.println(" 10 - Sair");
 }
public void cadastroAluno(){
     //* metodo para cadastrar alunos
     Alunos newaluno = new Alunos();
     System.out.println(" NOME ALUNO(A) : ");
     newaluno.setNome(leitor.next());

     System.out.println(" IDADE : ");
     newaluno.setIdade(leitor.nextInt());

     System.out.println(" GENERO : ");
     newaluno.setSexo(leitor.next());

     alunolista.add(newaluno);

 }
public void listarAlunos (){
     //*criar metodo para listar todos os alunos que foram cadastrados.
     System.out.println(alunolista);

 }
public void buscarAluno() {
     System.out.println("NOME DO ALUNO(A) : ");
     String buscarNome = leitor.next();

     boolean encontrou = false;
//* Esse for está pegando o tamanho da lista e entre as { } está sendo percorrido cada espaço da lista iniciando na posição 0
     //* o if faz a comparação de "buscarNome" com o nome do funcionario " funcionario.getNome " caso os nomes sejam iguais
     //* irá escrever na tela o Nome do Aluno , idade , genero .
     //* CASO NÃO seja iguais else " não encontrou"
     for(int contandor =0; contandor < alunolista.size(); contandor++ ){
        Alunos alunos = alunolista.get(contandor);
       if(buscarNome.equals(alunos.getNome())){
           System.out.println(" ENCONTROU"+"\n ALUNO : "+alunos.getNome()+"\n IDADE : "+alunos.getIdade()+" \n GENERO : "+alunos.getSexo());
           encontrou = true;
           break;
       }else{
           System.out.println("nao encontrou");
       }
     }

 }
public void cadastroProfessor(){
     //* metodo para cadastrar professores
    Professor newProfessor = new Professor();

    System.out.println(" NOME PROFESSOR : ");
    newProfessor.setNome(leitor.next());

    System.out.println(" IDADE : ");
    newProfessor.setIdade(leitor.nextInt());

    System.out.println(" GENERO : ");
    newProfessor.setSexo(leitor.next());
    professorlista.add(newProfessor);

}
public void listarProfessores(){
     //* criar metodo para listar todos os professores que foram cadastrado
     System.out.println(professorlista);
      Professor professor = new Professor();
      professor.especialidade();
}
public void buscarProfessor(){
        System.out.println("NOME DO PROFESSOR(A) : ");
        String buscarNome = leitor.next();

        boolean encontrou = false;
        //* Esse [for] está pegando o tamanho da lista e entre as { } está sendo percorrido cada espaço da lista iniciando na posição 0
        //* o if faz a comparação de "buscarNome" com o nome do funcionario " funcionario.getNome " caso os nomes sejam iguais
        //* irá escrever na tela o Nome do Professor , idade , genero .
        //* CASO NÃO seja iguais else " não encontrou"
        for(int contandor =0; contandor < professorlista.size(); contandor++ ){
            Professor professor = professorlista.get(contandor);
            if(buscarNome.equals(professor.getNome())){
                System.out.println(" ENCONTROU"+"\n PROFESSOR : "+professor.getNome()+"\n IDADE : "+professor.getIdade()+" \n GENERO : "+professor.getSexo());
                encontrou = true;
                break;
            }else{
                System.out.println("nao encontrou");
            }
        }

    }
public void cadastroFuncionario() {
    //* metodo para cadastrar os funcionarios da escola
    Funcionario newFuncionario = new Funcionario();

    System.out.println(" NOME ALUNO : ");
    newFuncionario.setNome(leitor.next());

    System.out.println(" IDADE : ");
    newFuncionario.setIdade(leitor.nextInt());

    System.out.println(" GENERO : ");
    newFuncionario.setSexo(leitor.next());
    funcionariolista.add(newFuncionario);
}
public void listarFuncionarios(){
     //*criar metodo para listar todos os funcionarios cadastrados
    System.out.println(funcionariolista);
}
public void buscarFuncionarios(){
        System.out.println("NOME DO FUNCIONARIO(A) : ");
        String buscarNome = leitor.next();

        boolean encontrou = false;
        //* Esse for está pegando o tamanho da lista e entre as { } está sendo percorrido cada espaço da lista iniciando na posição 0
        //* o if faz a comparação de "buscarNome" com o nome do funcionario " funcionario.getNome " caso os nomes sejam iguais
        //* irá escrever na tela o Nome do funcionario , idade , genero .
        //* CASO NÃO seja iguais else " não encontrou"
        for(int contandor =0; contandor < funcionariolista.size(); contandor++ ){
            Funcionario funcionario = funcionariolista.get(contandor);
            if(buscarNome.equals(funcionario.getNome())){
                System.out.println(" ENCONTROU"+"\n FUNCIONARIO : "+funcionario.getNome()+"\n IDADE : "+funcionario.getIdade()+" \n GENERO : "+funcionario.getSexo());
                encontrou = true;
                break;
            }else{
                System.out.println("nao encontrou");
            }
        }
    }

}
