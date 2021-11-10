
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Annuaire ann1 = new Annuaire();
		
		ann1.Ajout("Mohammed", new Coordonnee("0689989","Martil","Maroc"));
		ann1.Ajout("Zaid", new Coordonnee("0676767","Tetouan","Maroc"));
		ann1.Ajout("Manal", new Coordonnee("04545645","Paris","France"));
		ann1.Ajout("Khalid", new Coordonnee("045454","Lyon","France"));
		
		ann1.ListCoordonnees("maroc");
	}

}
