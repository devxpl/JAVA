public class Professor extends Pessoa {
    
private String espcialidade;
private float salario;


public void receberAumento(float aum){
this.salario += aum;
}

public String getEspcialidade() {
    return espcialidade;
}
public void setEspcialidade(String espcialidade) {
    this.espcialidade = espcialidade;
}
public float getSalario() {
   return salario;
}
public void setSalario(int salario) {
    this.salario = salario;
}


}
