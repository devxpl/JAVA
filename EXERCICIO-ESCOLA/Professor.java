import java.util.Scanner;

public class Professor extends  Pessoa {
    private String especialidade;
    private float salario;
    Scanner leitor = new Scanner(System.in);
    int op = 0;

    public void receberAumento() {


            System.out.println("Aumentar salario:(Digite 1 para Sim / Digite 3 para Não)");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Aumentar R$500,00");
                    System.out.println("(Digite 1 para Sim / Digite 3 para Sair)");
                    salario = leitor.nextFloat();
                    if(salario == 1 ) {
                        System.out.println("Seu salario Aumentou R$500,00");
                        salario+=500;
                    }else if(salario == 3 ){
                        System.out.println("Seu salario Não aumentou !!");
                        System.out.println("=== MENU ===");
                    }

                    break;
            }

    }
    public void especialidade(){
        System.out.println(" ESPECIALISTA : MATEMATICA ");
    }

}

