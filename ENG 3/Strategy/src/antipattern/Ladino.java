package antipattern;

public class Ladino extends Personagem {

	public Ladino(String hitPoints, String poder, String habilidadeEspecial) {
		super(hitPoints, poder, habilidadeEspecial);
		
	}
	
	public void caracteristicas() {
		 setHitPoints("50");
		 setPoder("10");
		 setHabilidadeEspecial("Roubo");
		System.out.println("Vida = "+getHitPoints()+"/n"+
				"poder ="+getPoder()+"/n"+
				"Habilidade especial ="+getHabilidadeEspecial()+"/n");
	}
 
}
