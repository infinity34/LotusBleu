package Data;

/**
 * 
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm768c]
 */
public class ContributorRole extends UserRole {
	
	
	private String description; // It is a description of the contributor

	//Constructor
	public ContributorRole(String description) {
		super();
		this.description = description;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contributor description : " + description;
	}
	
	
 }