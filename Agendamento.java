package clinicamedica;

public class Agendamento {
    private Medico medico;
    private Paciente paciente;
    private String data;
    private String hora;
    
    public Agendamento(Medico medico, Paciente paciente, String data, String hora){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
    }
    
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    
    public void setHora(String hora){
        this.hora = hora;
    }
    public String getHora(){
        return this.hora;
    }
    
    public Paciente getPaciente(){
        return paciente; 
    }
    public Medico getMedico (){
        return medico; 
    }
    
}
