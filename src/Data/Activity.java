
package Data;

/**
 * Activity
 * Designed by Lyvia
 * Developed by Prisca
 */
public class Activity {

    private String name; //name of the activity
    private String description; //description of the activity
    public Data.InCharge inCharge;
    
    //Constructor
    public Activity(String aName, String aDescription){
    	this.setName(aName);
    	this.setDescription(aDescription);
    }

    //Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
 }
