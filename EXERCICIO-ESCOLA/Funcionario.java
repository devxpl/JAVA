public class Funcionario extends Pessoa{

Pessoa pessoa = new Pessoa();

private String setor;
private boolean trabalhando;

public void mudarTrabalho(){
this.trabalhando = ! this.trabalhando;
}

public String getSetor() {
    return setor;
}
public void setSetor(String setor) {
    this.setor = setor;
}
public boolean getTrabalhando() {
    return trabalhando;
}
public void setTrabalhando(Boolean trabalhando) {
    this.trabalhando = trabalhando;
}










}
