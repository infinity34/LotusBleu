
package Data;

/**
 * 
 * 
 * @poseidon-object-id [Im37e90f00m14bf8ad3fd2mm768c]
 */
public class ContributorRole extends User {
	
	private String shortDescription;
	
	private String description;

	/**
	 * @param shortDescription
	 * @param description
	 */
	public ContributorRole(String shortDescription, String description) {
		super();
		this.shortDescription = shortDescription;
		this.description = description;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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
		return "ContributorRole [shortDescription=" + shortDescription
				+ ", description=" + description + "]";
	}
	
	
 }
