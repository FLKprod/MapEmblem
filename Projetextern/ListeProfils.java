import java.util.*;


public class ListeProfils {
	private Hashtable<String, Profil> Listeprofils;
	
	public void Classe(){
		Listeprofils = new Hashtable<String, Profil>();
	}
	
	private String createkey(String nom, String prenom){
		String tmp;
		tmp = nom.charAt(0)+ prenom;
		return tmp.toUpperCase( );
	}
	public void ajouteUnProfil() {
		Profil nouveau = new Profil();
		String key = createkey(nouveau.getnom(),nouveau.getprenom());
		if (Listeprofils.get(key)== null){
			Listeprofils.put(key, nouveau);
		}
		else System.out.println( "Ce Profil existe deja. Connectez vous !");
	}
	public void ajouteUnProfil(Profil p){
		String key = createkey(p.getnom(),p.getprenom());
		if (Listeprofils.get(key)== null) Listeprofils.put(key, p);
		else System.out.println( "Ce Profil existe deja. Connectez vous !");
	}
	
	public void rechercheUnProfil (String nom, String prenom){
		String key = createkey(nom,prenom);
		Profil p = (Profil) Listeprofils.get(key) ;
		if (p != null)
		System.out.println(p);
		else System.out.println("Le compte de " + nom + " " + prenom + " est inconnu ! ");
	}
	
	public void supprimeUnProfil(String nom, String prenom){
		String key = createkey(nom,prenom);
		Profil p = (Profil) Listeprofils.get(key) ;
		if (p != null) {Listeprofils.remove(key) ;
		System.out.println("Le compte de " + nom + " " + prenom + " a été supprimé ! ");
		}
	}
	
	public void showProfils(){
		if(Listeprofils.size() != 0){
			Enumeration<String> enumProfils = Listeprofils.keys();
			while ( enumProfils.hasMoreElements()){
				//enumProfils.nextElement();
				//Profil p = (Profil) ListeProfils.get(key);
				System.out.println(enumProfils.nextElement());
			}
		}
		else System.out.println("II n’y a pas de profil dans cette liste");
	}
}