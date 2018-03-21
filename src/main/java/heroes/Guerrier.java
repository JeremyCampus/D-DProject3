package main.java.heroes;

import java.util.Scanner;


class Guerrier extends Character{
	
	protected Arme monArme = new Arme();
	protected int damages =  strength + monArme.getWeaponAttackLevel();
	protected boolean shield = false;
	
	public Guerrier() {
		super();
	}


	public Guerrier(String myName) {
		super();
		name = myName;
	}


	public Guerrier(String myName, String newImage, int newLife, int newStrenght) {
		setName(myName);
		setImage(newImage);
		setLife(newLife);
		setStrength(newStrenght);
		mettreAJour();
	}
	
	
		
	public void mettreAJour(){
		damages = strength + monArme.getWeaponAttackLevel();
	}



	public void setShield(boolean status){
		shield = status;
	}

	public void modifier() {
		super.modifier();
		Scanner sc = new Scanner(System.in);

		System.out.println("Un bouclier ? ");
		System.out.println("Oui = 1");
		int str1 = sc.nextInt();
		if(str1==1){
			setShield(true);
		}else{
			setShield(false);
		}
		System.out.println("Votre bouclier est : " + shield);
	}

	public void attaquer() {
		System.out.println("Vous attaquez votre ennemi.");
		System.out.println("Vous lui avez fait : " + damages + "degats");
	}
	public void afficher() {
		System.out.println("_________________________________________");
		System.out.println("");
		System.out.println("Your Name : " + name);
		System.out.println("Your Image : " + image);
		System.out.println("Your Life : " + life);
		System.out.println("Your strength : " + strength);
		System.out.println("---");
		System.out.println("Your weapon is " + monArme.getNameWeapon() + " who deliver " + monArme.getWeaponAttackLevel() + " damages.");
		System.out.println("Your shield : " + shield);
		System.out.println("");
		System.out.println("_________________________________________");

	}


	public void ajouterArmeSpell(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Une arme ? ");
		System.out.println("Son nom : ");
		String str1 = sc.nextLine();
		monArme.setNameWeapon(str1);

		System.out.println("Son niveau de puissance : ");
		int str2 = sc.nextInt();
		monArme.setWeaponAttackLevel(str2);

	}

	public static void main(String[] args) {
	}
}