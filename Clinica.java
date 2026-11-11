package clinicamedica;

public class Clinica {
    private final Agendamento[] agendamento;
    private int total = 0;

    public Clinica() {
        this.agendamento = new Agendamento[100];
    }

    public void agendar(Paciente paciente, Medico medico, String data, String hora) {
        for (int i = 0; i < total; i++) {
            Agendamento a = agendamento[i];
            if (a.getMedico() == medico && a.getData().equals(data) && a.getHora().equals(hora)) {
                System.out.println("-----------------------------------------");
                System.out.println("\tHorario "+a.getData() +" as "+ a.getHora() + " do medico " + a.getMedico().getNome() + " Ocupado!");
                return;
            }
        }  
        
        if (total >= agendamento.length) {
            System.out.println("Agenda cheia!");
            return;
        }

        agendamento[total] = new Agendamento(medico, paciente, data, hora);
        total++;
        
        System.out.println("-----------------------------------------");
        System.out.println("\tPaciente: " + paciente.getNome());
        System.out.println("\tMedico: " + medico.getNome());
        System.out.println("\tSecretaria: " + medico.secretaria().getNome());
        System.out.println("\tData: " + data);
        System.out.println("\tHora: " + hora);
        System.out.println("\tSintoma: " + paciente.getSintomas());
    }
}
