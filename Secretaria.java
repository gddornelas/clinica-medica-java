package clinicamedica;

public class Secretaria extends Pessoa{
    private String cadastro;
    public Secretaria(String nome, String telefone, String email, String cadastro){
        super(nome,telefone,email);
        this.cadastro = cadastro;
    }
    
    public void setCadastro(String cadastro){
        this.cadastro = cadastro;
    }
    public String getCadastro(){
        return cadastro;
    }
}
