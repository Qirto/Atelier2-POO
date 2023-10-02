package TestPersonne;
import Personne.personne ;

public class TestPersonne {
	public static void main (String args[]) {
		personne p1=new personne("Florant","Patrice","18/09/1972",'M');
		System.out.println(p1.desc());
		personne p2= new personne("Florant","Christine","11/06/1980",'F' , p1);
		System.out.println(p1.equals(p2));
		System.out.println("Conjoint : ");
		System.out.println(p2.desc());


		
	}

}
