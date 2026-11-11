package clinicamedica;

public class ClinicaMedica {

    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        Paciente pac1 = new Paciente("Ana", "11999999999", "ana@email.com", "Dor de cabeca");
        Paciente pac2 = new Paciente("Maria", "11996592344", "Maria@email.com", "Falta de ar");
        Paciente pac3 = new Paciente("Julia", "11956426375", "Julia@email.com", "Convulso frequentes");
        Paciente pac4 = new Paciente("Danilo", "11954584355", "Danilo@email.com", "Desmaio");
        Paciente pac5 = new Paciente("Cleber", "11995334513", "Cleber@email.com", "Febre alta");
        Paciente pac6 = new Paciente("Jorge", "11999531462", "Jorge@email.com", "Dor no intestino");
        
        Medico med1 = new Medico("Dr. Carlos", "11888888888", "carlos@email.com", "CRM123");
        Medico med2 = new Medico("Dr. Lucas", "11995683247", "Lucas@email.com", "CRM567");
        
        Secretaria sec1 = new Secretaria("Carla", "11968123455","Carla@email.com");
        Secretaria sec2 = new Secretaria("valeria", "11965345781", "Valeria@email.com");
        
        med1.setSecretaria(sec1);
        med2.setSecretaria(sec2);

        clinica.agendar(pac1, med1, "15/11/2026", "14:00");
        clinica.agendar(pac2, med1, "15/11/2026", "15:00");
        clinica.agendar(pac3, med1, "15/11/2026", "17:00");
        clinica.agendar(pac4, med2, "16/11/2026", "11:00");
        clinica.agendar(pac5, med2, "16/11/2026", "13:00");
        clinica.agendar(pac6, med2, "16/11/2026", "13:00");
        
    }
    
}
