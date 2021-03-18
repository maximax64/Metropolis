import java.util.ArrayList;

public class Auteur {
	
	private int idAuteur;
	private  String nomAuteur;
	private String prenomAuteur;
	private ArrayList<Document> mesDocuments;
	
	public Auteur(int idAuteur, String nomAuteur, String prenomAuteur, ArrayList<Document> mesDocuments) {
		super();
		this.idAuteur = idAuteur;
		this.nomAuteur = nomAuteur;
		this.prenomAuteur = prenomAuteur;
		if(this.getMesDocuments() != null)
		{
			mesDocuments = new ArrayList<Document>();
		}
		else
		{
			this.mesDocuments = mesDocuments;
		}
	}
	
	public int getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(int idAuteur) {
		this.idAuteur = idAuteur;
	}
	public String getNomAuteur() {
		return nomAuteur;
	}
	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	public String getPrenomAuteur() {
		return prenomAuteur;
	}
	public void setPrenomAuteur(String prenomAuteur) {
		this.prenomAuteur = prenomAuteur;
	}
	
	public ArrayList<Document> getMesDocuments() {
		return mesDocuments;
	}

	public void setMesDocuments(ArrayList<Document> mesDocuments) {
		
		this.mesDocuments = mesDocuments;
	}
	
}
