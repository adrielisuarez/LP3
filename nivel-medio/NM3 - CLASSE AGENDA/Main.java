/*Classe Agenda Crie uma classe Agenda que mantém uma lista de Compromissos.
Cada Compromisso tem uma data, hora e descricao. A classe Agenda deve ter
métodos para adicionar um Compromisso e para retornar uma lista de
Compromissos para uma data específica.*/
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Agenda
        Agenda agenda = new Agenda();

        // Adicionando compromissos à agenda
        agenda.adicionarCompromisso(new Compromisso(LocalDate.of(2024, 6, 23), LocalTime.of(10, 0), "Reunião de trabalho"));
        agenda.adicionarCompromisso(new Compromisso(LocalDate.of(2024, 6, 23), LocalTime.of(14, 0), "Consulta médica"));
        agenda.adicionarCompromisso(new Compromisso(LocalDate.of(2024, 6, 24), LocalTime.of(9, 0), "Encontro com amigos"));

        // Obtendo compromissos para uma data específica
        LocalDate dataConsulta = LocalDate.of(2024, 6, 23);
        System.out.println("Compromissos para " + dataConsulta + ":");
        for (Compromisso compromisso : agenda.obterCompromissosPorData(dataConsulta)) {
            System.out.println(compromisso);
        }
    }
}
