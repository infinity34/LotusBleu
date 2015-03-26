
package Persistence;

import java.util.ArrayList;

import Data.ContributorRole;
import Data.Event;
import Data.User;

/**
 * 
 * 
 * @poseidon-object-id [I610a0d25m14bffb8994amm746e]
 */
public class ContributorManagerXML extends Persistence.ContributorManager {

	@Override
	public boolean addContributor(User contributor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Event> listEvents(User contributor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createContributor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<User> listContributor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteContributorEvent(Event myEvent,
			ContributorRole myContributor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean deleteContributorFromEvent(String eventName,
			String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}
 }
