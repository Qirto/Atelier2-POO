package Personne;

public class personne {
	private String nom ;
	private String prenom ;
	public String dateNaissance;
	public char sex ;
	public personne conjoint  ;
	public boolean mari ;
	
	
	public personne() {
		this.nom = "";
		this.prenom="";
		this.dateNaissance="";
		this.sex=' ';
		
	}
	
	public personne(String n , String p) {
		this.nom = n;
		this.prenom=p;
	
	}
	
	public personne(String n, String p,String d, char s, personne c) {
		this.nom=n;
		this.prenom=p;
		this.dateNaissance=d;
		this.sex=s;	
		if (mari==true) {this.conjoint=c; }
		else {
			this.conjoint = null ; 
		}
		
	}
	
	public personne(String n, String p,String d, char s) {
		this.nom=n;
		this.prenom=p;
		this.dateNaissance=d;
		this.sex=s;	
		
	}
	
	
	public String getn() {
		return nom;
	}
	public String getp() {
		return prenom;
	}
	
	public String desc() {
		String s;
		s="nom : " + this.nom +"\n" ;
		s += "prenom : " + this.prenom +"\n";
		s+="datNaissance : "+this.dateNaissance+"\n";
		s+="sex : " + this.sex +"\n";
		
		return s;
	}

}

