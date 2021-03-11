import java.util.ArrayList;
import java.util.List;

public class FondDocumentaire {
	
	private int idFondDoc;
	private String nomFondDoc;
	private List<Document>tousMesDocuments;
	
	public FondDocumentaire(int idFondDoc, String nomFondDoc, List<Document> tousMesDocuments) {
		super();
		this.idFondDoc = idFondDoc;
		this.nomFondDoc = nomFondDoc;
		if(this.getTousMesDocuments() != null)
		{
			tousMesDocuments = new ArrayList<Document>();
		}
		else
		{
			this.tousMesDocuments = tousMesDocuments;
		}
	}

	public int getIdFondDoc() {
		return idFondDoc;
	}

	public void setIdFondDoc(int idFondDoc) {
		this.idFondDoc = idFondDoc;
	}

	public String getNomFondDoc() {
		return nomFondDoc;
	}

	public void setNomFondDoc(String nomFondDoc) {
		this.nomFondDoc = nomFondDoc;
	}

	public List<Document> getTousMesDocuments() {
		return tousMesDocuments;
	}

	public void setTousMesDocuments(List<Document> tousMesDocuments) {
		this.tousMesDocuments = tousMesDocuments;
	}
	
	
	
	
	
}
