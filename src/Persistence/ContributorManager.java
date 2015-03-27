
package Persistence;

import java.sql.ResultSet;
import java.util.ArrayList;




/**
 * Contributor
 * Designed by Remy
 * Developed by Lyvia
 */
public abstract class ContributorManager {
	
	public abstract Boolean addContributorToEvent(String myEvent,String begin,String end, String name, String firstname);
     
    public abstract ResultSet listEvents(String name, String firstname);
    
    public abstract Boolean createContributor(String name,String firstname, String description);
    
    public abstract ArrayList<String> listContributor(); 

    public abstract Boolean deleteContributor(String name, String firstname);
    
    public abstract Boolean deleteContributorFromEvent(String eventName);
   
    public abstract ArrayList<String> searchContributor(String name, String firstname);
 }
