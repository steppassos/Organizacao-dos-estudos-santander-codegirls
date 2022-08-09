import br.com.dio.desafio.dominio.*;
import com.sun.source.tree.NewArrayTree;

import javax.swing.text.html.HTMLDocument;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTítulo("curso Java");
        curso1.setDescrição("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso Js");
        curso2.setDescrição("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de Java");
        mentoria.setDescrição("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStephanie = new Dev();
        devStephanie.setNome("Stephanie");
        devStephanie.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Stephanie: " + devStephanie.getConteudosInscritos());
        devStephanie.progredir();
        devStephanie.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Stephanie: " + devStephanie.getConteudosInscritos());
        System.out.println("Conteudos concluidos Stephanie: " + devStephanie.getConteudosInscritos());
        System.out.println("XP:" + devStephanie.calcularTotalXp());

        System.out.println("-------");

        Dev devDavid = new Dev();
        devDavid.setNome("David");
        devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos David: " + devDavid.getConteudosInscritos());
        devDavid.progredir();
        devDavid.progredir();
        devDavid.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos David: " + devDavid.getConteudosInscritos());
        System.out.println("Conteudos concluidos David: " + devDavid.getConteudosInscritos());
        System.out.println("XP:" + devDavid.calcularTotalXp());



        }


    }

