
package Data;

/**
 * Accessory
 * Designed by Maxime
 * Developed by Prisca
 */
public class Accessory {

/**
 * <p>Represents the name of an accessory</p>
 * 
 */
    private String accessoryName;

public Accessory(String accessoryName) {
	this.accessoryName = accessoryName;
}

/**
 * <p>Return the name of the accessory</p>
 *
 * @return String
 */
    public String getAccessoryName() {        
        return this.accessoryName;
    } 

/**
 * <p>Set the name of the accessory</p>
 * 
 * @param name 
 */
    public void setAccessoryName(String name) {        
        this.accessoryName = name;
    } 
 }
