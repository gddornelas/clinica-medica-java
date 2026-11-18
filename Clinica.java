package clinicamedica;
import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
    ArrayList<Agendamento> listaPaciente = new ArrayList<>();
    ArrayList<Agendamento> listaMedico = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Agendamento ag1 = new Agendamento(new Medico(" ", " ", " ", " "),new Paciente(" "," "," "," "), " ", " ");
    private int opcao;
    private Agendamento agendamento;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private String Sintoma;
    
    public Clinica(){
    }
 
    public void agendar(){
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("\t 1 - Cadastrar Paciente");
            System.out.println("\t 2 - Cadastrar Medico");
            System.out.println("\t 3 - Consultar Agenda");
            System.out.println("\t 4 - Sair ");
            System.out.printf("\t Digite uma opção para prosseguir: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.printf("\tDigite o nome do Paciente: ");
                    nome = scanner.nextLine();
                    ag1.getPaciente().setNome(nome);

                    System.out.printf("\tDigite o telefone do Paciente: ");
                    telefone = scanner.nextLine();
                    ag1.getPaciente().SetTelefone(telefone);

                    System.out.printf("\tDigite o email do Paciente: ");
                    email = scanner.nextLine();
                    ag1.getPaciente().setEmail(email);
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    System.out.printf("\tDigite o nome do Medico: ");
                    nome = scanner.nextLine();
                    ag1.getMedico().setNome(nome);

                    System.out.printf("\tDigite o telefone do Medico: ");
                    telefone = scanner.nextLine();
                    ag1.getMedico().SetTelefone(telefone);

                    System.out.printf("\tDigite o email do Medico: ");
                    email = scanner.nextLine();
                    ag1.getMedico().setEmail(email);
                    
                    System.out.printf("\tDigite o Crm do Medico: ");
                    crm = scanner.nextLine();
                    ag1.getMedico().setCrm(crm);
                    break;
                case 3:
                    System.out.println("boa");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }  
    }
    public void marcarConsulta(Paciente paciente, Medico medico, String data, String hora) {
        listaPaciente.add(new Agendamento(medico, paciente, data, hora));
    }
}