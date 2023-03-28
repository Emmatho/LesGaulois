package personnages;

public class Village {
	
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
			this.chef = chef;
	}
		
	public String getNom() {
			return nom;
	}
	
	public void ajouterHabitant(Gaulois gaul) {
		villageois[nbVillageois] = gaul;
		nbVillageois = nbVillageois + 1;
	}
	
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	public Chef getChef() {
		return chef;
	}
	
	public void afficherVillageois() {
		//TODO parcours de tableau après affiche de phrase contenant le chef
		System.out.println("Dans le village du chef " + getChef().getNom() + " vivent les légendaires gaulois :");
		for (int i=0 ; i<nbVillageois ; i++) {
			System.out.println("\n- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village;
		village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//Le dernier index est 29
		Chef abra = new Chef("Abraracourcix", 6, village);
		village.setChef(abra);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//Le premier habitant est d'indice 0 ; à l'indice 1, il n'y a rien
		Gaulois Obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
	}
}