import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    Scanner leitor = new Scanner(System.in);
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
     ArrayList<Aluno> aluno = new ArrayList<Aluno>();
     Aluno newAluno = new Aluno();

     System.out.println(" NOME ALUNO : ");
     String nomeAluno = leitor.next();
     newAluno.setNome(nomeAluno);

     System.out.println(" IDADE ALUNO : ");
     int idadeAluno = leitor.nextInt();
     newAluno.setIdade(idadeAluno);

     System.out.println(" GENERO ALUNO : ");
     String generoAluno = leitor.next();
     newAluno.setSexo(generoAluno);
     aluno.add(newAluno);

     System.out.println(aluno);

 }
 public void listarAlunos (){
     //*criar metodo para listar todos os alunos que foram cadastrados.

 }


public void cadastroProfessor(){
     //* metodo para cadastrar professores
    ArrayList<Professor> professor = new ArrayList<Professor>();
    Professor newProfessor = new Professor();

    System.out.println(" NOME PROFESSOR : ");
    String nomeProfessor = leitor.next();
    newProfessor.setNome(nomeProfessor);


    System.out.println(" IDADE PROFESSOR : ");
    int idadeProfessor = leitor.nextInt();
    newProfessor.setIdade(idadeProfessor);


    System.out.println(" GENERO PROFESSOR : ");
    String generoProfessor = leitor.next();
    newProfessor.setSexo(generoProfessor);
    professor.add(newProfessor);

}
public void listarProfessores(){
     //* criar metodo para listar todos os professores que foram cadastrado
}
public void cadastroFuncionario(){
     //* metodo para cadastrar os funcionarios da escola
    ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
    Funcionario newFuncionario = new Funcionario();

    System.out.println(" NOME ALUNO : ");
    String nomeFuncionario = leitor.next();
    newFuncionario.setNome(nomeFuncionario);


    System.out.println(" IDADE FUNCIONARIO : ");
    int idadeFuncionario = leitor.nextInt();
    newFuncionario.setIdade(idadeFuncionario);


    System.out.println(" GENERO FUNCIONARIO : ");
    String generoFuncionario = leitor.next();
    newFuncionario.setSexo(generoFuncionario);
    funcionario.add(newFuncionario);

}
public void listarFuncionarios(){
     //*criar metodo para listar todos os funcionarios cadastrados
}


}
