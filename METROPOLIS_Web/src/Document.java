public class Document {
	
	enum Type {Video,Livre,Musqiue,Fichier};
	private int idDocument;
	private String nomDocument;
	private String Auteur;
	Type typeDocument;
	
	
	public Document(int idDocument, String nomDocument, String auteur, Document.Type typeDocument) {
		super();
		this.idDocument = idDocument;
		this.nomDocument = nomDocument;
		Auteur = auteur;
		this.typeDocument = typeDocument;
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


	public String getAuteur() {
		return Auteur;
	}


	public void setAuteur(String auteur) {
		Auteur = auteur;
	}


	public Type getTypeDocument() {
		return typeDocument;
	}


	public void setTypeDocument(Type typeDocument) {
		this.typeDocument = typeDocument;
	}
	

	
	
	
	
}
