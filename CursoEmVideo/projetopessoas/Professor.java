package projetopessoas;

public class Professor extends Pessoa{
    private double salario;
    private String especialidade;

    public void receberAumento(double valor){
        this.setSalario(getSalario() + valor);
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
    
}