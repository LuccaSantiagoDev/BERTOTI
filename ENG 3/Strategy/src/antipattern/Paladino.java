package antipattern;

public class Paladino extends Personagem {

	public Paladino(String hitPoints, String poder, String habilidadeEspecial) {
		super(hitPoints, poder, habilidadeEspecial);
		// TODO Auto-generated constructor stub
	}
	public void caracteristicas() {
		 setHitPoints("150");
		 setPoder("10");
		 setHabilidadeEspecial("Smigth");
		System.out.println("Vida = "+getHitPoints()+"/n"+
				"poder ="+getPoder()+"/n"+
				"Habilidade especial ="+getHabilidadeEspecial()+"/n");
	}

}
