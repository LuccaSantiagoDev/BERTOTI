package pattern;

public class Paladino implements ClasseRPG  {

	@Override
	public void caracteristicas() {
		String hitPoints="150";
		String poder="30";
		String habilidadeEspecial="Smigh";
		System.out.println("Vida = "+hitPoints+"/n"+
				"poder ="+poder+"/n"+
				"Habilidade especial ="+habilidadeEspecial+"/n");
	}

}
