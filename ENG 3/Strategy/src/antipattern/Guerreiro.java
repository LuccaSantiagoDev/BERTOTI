package antipattern;

public class Guerreiro extends Personagem {

	public Guerreiro(String hitPoints, String poder, String habilidadeEspecial) {
		super(hitPoints, poder, habilidadeEspecial);
		// TODO Auto-generated constructor stub
	}
	
	public void caracteristicas() {
		 setHitPoints("200");
		 setPoder("30");
		 setHabilidadeEspecial("Furia");
		System.out.println("Vida = "+getHitPoints()+"/n"+
				"poder ="+getPoder()+"/n"+
				"Habilidade especial ="+getHabilidadeEspecial()+"/n");
	}

}
