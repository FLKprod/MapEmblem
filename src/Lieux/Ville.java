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
   				valide=1;	//on previent qu'on a trouvé un élément
   			}
   		}
   		if(valide==0){	//si aucun lieu a ce nom a été trouvé
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
   		
		Lieu kfcquetigny=new Lieu("KFC","Restauration","2 Bd de l'Europe, 21800 Quetigny","1 sandwitch offert pour un menu XL acheté","5 tenders offerts","https://www.kfc.fr");
		kfcquetigny.set_xyglobal(1183,856);
		kfcquetigny.set_description("Chez KFC, nous portons une attention toute particulière au bien-être de nos poulets. Ceux-ci proviennent depuis des années d’élevages de confiance, surveillés et labellisés, installés en France, en Pologne, en Allemagne et aux Pays-Bas. Tous nos fournisseurs ont fait l’objet d’une sélection rigoureuse, menée selon un cahier des charges très strict, et sont régulièrement audités par un organisme indépendant. Les poussins n’y seront jamais broyés et les poulets mutants n’y auront jamais leur place. Parce que concernant le bien-être de nos poulets, nous veillons au grain : ils sont élevés dans des bâtiments de grande taille, où ils sont libres de circuler et de grandir dans des conditions optimales. À cet effet, nos éleveurs leur fournissent une alimentation de qualité, constituée de céréales variées afin d’assurer leur croissance, un bon équilibre alimentaire et une bonne santé.");
		dijon.ajouter(kfcquetigny);
		
		Lieu kfcikea=new Lieu(kfcquetigny);
		kfcikea.set_xyglobal(936,534);
		kfcikea.set_adresse("12 Rue de Cracovie, 21000 Dijon");
		dijon.ajouter(kfcikea);
		
		Lieu kfcchenove=new Lieu(kfcquetigny);
		kfcchenove.set_xyglobal(493,1092);
		kfcchenove.set_adresse("263 Av. Roland Carraz, 21300 Chenôve");
		dijon.ajouter(kfcchenove);
		
		Lieu campusKebab=new Lieu("Campus Kebab","Restauration","75 Rue de Mirande, 21000 Dijon","1€ de réduction sur le Kebab en Menu","Une Grande Box Kebab","https://campuskebab-dijon.fr");
		campusKebab.set_xyglobal(870,810);
		campusKebab.set_description("Depuis plus de 21 ans, l'équipe de Campus Kebab vous accueille avec plaisir dans son établissement se situant proche des facultés de Dijon.");
    	dijon.ajouter(campusKebab);
    	
    	Lieu colombusdarcy=new Lieu("Colombus Café","Restauration","4 Pl. Darcy, 21000 Dijon","1€ de réduction sur le Kebab en Menu","Une Boite de 6 mufins","https://www.columbuscafe.com/");
    	colombusdarcy.set_xycentre(478,541);
    	colombusdarcy.set_description("Chez Columbus Café & Co, chaque personne qui entre et qui sort de l’un de nos coffee shops en France est avant tout une personnalité. Cette philosophie s’applique des deux côtés du comptoir. Derrière notre ours au grand coeur, vous trouverez des hommes et des femmes engagés, des baristas qui partagent leur savoir-faire autant que leur bonne humeur, des producteurs passionnés et des entrepreneurs qui sont aussi des compagnons de route.Mais surtout, chez nous, il y a vous. Vous qui nous inspirez, qui nous apprenez à progresser, à inventer ce qui vous régalera tous un peu plus chaque jour. Vous qui venez pour bien commencer la journée, pour votre pause du midi, avec vos amis, vos collègues, votre maman, l’amour de votre vie, pour un goûter confortable, pour lancer votre début de soirée… ou juste pour vous réconforter avec un bon café français ! Chez Columbus Café, votre coffee shop en France mais aussi à l’international, nous sommes fiers d’accueillir et de partager tous les moments de votre vie, les simples, les grands, les mémorables, les gourmands…");
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
    	
    	Lieu dominosdrapeau=new Lieu("Dominos Pizza","Restauration","57 Av. du Drapeau, 21000 Dijon","6€ le menu pizza medium + boisson 33cl","une entrée chaude","https://commande.dominos.fr/");
    	dominosdrapeau.set_description("Découvrez notre gamme sur notre site web et commandez votre pizza facilement en ligne. Domino's Pizza, élue meilleure marque de pizza en France pour la 5e année consécutive. A Emporter Sans Contact. Pizzas à Emporter. Livraison Sans Contact. Commandez en Ligne.");
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
    	
    	Lieu tacos=new Lieu("New School Tacos","Restauration","21 Rue Bossuet, 21000 Dijon","Un Menu Tacos acheté = Un P'tit Kiff offert (Entrée chaude d'une valeur de 2,50€).","Un Tacos Simple au choix offert, ou une, remise de 5€ sur ta première commande.","https://www.newschooltacos.fr");
    	tacos.set_xycentre(573,653);
    	tacos.set_description("Notre ville impose son style depuis toujours pour son vin, sa gastronomie et son architecture, certes. Il était temps de s’imposer avec la possibilité de déguster un délicieux tacos à n’importe quel moment ! En sortant des galeries Lafayette, difficile de résister... Avant de retourner en cours, difficile de résister... Plus la peine de lutter : le restaurant New School est juste à côté de la rue piétonne. Et tu peux même te mettre en terrasse !Nous disposons de 80 places assises. On te donne RDV rue Bossuet, à Dijon !");
    	dijon.ajouter(tacos);
    	
    	Lieu pointB=new Lieu("Point B","Restauration","10 Rue Bossuet, 21000 Dijon","Un Menu Double acheté = Un Cheese B offert.","Un B Big offert.","https://pointb-officiel.com/");
    	pointB.set_xycentre(571,611);
    	pointB.set_description("Inspiré des plus grandes chaînes de restauration rapide, Point B propose une large offre de recettes. Recommandé par un grand nombre de célébrités et d’influenceurs, le concept s’est rapidement développé en tant que franchise. Des ouvertures partout en France sont à prévoir pour 2021 !");
    	dijon.ajouter(pointB);
    	
    	Lieu bagle=new Lieu("BAGELSTEIN DIJON","Restauration","10 Rue Bossuet, 21000 Dijon","Un Menu Double acheté = Un Cheese B offert.","Une Boisson Chaude offerte.","https://www.bagelstein.com/magasin/122");
    	bagle.set_xycentre(633,550);
    	bagle.set_description("Bagelstein, c’est pas qu’un trou dans un pain rond.Bagelstein, c’est aussi deux supers piliers sur lesquels on mise tout :Pour commencer, l’identité non-consensuelle, impertinente et border line que vous connaissez tous. On ne se contente pas de remplir bêtement le ventre de nos (chers) clients, on ambitionne de créer une micro-séquelle dans leur (chère) cervelle, afin de les émouvoir, de les faire marrer. Bref, qu’il se passe un truc en eux, quoi.Tout ça n’aurait aucun sens, si ce qu’on leur servait n’était pas sublimement bon.Par conséquent, on fabrique tout nous-même. Hormis les donuts (surgelés et gras, mais tellement bons…), tout ce qui est vendu dans nos restaurants est donc fait par nos boulangers-pâtissiers. Et parce qu’en plus d’être prétentieux, on est extrêmement parano : on pense que les congélos abîment nos produits, leurs font du mal…. donc ce ne sont pas nos potes et on ne surgèle rien.");
    	dijon.ajouter(bagle);
    	
    	Lieu subway=new Lieu("Subway","Restauration","70 Rue de la Liberté, 21000 Dijon","Sub 15 (hors Sub spéciaux) + Boisson 50cl + Cookie = 7€.","9 Croustis ou 9 Röstis offerts.","https://restaurants.subway.com/fr/france/dijon");
    	subway.set_xycentre(608,621);
    	subway.set_description("Vos restaurants Subway® vous proposent de personnaliser vos sandwiches, salades et wraps. Des millions de combinaisons possibles avec un large choix d'ingrédients : du pain et des cookies cuits sur place chaque jour, des légumes fraîchement coupés tous les matins, des garnitures variées qui s'adaptent à tous les goûts... pour créer un repas au plus près de vos envies du moment. A vous de créer le vôtre ! Chez Subway®, C’est vous le Chef !");
    	dijon.ajouter(subway);
    	
    	Lieu subway2=new Lieu(subway);
    	subway2.set_adresse("17 Av. Maréchal Foch, 21000 Dijon");
    	subway2.set_xycentre(367,518);
    	dijon.ajouter(subway2);
    	
    	Lieu subway3=new Lieu(subway);
    	subway3.set_adresse("13 Rue Paul Langevin, 21800 Chenôve");
    	subway3.set_xyglobal(486,1142);
    	dijon.ajouter(subway3);
    	
    	Lieu aubureau=new Lieu("Au Bureau Dijon","Restauration","2 Pl. de la République, 21000 Dijon","¤ 12,95€ = Burger Original / Royal Potatoes Burger / Fish & Chips / Brochettes Poulet (ou autre Burger pour 1€ de plus) + Accompagnement + Bière Bud 25cl ou Soft (hors Samedi).\n\n- ¤ 1,50€ sur toutes les Pintes Pression et les Cocktails (hors Vendredi & Samedi).","","https://www.bagelstein.com/magasin/122");
    	aubureau.set_xycentre(777,385);
    	aubureau.set_description("Inspirée des pubs londoniens, l’enseigne Au Bureau est née en 1989 en France. A la fois pub, brasserie et restaurant, les établissements proposent des animations et des offres adaptées à tous les moments de la journée, afin de transporter les consommateurs dans une ambiance authentique et chaleureuse.");
    	dijon.ajouter(aubureau);
    	
    	Lieu hollys=new Lieu("Holly's Diner","Restauration","1 Rue du Cap Vert, 21800 Quetigny","-20% sur toute la carte (hors Bonnes affaires du Midi, Menu Good Deal et Big Mount Lee).","Un Sundae offert.","https://dijon.hollysdiner.fr/");
    	hollys.set_xyglobal(1101,864);
    	hollys.set_description("Holly's Diner restaurant : burger, frites maison, steak house, coffee shop, bière, glace, sundae. Recettes traditionnelles américaines des années 50");
    	dijon.ajouter(hollys);
    	
    	Lieu castor=new Lieu("Chez Les Castors","Restauration","67 Rue Jeannin, 21000 Dijon","Poutine (hors suppléments) + Boisson Soft = 7€.","","https://www.facebook.com/chezlescastors/");
    	castor.set_xycentre(915,635);
    	castor.set_description("Restaurant de spécialités Canadiennes, Poutines, Burgers et autres produits nord-Américains");
    	dijon.ajouter(castor);
    	
    	Lieu miecaline=new Lieu("La Mie Caline","Restauration","4 Rue Bossuet, 21000 Dijon","Une Formule Chic ou Extra achetée = Un Dessert au choix offert.","","https://www.lamiecaline.com/boutiques/dijon/");
    	miecaline.set_xycentre(571,611);
    	miecaline.set_description("La Mie Câline est une enseigne spécialisée dans la fabrication et la distribution de produits alimentaires à emporter. Son coeur de métier est la boulangerie, avec en complément de la restauration rapide. On y trouve ainsi différentes sortes de pains, des viennoiseries, des pâtisseries, des sandwiches, des salades et des petits plats préparés.");
    	dijon.ajouter(miecaline);
    	
    	Lieu benja=new Lieu("Benja Burger","Restauration","15 Rue Jean Jacques Rousseau, 21000 Dijon","Un Menu Burger acheté = 5 Nuggets ou 8 Onion Rings offerts.","Une Box 12 Finger Foods offerte.","http://benjaburger.tastycloud.menu/");
    	benja.set_xycentre(845,433);
    	benja.set_description("Le restaurant vous propose des burgers à composer parce que c’est vous le chef ici ! Et si vous n’avez pas les compétences d’un cuisinier ou que vous avez la flemme, ne vous en faites pas, des propositions de burgers déjà préparés avec des produits de qualité vous sont proposés pour la somme imbattable de 6 euros.");
    	dijon.ajouter(benja);
    	
    	Lieu frozencup=new Lieu("Frozen Cup","Restauration","10 Rue Jean Jacques Rousseau, 21000 Dijon","Une Boisson Chaude achetée (hors Expresso et Café allongé) = Une Pâtisserie au choix offerte (hors Fondant & Cheesecake).","Une Glace Signature offerte.","https://frozencup.fr/");
    	frozencup.set_xycentre(571,611);
    	frozencup.set_description("Frozen Cup est un glacier moderne au cœur de Dijon. Nous vous proposons des crèmes glacées infusées aux céréales de votre enfance, agrémentées de toppings et coulis plus gourmands les uns que les autres. Venez profiter de nos glaces à l'américaine, mais aussi de nos pâtisseries maison et de nos boissons chaudes et froides.");
    	dijon.ajouter(frozencup);
    	
    	Lieu pancakeslover=new Lieu("Pancakes Lovers","Restauration","12 Rue Monge, 21000 Dijon","Pancake Sucré + Sirop + Toppings à volonté = 7,50€.","","https://facebook.com/pages/category/Coffee-Shop/PancakesLoversDijon");
    	pancakeslover.set_xycentre(538,700);
    	pancakeslover.set_description("Bar à pancakes. Sucré, salé, sain, gourmand, pour les petits et pour les grands!");
    	dijon.ajouter(pancakeslover);
    	
    	Lieu myflaxes=new Lieu("My Flaxes","Restauration","75 Rue Vannerie, 21000 Dijon","Une Formule à 7,50€ achetée (Gaufre + Accompagnement + Boisson hors Canette US) = une Formule offerte (hors week-end).","","https://www.facebook.com/My-Flakes-108465263988678/");
    	myflaxes.set_xycentre(846,608);
    	myflaxes.set_description("Lendemain de soirée difficile ou grosse dalle pour le goûter ? Viens déguster de délicieux et gigantesques bols de céréales, ou bien des gaufres, des twisters avec les toppings, la garniture et le nappage de ton choix. Des brunchs sont également disponibles, idéal quand tu te réveilles à midi ! ");
    	dijon.ajouter(myflaxes);
    	
    	Lieu burrito=new Lieu("Le Burritos","Restauration","114 Rue de Mirande, 21000 Dijon","Sandwich seul à 7€.Sandwich + Canette 33cl = 8€.","","https://le-burritos.business.site/");
    	burrito.set_xyglobal(895,815);
    	burrito.set_description("C’est une petite affaire familiale ou règne une ambiance très détendue. Les produits sont très frais avec un excellent rapport qualité prix. Le patron prépare lui même les viandes mijotées et les sauces. Son guacamole fait maison (« une demi-heure de préparation ! ») est excellent. Vous choisissez vous même parmi les ingrédients proposés des viandes, légumes et autres accompagnements (les amateurs de piment auront de quoi se régaler) que vous souhaitez mettre dans votre tacos, burritos, enchiladas…");
    	dijon.ajouter(burrito);
    	
    	// -------------------------------- //
    	
    	// BARS //
    	
    	Lieu bayron=new Lieu("Bayron Bay","Bars","106 Rue Berbisey, 21000 Dijon","-1€ sur tous les Cocktails jusqu'à 23h.","","https://fr.restaurantguru.com/Byron-Bay-Dijon");
    	bayron.set_xycentre(470,817);
    	bayron.set_description("Ce pub australien au décor convivial boisé propose une liste de cocktails et des retransmissions sportives.");
    	dijon.ajouter(bayron);
    	
    	Lieu barberousse=new Lieu("Barberousse","Bars","6 Rue Vannerie, 21000 Dijon","Bouteilles de Planteur à 13€ au lieu de 16€.\nBouteille de Shooter à 23€ au lieu de 26€.\nMix (Bouteille de Planteur + Bouteille de Shooter) à 29€ au lieu de 37€. \nNon cumulable avec l'Happy Hour. ","Une demi-bouteille de Planteur offerte.","https://www.facebook.com/barberousseDijon//");
    	barberousse.set_xycentre(839,482);
    	barberousse.set_description("Découvrez le Barberousse, cale pirate remplie de nombreux rhums et... de fête ! Soyez prêts à vous faire chavirer à chaque soirée d'embarquement !");
    	dijon.ajouter(barberousse);
    	
    	Lieu celier=new Lieu("Le Celier","Bars","1 Rue Auguste Perdrix, 21000 Dijon","-1€ sur tous les Saucissons.\n4,50€ la Pinte de Canoterie Blonde.\n6€ la Pinte de Bière du moment","","http://lecellier-dijon.fr/");
    	celier.set_xycentre(436,433);
    	celier.set_description("Le Cellier vous accueillera dans de magnifiques caves voûtées et une ambiance convivial.Venez y découvrir le savoir-faire régional avec un assortiment de bières et produits locaux vous permettant de découvrir toute la richesse de ce terroir");
    	dijon.ajouter(celier);
    	
    	Lieu beverly=new Lieu("Le Beverly","Bars","11 Av. du Drapeau, 21000 Dijon","L'heure de Billard à 9€ (hors Samedi).\n Le Cocktail du Jour à 6€ (hors Soirées étudiantes).","","http://www.pub-beverly.com/");
    	beverly.set_xycentre(777,105);
    	beverly.set_description("Pub/Discothèque avec grande salle de billards anglais/américains et discothèque au cadre lounge raffiné, avec terrasse.");
    	dijon.ajouter(beverly);
    	
    	Lieu salsa=new Lieu("la salsapelpa","Bars","1 Rue Marceau, 21000 Dijon","-50% sur les Bouteilles de Captain Morgan, Smirnoff ou Champagne Selection, hors Samedi.","","https://www.lesmeilleursrestos.fr/restaurant-dijon/98-restaurant-salsapelpa-dijon.html");
    	salsa.set_xycentre(817,343);
    	salsa.set_description("A Dijon Le restaurant Salsapelpa est un restaurant au couleurs latinos est une référence. Découvrez d'autres restaurants qui proposent du fait maison.");
    	dijon.ajouter(salsa);
    	
    	//---------------------------------------------------//
    	
    	// LOISIRS ET SPORTS //
    	
    	Lieu cinemaolympia=new Lieu("Cinéma Olympia","Loisirs et Sports","16 Av. Maréchal Foch, 21000 Dijon","5€ la place de cinéma, pour toutes les séances du Lundi au Vendredi (hors supplément 3D).","","https://www.cines-dijon.com/olympia");
    	cinemaolympia.set_xycentre(309,535);
    	cinemaolympia.set_description("Pour aller voir les dernières sorties de la semaine, le film du moment à ne pas rater ou même un opéra retransmis en direct depuis le Metropolitan Opera de New-York, le cinéma Darcy est idéalement situé, en plein centre-ville. Complexe ultra-moderne de 10 salles en gradin, celles-ci peuvent accueillir jusqu'à 408 personnes. On prend ses places aux bornes interactives ou à l'un des guichets et on attend sa séance à l'espace-bar qui propose : boissons, friandises et bien sûr pop-corn ! Au programme : séances 3D, avant-premières... Bon film !");
    	dijon.ajouter(cinemaolympia);
    	
    	Lieu cinemadarcy=new Lieu("Cinéma Darcy","Loisirs et Sports","28 Rue de Cracovie, 21850 Saint-Apollinaire","5€ la place de cinéma, pour toutes les séances du Lundi au Vendredi (hors supplément 3D).","","https://www.cines-dijon.com/darcy");
    	cinemadarcy.set_xycentre(456,528);
    	cinemadarcy.set_description("Pour aller voir les dernières sorties de la semaine, le film du moment à ne pas rater ou même un opéra retransmis en direct depuis le Metropolitan Opera de New-York, le cinéma Olympia est idéalement situé, en plein centre-ville. Complexe ultra-moderne de 10 salles en gradin, celles-ci peuvent accueillir jusqu'à 408 personnes. On prend ses places aux bornes interactives ou à l'un des guichets et on attend sa séance à l'espace-bar qui propose : boissons, friandises et bien sûr pop-corn ! Au programme : séances 3D, avant-premières... Bon film !");
    	dijon.ajouter(cinemadarcy);
    	
    	Lieu lasergame=new Lieu("Laser Game Evolution","Loisirs et Sports","8 Pl. Darcy, 21000 Dijon","9€ les 2 parties de 20 minutes au lieu de 16€.\n La Planche de Charcuterie 4 personnes + 1,5L de Bière au choix = 20€.","Une partie de Laser Game offerte (hors Samedi).","https://dijon.lasergame-evolution.fr/");
    	lasergame.set_xyglobal(983,516);
    	lasergame.set_description("Le seul Laser Game sur Dijon et le plus grand centre Laser Game de Bourgogne.\nVenez défier vos amis dans une ambiance totalement déroutante !\n2 immenses labyrinthes de 300m2  sur 3 niveaux.\nPour les grands groupes, les 2 salles peuvent communiquer entre elles pour une surface de jeu totale de près de 600 m2 !! Eclairage black light, musique endiablée, fumée et  déco fluo, sans doute le loisir le plus futuriste de l’agglomération !\nÉquipés de votre pistolet 100% LASER, votre précision et votre rapidité seront vos atouts pour surpasser vos adversaires !  \nUtiliser les planches pour vous cacher, mais méfiez-vous des meurtrières et des miroirs ! Jamais un loisir n’a permis autant d’interactivité entre les participants : Tout le monde joue en même temps ! \nNous fonctionnons exclusivement sur réservation et nous ne mélangeons pas les groupes ! Ainsi il faut un MINIMUM de 8 JOUEURS pour réserver !");
    	dijon.ajouter(lasergame);
    	
    	Lieu kartmania=new Lieu("Kart Mania","Loisirs et Sports","12 Rue Antoine Becquerel, 21300 Chenôve","Indoor : 8,50€ la session de 12 min au lieu de 17€. \nOutdoor : 15€ la partie de 10 min au lieu de 20€. ","","http://kartmania.site-solocal.com/");
    	kartmania.set_xyglobal(535,1175);
    	kartmania.set_description("Ce complexe de karting invite les amateurs de sensations fortes, petits et grands, à passer des moments inoubliables sur notre piste extérieure de 1090 mitres. Et après l'effort, le réconfort. Des délicieuses boissons vous attendent dans le bar.");
    	dijon.ajouter(kartmania);
    	
    	Lieu arcanium=new Lieu("Arcanium","Loisirs et Sports","52 Av. de Stalingrad, 21000 Dijon","80€ la partie quel que soit le nombre de joueurs (au lieu de jusqu'à 115€).\nRéservations uniquement par email ou téléphone (pas via leur site).","","http://www.arcanium-dijon.fr/");
    	arcanium.set_xyglobal(869,400);
    	arcanium.set_description("Bienvenue à ARCANIUM, le premier centre d'escape game et de quiz de Dijon\n\nVenez vivre 4 expériences incroyables parmi nos salles d’escape game.\n\nVous vous retrouvez dans un espace clos. Votre objectif est d’en sortir en moins d’une heure en résolvant des énigmes et en déjouant des pièges.\n\nCommunication, réflexion, esprit d’équipe et une bonne dose de logique seront vos meilleurs alliés durant votre expérience.\n\nCurieux, motivés, aventuriers ? Venez jouer en famille, entre collègues ou avec vos amis.\n\nMarre de la collaboration ? Affrontez-vous dans notre arène de quiz et devenez le boss de Rival Quiz.");
    	dijon.ajouter(arcanium);
    	
    	Lieu trampoline=new Lieu("Trampoline Experience","Loisirs et Sports","4 Rue des Fromentaux, 21121 Ahuy","Forfait 2h + Chaussettes + Boisson 25cl = 12€ (au lieu de 22€).","","http://www.trampoline-experience-dijon.fr/");
    	trampoline.set_xyglobal(677,325);
    	trampoline.set_description("Venez découvrir nos différentes expériences : sautez, smashez , toutes les occasions  sont bonnes pour vous amuser : anniversaires, groupe d’amis, comité d’entreprises, enterrement de vie de jeunes filles ou garçons. On vous attend très vite.\n\nRéserver votre session en ligne sur notre site c’est la garantie de ne pas attendre et de bénéficier d’une réduction de 2 euros sur chaque session d’une heure.");
    	dijon.ajouter(trampoline);

    	Lieu klube=new Lieu("Le Klube","Loisirs et Sports","4 Rue des Fromentaux, 21121 Ahuy","Location de Terrain pour une heure :\n Badminton : 10,50€ en heure creuse,\n 12,50€ en heure pleine.\n Futsal : 5€ par personne. \n Bubble Foot : 10€ par personne.","une demi-heure de badmington","https://www.leklube.com/");
    	klube.set_xyglobal(677,325);
    	klube.set_description("Le Klube à Dijon, salle de sport et centre de bien-être unique en Bourgogne, vous propose sur un même lieu de 6 500 m² une multitude d’activités pour vous dépenser ou vous détendre : fitness (cours collectifs Les Mills, aquagym, aquabike), cardio-training, plateau de musculation, balnéothérapie (saunas, hammam, jacuzzi géant, douches sensorielle), Spa institut, piscine, squash, footsalle, badminton, séminaires, événements privés et restaurant.");
    	dijon.ajouter(klube);
    	
    	Lieu rivalquiz=new Lieu("Rival Quiz","Loisirs et Sports","Palais des Sports Jean Michel Geoffroy, 17 Rue Léon Mauris, 21000 Dijon","Location de Terrain pour une heure :\n Badminton : 10,50€ en heure creuse,\n 12,50€ en heure pleine.\n Futsal : 5€ par personne. \n Bubble Foot : 10€ par personne.","","http://hand.jdadijon.com/");
    	rivalquiz.set_xyglobal(869,400);
    	rivalquiz.set_description("Rival Quiz est la toute première salle de quiz immersive de Dijon. Dans une arène retro-futuriste, plongez dans la bataille et affrontez vos adversaires dans un quiz totalement épique !");
    	dijon.ajouter(rivalquiz);
    	
    	Lieu jda=new Lieu("JDA Dijon Handball","Loisirs et Sports","52 Av. de Stalingrad, 21000 Dijon","La Partie de 4 à 6 joueurs + Un Soft par personne = 15€ par personne.\nLa Partie de 7 à 12 joueurs + Un Soft par personne = 13€ par personne.\nOffres valables uniquement pour les porteurs de Carte Emblem (et non pour tout le groupe).","","https://dijon.rivalquiz.fr/");
    	jda.set_xyglobal(822,620);
    	jda.set_description("Les handballeuses dijonnaises sont de retour pour une nouvelle saison dans l’élite du handball féminin français !\n\nPour leur troisème saison sous leurs nouvelles couleurs de la JDA, elles auront au cœur de faire vibrer les tribunes du Palais des Sports Jean Michel Geoffroy de Dijon !\n\nCe nouvel exercice en Ligue Butagaz Energie s’annonce plus exaltant que jamais !\n\nMais l’histoire ne s’écrira pas sans vous !!!\n\nAlors, n’hésitez plus, rejoignez l’équipe et venez découvrir le handball féminin ! Entre amis ou en famille, vous vivrez un spectacle inédit et captivant !\n\n\nVenez nombreux les encourager… « Elles le valent bien » !");
    	dijon.ajouter(jda);
    	
    	
    	//---------------------------------//
    	
    	// Service Sports et Santé //
    	
    	Lieu epiceriegare=new Lieu("Epicerie de la Gare - La LOCO","Services, Sport et Santé","5 Av. Maréchal Foch, 21000 Dijon","-10% sur tout le magasin, pour un minimum de 10€ d'achat. \n\nHors tabac, recharges téléphoniques, livraison.","","https://www.epiceriedelagarelaloco.fr/");
    	epiceriegare.set_xycentre(337,557);
    	epiceriegare.set_description("L'épicerie le Loco est ouverte tous les jours, 365 jours par an de 9h à minuit. En plus d'être une adresse qui dépanne, rappelons qu'elle propose des produits de qualité et régionaux : pain d’épices, moutarde et consort figurent sur les rayons et peuvent même vous être livrés à domicile via l'application Uber Eats. On retrouve ici tout le plaisir du commerce de proximité ainsi qu'un accueil chaleureux. Super pratique puisqu'à deux pas de la gare et devant une station de tramway.");
    	dijon.ajouter(epiceriegare);
    	
    	Lieu econduite=new Lieu("E-conduite21","Services, Sport et Santé","19 Bd de l'Université, 21000 Dijon","3h de conduite offertes pour tout forfait Permis B (avec ou sans Code). Accès à la formation Code en ligne gratuite (au lieu de 30€).","","http://e-conduite21.fr/");
    	econduite.set_xycentre(1167,1027);
    	econduite.set_description("Notre équipe d'enseignants dynamiques, diplômés et expérimentés s'investit pour la réussite de votre apprentissage dans les meilleurs délais à votre examen du permis de conduire auto ou moto.Nous vous offrons ainsi une capacité à vous faire passer l'examen rapidement.\n\nNous vous proposons des tests journaliers au code de la route dans nos locaux avec des boitiers électroniques, et pour encore mieux vous servir un enseignant diplômé vous aidera à vous préparer à l'examen (tous les mardis et jeudis de 14h à 17h).\n\nPour vous renforcer chez vous, nous vous proposerons également une formation sur internet au code de la route très complète avec des cours multimédias, des tests et des examens blancs dans tous nos forfaits.\n\nNos leçons de conduite auto ou moto sont possibles du lundi de 8h00 à 12h00 et de 14h00 jusqu'à 19h00 jusqu'au samedi midi.");
    	dijon.ajouter(econduite);
    	
    	Lieu gosport=new Lieu("Magasin GO Sport","Services, Sport et Santé","Centre Commercial De La Toison D'Or, 21000 Dijon","-15% sur tout le magasin, hors promotions, cycle, matériel techno ou de musculation.\n\nValable dans tous les Go Sport de Dijon, Grenoble et Lyon.","","https://www.go-sport.com");
    	gosport.set_xyglobal(785,311);
    	gosport.set_description("GO Sport : Magasins de sport. Vélos, skis, articles et matériel de sport pour la randonnée, la musculation, le fitness, le running, le football et toutes les discipline. Chaîne multimarque de magasins spécialisés dans les vêtements, les chaussures et les articles de sport.");
    	dijon.ajouter(gosport);
    	
    	Lieu magicform=new Lieu("Magic Form","Services, Sport et Santé","10-12 Bd Carnot, 21000 Dijon","Frais d'inscription (49,90€) + Carte de membre (20€) + Séance d'essai (5€) offerts. \n\nParrainage Emblem : si vous êtes client, une séance/mois avec un ami offerte. S'il s'inscrit pour 12 mois, un mois d'abonnement (29,90€) offert à chacun. ","","https://www.magic-form.fr/clubs/dijon");
    	magicform.set_xycentre(866,827);
    	magicform.set_description("Bienvenue chez vous !\n Chez Magic Form, nous avons notre propre définition du sport : une expérience vraie, épanouissante et conviviale, qui fait autant de bien au physique qu'au moral.\n\nLe principe de nos clubs ? Des lieux chaleureux et vivants qui méritent vraiment le nom de 'clubs' : les petits nouveaux deviennent vite des habitués, chaque salle offre des cours effectués par des coachs diplômés en chair et en os, des animations, du partage, de l'énergie, de l'humour, et les coachs vous connaissent réellement, sportivement et amicalement.");
    	dijon.ajouter(magicform);
    	
    	Lieu americandreamshop=new Lieu("AMERICAN DREAM SHOP","Services, Sport et Santé","30 Rue de la Redoute, 21850 Saint-Apollinaire","5€ de réduction sur les Casquettes. \nUne Barre chocolatée achetée = une Offerte (jusqu’à 3 personnes).","","https://www.americandreamshop.fr/");
    	americandreamshop.set_xyglobal(1027,505);
    	americandreamshop.set_description("Née d'une découverte datant des années 80, l'American Dream Shop est l'aboutissement, d'un rêve. Après 5 ans de réflexion, de recherches et de découvertes, il nous a semblé évident de partager cette culture et cette passion avec vous !");
    	dijon.ajouter(americandreamshop);
    	
    	Lieu seldabl=new Lieu("Selda BL","Services, Sport et Santé","28 Rue d'Auxonne, 21000 Dijon","Homme : Shampoing + Coupe à 17,50€ (au lieu de 21€) OU un Soin de la Barbe offert.\n\nFemme : Shampoing + Coupe + Brushing = 25€ (au lieu de 35€) OU un Soin des Cheveux offert.","","http://fr-fr.facebook.com/SeldaBLHairStyling");
    	seldabl.set_xycentre(853,948);
    	seldabl.set_description("Bienvenue dans notre salon de coiffure. Nous vous invitons pour une écoute, des conseils, des services personnalisés, en un mot de la coiffure professionnelle « sur-mesure ». Nous sommes spécialistes en coupes homme et femme, en couleurs , effets ...");
    	dijon.ajouter(seldabl);
    	
    	Lieu auratriomphe=new Lieu("L'Aura Triomphe","Services, Sport et Santé","2 Rue de la Serpe, 21800 Quetigny","Massage “Focus Time” de 30 min + Une Viennoiserie = 30€.","","https://lauratriomphe.kalendes.com/");
    	auratriomphe.set_xyglobal(1189,895);
    	auratriomphe.set_description("Massages  Bien-être et Sportif personnalisés.\nSoins corporels sur mesure aux sels minéraux  by Jericho cosmetics. \nEpilations sans colophane");
    	dijon.ajouter(auratriomphe);
    	
     	return dijon;
	}
   	//---------------------------------------------------------------------------------//
}



