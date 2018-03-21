package main.java.heroes;

import java.util.Scanner;


class Mage extends Character{
	
	protected Spell monSort = new Spell();
	protected int damages = strength + monSort.getSpellAttackLevel();
	protected boolean shieldPotion = false;
	
	public Mage() {
		super();
	}


	public Mage(String myName) {
		super();
		name = myName;
	}


	public Mage(String myName, String newImage, int newLife, int newStrenght) {
		super();
		setName(myName);
		setImage(newImage);
		setLife(newLife);
		setStrength(newStrenght);
	}
	
	
		
	public void mettreAJour(){
		damages =  strength + monSort.getSpellAttackLevel();
	}



	public void setShieldPotion(boolean status){
		shieldPotion = status;
	}
	public void modifier() {
		super.modifier();
		Scanner sc = new Scanner(System.in);

		System.out.println("Une potion de défence ? ");
		System.out.println("Oui = 1");
		int str1 = sc.nextInt();
		if(str1==1){
			setShieldPotion(true);
		}else{
			setShieldPotion(false);
		}
		System.out.println("Votre potion de défence est : " + shieldPotion);
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
		System.out.println("Your spell : " + monSort.getNameSpell() + " who deliver " + monSort.getSpellAttackLevel() + " damages");
		System.out.println("Your shieldPotion : " + shieldPotion);
		System.out.println("");
		System.out.println("_________________________________________");

	}

	public void ajouterArmeSpell(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Un sort ? ");
		System.out.println("Son nom : ");
		String str1 = sc.nextLine();
		monSort.setNameSpell(str1);

		System.out.println("Son niveau de puissance : ");
		int str2 = sc.nextInt();
		monSort.setSpellAttackLevel(str2);

	}

	public static void main(String[] args) {

	}
}