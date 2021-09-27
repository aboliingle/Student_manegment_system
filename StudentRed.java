package StudentRed;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentRed {

	protected static final String JOptionPane = null;
	private JFrame frame;
	private JTextField jtxtStudentID;
	private JTextField jtxtFirstname;
	private JTextField jtxtSurname;
	private JTextField jtxtExamNo;
	private JTextField jtxtBiology;
	private JTextField jtxtAddress;
	private JTextField jtxtMaths;
	private JTextField jtxtEnglish;
	private JTextField jtxtDoB;
	private JTextField jtxtComputing;
	private JTextField jtxtChem;
	private JTextField jtxtPhy;
	private JTextField jtxtAddM;
	private JTextField jtxtBusiness;
	private JTextField SetTextTotalScore;
	private JTextField SetTextAverage;
	private JTextField SetTextRanking;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	 public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRed window = new StudentRed();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	 
	public StudentRed() { 
		initialize();
	
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(293, 37, 15, -28);
		frame.getContentPane().add(panel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(1063, 19, 357, 446);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(118, 75, -27, 22);
		panel_1_1.add(textArea);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setBounds(21, 22, 314, 401);
		panel_1_1.add(jtxtTranscript);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setBounds(10, 472, 1410, 78);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double[] R = new double[14];
				R[0] = Double.parseDouble(jtxtMaths.getText());
				R[1] = Double.parseDouble(jtxtEnglish.getText());
				R[2] = Double.parseDouble(jtxtBiology.getText());
				R[3] = Double.parseDouble(jtxtComputing.getText());
				R[4] = Double.parseDouble(jtxtChem.getText());
				R[5] = Double.parseDouble(jtxtPhy.getText());
				R[6] = Double.parseDouble(jtxtAddM.getText());
				R[7] = Double.parseDouble(jtxtBusiness.getText());
				
				R[8] = (R[0] + R[1]+ R[2]+ R[3]+ R[4]+ R[5]+ R[6]+ R[7])/8;
				R[9] = (R[0] + R[1]+ R[2]+ R[3]+ R[4]+ R[5]+ R[6]+ R[7]);
				
				String Average =String.format("%.0f", R[8]);
				SetTextAverage.setText(Average);
				
				String TotalScore =String.format("%.0f", R[9]);
				SetTextTotalScore.setText(TotalScore);
				
				//=====================Ranking=====================
				
				if (R[9] >= 700)
				{
					SetTextRanking.setText("1st Class");
				}
				
				else if (R[9] >= 600)
				{
					SetTextRanking.setText("2nd Class Upper");
				}
				
				else if (R[9] >= 500)
				{
					SetTextRanking.setText("2nd Class Lower");
				}
				
				else if (R[9] >= 400)
				{
					SetTextRanking.setText("3rd Class");
				}
				else if (R[9] >= 300)
				{
					SetTextRanking.setText("chouz");
				}
					else if (R[9] >= 200)
					{
						SetTextRanking.setText("Fail");
					}
//=====================Less than 100=====================
					
					if (R[1]> 100)
					{
						jtxtMaths.setText("");	
						jtxtMaths.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
					
					}
					
					if (R[2]> 100)
					{
						jtxtEnglish.setText("");	
						jtxtEnglish.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
					
					}
					
					if (R[3]> 100)
					{
						jtxtBiology.setText("");	
						jtxtBiology.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
						
					}
					
					if (R[4]> 100)
					{
						jtxtComputing.setText("");	
						jtxtComputing.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
						
					}
					
					if (R[5]> 100)
					{
						jtxtChem.setText("");	
						jtxtChem.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
						
					}
					
					if (R[6]> 100)
					{
						jtxtPhy.setText("");	
						jtxtPhy.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
					}
					
					if (R[7]> 100)
					{
						jtxtBusiness.setText("");	
						jtxtBusiness.requestFocus();
						SetTextAverage.setText("");
						SetTextTotalScore.setText("");
						SetTextRanking.setText("");
						
				}
					
			}
					
			
		});
		
		
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnResult.setBounds(38, 23, 204, 33);
		panel_1_1_1.add(btnResult);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Result Recording System\n"
				+ "                                 \n"		
				+ "Student ID:\t\t" + jtxtStudentID.getText()
				+ "\nFirstname:\t\t" +jtxtFirstname.getText()
				+ "\nSurname:\t\t" +jtxtSurname.getText()
				+ "\nMaths:\t\t" +jtxtMaths.getText()
				+ "\nEnglish:\t\t" +jtxtEnglish.getText()
				+ "\nBiology:\t\t" +jtxtBiology.getText()
				+ "\nComputing:\t\t" +jtxtComputing.getText()
				+ "\nChemistry:\t\t" +jtxtChem.getText()
				+ "\nPhysics:\t\t" +jtxtPhy.getText()
				+ "\nAdd Maths:\t\t"+jtxtAddM.getText()
				+ "\nBusiness:\t\t" +jtxtBusiness.getText()
				+ "\n                                    "
				+ "\nTotal Score:\t\t" +SetTextTotalScore.getText()
				+ "\nAverage:\t\t" +SetTextAverage.getText()
				+ "\nRanking:\t\t" +SetTextRanking.getText()+"\n");
		
		
				
				
				
			}
		});
		btnTranscript.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTranscript.setBounds(323, 23, 204, 33);
		panel_1_1_1.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				MessageFormat header = new MessageFormat ("printing in progress");
				MessageFormat footer = new MessageFormat("page {0, number,integer}");
				
				try
				{
					jtxtTranscript.print();
				}
				catch(java.awt.print.PrinterException ev){
					System.err.format( "No Printer found",ev.getMessage());
				}
				
				
				
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPrint.setBounds(581, 23, 204, 33);
		panel_1_1_1.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp=null;
				for(Component c:panel.getComponents()){
					if(c.getClass().toString().contains("javax.swing.JTextfield")){
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
				jtxtTranscript.setText(null);
				jtxtAddress.setText(null);
				jtxtMaths.setText(null);
				jtxtEnglish.setText(null);
				jtxtBiology.setText(null);
				jtxtComputing.setText(null);
				jtxtChem.setText(null);
				jtxtPhy.setText(null);
				jtxtAddM.setText(null);
				jtxtBusiness.setText(null);
				jtxtStudentID.setText(null);
				jtxtFirstname.setText(null);
				jtxtExamNo.setText(null);
				jtxtSurname.setText(null);
				
				
				
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReset.setBounds(842, 23, 204, 33);
		panel_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Student Result System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_Option){
				System.exit(0);	
				}
				
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(1121, 23, 204, 33);
		panel_1_1_1.add(btnExit);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBorder(new LineBorder(new Color(95, 158, 160), 12));
		panel_1_1_2.setBackground(new Color(176, 224, 230));
		panel_1_1_2.setBounds(10, 19, 1043, 446);
		frame.getContentPane().add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setBounds(187, 30, 182, 26);
		panel_1_1_2.add(jtxtStudentID);
		jtxtStudentID.setColumns(10);
		
		jtxtFirstname = new JTextField();
		jtxtFirstname.setBounds(187, 66, 182, 26);
		jtxtFirstname.setColumns(10);
		panel_1_1_2.add(jtxtFirstname);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setBounds(187, 102, 182, 26);
		jtxtSurname.setColumns(10);
		panel_1_1_2.add(jtxtSurname);
		
		jtxtExamNo = new JTextField();
		jtxtExamNo.setBounds(187, 174, 182, 26);
		jtxtExamNo.setColumns(10);
		panel_1_1_2.add(jtxtExamNo);
		
		jtxtBiology = new JTextField();
		jtxtBiology.setBounds(725, 102, 182, 26);
		jtxtBiology.setColumns(10);
		panel_1_1_2.add(jtxtBiology);
		
		jtxtAddress = new JTextField();
		jtxtAddress.setBounds(187, 277, 182, 143);
		jtxtAddress.setColumns(10);
		panel_1_1_2.add(jtxtAddress);
		
		JLabel lblNewLabel = new JLabel("Firstname:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 56, 128, 26);
		panel_1_1_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Surname:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(22, 92, 144, 26);
		panel_1_1_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Course Code:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(22, 128, 144, 26);
		panel_1_1_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Exam No:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(22, 169, 134, 26);
		panel_1_1_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(22, 200, 128, 26);
		panel_1_1_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DoB");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(22, 236, 128, 26);
		panel_1_1_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(22, 272, 128, 26);
		panel_1_1_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Maths:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_8.setBounds(587, 25, 128, 26);
		panel_1_1_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("English:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(587, 61, 128, 26);
		panel_1_1_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Biology:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_10.setBounds(587, 97, 128, 26);
		panel_1_1_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Computing:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(587, 133, 128, 26);
		panel_1_1_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Chemistry:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(587, 176, 128, 26);
		panel_1_1_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Physics:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(587, 205, 128, 26);
		panel_1_1_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("Add Maths:");
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13_1.setBounds(587, 236, 128, 26);
		panel_1_1_2.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("Business:");
		lblNewLabel_13_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13_2.setBounds(587, 272, 128, 26);
		panel_1_1_2.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_13_3 = new JLabel("Total Score:");
		lblNewLabel_13_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13_3.setBounds(587, 308, 128, 26);
		panel_1_1_2.add(lblNewLabel_13_3);
		
		JLabel lblNewLabel_13_4 = new JLabel("Average:");
		lblNewLabel_13_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13_4.setBounds(587, 340, 128, 26);
		panel_1_1_2.add(lblNewLabel_13_4);
		
		JLabel lblNewLabel_13_5 = new JLabel("Ranking:");
		lblNewLabel_13_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13_5.setBounds(587, 386, 128, 26);
		panel_1_1_2.add(lblNewLabel_13_5);
		
		JLabel lblNewLabel_14 = new JLabel("Student ID:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_14.setBounds(22, 25, 128, 26);
		panel_1_1_2.add(lblNewLabel_14);
		
		jtxtMaths = new JTextField();
		jtxtMaths.setColumns(10);
		jtxtMaths.setBounds(725, 28, 182, 26);
		panel_1_1_2.add(jtxtMaths);
		
		jtxtEnglish = new JTextField();
		jtxtEnglish.setColumns(10);
		jtxtEnglish.setBounds(725, 69, 182, 26);
		panel_1_1_2.add(jtxtEnglish);
		
		jtxtDoB = new JTextField();
		jtxtDoB.setColumns(10);
		jtxtDoB.setBounds(187, 246, 182, 26);
		panel_1_1_2.add(jtxtDoB);
		
		jtxtComputing = new JTextField();
		jtxtComputing.setColumns(10);
		jtxtComputing.setBounds(725, 136, 182, 26);
		panel_1_1_2.add(jtxtComputing);
		
		jtxtChem = new JTextField();
		jtxtChem.setColumns(10);
		jtxtChem.setBounds(725, 177, 182, 26);
		panel_1_1_2.add(jtxtChem);
		
		jtxtPhy = new JTextField();
		jtxtPhy.setColumns(10);
		jtxtPhy.setBounds(725, 210, 182, 26);
		panel_1_1_2.add(jtxtPhy);
		
		jtxtAddM = new JTextField();
		jtxtAddM.setColumns(10);
		jtxtAddM.setBounds(725, 241, 182, 26);
		panel_1_1_2.add(jtxtAddM);
		
		jtxtBusiness = new JTextField();
		jtxtBusiness.setColumns(10);
		jtxtBusiness.setBounds(725, 272, 182, 26);
		panel_1_1_2.add(jtxtBusiness);
		
		SetTextTotalScore = new JTextField();
		SetTextTotalScore.setForeground(Color.BLACK);
		SetTextTotalScore.setFont(new Font("Tahoma", Font.BOLD, 18));
		SetTextTotalScore.setEnabled(false);
		SetTextTotalScore.setColumns(10);
		SetTextTotalScore.setBounds(725, 319, 182, 26);
		panel_1_1_2.add(SetTextTotalScore);
		
		SetTextAverage = new JTextField();
		SetTextAverage.setForeground(Color.BLACK);
		SetTextAverage.setFont(new Font("Tahoma", Font.BOLD, 18));
		SetTextAverage.setEnabled(false);
		SetTextAverage.setColumns(10);
		SetTextAverage.setBounds(725, 355, 182, 26);
		panel_1_1_2.add(SetTextAverage);
		
		SetTextRanking = new JTextField();
		SetTextRanking.setForeground(Color.BLACK);
		SetTextRanking.setFont(new Font("Tahoma", Font.BOLD, 18));
		SetTextRanking.setEnabled(false);
		SetTextRanking.setColumns(10);
		SetTextRanking.setBounds(725, 391, 182, 26);
		panel_1_1_2.add(SetTextRanking);
		
		textField = new JTextField();
		textField.setBounds(187, 138, 182, 26);
		panel_1_1_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 208, 182, 28);
		panel_1_1_2.add(textField_1);
		textField_1.setColumns(10);
		
	
		
		}
	
}
	

