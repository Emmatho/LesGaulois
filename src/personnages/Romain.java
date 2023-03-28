package personnages;

public class Romain {
	
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		assert force > 0 : "la force d’un Romain est toujours positive";
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}

	private String prendreParole() {
		return "Le romain" + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		assert force < 0 : "La force d’un Romain est positive";
		int aux = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert aux > force : "La force d'un Romain a diminué";
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
	}
}
