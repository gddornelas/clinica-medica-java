package clinicamedica;

public class Medico extends Pessoa{
    private String crm;
    private Secretaria secretaria;
    
    public Medico(String nome, String telefone, String email, String crm){
        super(nome, telefone, email);
        this.crm = crm;
    }
    
    public void setCrm(String crm){
        this.crm = crm;
    }
    public String getCrm(){
        return this.crm;
    }
    
    public void setSecretaria(Secretaria secretaria){
        this.secretaria = secretaria;
    }
    public Secretaria secretaria(){
        return secretaria;
    }
}
