package outputExamples;

import javax.swing.JTable;

public class LikesDislikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] columnNames = {"Likes","Dislikes" };
		Object[][] data = {
				{"Sleeping", "Waking Up"},
				{"Free Days", "Homework"},
				{"Games", "Math"},
				{"Hockey", "English"},
				{"Random stuff", "Chores"}
				};
		JTable table = new JTable(data, columnNames);
	}

}
