package personnages;

public class Romain {

	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		super();
		assert force > 0 : "la force d�un Romain est toujours positive";
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
		return "Le romain" + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		assert force < 0 : "La force d�un Romain est positive";
		int aux = force;
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert aux > force : "La force d'un Romain a diminu�";
	}

	private void ajouter(String texte, Equipement eq) {
		equipement[nbEquipement] = eq;
		nbEquipement += 1;
		System.out.println(texte + " s'�quipe avec un " + eq);
	}

	public void sEquiper(Equipement eq) {

		String soldat = "Le soldat " + getNom();
		switch (nbEquipement) {
		case 2:
			System.out.println(soldat + " est d�j� bien prot�g� !");
			break;
		case 1:
			if (equipement[0] == eq) {
				System.out.println(soldat + " poss�de d�j� un " + eq);
			} else {
				ajouter(soldat, eq);
			}
			break;

		case 0:
			ajouter(soldat, eq);

			break;
		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
