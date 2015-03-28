/**
 * 
 */
package Data;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

/**
 * @author max
 *
 */
@SuppressWarnings("serial")
public class EventTableModel extends AbstractTableModel {

	private final ArrayList<Event> events;

	private final String[] entetes = {"Name", "Begin", "End", "Action" };

	/**
	 * Creates an empty EventTableModel
	 */
	public EventTableModel() {
		super();
		events = new ArrayList<Event>();
	}

	/**
	 * 
	 */
	public EventTableModel(ArrayList<Event> events) {
		super();
		this.events = events;
	}
	
	/**
	 * @return the events
	 */
	public ArrayList<Event> getEvents() {
		return events;
	}

	/**
	 * @return the entetes
	 */
	public String[] getEntetes() {
		return entetes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getRowCount()
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return events.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getColumnCount()
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return entetes.length;
	}

	public String getColumnName(int columnIndex) {
		return entetes[columnIndex];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.table.TableModel#getValueAt(int, int)
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return events.get(rowIndex).getEventName();
		case 1:
			return events.get(rowIndex).getEventTimeSlot().getBeginDate();
		case 2:
			return events.get(rowIndex).getEventTimeSlot().getEndDate();
		default:
			return null;
		}
	}

}
