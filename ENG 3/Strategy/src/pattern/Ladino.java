package pattern;

public class Ladino implements ClasseRPG{

	@Override
	public void caracteristicas() {
		String hitPoints="50";
		String poder="10";
		String habilidadeEspecial="Roubo furtivo";
		System.out.println("Vida = "+hitPoints+"/n"+
				"poder ="+poder+"/n"+
				"Habilidade especial ="+habilidadeEspecial+"/n");
	}

}
