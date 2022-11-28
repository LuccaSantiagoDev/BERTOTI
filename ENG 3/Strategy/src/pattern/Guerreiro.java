package pattern;

public class Guerreiro implements ClasseRPG {
	
	@Override
	public void caracteristicas() {
		String hitPoints="200";
		String poder="30";
		String habilidadeEspecial="Furia";
		System.out.println("Vida = "+hitPoints+"/n"+
							"poder ="+poder+"/n"+
							"Habilidade especial ="+habilidadeEspecial+"/n");
	}
}
