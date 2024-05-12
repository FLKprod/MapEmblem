package Lieux;

public class Lieu{
	private String _name;
	private String _type;
	private String _adresse;
	private String _detailsoffres;
	private String _detailscadeaux;
	private String _description;
	private String _site;
	private int _xglobal;
	private int _yglobal;
	private int _xcentre;
	private int _ycentre;
	
	//CONSTRUCTOR
	public Lieu(String name,String type,String adresse,String offres,String cadeaux,String site){
		this._name=name;
		this._type=type;
		this._adresse=adresse;
		this._detailsoffres=offres;
		this._detailscadeaux=cadeaux;
		
		this._site=site;
		
		// initialisation des coordonnées a 0 ( pour les changer, nous utiliserons les setters des differentes coordonnées
		// meme chose pour la description du lieu
		this._xglobal=0;		//COORDONNEE X SUR LA CARTE GLOBALE
		this._yglobal=0;		//COORDONNEE Y SUR LA CARTE GLOBALE
		this._xcentre=0;		//COORDONNEE X SUR LA CARTE DU CENTRE-VILLE
		this._ycentre=0;		//COORDONNEE Y SUR LA CARTE DU CENTRE-VILLE
		this._description="";	//DESCRIPTION DU LIEU
		
	}
	
	// pour recreer un lieu presque identique qu'un autre ( seul l'adresse et les coordonnées seront forcément différentes )
	public Lieu(Lieu l) {
		this._name=l.get_name();
		this._type=l.get_type();
		this._adresse=new String("");
		this._detailsoffres=l.get_detailsoffres();
		this._detailscadeaux=l.get_detailscadeaux();
		this._site=l.get_site();
		this._xglobal=0;
		this._yglobal=0;
		this._xcentre=0;
		this._ycentre=0;
		this._description=l.get_description();
	}
		//----------------------------------- FONCTIONS GETTERS ET SETTERS -----------------------------------------//
	
		public String get_type() {
			return _type;
		}
		
		public String get_detailsoffres() {
			return _detailsoffres;
		}
		
		public String get_detailscadeaux() {
			return _detailscadeaux;
		}
		
		public String get_site() {
			return _site;
		}
		
		public String get_name() {
			return _name;
		}

		public int get_xglobal() {
			return _xglobal;
		}

		public int get_yglobal() {
			return _yglobal;
		}

		public void set_xyglobal(int _xglobal,int _yglobal) {
			this._xglobal = _xglobal;
			this._yglobal = _yglobal;
		}

		public int get_xcentre() {
			return _xcentre;
		}

		public String get_adresse() {
			return _adresse;
		}

		public void set_adresse(String _adresse) {
			this._adresse = _adresse;
		}

		public String get_description() {
			return _description;
		}

		public void set_description(String _description) {
			this._description = _description;
		}

		public void set_xycentre(int _xcentre,int _ycentre) {
			this._ycentre = _ycentre;
			this._xcentre = _xcentre;
		}

		public int get_ycentre() {
			return _ycentre;
		}

		// --------------------------------------------------------------------------------------------------- //
		
		// FONCTIONS D'AFFICHAGE DES INFORMATIONS //
		public String afficher() {
			String afficher= "---------------------------------\n\n Nom : " + this._name + "\n\n Type : " + this._type + "\n\n Adresse : " + this._adresse + "\n\n\n Details des offres EMBLEM : "+this._detailsoffres;
			if(this._detailscadeaux!=""){
				afficher+= "\n\n Details des cadeaux EMBLEM : " + this._detailscadeaux;
			}
		afficher +=" \n\n\n Description de ce lieu : " + this._description + "\n\n Site officiel : " + this._site + "\n\n---------------------------------";
		return afficher;
		}
		// fonction To string utile pour afficher le lieu et l'adresse
		public String toString() {
			return "Lieu [_name=" + _name + _adresse + "]";
		}
}