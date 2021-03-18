import java.util.Date;

public class Emprunt {

	private int idEmprunt;
	private Date dateEmprunt;
	private Date dateRetour;
	private Membre unMembre;
	private Document unDocument;
	
	public Emprunt(int idEmprunt, Date dateEmprunt, Date dateRetour, Membre unMembre, Document unDocument) {
		super();
		this.idEmprunt = idEmprunt;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}
	
	public Emprunt()
	{
		
	}

	public int getIdEmprunt() {
		return idEmprunt;
	}

	public void setIdEmprunt(int idEmprunt) {
		this.idEmprunt = idEmprunt;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Membre getUnMembre() {
		return unMembre;
	}

	public void setUnMembre(Membre unMembre) {
		this.unMembre = unMembre;
	}

	public Document getUnDocument() {
		return unDocument;
	}

	public void setUnDocument(Document unDocument) {
		this.unDocument = unDocument;
	}
	
	
	
}
