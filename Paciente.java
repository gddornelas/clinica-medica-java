package clinicamedica;

public class Paciente extends Pessoa{
    
    private String sintomas;
    
    public Paciente(String nome, String telefone, String email, String sintomas){
        super(nome, telefone, email);
        this.sintomas = sintomas;
    }
    
    public void setSintomas(String sintomas){
        this.sintomas = sintomas;
    }
    public String getSintomas(){
        return this.sintomas;
    }
}
