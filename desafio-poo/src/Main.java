import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(20);
        curso1.setTitulo("DIO");
        curso1.setDescricao("Curso Java DIO");
        Curso curso2 = new Curso();
        curso2.setCargaHoraria(12);
        curso2.setTitulo("JAVA");
        curso2.setDescricao("Curso Java");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Olaa");
        mentoria.setDescricao("Opppaa");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}