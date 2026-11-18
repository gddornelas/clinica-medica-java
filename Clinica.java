package clinicamedica;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
    ArrayList<Paciente> pacientes = new ArrayList<>();
    ArrayList<Medico> medicos = new ArrayList<>();
    ArrayList<Secretaria> secretarias = new ArrayList<>();
    ArrayList<Agendamento> agenda = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int opcao;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("\t 1 - Pacientes");
            System.out.println("\t 2 - Medicos");
            System.out.println("\t 3 - Secretarias");
            System.out.println("\t 4 - Agendar consulta");
            System.out.println("\t 5 - Consultar agenda");
            System.out.println("\t 6 - Sair");
            System.out.print("\t Digite uma opcao: ");
            opcao = lerNumero();

            switch (opcao) {
                case 1:
                    menuPacientes();
                    break;
                case 2:
                    menuMedicos();
                    break;
                case 3:
                    menuSecretarias();
                    break;
                case 4:
                    agendar();
                    break;
                case 5:
                    consultarAgenda();
                    break;
                case 6:
                    System.out.println("\t Saindo...");
                    break;
                default:
                    System.out.println("\t Opção inválida");
            }
        } while (opcao != 6);
    }

    // ---------------------- PACIENTES ---------------------------
    private void menuPacientes() {
        int op;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("\t ------ PACIENTE ------");
            System.out.println("\t 1 - Cadastrar");
            System.out.println("\t 2 - Alterar");
            System.out.println("\t 3 - Mostrar");
            System.out.println("\t 0 - Voltar");
            System.out.print("\t Digite uma opcao: ");
            op = lerNumero();

            switch (op) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.print("\t Nome do paciente: ");
                    String nome = scanner.nextLine();
                    System.out.print("\t Telefone do paciente: ");
                    String telefone = scanner.nextLine();
                    System.out.print("\t Email do paciente: ");
                    String email = scanner.nextLine();

                    pacientes.add(new Paciente(nome, telefone, email));
                    System.out.println("\t Paciente cadastrado!");
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    if (pacientes.isEmpty()) {
                        System.out.println("\t Nenhum paciente cadastrado.");
                        return;
                    }
                    mostrarPacientes();
                    System.out.print("\t Número do paciente que deseja alterar: ");
                    int i = lerNumero() - 1;
                    if (i < 0 || i >= pacientes.size()) {
                        System.out.println("\t Paciente invalido.");
                        return;
                    }

                    Paciente p = pacientes.get(i);
                    System.out.println("\t (Aperte Enter para manter o valor atual)");
                    p.setNome(lerOuManter("Nome", p.getNome()));
                    p.setTelefone(lerOuManter("Telefone", p.getTelefone()));
                    p.setEmail(lerOuManter("Email", p.getEmail()));
                    System.out.println("\t Paciente alterado!");
                    break;
                case 3:
                    mostrarPacientes();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\t Opção invalida");
            }
        } while (op != 0);
    }
    
    private void mostrarPacientes() {
        System.out.println("-----------------------------------------");
        if (pacientes.isEmpty()) {
            System.out.println("\t Nenhum paciente cadastrado.");
            return;
        }
        for (int i = 0; i < pacientes.size(); i++) {
            Paciente p = pacientes.get(i);
            System.out.println("\t " + (i + 1) + " - " + p.getNome()
                    + " | Tel: " + p.getTelefone()
                    + " | Email: " + p.getEmail());
        }
    }
    
    //certo

    // --------------------- MÉDICOS ------------------------
    private void menuMedicos() {
        int op;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("\t ------ MEDICOS ------");
            System.out.println("\t 1 - Cadastrar");
            System.out.println("\t 2 - Alterar");
            System.out.println("\t 3 - Mostrar");
            System.out.println("\t 0 - Voltar");
            System.out.print("\t Digite uma opcao: ");
            op = lerNumero();

            switch (op) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.print("\t Nome do medico: ");
                    String nome = scanner.nextLine();
                    System.out.print("\t Telefone do medico: ");
                    String telefone = scanner.nextLine();
                    System.out.print("\t Email do medico: ");
                    String email = scanner.nextLine();
                    System.out.print("\t CRM do medico: ");
                    String crm = scanner.nextLine();

                    medicos.add(new Medico(nome, telefone, email, crm));
                    System.out.println("\t Medico cadastrado.");
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    if (medicos.isEmpty()) {
                        System.out.println("\t Nenhum medico cadastrado.");
                        return;
                    }
                    mostrarMedicos();
                    System.out.print("\t Número do medico que deseja alterar: ");
                    int i = lerNumero() - 1;
                    if (i < 0 || i >= medicos.size()) {
                        System.out.println("\t Medico invalido.");
                        return;
                    }

                    Medico m = medicos.get(i);
                    System.out.println("\t (Aperte Enter para manter o valor atual)");
                    m.setNome(lerOuManter("Nome", m.getNome()));
                    m.setTelefone(lerOuManter("Telefone", m.getTelefone()));
                    m.setEmail(lerOuManter("Email", m.getEmail()));
                    m.setCrm(lerOuManter("CRM", m.getCrm()));
                    System.out.println("\t Médico alterado!");
                    break;
                case 3:
                   mostrarMedicos();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\t Opção invalida");
            }
        } while (op != 0);
    }
    
    private void mostrarMedicos() {
        System.out.println("-----------------------------------------");
        if (medicos.isEmpty()) {
            System.out.println("\t Nenhum medico cadastrado.");
            return;
        }
        for (int i = 0; i < medicos.size(); i++) {
            Medico m = medicos.get(i);
            System.out.println("\t " + (i + 1) + " - " + m.getNome()
                    + " | Tel: " + m.getTelefone()
                    + " | Email: " + m.getEmail()
                    + " | CRM: " + m.getCrm());
        }
    }
    

    // -------------------- SECRETÁRIAS -------------------------
    private void menuSecretarias() {
        int op;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("\t ------ SECRETARIAS ------");
            System.out.println("\t 1 - Cadastrar");
            System.out.println("\t 2 - Alterar");
            System.out.println("\t 3 - Mostrar");
            System.out.println("\t 0 - Voltar");
            System.out.print("\t Digite uma opcao: ");
            op = lerNumero();

            switch (op) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.print("\t Nome da secretaria: ");
                    String nome = scanner.nextLine();
                    System.out.print("\t Telefone da secretaria: ");
                    String telefone = scanner.nextLine();
                    System.out.print("\t Email da secretaria: ");
                    String email = scanner.nextLine();
                    System.out.print("\t Matricula da secretaria: ");
                    String cadastro = scanner.nextLine();

                    secretarias.add(new Secretaria(nome, telefone, email, cadastro));
                    System.out.println("\t Secretaria cadastrada!");
                    break;
                case 2:
                    System.out.println("-----------------------------------------");
                    if (secretarias.isEmpty()) {
                        System.out.println("\t Nenhuma secretária cadastrada.");
                        return;
                    }
                    mostrarSecretarias();
                    System.out.print("\t Número da secretaria que deseja alterar: ");
                    int i = lerNumero() - 1;
                    if (i < 0 || i >= secretarias.size()) {
                        System.out.println("\t Secretaria invalida.");
                        return;
                    }

                    Secretaria s = secretarias.get(i);
                    System.out.println("\t (Aperte Enter para manter o valor atual)");
                    s.setNome(lerOuManter("Nome", s.getNome()));
                    s.setTelefone(lerOuManter("Telefone", s.getTelefone()));
                    s.setEmail(lerOuManter("Email", s.getEmail()));
                    s.setCadastro(lerOuManter("Matrícula", s.getCadastro()));
                    System.out.println("\t Secretária alterada!");
                    break;
                case 3:
                    mostrarSecretarias();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\t Opcao invalida");
            }
        } while (op != 0);
    }
    
    private void mostrarSecretarias() {
        System.out.println("-----------------------------------------");
        if (secretarias.isEmpty()) {
            System.out.println("\t Nenhuma secretaria cadastrada.");
            return;
        }
        for (int i = 0; i < secretarias.size(); i++) {
            Secretaria s = secretarias.get(i);
            System.out.println("\t " + (i + 1) + " - " + s.getNome()
                    + " | Tel: " + s.getTelefone()
                    + " | Email: " + s.getEmail()
                    + " | Matrícula: " + s.getCadastro());
        }
    }

    // ------------------- AGENDAMENTO ---------------------
    private void agendar() {
        System.out.println("-----------------------------------------");
        if (pacientes.isEmpty() || medicos.isEmpty()) {
            System.out.println("\t Cadastre pelo menos um paciente e um medico primeiro.");
            return;
        }

        // Escolher paciente
        System.out.println("\t Pacientes:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println("\t " + (i + 1) + " - " + pacientes.get(i).getNome());
        }
        System.out.print("\t Escolha o paciente: ");
        int escolhaPaciente = lerNumero() - 1;
        if (escolhaPaciente < 0 || escolhaPaciente >= pacientes.size()) {
            System.out.println("\t Paciente invalido.");
            return;
        }

        // Escolher médico
        System.out.println("\t Medicos:");
        for (int i = 0; i < medicos.size(); i++) {
            System.out.println("\t " + (i + 1) + " - " + medicos.get(i).getNome());
        }
        System.out.print("\t Escolha o medico: ");
        int escolhaMedico = lerNumero() - 1;
        if (escolhaMedico < 0 || escolhaMedico >= medicos.size()) {
            System.out.println("\t Medico invalido.");
            return;
        }

        // Sintoma, data e hora
        System.out.print("\t Qual o sintoma? ");
        String sintoma = scanner.nextLine();
        System.out.print("\t Data (dd/mm/aaaa): ");
        String data = scanner.nextLine();
        System.out.print("\t Hora (hh:mm): ");
        String hora = scanner.nextLine();

        Paciente paciente = pacientes.get(escolhaPaciente);
        Medico medico = medicos.get(escolhaMedico);

        // Não deixa o mesmo médico ter duas consultas no mesmo horário
        for (Agendamento a : agenda) {
            if (a.getMedico() == medico && a.getData().equals(data) && a.getHora().equals(hora)) {
                System.out.println("\t Dr(a)"+ a.getMedico().getNome() + " ja tem o horariao das "+ a.getHora()  + " ocupado.");
                return;
            }
        }

        agenda.add(new Agendamento(medico,paciente,sintoma, data, hora));
        System.out.println("\t Consulta agendada!");
    }

    private void consultarAgenda() {
        System.out.println("-----------------------------------------");
        if (agenda.isEmpty()) {
            System.out.println("\t Nenhum agendamento ainda.");
            return;
        }
        for (int i = 0; i < agenda.size(); i++) {
            Agendamento a = agenda.get(i);
            System.out.println("\t " + (i + 1) + ") Medico: " + a.getMedico().getNome()
                    + " | Paciente: " + a.getPaciente().getNome()
                    + " | Sintoma: " + a.getSintomas() 
                    + " | " + a.getData() + " as " + a.getHora());
        }
    }

    // --------------- AUXILIARES ----------------
    // Lê um número sem travar se a pessoa digitar letra
    private int lerNumero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Mostra o valor atual e, se a pessoa só apertar Enter, mantém o valor
    private String lerOuManter(String campo, String atual) {
        System.out.print("\t " + campo + " [" + atual + "]: ");
        String novo = scanner.nextLine();
        if (novo.trim().isEmpty()) {
            return atual;
        }
        return novo;
    }
}