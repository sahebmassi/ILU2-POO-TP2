package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		//TODO a completer
		if (controlPrendreEtal.verifierIdentite(nomVendeur)==false) {
			System.out.println("je suis desol� "+nomVendeur+" mais il faut etre un habitant de notre village pour commercer ici");
		}else {
			System.out.println("Bonjour "+nomVendeur+" , je vais regarder si je peux vous trouver un etal.");
			if (controlPrendreEtal.resteEtals()==false) {
				System.out.println("D�sol� "+ nomVendeur+" je n'ai plus d'�tal qui ne soit pas d�ja occup�.");
			}else {
				installerVendeur(nomVendeur);
				
			}
		}
		
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
		System.out.println("C'est parfait , il me reste un �tal pour vous !");
		System.out.println("il me faut bquelque renseignements:");
		String produit = Clavier.entrerChaine("Quel produit souhaitez vous vendre");
		int nbProduit = Clavier.entrerEntier("Combien souhaitez vous vendre");
		int numeroEtal=controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numeroEtal!=-1) {
			System.out.println("Le vendeur "+nomVendeur+" s'est install� a l'etal n�"+numeroEtal);
		}
	}
}
