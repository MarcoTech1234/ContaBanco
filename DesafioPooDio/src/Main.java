import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java Pro");
		curso1.setDescricao("Descricao do Curso Java Pro");
		curso1.setCargaHoraria(10);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Descricao do Curso Python");
		curso2.setCargaHoraria(20);
		
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev marco = new Dev();
        marco.setNome("Marco");
        marco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + marco.getNome() + " : " + marco.getConteudoInscrito());
        marco.progredir();
        marco.progredir();
        marco.progredir();
        System.out.println("Conteúdos inscritos " + marco.getNome() + " : " + marco.getConteudoInscrito());
        System.out.println("Conteúdos concluido " + marco.getNome() + " : " + marco.getConteudoConcluido());
        System.out.println("XP: " + marco.calcularTotalXP());
        
        Dev pedro = new Dev();
        pedro.setNome("Pedro Rocha");
        pedro.inscreverBootcamp(bootcamp);
        pedro.progredir();
        System.out.println("Conteúdos inscritos " + pedro.getNome() + " : " + pedro.getConteudoInscrito());
        System.out.println("Conteúdos concluido " + pedro.getNome() + " : " + pedro.getConteudoConcluido());
        System.out.println("XP: " + pedro.calcularTotalXP());
        
        
        
        
        
        
		
		
	}

}
