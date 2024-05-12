import java.util.Scanner;

public class Profil{
    private String _nom;
    private String _prenom;
    private String _adresse;
    private int _age;
    private String _ville;
    private String _codepostal;
    private String _telephone;
    private String _mdp;

    public Profil(){
    	super();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Veuillez saisir votre nom");
    	_nom=sc.nextLine();
    	System.out.println("Veuillez saisir votre prenom");
    	_prenom=sc.nextLine();
    	System.out.println("Veuillez saisir votre Date de naissance");
    	//_age=Lire.i();
    	_age=12;
    	System.out.println("Veuillez saisir votre adresse");
    	_adresse=sc.nextLine();
    	System.out.println("Veuillez saisir votre ville");
    	_ville=sc.nextLine();
    	System.out.println("Veuillez saisir votre code postal");
    	_codepostal=21400;
    	//_codepostal=Lire.i();
    	System.out.println("Veuillez saisir votre Numero de telphone");
    	_telephone=sc.nextLine();
    	String mdpconf="*";
    	/*
    	while(_mdp.equals(mdpconf)==true){
    		System.out.println("Veuillez saisir un mot de passe");
    		_mdp=sc.nextLine();
    		System.out.println("Veuillez resaisir le mot de passe pour le confirmer");
    		mdpconf=sc.nextLine();
    		if(_mdp!=mdpconf){
    			System.out.println("Les mots de passe sont différents.");
    		}
    		System.out.println(_mdp);
    		System.out.println(mdpconf);
    	}
    	*/
    }
    public Profil(String nom,String prenom, int age, String adresse, String ville, int code,String telephone,String mdp){
    	super();
    	this._nom = nom;
    	this._prenom = prenom;
    	this._age = age;
    	this._adresse = adresse;
    	this._ville = ville;
    	this._codepostal = code;
    	this._telephone = telephone;
    	this.set_mdp(mdp);
    }
    
    // GETTERS //
    public String getnom(){
    	return _nom;
    }
    public String getprenom(){
    	return _prenom;
    }
    public String getadresse(){
    	return _adresse;
    }
    public int getage(){
    	return _age;
    }
    public String getville(){
    	return _ville + " " + _codepostal;
    }
    public String gettelephone(){
    	return _telephone;
    }
    public String get_mdp() {
		return _mdp;
	}
    
    // SETTERS //
    public void setnom(String nom){
	this._nom = nom;
    }
    public void setprenom(String prenom){
	this._prenom = prenom;
    }
    public void setadresse(String adresse){
	this._adresse = adresse;
    }
    public void setville(String ville,String code){
	this._ville = ville;
	this._codepostal=code;
    }
    public void setage(int age){
    	while(age>0){
    		if(age<=0){
    			System.out.println("Age invalide");
    			//age=Lire.i();
    		}
    		else{
    			this._age = age;
    		}
    	}
    }
    public void settelephone(String telephone){
    	this._telephone=telephone;
    }
    
    public void set_mdp(String _mdp) {
		this._mdp = _mdp;
	}
    // TOSTRING //
    public String toString() {
    	return "--------------------------------------------------------\n \n NOM :\t" + this._nom + "\n PRENOM :\t" + this._prenom + "\n AGE :\t" + this._age + "\n ADRESSE :\t" + 			this._adresse + " " + this._codepostal + " " + this._ville + "\n NUMERO DE TELEPHONE :\t" + this._telephone + "\n \n";
    }
    public static void main( String args[]){
    	Profil max=new Profil();
    }
}
