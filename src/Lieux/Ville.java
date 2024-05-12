package Lieux;
import java.util.ArrayList;

public class Ville{
	private String _nom;
	private ArrayList<Lieu> _listelieux;
	
	//CONSTRUCTOR
	public Ville(String nom){
		this._nom=nom;
		this._listelieux = new ArrayList<Lieu>();
	}
	
	//----------------------------------- FONCTIONS GETTERS ET SETTERS -----------------------------------------//
	public String get_nom() {
		return _nom;
	}
	
	public ArrayList<Lieu> get_listelieux() {
		return _listelieux;
	}
	public void set_listelieux(ArrayList<Lieu> _listelieux) {
		this._listelieux = _listelieux;
	}
	
	// -------------------------------------- FONCTION TOSTRING --------------------------------------------------//
    public String toString() {
    	String affichage=" Liste des lieux de " + this._nom + " avec Offres EMBLEM : \n ";
   		for(int i=0;i<this._listelieux.size();i++){
   			affichage += this._listelieux.get(i) + "\n ";
   		}
   		return affichage;
   	}
    //------------------------------------------------------------------------------------------------------------//
    
    //FONCTION POUR AJOUTER UN LIEU A UNE VILLE
   	public void ajouter(Lieu l){
   		this._listelieux.add(l);
   	}
   	
    //---------------------------- FONCTION POUR RETOURNER ET AFFICHER UN LIEU D'UNE VILLE ---------------------------------------------//
	public Lieu getlieu(String name){
   		int valide=0,casetab=0;
   		for(int i=0;i<this._listelieux.size();i++){
   			if(_listelieux.get(i).get_name()==name){
   				casetab=i;	//on enregistre la case du tableau
   				valide=1;	//on previent qu'on a trouv� un �l�ment
   			}
   		}
   		if(valide==0){	//si aucun lieu a ce nom a �t� trouv�
   			System.err.println("Aucun lieu n'existe a ce nom");	//affichage d'un message
   			return null;										// on ne reourne rien
   		}
   		else{
   			return _listelieux.get(casetab);	//sinon, on retourne les informations du lieu
   		}
		
   		
   	}
   	public Lieu getlieu(int i){
   		return _listelieux.get(i);
   	}
   	public String afficherunseullieu(String name){
   		Lieu l=this.getlieu(name);
   		return l.afficher();
   	}
   
   	//----------------------------------------------------------------------------------------------------------------------------------//
   	
   	// CREATION DE L'ENSEMBLE DES LIEUX EMBLEM DE LA VILLE DE DIJON //
   	public Ville lieuxdijon(){
   		Ville dijon=new Ville("Dijon");
   		
   		// LIEUX DE RESTAURATION //
   		
		Lieu kfcquetigny=new Lieu("KFC","Restauration","2 Bd de l'Europe, 21800 Quetigny","1 sandwitch offert pour un menu XL achet�","5 tenders offerts","https://www.kfc.fr");
		kfcquetigny.set_xyglobal(1183,856);
		kfcquetigny.set_description("Chez KFC, nous portons une attention toute particuli�re au bien-�tre de nos poulets. Ceux-ci proviennent depuis des ann�es d��levages de confiance, surveill�s et labellis�s, install�s en France, en Pologne, en Allemagne et aux Pays-Bas. Tous nos fournisseurs ont fait l�objet d�une s�lection rigoureuse, men�e selon un cahier des charges tr�s strict, et sont r�guli�rement audit�s par un organisme ind�pendant. Les poussins n�y seront jamais broy�s et les poulets mutants n�y auront jamais leur place. Parce que concernant le bien-�tre de nos poulets, nous veillons au grain : ils sont �lev�s dans des b�timents de grande taille, o� ils sont libres de circuler et de grandir dans des conditions optimales. � cet effet, nos �leveurs leur fournissent une alimentation de qualit�, constitu�e de c�r�ales vari�es afin d�assurer leur croissance, un bon �quilibre alimentaire et une bonne sant�.");
		dijon.ajouter(kfcquetigny);
		
		Lieu kfcikea=new Lieu(kfcquetigny);
		kfcikea.set_xyglobal(936,534);
		kfcikea.set_adresse("12 Rue de Cracovie, 21000 Dijon");
		dijon.ajouter(kfcikea);
		
		Lieu kfcchenove=new Lieu(kfcquetigny);
		kfcchenove.set_xyglobal(493,1092);
		kfcchenove.set_adresse("263 Av. Roland Carraz, 21300 Chen�ve");
		dijon.ajouter(kfcchenove);
		
		Lieu campusKebab=new Lieu("Campus Kebab","Restauration","75 Rue de Mirande, 21000 Dijon","1� de r�duction sur le Kebab en Menu","Une Grande Box Kebab","https://campuskebab-dijon.fr");
		campusKebab.set_xyglobal(870,810);
		campusKebab.set_description("Depuis plus de 21 ans, l'�quipe de Campus Kebab vous accueille avec plaisir dans son �tablissement se situant proche des facult�s de Dijon.");
    	dijon.ajouter(campusKebab);
    	
    	Lieu colombusdarcy=new Lieu("Colombus Caf�","Restauration","4 Pl. Darcy, 21000 Dijon","1� de r�duction sur le Kebab en Menu","Une Boite de 6 mufins","https://www.columbuscafe.com/");
    	colombusdarcy.set_xycentre(478,541);
    	colombusdarcy.set_description("Chez Columbus Caf� & Co, chaque personne qui entre et qui sort de l�un de nos coffee shops en France est avant tout une personnalit�. Cette philosophie s�applique des deux c�t�s du comptoir. Derri�re notre ours au grand coeur, vous trouverez des hommes et des femmes engag�s, des baristas qui partagent leur savoir-faire autant que leur bonne humeur, des producteurs passionn�s et des entrepreneurs qui sont aussi des compagnons de route.Mais surtout, chez nous, il y a vous. Vous qui nous inspirez, qui nous apprenez � progresser, � inventer ce qui vous r�galera tous un peu plus chaque jour. Vous qui venez pour bien commencer la journ�e, pour votre pause du midi, avec vos amis, vos coll�gues, votre maman, l�amour de votre vie, pour un go�ter confortable, pour lancer votre d�but de soir�e� ou juste pour vous r�conforter avec un bon caf� fran�ais ! Chez Columbus Caf�, votre coffee shop en France mais aussi � l�international, nous sommes fiers d�accueillir et de partager tous les moments de votre vie, les simples, les grands, les m�morables, les gourmands�");
    	dijon.ajouter(colombusdarcy);
    	
    	Lieu colombusquetigny=new Lieu(colombusdarcy);
    	colombusquetigny.set_adresse("Centre commercial Grand, Av. de Bourgogne, 21800 Quetigny");
    	colombusquetigny.set_xyglobal(1235,894);
    	dijon.ajouter(colombusquetigny);
    	
    	Lieu colombusgodran=new Lieu(colombusdarcy);
    	colombusgodran.set_adresse("21 Rue des Godrans, 21000 Dijon");
    	colombusgodran.set_xycentre(643,511);
    	dijon.ajouter(colombusgodran);
    	
    	Lieu colombustoison=new Lieu(colombusdarcy);
    	colombustoison.set_adresse("21 Rue des Godrans, 21000 Dijon");
    	colombustoison.set_xyglobal(794,318);
    	dijon.ajouter(colombustoison);
    	
    	Lieu dominosdrapeau=new Lieu("Dominos Pizza","Restauration","57 Av. du Drapeau, 21000 Dijon","6� le menu pizza medium + boisson 33cl","une entr�e chaude","https://commande.dominos.fr/");
    	dominosdrapeau.set_description("D�couvrez notre gamme sur notre site web et commandez votre pizza facilement en ligne. Domino's Pizza, �lue meilleure marque de pizza en France pour la 5e ann�e cons�cutive. A Emporter Sans Contact. Pizzas � Emporter. Livraison Sans Contact. Commandez en Ligne.");
    	dominosdrapeau.set_xyglobal(718,605);
    	dijon.ajouter(dominosdrapeau);
    	
    	Lieu dominosauxonne=new Lieu(dominosdrapeau);
    	dominosauxonne.set_adresse("74 Rue d'Auxonne, 21000 Dijon");
    	dominosauxonne.set_xycentre(1028,1068);
    	dijon.ajouter(dominosauxonne);
    	
    	Lieu dominosbenine=new Lieu(dominosdrapeau);
    	dominosbenine.set_adresse("2 Bis Rue Mariotte, 21000 Dijon");
    	dominosbenine.set_xycentre(428,623);
    	dijon.ajouter(dominosbenine);
    	
    	Lieu tacos=new Lieu("New School Tacos","Restauration","21 Rue Bossuet, 21000 Dijon","Un Menu Tacos achet� = Un P'tit Kiff offert (Entr�e chaude d'une valeur de 2,50�).","Un Tacos Simple au choix offert, ou une, remise de 5� sur ta premi�re commande.","https://www.newschooltacos.fr");
    	tacos.set_xycentre(573,653);
    	tacos.set_description("Notre ville impose son style depuis toujours pour son vin, sa gastronomie et son architecture, certes. Il �tait temps de s�imposer avec la possibilit� de d�guster un d�licieux tacos � n�importe quel moment ! En sortant des galeries Lafayette, difficile de r�sister... Avant de retourner en cours, difficile de r�sister... Plus la peine de lutter : le restaurant New School est juste � c�t� de la rue pi�tonne. Et tu peux m�me te mettre en terrasse !Nous disposons de 80 places assises. On te donne RDV rue Bossuet, � Dijon !");
    	dijon.ajouter(tacos);
    	
    	Lieu pointB=new Lieu("Point B","Restauration","10 Rue Bossuet, 21000 Dijon","Un Menu Double achet� = Un Cheese B offert.","Un B Big offert.","https://pointb-officiel.com/");
    	pointB.set_xycentre(571,611);
    	pointB.set_description("Inspir� des plus grandes cha�nes de restauration rapide, Point B propose une large offre de recettes. Recommand� par un grand nombre de c�l�brit�s et d�influenceurs, le concept s�est rapidement d�velopp� en tant que franchise. Des ouvertures partout en France sont � pr�voir pour 2021 !");
    	dijon.ajouter(pointB);
    	
    	Lieu bagle=new Lieu("BAGELSTEIN DIJON","Restauration","10 Rue Bossuet, 21000 Dijon","Un Menu Double achet� = Un Cheese B offert.","Une Boisson Chaude offerte.","https://www.bagelstein.com/magasin/122");
    	bagle.set_xycentre(633,550);
    	bagle.set_description("Bagelstein, c�est pas qu�un trou dans un pain rond.Bagelstein, c�est aussi deux supers piliers sur lesquels on mise tout :Pour commencer, l�identit� non-consensuelle, impertinente et border line que vous connaissez tous. On ne se contente pas de remplir b�tement le ventre de nos (chers) clients, on ambitionne de cr�er une micro-s�quelle dans leur (ch�re) cervelle, afin de les �mouvoir, de les faire marrer. Bref, qu�il se passe un truc en eux, quoi.Tout �a n�aurait aucun sens, si ce qu�on leur servait n��tait pas sublimement bon.Par cons�quent, on fabrique tout nous-m�me. Hormis les donuts (surgel�s et gras, mais tellement bons�), tout ce qui est vendu dans nos restaurants est donc fait par nos boulangers-p�tissiers. Et parce qu�en plus d��tre pr�tentieux, on est extr�mement parano : on pense que les cong�los ab�ment nos produits, leurs font du mal�. donc ce ne sont pas nos potes et on ne surg�le rien.");
    	dijon.ajouter(bagle);
    	
    	Lieu subway=new Lieu("Subway","Restauration","70 Rue de la Libert�, 21000 Dijon","Sub 15 (hors Sub sp�ciaux) + Boisson 50cl + Cookie = 7�.","9 Croustis ou 9 R�stis offerts.","https://restaurants.subway.com/fr/france/dijon");
    	subway.set_xycentre(608,621);
    	subway.set_description("Vos restaurants Subway� vous proposent de personnaliser vos sandwiches, salades et wraps. Des millions de combinaisons possibles avec un large choix d'ingr�dients : du pain et des cookies cuits sur place chaque jour, des l�gumes fra�chement coup�s tous les matins, des garnitures vari�es qui s'adaptent � tous les go�ts... pour cr�er un repas au plus pr�s de vos envies du moment. A vous de cr�er le v�tre ! Chez Subway�, C�est vous le Chef !");
    	dijon.ajouter(subway);
    	
    	Lieu subway2=new Lieu(subway);
    	subway2.set_adresse("17 Av. Mar�chal Foch, 21000 Dijon");
    	subway2.set_xycentre(367,518);
    	dijon.ajouter(subway2);
    	
    	Lieu subway3=new Lieu(subway);
    	subway3.set_adresse("13 Rue Paul Langevin, 21800 Chen�ve");
    	subway3.set_xyglobal(486,1142);
    	dijon.ajouter(subway3);
    	
    	Lieu aubureau=new Lieu("Au Bureau Dijon","Restauration","2 Pl. de la R�publique, 21000 Dijon","� 12,95� = Burger Original / Royal Potatoes Burger / Fish & Chips / Brochettes Poulet (ou autre Burger pour 1� de plus) + Accompagnement + Bi�re Bud 25cl ou Soft (hors Samedi).\n\n- � 1,50� sur toutes les Pintes Pression et les Cocktails (hors Vendredi & Samedi).","","https://www.bagelstein.com/magasin/122");
    	aubureau.set_xycentre(777,385);
    	aubureau.set_description("Inspir�e des pubs londoniens, l�enseigne Au Bureau est n�e en 1989 en France. A la fois pub, brasserie et restaurant, les �tablissements proposent des animations et des offres adapt�es � tous les moments de la journ�e, afin de transporter les consommateurs dans une ambiance authentique et chaleureuse.");
    	dijon.ajouter(aubureau);
    	
    	Lieu hollys=new Lieu("Holly's Diner","Restauration","1 Rue du Cap Vert, 21800 Quetigny","-20% sur toute la carte (hors Bonnes affaires du Midi, Menu Good Deal et Big Mount Lee).","Un Sundae offert.","https://dijon.hollysdiner.fr/");
    	hollys.set_xyglobal(1101,864);
    	hollys.set_description("Holly's Diner restaurant : burger, frites maison, steak house, coffee shop, bi�re, glace, sundae. Recettes traditionnelles am�ricaines des ann�es 50");
    	dijon.ajouter(hollys);
    	
    	Lieu castor=new Lieu("Chez Les Castors","Restauration","67 Rue Jeannin, 21000 Dijon","Poutine (hors suppl�ments) + Boisson Soft = 7�.","","https://www.facebook.com/chezlescastors/");
    	castor.set_xycentre(915,635);
    	castor.set_description("Restaurant de sp�cialit�s Canadiennes, Poutines, Burgers et autres produits nord-Am�ricains");
    	dijon.ajouter(castor);
    	
    	Lieu miecaline=new Lieu("La Mie Caline","Restauration","4 Rue Bossuet, 21000 Dijon","Une Formule Chic ou Extra achet�e = Un Dessert au choix offert.","","https://www.lamiecaline.com/boutiques/dijon/");
    	miecaline.set_xycentre(571,611);
    	miecaline.set_description("La Mie C�line est une enseigne sp�cialis�e dans la fabrication et la distribution de produits alimentaires � emporter. Son coeur de m�tier est la boulangerie, avec en compl�ment de la restauration rapide. On y trouve ainsi diff�rentes sortes de pains, des viennoiseries, des p�tisseries, des sandwiches, des salades et des petits plats pr�par�s.");
    	dijon.ajouter(miecaline);
    	
    	Lieu benja=new Lieu("Benja Burger","Restauration","15 Rue Jean Jacques Rousseau, 21000 Dijon","Un Menu Burger achet� = 5 Nuggets ou 8 Onion Rings offerts.","Une Box 12 Finger Foods offerte.","http://benjaburger.tastycloud.menu/");
    	benja.set_xycentre(845,433);
    	benja.set_description("Le restaurant vous propose des burgers � composer parce que c�est vous le chef ici ! Et si vous n�avez pas les comp�tences d�un cuisinier ou que vous avez la flemme, ne vous en faites pas, des propositions de burgers d�j� pr�par�s avec des produits de qualit� vous sont propos�s pour la somme imbattable de 6 euros.");
    	dijon.ajouter(benja);
    	
    	Lieu frozencup=new Lieu("Frozen Cup","Restauration","10 Rue Jean Jacques Rousseau, 21000 Dijon","Une Boisson Chaude achet�e (hors Expresso et Caf� allong�) = Une P�tisserie au choix offerte (hors Fondant & Cheesecake).","Une Glace Signature offerte.","https://frozencup.fr/");
    	frozencup.set_xycentre(571,611);
    	frozencup.set_description("Frozen Cup est un glacier moderne au c�ur de Dijon. Nous vous proposons des cr�mes glac�es infus�es aux c�r�ales de votre enfance, agr�ment�es de toppings et coulis plus gourmands les uns que les autres. Venez profiter de nos glaces � l'am�ricaine, mais aussi de nos p�tisseries maison et de nos boissons chaudes et froides.");
    	dijon.ajouter(frozencup);
    	
    	Lieu pancakeslover=new Lieu("Pancakes Lovers","Restauration","12 Rue Monge, 21000 Dijon","Pancake Sucr� + Sirop + Toppings � volont� = 7,50�.","","https://facebook.com/pages/category/Coffee-Shop/PancakesLoversDijon");
    	pancakeslover.set_xycentre(538,700);
    	pancakeslover.set_description("Bar � pancakes. Sucr�, sal�, sain, gourmand, pour les petits et pour les grands!");
    	dijon.ajouter(pancakeslover);
    	
    	Lieu myflaxes=new Lieu("My Flaxes","Restauration","75 Rue Vannerie, 21000 Dijon","Une Formule � 7,50� achet�e (Gaufre + Accompagnement + Boisson hors Canette US) = une Formule offerte (hors week-end).","","https://www.facebook.com/My-Flakes-108465263988678/");
    	myflaxes.set_xycentre(846,608);
    	myflaxes.set_description("Lendemain de soir�e difficile ou grosse dalle pour le go�ter ? Viens d�guster de d�licieux et gigantesques bols de c�r�ales, ou bien des gaufres, des twisters avec les toppings, la garniture et le nappage de ton choix. Des brunchs sont �galement disponibles, id�al quand tu te r�veilles � midi ! ");
    	dijon.ajouter(myflaxes);
    	
    	Lieu burrito=new Lieu("Le Burritos","Restauration","114 Rue de Mirande, 21000 Dijon","Sandwich seul � 7�.Sandwich + Canette 33cl = 8�.","","https://le-burritos.business.site/");
    	burrito.set_xyglobal(895,815);
    	burrito.set_description("C�est une petite affaire familiale ou r�gne une ambiance tr�s d�tendue. Les produits sont tr�s frais avec un excellent rapport qualit� prix. Le patron pr�pare lui m�me les viandes mijot�es et les sauces. Son guacamole fait maison (� une demi-heure de pr�paration ! �) est excellent. Vous choisissez vous m�me parmi les ingr�dients propos�s des viandes, l�gumes et autres accompagnements (les amateurs de piment auront de quoi se r�galer) que vous souhaitez mettre dans votre tacos, burritos, enchiladas�");
    	dijon.ajouter(burrito);
    	
    	// -------------------------------- //
    	
    	// BARS //
    	
    	Lieu bayron=new Lieu("Bayron Bay","Bars","106 Rue Berbisey, 21000 Dijon","-1� sur tous les Cocktails jusqu'� 23h.","","https://fr.restaurantguru.com/Byron-Bay-Dijon");
    	bayron.set_xycentre(470,817);
    	bayron.set_description("Ce pub australien au d�cor convivial bois� propose une liste de cocktails et des retransmissions sportives.");
    	dijon.ajouter(bayron);
    	
    	Lieu barberousse=new Lieu("Barberousse","Bars","6 Rue Vannerie, 21000 Dijon","Bouteilles de Planteur � 13� au lieu de 16�.\nBouteille de Shooter � 23� au lieu de 26�.\nMix (Bouteille de Planteur + Bouteille de Shooter) � 29� au lieu de 37�. \nNon cumulable avec l'Happy Hour. ","Une demi-bouteille de Planteur offerte.","https://www.facebook.com/barberousseDijon//");
    	barberousse.set_xycentre(839,482);
    	barberousse.set_description("D�couvrez le Barberousse, cale pirate remplie de nombreux rhums et... de f�te ! Soyez pr�ts � vous faire chavirer � chaque soir�e d'embarquement !");
    	dijon.ajouter(barberousse);
    	
    	Lieu celier=new Lieu("Le Celier","Bars","1 Rue Auguste Perdrix, 21000 Dijon","-1� sur tous les Saucissons.\n4,50� la Pinte de Canoterie Blonde.\n6� la Pinte de Bi�re du moment","","http://lecellier-dijon.fr/");
    	celier.set_xycentre(436,433);
    	celier.set_description("Le Cellier vous accueillera dans de magnifiques caves vo�t�es et une ambiance convivial.Venez y d�couvrir le savoir-faire r�gional avec un assortiment de bi�res et produits locaux vous permettant de d�couvrir toute la richesse de ce terroir");
    	dijon.ajouter(celier);
    	
    	Lieu beverly=new Lieu("Le Beverly","Bars","11 Av. du Drapeau, 21000 Dijon","L'heure de Billard � 9� (hors Samedi).\n Le Cocktail du Jour � 6� (hors Soir�es �tudiantes).","","http://www.pub-beverly.com/");
    	beverly.set_xycentre(777,105);
    	beverly.set_description("Pub/Discoth�que avec grande salle de billards anglais/am�ricains et discoth�que au cadre lounge raffin�, avec terrasse.");
    	dijon.ajouter(beverly);
    	
    	Lieu salsa=new Lieu("la salsapelpa","Bars","1 Rue Marceau, 21000 Dijon","-50% sur les Bouteilles de Captain Morgan, Smirnoff ou Champagne Selection, hors Samedi.","","https://www.lesmeilleursrestos.fr/restaurant-dijon/98-restaurant-salsapelpa-dijon.html");
    	salsa.set_xycentre(817,343);
    	salsa.set_description("A Dijon Le restaurant Salsapelpa est un restaurant au couleurs latinos est une r�f�rence. D�couvrez d'autres restaurants qui proposent du fait maison.");
    	dijon.ajouter(salsa);
    	
    	//---------------------------------------------------//
    	
    	// LOISIRS ET SPORTS //
    	
    	Lieu cinemaolympia=new Lieu("Cin�ma Olympia","Loisirs et Sports","16 Av. Mar�chal Foch, 21000 Dijon","5� la place de cin�ma, pour toutes les s�ances du Lundi au Vendredi (hors suppl�ment 3D).","","https://www.cines-dijon.com/olympia");
    	cinemaolympia.set_xycentre(309,535);
    	cinemaolympia.set_description("Pour aller voir les derni�res sorties de la semaine, le film du moment � ne pas rater ou m�me un op�ra retransmis en direct depuis le Metropolitan Opera de New-York, le cin�ma Darcy est id�alement situ�, en plein centre-ville. Complexe ultra-moderne de 10 salles en gradin, celles-ci peuvent accueillir jusqu'� 408 personnes. On prend ses places aux bornes interactives ou � l'un des guichets et on attend sa s�ance � l'espace-bar qui propose : boissons, friandises et bien s�r pop-corn ! Au programme : s�ances 3D, avant-premi�res... Bon film !");
    	dijon.ajouter(cinemaolympia);
    	
    	Lieu cinemadarcy=new Lieu("Cin�ma Darcy","Loisirs et Sports","28 Rue de Cracovie, 21850 Saint-Apollinaire","5� la place de cin�ma, pour toutes les s�ances du Lundi au Vendredi (hors suppl�ment 3D).","","https://www.cines-dijon.com/darcy");
    	cinemadarcy.set_xycentre(456,528);
    	cinemadarcy.set_description("Pour aller voir les derni�res sorties de la semaine, le film du moment � ne pas rater ou m�me un op�ra retransmis en direct depuis le Metropolitan Opera de New-York, le cin�ma Olympia est id�alement situ�, en plein centre-ville. Complexe ultra-moderne de 10 salles en gradin, celles-ci peuvent accueillir jusqu'� 408 personnes. On prend ses places aux bornes interactives ou � l'un des guichets et on attend sa s�ance � l'espace-bar qui propose : boissons, friandises et bien s�r pop-corn ! Au programme : s�ances 3D, avant-premi�res... Bon film !");
    	dijon.ajouter(cinemadarcy);
    	
    	Lieu lasergame=new Lieu("Laser Game Evolution","Loisirs et Sports","8 Pl. Darcy, 21000 Dijon","9� les 2 parties de 20 minutes au lieu de 16�.\n La Planche de Charcuterie 4 personnes + 1,5L de Bi�re au choix = 20�.","Une partie de Laser Game offerte (hors Samedi).","https://dijon.lasergame-evolution.fr/");
    	lasergame.set_xyglobal(983,516);
    	lasergame.set_description("Le seul Laser Game sur Dijon et le plus grand centre Laser Game de Bourgogne.\nVenez d�fier vos amis dans une ambiance totalement d�routante !\n2 immenses labyrinthes de 300m2  sur 3 niveaux.\nPour les grands groupes, les 2 salles peuvent communiquer entre elles pour une surface de jeu totale de pr�s de 600 m2 !! Eclairage black light, musique endiabl�e, fum�e et  d�co fluo, sans doute le loisir le plus futuriste de l�agglom�ration !\n�quip�s de votre pistolet 100% LASER, votre pr�cision et votre rapidit� seront vos atouts pour surpasser vos adversaires !  \nUtiliser les planches pour vous cacher, mais m�fiez-vous des meurtri�res et des miroirs ! Jamais un loisir n�a permis autant d�interactivit� entre les participants : Tout le monde joue en m�me temps ! \nNous fonctionnons exclusivement sur r�servation et nous ne m�langeons pas les groupes ! Ainsi il faut un MINIMUM de 8 JOUEURS pour r�server !");
    	dijon.ajouter(lasergame);
    	
    	Lieu kartmania=new Lieu("Kart Mania","Loisirs et Sports","12 Rue Antoine Becquerel, 21300 Chen�ve","Indoor : 8,50� la session de 12 min au lieu de 17�. \nOutdoor : 15� la partie de 10 min au lieu de 20�. ","","http://kartmania.site-solocal.com/");
    	kartmania.set_xyglobal(535,1175);
    	kartmania.set_description("Ce complexe de karting invite les amateurs de sensations fortes, petits et grands, � passer des moments inoubliables sur notre piste ext�rieure de 1090 mitres. Et apr�s l'effort, le r�confort. Des d�licieuses boissons vous attendent dans le bar.");
    	dijon.ajouter(kartmania);
    	
    	Lieu arcanium=new Lieu("Arcanium","Loisirs et Sports","52 Av. de Stalingrad, 21000 Dijon","80� la partie quel que soit le nombre de joueurs (au lieu de jusqu'� 115�).\nR�servations uniquement par email ou t�l�phone (pas via leur site).","","http://www.arcanium-dijon.fr/");
    	arcanium.set_xyglobal(869,400);
    	arcanium.set_description("Bienvenue � ARCANIUM, le premier centre d'escape game et de quiz de Dijon\n\nVenez vivre 4 exp�riences incroyables parmi nos salles d�escape game.\n\nVous vous retrouvez dans un espace clos. Votre objectif est d�en sortir en moins d�une heure en r�solvant des �nigmes et en d�jouant des pi�ges.\n\nCommunication, r�flexion, esprit d��quipe et une bonne dose de logique seront vos meilleurs alli�s durant votre exp�rience.\n\nCurieux, motiv�s, aventuriers ? Venez jouer en famille, entre coll�gues ou avec vos amis.\n\nMarre de la collaboration ? Affrontez-vous dans notre ar�ne de quiz et devenez le boss de Rival Quiz.");
    	dijon.ajouter(arcanium);
    	
    	Lieu trampoline=new Lieu("Trampoline Experience","Loisirs et Sports","4 Rue des Fromentaux, 21121 Ahuy","Forfait 2h + Chaussettes + Boisson 25cl = 12� (au lieu de 22�).","","http://www.trampoline-experience-dijon.fr/");
    	trampoline.set_xyglobal(677,325);
    	trampoline.set_description("Venez d�couvrir nos diff�rentes exp�riences : sautez, smashez , toutes les occasions  sont bonnes pour vous amuser : anniversaires, groupe d�amis, comit� d�entreprises, enterrement de vie de jeunes filles ou gar�ons. On vous attend tr�s vite.\n\nR�server votre session en ligne sur notre site c�est la garantie de ne pas attendre et de b�n�ficier d�une r�duction de 2 euros sur chaque session d�une heure.");
    	dijon.ajouter(trampoline);

    	Lieu klube=new Lieu("Le Klube","Loisirs et Sports","4 Rue des Fromentaux, 21121 Ahuy","Location de Terrain pour une heure :\n Badminton : 10,50� en heure creuse,\n 12,50� en heure pleine.\n Futsal : 5� par personne. \n Bubble Foot : 10� par personne.","une demi-heure de badmington","https://www.leklube.com/");
    	klube.set_xyglobal(677,325);
    	klube.set_description("Le Klube � Dijon, salle de sport et centre de bien-�tre unique en Bourgogne, vous propose sur un m�me lieu de 6 500 m� une multitude d�activit�s pour vous d�penser ou vous d�tendre : fitness (cours collectifs Les Mills, aquagym, aquabike), cardio-training, plateau de musculation, baln�oth�rapie (saunas, hammam, jacuzzi g�ant, douches sensorielle), Spa institut, piscine, squash, footsalle, badminton, s�minaires, �v�nements priv�s et restaurant.");
    	dijon.ajouter(klube);
    	
    	Lieu rivalquiz=new Lieu("Rival Quiz","Loisirs et Sports","Palais des Sports Jean Michel Geoffroy, 17 Rue L�on Mauris, 21000 Dijon","Location de Terrain pour une heure :\n Badminton : 10,50� en heure creuse,\n 12,50� en heure pleine.\n Futsal : 5� par personne. \n Bubble Foot : 10� par personne.","","http://hand.jdadijon.com/");
    	rivalquiz.set_xyglobal(869,400);
    	rivalquiz.set_description("Rival Quiz est la toute premi�re salle de quiz immersive de Dijon. Dans une ar�ne retro-futuriste, plongez dans la bataille et affrontez vos adversaires dans un quiz totalement �pique !");
    	dijon.ajouter(rivalquiz);
    	
    	Lieu jda=new Lieu("JDA Dijon Handball","Loisirs et Sports","52 Av. de Stalingrad, 21000 Dijon","La Partie de 4 � 6 joueurs + Un Soft par personne = 15� par personne.\nLa Partie de 7 � 12 joueurs + Un Soft par personne = 13� par personne.\nOffres valables uniquement pour les porteurs de Carte Emblem (et non pour tout le groupe).","","https://dijon.rivalquiz.fr/");
    	jda.set_xyglobal(822,620);
    	jda.set_description("Les handballeuses dijonnaises sont de retour pour une nouvelle saison dans l��lite du handball f�minin fran�ais !\n\nPour leur trois�me saison sous leurs nouvelles couleurs de la JDA, elles auront au c�ur de faire vibrer les tribunes du Palais des Sports Jean Michel Geoffroy de Dijon !\n\nCe nouvel exercice en Ligue Butagaz Energie s�annonce plus exaltant que jamais !\n\nMais l�histoire ne s��crira pas sans vous !!!\n\nAlors, n�h�sitez plus, rejoignez l��quipe et venez d�couvrir le handball f�minin ! Entre amis ou en famille, vous vivrez un spectacle in�dit et captivant !\n\n\nVenez nombreux les encourager� � Elles le valent bien � !");
    	dijon.ajouter(jda);
    	
    	
    	//---------------------------------//
    	
    	// Service Sports et Sant� //
    	
    	Lieu epiceriegare=new Lieu("Epicerie de la Gare - La LOCO","Services, Sport et Sant�","5 Av. Mar�chal Foch, 21000 Dijon","-10% sur tout le magasin, pour un minimum de 10� d'achat. \n\nHors tabac, recharges t�l�phoniques, livraison.","","https://www.epiceriedelagarelaloco.fr/");
    	epiceriegare.set_xycentre(337,557);
    	epiceriegare.set_description("L'�picerie le Loco est ouverte tous les jours, 365 jours par an de 9h � minuit. En plus d'�tre une adresse qui d�panne, rappelons qu'elle propose des produits de qualit� et r�gionaux : pain d��pices, moutarde et consort figurent sur les rayons et peuvent m�me vous �tre livr�s � domicile via l'application Uber Eats. On retrouve ici tout le plaisir du commerce de proximit� ainsi qu'un accueil chaleureux. Super pratique puisqu'� deux pas de la gare et devant une station de tramway.");
    	dijon.ajouter(epiceriegare);
    	
    	Lieu econduite=new Lieu("E-conduite21","Services, Sport et Sant�","19 Bd de l'Universit�, 21000 Dijon","3h de conduite offertes pour tout forfait Permis B (avec ou sans Code). Acc�s � la formation Code en ligne gratuite (au lieu de 30�).","","http://e-conduite21.fr/");
    	econduite.set_xycentre(1167,1027);
    	econduite.set_description("Notre �quipe d'enseignants dynamiques, dipl�m�s et exp�riment�s s'investit pour la r�ussite de votre apprentissage dans les meilleurs d�lais � votre examen du permis de conduire auto ou moto.Nous vous offrons ainsi une capacit� � vous faire passer l'examen rapidement.\n\nNous vous proposons des tests journaliers au code de la route dans nos locaux avec des boitiers �lectroniques, et pour encore mieux vous servir un enseignant dipl�m� vous aidera � vous pr�parer � l'examen (tous les mardis et jeudis de 14h � 17h).\n\nPour vous renforcer chez vous, nous vous proposerons �galement une formation sur internet au code de la route tr�s compl�te avec des cours multim�dias, des tests et des examens blancs dans tous nos forfaits.\n\nNos le�ons de conduite auto ou moto sont possibles du lundi de 8h00 � 12h00 et de 14h00 jusqu'� 19h00 jusqu'au samedi midi.");
    	dijon.ajouter(econduite);
    	
    	Lieu gosport=new Lieu("Magasin GO Sport","Services, Sport et Sant�","Centre Commercial De La Toison D'Or, 21000 Dijon","-15% sur tout le magasin, hors promotions, cycle, mat�riel techno ou de musculation.\n\nValable dans tous les Go Sport de Dijon, Grenoble et Lyon.","","https://www.go-sport.com");
    	gosport.set_xyglobal(785,311);
    	gosport.set_description("GO Sport : Magasins de sport. V�los, skis, articles et mat�riel de sport pour la randonn�e, la musculation, le fitness, le running, le football et toutes les discipline. Cha�ne multimarque de magasins sp�cialis�s dans les v�tements, les chaussures et les articles de sport.");
    	dijon.ajouter(gosport);
    	
    	Lieu magicform=new Lieu("Magic Form","Services, Sport et Sant�","10-12 Bd Carnot, 21000 Dijon","Frais d'inscription (49,90�) + Carte de membre (20�) + S�ance d'essai (5�) offerts. \n\nParrainage Emblem : si vous �tes client, une s�ance/mois avec un ami offerte. S'il s'inscrit pour 12 mois, un mois d'abonnement (29,90�) offert � chacun. ","","https://www.magic-form.fr/clubs/dijon");
    	magicform.set_xycentre(866,827);
    	magicform.set_description("Bienvenue chez vous !\n Chez Magic Form, nous avons notre propre d�finition du sport : une exp�rience vraie, �panouissante et conviviale, qui fait autant de bien au physique qu'au moral.\n\nLe principe de nos clubs ? Des lieux chaleureux et vivants qui m�ritent vraiment le nom de 'clubs' : les petits nouveaux deviennent vite des habitu�s, chaque salle offre des cours effectu�s par des coachs dipl�m�s en chair et en os, des animations, du partage, de l'�nergie, de l'humour, et les coachs vous connaissent r�ellement, sportivement et amicalement.");
    	dijon.ajouter(magicform);
    	
    	Lieu americandreamshop=new Lieu("AMERICAN DREAM SHOP","Services, Sport et Sant�","30 Rue de la Redoute, 21850 Saint-Apollinaire","5� de r�duction sur les Casquettes. \nUne Barre chocolat�e achet�e = une Offerte (jusqu�� 3 personnes).","","https://www.americandreamshop.fr/");
    	americandreamshop.set_xyglobal(1027,505);
    	americandreamshop.set_description("N�e d'une d�couverte datant des ann�es 80, l'American Dream Shop est l'aboutissement, d'un r�ve. Apr�s 5 ans de r�flexion, de recherches et de d�couvertes, il nous a sembl� �vident de partager cette culture et cette passion avec vous !");
    	dijon.ajouter(americandreamshop);
    	
    	Lieu seldabl=new Lieu("Selda BL","Services, Sport et Sant�","28 Rue d'Auxonne, 21000 Dijon","Homme : Shampoing + Coupe � 17,50� (au lieu de 21�) OU un Soin de la Barbe offert.\n\nFemme : Shampoing + Coupe + Brushing = 25� (au lieu de 35�) OU un Soin des Cheveux offert.","","http://fr-fr.facebook.com/SeldaBLHairStyling");
    	seldabl.set_xycentre(853,948);
    	seldabl.set_description("Bienvenue dans notre salon de coiffure. Nous vous invitons pour une �coute, des conseils, des services personnalis�s, en un mot de la coiffure professionnelle � sur-mesure �. Nous sommes sp�cialistes en coupes homme et femme, en couleurs , effets ...");
    	dijon.ajouter(seldabl);
    	
    	Lieu auratriomphe=new Lieu("L'Aura Triomphe","Services, Sport et Sant�","2 Rue de la Serpe, 21800 Quetigny","Massage �Focus Time� de 30 min + Une Viennoiserie = 30�.","","https://lauratriomphe.kalendes.com/");
    	auratriomphe.set_xyglobal(1189,895);
    	auratriomphe.set_description("Massages  Bien-�tre et Sportif personnalis�s.\nSoins corporels sur mesure aux sels min�raux  by Jericho cosmetics. \nEpilations sans colophane");
    	dijon.ajouter(auratriomphe);
    	
     	return dijon;
	}
   	//---------------------------------------------------------------------------------//
}



