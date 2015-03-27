
package Persistence;

import java.sql.ResultSet;
import java.util.ArrayList;


/**
 * 
 * 
 * @poseidon-object-id [I610a0d25m14bffb8994amm746e]
 */
public class ContributorManagerXML extends Persistence.ContributorManager {


	

	@Override
	public ResultSet listEvents(String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Boolean deleteContributorFromEvent(String eventName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addContributorToEvent(String myEvent, String begin,
			String end, String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	 public Boolean createContributor(String name,String firstname, String description){
		 return null;
	 }

	@Override
	public Boolean deleteContributor(String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<String> listContributor() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<String> searchContributor(String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
 }
