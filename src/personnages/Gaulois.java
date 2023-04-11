package personnages;

import java.util.Iterator;

public class Gaulois {

	private String nom;
	private int effetPotion;
	private int force;
	private int nbTrophees = 0;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] troph = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; troph != null && i < troph.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = troph[i];
		}
	}


	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix;
		asterix = new Gaulois("Ast�rix", 8);
		//System.out.println(asterix);
	}

}
