package main.java.heroes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;


class BattleField {

	static List<Character> listeHeroes = new ArrayList<Character>();
	// static Object listeHeroes[] = new warr() ;
	
	public BattleField(){
		// for (Guerrier heroes : listeHeroes) {   
		// 	heroes = new Guerrier("Guerrier du Nord");
		// }	
	}
		
	public void newCharacter(){
	}

	public static void clearZone()
	{
		System.out.print("\033[H\033[2J");  //CLEAR TERMINAL
		System.out.flush();					//CLEAR TERMINAL
	}

	public static void main(String[] args) {
		creationALaChaine();
		Scanner sc = new Scanner(System.in);
		boolean quitter = false;	
		clearZone();		  
			do{
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("_____________________________________________________________________");
				System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
				System.out.println("_____________________________________________________________________");
				System.out.println("---");
				System.out.println("Creer un/des personnages ? = 1");
				System.out.println("Afficher la liste des personnages ? = 2");
				System.out.println("Menu de gestion des personnages ? = 3");
				System.out.println("Afficher un tableau de 5 objet ? = 4");
				System.out.println("Quitter = 5");
				System.out.println("Une division par 0 ? = 6");
				System.out.println("---");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				String str2 = sc.nextLine();
				clearZone();
				System.out.println("_____________________________________________________________________");
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("_____________________________________________________________________");
				switch (str2)
				{
					case "1":
						createCharacter();
						break;        
					case "2":
						for(int i = 0; i < listeHeroes.size(); i++){
							System.out.println("");
							System.out.println("");
							System.out.println("Voici le hero : " + listeHeroes.get(i).getName() + " | Numero : " + i);
							listeHeroes.get(i).afficher();

						}			  
						break;        
					case "3":
						try {
							int numHero = 0;
							System.out.println("Quel personnage souhaitez vous modifier ?");
							for(int i = 0; i < listeHeroes.size(); i++){
								System.out.println("-----------------------");
								System.out.println("Voici le hero : " + listeHeroes.get(i).getName() + " | Numero : " + i);
							}	
							numHero = sc.nextInt();	
							listeHeroes.get(numHero).afficher();
							gestionDuHero(numHero);	
						} catch (Exception e) {
							System.out.println("erreur");
						}      
						break;  
						
					case "4":
					creationALaChaine();
						;
						break;       
					case "5":
						quitter = true;
						break;   
					case "6":
						try {
							System.out.println(1/0);
						  } catch (ArithmeticException e) {
							System.out.println("Division par zéro !");
						  }
					  break; 						  
					default:
						System.out.println("");
						break;        
				}
			}while(quitter != true);
		System.out.println("___________________Merci De Votre Visite (^_^)_______________________");



	}
//-------------------------Selectionner/modifier Un personnage
public static void gestionDuHero(int numHero){
	boolean exit = false;			  
	Scanner sc = new Scanner(System.in);
	clearZone();		  
	do{
		listeHeroes.get(numHero).mettreAJour();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||| QUE VOULEZ VOUS FAIRE ? ||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");
		System.out.println("---");
		System.out.println("Afficher votre personnage ? = 1");
		System.out.println("Modifier les infos de votre personnage? = 2");
		System.out.println("Attaquer ? = 3");
		System.out.println("Ajouter une arme ou un sort?  = 4");
		System.out.println("Supprimer ce personnage ?  = 5");
		System.out.println("Quitter  = 6");
		System.out.println("---");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		String str2 = sc.nextLine();
		clearZone();		  		
		System.out.println("_____________________________________________________________________");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("_____________________________________________________________________");

		switch (str2)
		{
			case "1":
				listeHeroes.get(numHero).afficher();			  
				break;        
			case "2":
				listeHeroes.get(numHero).modifier();			  
				break;        
			case "3":
				listeHeroes.get(numHero).attaquer();			  
				break;        
			case "4":
				listeHeroes.get(numHero).ajouterArmeSpell();			  
				break;        
			case "5":
			System.out.println("Etes vous sur ?");
			System.out.println("y(Yes), n(No)");
			String validSuppr = sc.nextLine();
			if(validSuppr == "y" || validSuppr == "Y")
			{
				listeHeroes.remove(numHero);
				exit = true;
			}
				break; 
			case "6":
				exit = true;
				break;        
			default:
		System.out.println("Erreur");
				break;        
		}
	}while(exit != true);
}

//-------------------------AFFICHER TEMPORAIRE
		public static void creationALaChaine(){
			Guerrier[] tableauGuerrier = new Guerrier[6];

			Guerrier myHero = new Guerrier("Guerrier n1 pour la competence");
			Guerrier myHero2 = new Guerrier("Guerrier n2 pour la competence");
			Guerrier myHero3 = new Guerrier("Guerrier n3 pour la competence");
			Guerrier myHero4 = new Guerrier("Guerrier n4 pour la competence");
			Guerrier myHero5 = new Guerrier("Guerrier n5 pour la competence");
			tableauGuerrier[0]=myHero;
			tableauGuerrier[1]=myHero2;
			tableauGuerrier[2]=myHero3;
			tableauGuerrier[3]=myHero4;
			tableauGuerrier[4]=myHero4;
			for(int i = 0; i < 5; i++){
			System.out.println("Voici le hero : " + tableauGuerrier[i].getName());
			}
		}


//-------------------------CREATION PERSONNAGE OLD
	public static void createCharacter()
	{
		Scanner sc = new Scanner(System.in);
		Character myHero = null;

		String vocation = "";
		System.out.println("Guerrier(1) ou Mage(2) ?");
		vocation = sc.nextLine();

		String myName ="";
		System.out.println("Quel est son nom ?");
		myName = sc.nextLine();

		String newImage ="X";

		int newLife =1;
		System.out.println("Quel est votre life ?");
		newLife = sc.nextInt();

		int newStrenght = 1;
		System.out.println("Quel est votre Strenght ?");
		newStrenght = sc.nextInt();	

		if(vocation == "1"){
			myHero = new Guerrier(myName, newImage, newLife, newStrenght);
		}else{
			myHero = new Mage(myName, newImage, newLife, newStrenght);
		}
		listeHeroes.add(myHero);
	}
}