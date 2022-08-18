package swing_tables;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

public class Swing_tables extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing_tables frame = new Swing_tables();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class TableData extends AbstractTableModel {

		int[][] allData = new int[3][3];
		private static final long serialVersionUID = -3121818866196017932L;
		
		public TableData() {
			//can ref and assign cells by
			//allData[0][0] = 1;
//			//this is faster
//			allData[0] = new int[] {1,2,3};
//			allData[1] = new int[] {4,5,6};
//			allData[2] = new int[] {7,8,9};
			loadFile("data.csv");
			
		}
		private void loadFile(String fileName) {
			Path file = FileSystems.getDefault().getPath("", fileName);
			try {
				List<String> lines = Files.readAllLines(file);
				for (int i=0;i<lines.size();i++) {
					String line = lines.get(i);
					String[] lineArray = line.split(",");
					for (int j=0;j<lineArray.length;j++) {
						int parsedInt = Integer.parseInt(lineArray[j]);
						allData[i][j] = parsedInt;
						
					}
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return allData.length;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return allData[rowIndex][columnIndex];
		}
		
	}
	/**
	 * Create the frame.
	 */
	public Swing_tables() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(37, 36, 346, 217);
		contentPane.add(table);
		
		TableData data = new TableData();
		table.setModel(data);
	}
}
