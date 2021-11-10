import java.util.HashMap;
import java.util.Scanner;

public class Annuaire {

	private HashMap<String, Coordonnee> contacts = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void Ajout(String N, Coordonnee C) {
		if(contacts.containsKey(N)) {
			System.out.println("Nom de contact deja dans annuaire.");
			return;
		}
		contacts.put(N, C);
	}

	public void AffichCoord(String N) {
		if(!contacts.containsKey(N)) {
			System.out.println("Pas de contact avec le nom " + N);
			return;
		}
		System.out.println(contacts.get(N));
	}

	public void ModifCoord(String N) {
		if(!contacts.containsKey(N)) {
			System.out.println("Pas de contact avec le nom " + N);
			return;
		}
		Coordonnee C = new Coordonnee();
		System.out.print("Donner le nunero de tel : ");
		C.setTel(sc.nextLine());
		System.out.print("Donner l'adresse : ");
		C.setAdr(sc.nextLine());
		System.out.print("Donner le pays : ");
		C.setPays(sc.nextLine());
		contacts.put(N, C);
	}
	
	void Suppression(String N) {
		if(!contacts.containsKey(N)) {
			System.out.println("Pas de contact avec le nom " + N);
			return;
		}
		contacts.remove(N);
	}
	
	public void ListerNoms () {
		if(contacts.isEmpty()) {
			System.out.println("Annuaire vide");
			return;
		}
		System.out.println("La liste des noms est : ");
		for(String c:contacts.keySet()) {
			System.out.println(c);
		}
	}
	
	public void ListerAdr () {
		if(contacts.isEmpty()) {
			System.out.println("Annuaire vide");
			return;
		}
		System.out.println("La liste des adresses est : ");
		for(Coordonnee c:contacts.values()) {
			System.out.println(c.getAdr());
		}
	}
	
	public void ListerTel() {
		if(contacts.isEmpty()) {
			System.out.println("Annuaire vide");
			return;
		}
		System.out.println("La liste des telephones est : ");
		for(Coordonnee c:contacts.values()) {
			System.out.println(c.getTel());
		}
	}
	
	public void AfficheAnnuaire() {
		if(contacts.isEmpty()) {
			System.out.println("Annuaire vide");
			return;
		}
		System.out.println("La liste totale d'annuaire : ");
		for(String c:contacts.keySet()) {
			System.out.println(c + " : " + contacts.get(c));
		}
	}

	public void ListCoordonnees(String pays) {
		if(contacts.isEmpty()) {
			System.out.println("Annuaire vide");
			return;
		}
		System.out.println("La liste des contacts du pays " + pays + " : ");
		for(String c:contacts.keySet()) {
			if(contacts.get(c).getPays().equalsIgnoreCase(pays))
				System.out.println(c + " : " + contacts.get(c));
		}
	}
}
