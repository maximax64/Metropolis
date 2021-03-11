package metropolis.entities;
public class Document {
	
	private int idDocument;
	private String nomDocument;
	private Auteur monAuteur;
	
	public Document(int idDocument, String nomDocument, Auteur monAuteur) {
		super();
		this.idDocument = idDocument;
		this.nomDocument = nomDocument;
		this.monAuteur = monAuteur;
	}
	
	public int getIdDocument() {
		return idDocument;
	}
	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}
	public String getNomDocument() {
		return nomDocument;
	}
	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}
	public Auteur getMonAuteur() {
		return monAuteur;
	}
	public void setMonAuteur(Auteur monAuteur) {
		this.monAuteur = monAuteur;
	}
	
}
