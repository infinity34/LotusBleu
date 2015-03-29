package Data;

public class MemberRole extends UserRole {
	
	private Subscription subscription;

	/**
	 * @return the subscription
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberRole [subscription=" + subscription + "]";
	}

	/**
	 * @param subscription
	 */
	public MemberRole(Subscription subscription) {
		super();
		this.subscription = subscription;
	}

	public MemberRole() {
		// TODO Auto-generated constructor stub
	}	
	
}
