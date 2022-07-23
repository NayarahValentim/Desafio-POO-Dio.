package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso2.setTitulo("curso dominandoides");
        curso2.setDescricao("descricao curso dominandoides");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devNayarah = new Dev();
        devNayarah.setNome("Nayarah");
        devNayarah.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nayarah:" + devNayarah.getConteudosInscritos());
        devNayarah.progredir();
        devNayarah.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nayarah:" + devNayarah.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nayarah:" + devNayarah.getConteudosConcluidos());
        System.out.println("XP:" + devNayarah.calcularTotalXp());

        System.out.println("-------");

        Dev devDebora = new Dev();
        devDebora.setNome("Debora");
        devDebora.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Debora:" + devDebora.getConteudosInscritos());
        devDebora.progredir();
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Debora:" + devDebora.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Debora:" + devDebora.getConteudosConcluidos());
        System.out.println("XP:" + devDebora.calcularTotalXp());

    }
}