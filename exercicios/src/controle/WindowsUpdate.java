package controle;

import java.time.LocalDate;

public class WindowsUpdate {
	private String Id;
	private String Alias;
	private String DocumentTitle;
	private String Severity;
	private LocalDate InitialReleaseDate;
	private LocalDate CurrentReleaseDate;
	private String CvrfUrl;
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public String getDocumentTitle() {
		return DocumentTitle;
	}
	public void setDocumentTitle(String documentTitle) {
		DocumentTitle = documentTitle;
	}
	public String getSeverity() {
		return Severity;
	}
	public void setSeverity(String severity) {
		Severity = severity;
	}
	public LocalDate getInitialReleaseDate() {
		return InitialReleaseDate;
	}
	public void setInitialReleaseDate(LocalDate initialReleaseDate) {
		InitialReleaseDate = initialReleaseDate;
	}
	public LocalDate getCurrentReleaseDate() {
		return CurrentReleaseDate;
	}
	public void setCurrentReleaseDate(LocalDate currentReleaseDate) {
		CurrentReleaseDate = currentReleaseDate;
	}
	public String getCvrfUrl() {
		return CvrfUrl;
	}
	public void setCvrfUrl(String cvrfUrl) {
		CvrfUrl = cvrfUrl;
	}
}
