package antipattern;

public class Personagem {
	
	private String hitPoints;
	private String poder;
	private String habilidadeEspecial;
	
	public Personagem(String hitPoints, String poder, String habilidadeEspecial) {
		
		this.setHitPoints(hitPoints);
		this.setPoder(poder);
		this.setHabilidadeEspecial(habilidadeEspecial);
	}
	
	public String getPoder() {
		return poder;
	}
	public void setPoder(String poder) {
		this.poder = poder;
	}
	public String getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(String hitPoints) {
		this.hitPoints = hitPoints;
	}
	public String getHabilidadeEspecial() {
		return habilidadeEspecial;
	}
	public void setHabilidadeEspecial(String habilidadeEspecial) {
		this.habilidadeEspecial = habilidadeEspecial;
	}
	
}
