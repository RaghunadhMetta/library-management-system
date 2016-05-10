
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import org.eclipse.wb.swing.FocusTraversalOnArray;

//import TableSelectionDemo.ColumnListener;







import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JComboBox;


public class GUI {
	class WrongInputException extends Exception{
	    WrongInputException() {
	 
	    }
	    public String toString(){ 
	       return ("Wrong inputs") ;
	    }
	}
	private JFrame frame;
	/**
	 * @wbp.nonvisual location=141,-11
	 */
//	private final JLabel label = new JLabel("New label");
	private final JPanel Book_Search = new JPanel();
	private final JPanel Book_Loans = new JPanel();
	private final JLabel lblBookId_1 = new JLabel("Book ISBN*");
	private final JLabel lblBranchId = new JLabel("Branch ID*");
	private final JLabel lblCardNumber = new JLabel("Card Number*");
	private final JPanel Check_in = new JPanel();
	private final JPanel Borrower = new JPanel();
	private final JPanel login = new JPanel();
	private final JLabel lblFirstName = new JLabel(" First Name*");
	private final JLabel lblLastName = new JLabel("Last Name*");
	private final JLabel lblAddress = new JLabel("Address1*");
	private final JLabel lblAddress_1 = new JLabel("ssn* (eg:123-12-1234)"); //field for ssn
	private final JLabel lblCity = new JLabel("City*");
	private final JLabel lblState = new JLabel("State*");
	private final JLabel lblZip = new JLabel("email");
	private final JLabel lblPhone = new JLabel("Phone");
	private final JTextField textField_Lname = new JTextField();
	private final JTextField textField_Fname = new JTextField();
	private final JTextField textField_Add1 = new JTextField();
	private final JTextField textField_Add2 = new JTextField();
	private final JTextField textField_Zip = new JTextField();
	private final JTextField textField_City = new JTextField();
	private final JTextField textField_State = new JTextField();
	private final JTextField textField_Phone = new JTextField();
	private final JButton btnCreateBorrower = new JButton("Create Borrower");
	private final JPanel Library = new JPanel();
	private final JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT SYSTEM");
//	lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.black));
	private final JButton btnBookSearch = new JButton("Book Search");
	private final JButton btnCheckOutBooks = new JButton("Check Out Books");
	private final JButton btnCheckInBooks = new JButton("Check in Books");
	private final JButton btnBorrower = new JButton("Borrower");
	private final JTextField textField_chkbook = new JTextField();
	private final JTextField textField_chkbranch = new JTextField();
	private final JTextField textField_chkcard = new JTextField();
	private final JButton btnCheckOut = new JButton("Check Out");
	private final JLabel lblBookId_2 = new JLabel("Book ISBN");
	private final JLabel lblCardNumber_1 = new JLabel("Card Number");
	private final JLabel lblBorrowerName = new JLabel("Borrower Name");
	private final JTextField textField_chkinbook = new JTextField();
	private final JTextField textField_chkincard = new JTextField();
	private final JTextField textField_chkinborrower = new JTextField();
	private final JButton btnNewButton_1 = new JButton("Get Books");
	private JTextField textField_bookid;
	private JTextField textField_title;
	private JTextField textField_author;
	private final JScrollPane searchScrollPane = new JScrollPane();
	private final JTable table = new JTable();
	private final JLabel lblMessage = new JLabel("");
	private final JLabel lblMessage_chkout = new JLabel("");
	private final JLabel message_chkin = new JLabel("");
	private JTable table_chkin;
	private final JButton btnChkin = new JButton("Check in");
	private final JLabel lblCheckOutBooks = new JLabel("  Check Out Books  ");
	private final JLabel lblCheckInBooks = new JLabel("  Check In Books  ");
	private final JLabel lblNewLabel_2 = new JLabel("  Borrower Creation  ");
	private final JLabel lblMessagechkin = new JLabel("**Please select only one of the below books if checked multiple rows only first book is checked out!");
	private final JLabel lblUserName = new JLabel("card number*");
	private final JLabel lblPassword = new JLabel("enter amount");
	private JTextField textField_user;
	private JTable table_fines;
	private JTextField textField;
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_cardnumber = new JTextField();
	private final JLabel lblCardnumber = new JLabel("cardnumber*");
	private final JScrollPane scrollPane_fine = new JScrollPane();
	private final JTable table_1_fine = new JTable();
	private final JLabel lblEnterAmount = new JLabel("Enter amount");
	private final JTextField textField_fineamount = new JTextField();
	private final JLabel finemsg = new JLabel("");
	private final JButton btnGetFineDetails = new JButton("get/update fine details");
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField textField_2_loanid;
	private JTable table_1_fines;
	private final JButton btngetfinedetails = new JButton("get fine details");
	private final JLabel lblFines = new JLabel("FINES");

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	
 
   

	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_fineamount.setBounds(163, 302, 86, 20);
		textField_fineamount.setColumns(10);
		textField_cardnumber.setBounds(213, 38, 86, 20);
		textField_cardnumber.setColumns(10);
		textField_1.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frame.setBounds(100, 100, 778, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("700px"),},
			new RowSpec[] {
				RowSpec.decode("462px"),}));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, "1, 1, fill, fill");
		Library.setFont(new Font("Engravers MT", Font.PLAIN, 11));
		Library.setBackground(new Color(211, 211, 211));
		Library.setForeground(new Color(0, 0, 0));
		
		tabbedPane.addTab("Library", null, Library, null);
		tabbedPane.setDisplayedMnemonicIndexAt(0, 0);
		tabbedPane.setBackgroundAt(0, new Color(192, 192, 192));
		Library.setLayout(null);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(null);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(192, 27, 328, 25);
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.YELLOW);
		
		Library.add(lblNewLabel);
		btnBookSearch.setForeground(Color.BLACK);
		btnBookSearch.setBackground(new Color(192, 192, 192));
		btnBookSearch.setBounds(241, 79, 135, 23);
		btnBookSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		
		Library.add(btnBookSearch);
		btnCheckInBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnCheckInBooks.setBackground(new Color(192, 192, 192));
		btnCheckInBooks.setBounds(241, 114, 135, 23);
		
/*************************************************************************************************************/
/***************************************Book Search***********************************************************/
		Library.add(btnCheckInBooks);
		btnCheckOutBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnCheckOutBooks.setBackground(new Color(192, 192, 192));
		btnCheckOutBooks.setBounds(241, 148, 135, 23);
		
		Library.add(btnCheckOutBooks);
		btnBorrower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnBorrower.setBackground(new Color(192, 192, 192));
		btnBorrower.setBounds(241, 216, 135, 23);
		
		Library.add(btnBorrower);
		
		JButton btnFines = new JButton("Fines");
		btnFines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
		//	new Fines().setVisible(true);
			}
		});
		btnFines.setBackground(new Color(192, 192, 192));
		btnFines.setBounds(241, 182, 135, 23);
		Library.add(btnFines);
		Library.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, btnBookSearch, btnCheckInBooks, btnCheckOutBooks, btnBorrower, btnFines}));
		Book_Search.setBackground(new Color(192, 192, 192));
		
		tabbedPane.addTab("Book Search", null, Book_Search, null);
		tabbedPane.setDisplayedMnemonicIndexAt(1, 1);
		Book_Search.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book ISBN");
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(35, 44, 69, 20);
		Book_Search.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setBounds(35, 102, 46, 14);
		Book_Search.add(lblTitle);
		
	
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAuthor.setBounds(35, 72, 46, 14);
		Book_Search.add(lblAuthor);
		
		textField_bookid = new JTextField();
		textField_bookid.setBounds(114, 44, 138, 20);
		Book_Search.add(textField_bookid);
		textField_bookid.setColumns(10);
		
		textField_title = new JTextField();
		textField_title.setBounds(114, 99, 214, 20);
		Book_Search.add(textField_title);
		textField_title.setColumns(10);
		JLabel label_search = new JLabel("");
		label_search.setBounds(35, 161, 448, 14);
		Book_Search.add(label_search);
		textField_author = new JTextField();
		textField_author.setBounds(114, 69, 151, 20);
		Book_Search.add(textField_author);
		textField_author.setColumns(10);
		//String query_begin = "SELECT T1.isbn,T1.TITLE,T1.BRANCH_ID,fullname,no_of_copies,(no_of_copies-count(L.isbn)) as AVAILABLE_COPIES FROM book_loans L  RIGHT JOIN (select B.isbn,B.TITLE,C.BRANCH_ID,C.NO_OF_COPIES,A.AUTHOR_NAME FROM BOOK_COPIES C  NATURAL JOIN BOOK B  LEFT JOIN BOOK_AUTHORS A ON B.isbn=A.isbn GROUP BY isbn,BRANCH_ID) AS T1 ON (L.isbn=T1.isbn AND L.BRANCH_ID=T1.BRANCH_ID)";
		String query_begin = "SELECT T1.isbn,T1.TITLE,T1.BRANCH_ID,fullname,no_of_copies,T1.branch_name  FROM book_loans L  RIGHT JOIN (select c.branch_id , c.no_of_copies, lb.branch_name,bk.isbn, bk.title, au.fullname  from (library_branch lb left join ( book_copies c left join (book bk left join (book_authors ba left join  authors au  on ba.author_id = au.author_id ) on bk.isbn=ba.isbn  ) on bk.isbn= c.isbn  ) on c.branch_id = lb.branch_id )) as T1 ON (L.isbn=T1.isbn AND L.BRANCH_ID=T1.BRANCH_ID)";
		JButton btnSearchButton = new JButton("Search");
		btnSearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	        		searchScrollPane.setVisible(false);
	        		label_search.setVisible(false);
	       			table.setEnabled(false);
	        		DefaultTableModel model3 = (DefaultTableModel) table.getModel();
					model3.setRowCount(0);
					   String book_id= textField_bookid.getText();	//store input from book id text box
					   String author= textField_author.getText();	//store input from  author text box
			  		   String title= textField_title.getText();		//store input from  author text box
			  		   String query = null;
			  		   int count = 1;
			  		 if(!book_id.isEmpty() && !author.isEmpty() && !title.isEmpty()){
			  			query = query_begin+" WHERE T1.isbn LIKE '%"+book_id+"%' OR T1.fullname LIKE '%"+author+"%' OR T1.TITLE LIKE '%"+title+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else if(!book_id.isEmpty() && !author.isEmpty()&& title.isEmpty()){
			  			query = query_begin+"  WHERE T1.isbn LIKE '%"+book_id+"%' OR T1.fullname LIKE '%"+author+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else if(!author.isEmpty() && !title.isEmpty() && book_id.isEmpty()){
			  			query = query_begin+" WHERE T1.fullname LIKE '%"+author+"%' OR T1.TITLE LIKE '%"+title+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else if(!book_id.isEmpty() && !title.isEmpty() && author.isEmpty()){
			  			query = query_begin+" WHERE T1.isbn LIKE '%"+book_id+"%' OR T1.TITLE LIKE '%"+title+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else if(!book_id.isEmpty() && author.isEmpty() && title.isEmpty()){
			  			query = query_begin+" WHERE T1.isbn LIKE '%"+book_id+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else if(book_id.isEmpty() && !author.isEmpty() && title.isEmpty()){
			  			query = query_begin+" WHERE T1.isbn LIKE '%"+author+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else if(book_id.isEmpty() && author.isEmpty() && !title.isEmpty()){
			  			query = query_begin+" WHERE T1.TITLE LIKE '%"+title+"%' GROUP BY T1.isbn,T1.BRANCH_ID;";
			  			}
			  			else{
			  				count = 0;
			  			}
					   if(count > 0){
					   Library library1= new Library();
			    	   ResultSet rs1=library1.Connection(query);		//storing result set
			    	   int count1=0;
			    	   if(!rs1.next())
			    	   {
			    		   label_search.setVisible(true);
			    		   label_search.setText("No books found with given details");
			    		   
			    	   }
			    	   else {
			    	  do{						//displaying result set
			    		   
			    		   count1++;   
			    	   String s1=rs1.getString("isbn");
			    	   String s2=rs1.getString("TITLE");
			    	   String s3=rs1.getString("fullname");
			    	   String s4=rs1.getString("Branch_id");
			    	   String s5=rs1.getString("no_of_copies");
			    	   String s9 = rs1.getString("branch_name");
			    	   String q3= "select c.isbn,c.branch_id,(no_of_copies- count(l.isbn)) as available_copies from book_loans l right join book_copies c on l.isbn=c.isbn where l.branch_id = c.branch_id and l.date_in is null and c.isbn='"+s1+"' and c.branch_id='"+s4+"';";
			    	   Library lib3=new Library();
			    	   ResultSet rs3= lib3.Connection(q3);
			    	   if(rs3.next()){
			    		  
			    	   String s6 = rs3.getString("AVAILABLE_COPIES");
			    	   if(Integer.parseInt(s6)<=0)
			    		   s6= "0";
			    	   System.out.println(Integer.parseInt(s6));
			    	   model3.addRow(new Object[]{s1,s2,s3,s4,s9,s5,s6	});//adding arow to jtable
					   searchScrollPane.setVisible(true);      
			    	   Book_Search.revalidate();
			    	   }
			    	   }while(rs1.next());
			    	   }
			    	   rs1.close();
					   }
					   else{
			    		   label_search.setVisible(true);
			    		   label_search.setText("Please enter atleast one of the field");
			    		
			    	   }
			    	   textField_bookid.setText("");
			    	   textField_author.setText("");
			    	   textField_title.setText("");
			    	   }
			           catch ( SQLException ex ) {
			           System.out.println( ex.getMessage( ) );
			       }	
			}
		});
		btnSearchButton.setBounds(89, 130, 89, 23);
		Book_Search.add(btnSearchButton);
		searchScrollPane.setBounds(10, 180, 675, 227);
		Book_Search.add(searchScrollPane);
		searchScrollPane.setEnabled(false);
		searchScrollPane.setViewportView(table);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Book ID", "Title", "Authors", "Branch ID", "name", "Total Copies", "Avaiable"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, String.class, Integer.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(58);
		table.getColumnModel().getColumn(4).setPreferredWidth(90);
		table.getColumnModel().getColumn(5).setPreferredWidth(76);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblBookSearch = new JLabel(" BOOK  SEARCH");
		lblBookSearch.setBackground(new Color(255, 255, 0));
		lblBookSearch.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		lblBookSearch.setForeground(Color.DARK_GRAY);
		lblBookSearch.setBounds(306, 11, 147, 14);
		Book_Search.add(lblBookSearch);
		
/*************************************************************************************************************/
/******************************************CHECK OUT*********************************************************/
		textField_chkcard.setColumns(10);
		textField_chkbranch.setColumns(10);
		textField_chkbook.setPreferredSize(new Dimension(15, 20));
		textField_chkbook.setMinimumSize(new Dimension(15, 20));
		textField_chkbook.setColumns(10);
		Book_Loans.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("Check out", null, Book_Loans, null);
		tabbedPane.setDisplayedMnemonicIndexAt(2, 2);
		Book_Loans.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		lblCheckOutBooks.setMaximumSize(new Dimension(150, 14));
		lblCheckOutBooks.setBounds(new Rectangle(10, 10, 10, 10));
		lblCheckOutBooks.setBorder(null);
		lblCheckOutBooks.setForeground(Color.MAGENTA);
		lblCheckOutBooks.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		
		Book_Loans.add(lblCheckOutBooks, "4, 2, center, fill");
		lblBookId_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Book_Loans.add(lblBookId_1, "2, 6, left, default");
		
		Book_Loans.add(textField_chkbook, "4, 6, fill, default");
		lblBranchId.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Book_Loans.add(lblBranchId, "2, 8, left, default");
		
		Book_Loans.add(textField_chkbranch, "4, 8, fill, default");
		lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Book_Loans.add(lblCardNumber, "2, 10, right, default");
		
		Book_Loans.add(textField_chkcard, "4, 10, fill, default");
		btnCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMessage_chkout.setVisible(false);
				String chk_bookid = textField_chkbook.getText();
				String chk_branch = textField_chkbranch.getText();
				String chk_card   = textField_chkcard.getText();
				Library lib_chkout = new Library();
				int loan_no = 0;
				int chkout_count = 0;
				int chkout_count1 =0;
				int ex_id = 0;
/*				try{
	//				if(!chk_bookid.isEmpty() && !chk_branch.isEmpty() && !chk_card.isEmpty()){
					String chkquery = "Select no_of_copies from book_copies where book_id="+chk_bookid+" AND branch_id="+chk_branch+";";
					ResultSet checkout_rs = lib_chkout.Connection(chkquery);
					if(checkout_rs.next()){
						int checkout_1 = Integer.parseInt(checkout_rs.getString(1));
						if(checkout_1>0){
							chkout_count = 1;
							/////query to check valid card id
							String chkquery1 = "Select * from borrower where card_no="+chk_card+";";
							ResultSet checkout_rs1 = lib_chkout.Connection(chkquery);
							if(checkout_rs1.next()){
								chkout_count1 = 1;
							}
							else{
								lblMessage_chkout.setVisible(true);
								lblMessage_chkout.setText("Please enter a valid card number**");
								throw new WrongInputException();
							}
							/////////////////////////////////////////////////////////////
						}
						else{
							lblMessage_chkout.setVisible(true);
							lblMessage_chkout.setText("Please enter a valid Book ID as number of copies are 0 for branch**");
							throw new WrongInputException();
						}
					}
					else{
						lblMessage_chkout.setVisible(true);
						lblMessage_chkout.setText("Please enter a valid combination of book id and barnch id**");
						throw new WrongInputException();
					
					}
				}
					catch(SQLException | WrongInputException ex) {
				           System.out.println("exception" +ex);
				       }*/
		try{

			if(chk_bookid.isEmpty() || chk_branch.isEmpty() || chk_card.isEmpty()){
				lblMessage_chkout.setText("Please enter all required fields *");
				lblMessage_chkout.setVisible(true);
			}
			else{
				String query = "SELECT COUNT(*)FROM BOOK_LOANS WHERE DATE_IN IS NULL AND card_no="+chk_card+";";
				Library lib_chk = new Library();
				ResultSet rs_chk = lib_chk.Connection(query);
				int chk_out=4;
				if(rs_chk.next()){	
					chk_out = Integer.parseInt(rs_chk.getString(1));
				//	System.out.println(chk_out);}
					
				}
					if(chk_out >= 3){
					lblMessage_chkout.setText("Card number has already 3 active checkouts *");
					lblMessage_chkout.setVisible(true);
				}
				else{
				//	System.out.println("1");
					String query90=("select c.isbn,c.branch_id,(no_of_copies- count(l.isbn)) as available_copies from book_loans l right join book_copies c on l.isbn=c.isbn where l.branch_id = c.branch_id and l.date_in is null and c.isbn='"+chk_bookid+"' and c.branch_id='"+chk_branch+"';");
					Library borrower90 = new Library();
					ResultSet rs_loan_no90 = borrower90.Connection(query90);
						if(rs_loan_no90.next()){
							String loan_no90 = rs_loan_no90.getString("available_copies");
							int loan_no91 = Integer.parseInt(loan_no90);
					//		System.out.println(loan_no91);
							if(loan_no91>0){
								String query_loan_no = "SELECT MAX(BOOK_LOANS.Loan_id) AS loan FROM BOOK_LOANS;";
								Library borrower2 = new Library();
								ResultSet rs_loan_no = borrower2.Connection(query_loan_no);
									if(rs_loan_no.next()){
										String loan_no1 = rs_loan_no.getString(1);
										loan_no = Integer.parseInt(loan_no1)+1;
									}
									else{
										loan_no = 111;
									}									
									System.out.println(loan_no);
									System.out.println("check here");
									String chkout_query = "INSERT INTO BOOK_LOANS(LOAN_ID,isbn,branch_id,card_no,Date_out,due_date) VALUES("+loan_no+",'"+chk_bookid+"',"+chk_branch+","+chk_card+",CURDATE(),DATE_ADD(CURDATE(),INTERVAL 14 DAY));";
									Library library3 = new Library();
									int rs_chkout=library3.Connection1(chkout_query);
									if(rs_chkout != 0){
										lblMessage_chkout.setVisible(true);
										lblMessage_chkout.setText(chk_bookid+" Checked out Successfully");
	//			System.out.println(chk_bookid+" Checked out Successfully");
									}
									else{
										lblMessage_chkout.setVisible(true);
										lblMessage_chkout.setText(chk_bookid+" Check out failed. Please try again");
				//		System.out.println(chk_bookid+" Check out failed. Please try again");
									}
							}
							else{
								lblMessage_chkout.setVisible(true);
								lblMessage_chkout.setText("No available Copies for branch*");
							}	
					}					
				}
					
			}

		//	System.out.println("Now the date is :=>  " + dateNow);
			}
		
		
				catch( SQLException ex ) {
			           System.out.println( ex.getMessage( ) );
			       }
			}
		});
		
		Book_Loans.add(btnCheckOut, "4, 14, center, default");
		
		Book_Loans.add(lblMessage_chkout, "2, 16, 7, 1");
/**********************************************************************************************************/
/******************************************CHECK IN********************************************************/		
		DefaultTableModel model4 = new DefaultTableModel(){
			public Class<?> getColumnClass(int column){
				switch(column){
				case 0:
					return Boolean.class;
				case 1:
					return String.class;
				case 2:
					return String.class;
				case 3:
					return String.class;
				case 4:
					return String.class;
				case 5:
					return String.class;
				case 6:
					return String.class;
				default:
					return String.class;
				}
			}
		};
		model4.addColumn("Selection");
		model4.addColumn("Loan_ID");
		model4.addColumn("Isbn");
		model4.addColumn("Branch_ID");
		model4.addColumn("Card__no");
		model4.addColumn("Date_out");
		model4.addColumn("Due_Date");
	//	model4.addColumn("Date_in");
		
		tabbedPane.addTab("Check in ", null, Check_in, null);
		tabbedPane.setDisplayedMnemonicIndexAt(3, 3);
		Check_in.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		lblCheckInBooks.setSize(new Dimension(10, 2));
		lblCheckInBooks.setLocation(new Point(10, 0));
		lblCheckInBooks.setBounds(new Rectangle(10, 10, 10, 10));
		lblCheckInBooks.setBorder(null);
		lblCheckInBooks.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
		lblCheckInBooks.setForeground(new Color(0, 128, 0));
		
		Check_in.add(lblCheckInBooks, "7, 2, left, default");
		lblBookId_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Check_in.add(lblBookId_2, "4, 4, left, default");
		textField_chkinbook.setColumns(10);
		
		Check_in.add(textField_chkinbook, "7, 4, left, default");
		lblCardNumber_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Check_in.add(lblCardNumber_1, "4, 6");
		textField_chkincard.setColumns(10);
		
		Check_in.add(textField_chkincard, "7, 6, left, default");
		lblBorrowerName.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		Check_in.add(lblBorrowerName, "4, 8");
		textField_chkinborrower.setColumns(10);
		JScrollPane scrollPane_chkin = new JScrollPane();
		Check_in.add(textField_chkinborrower, "7, 8, left, default");
		JTable table_chkin_1 = new JTable();
		table_chkin_1.setSurrendersFocusOnKeystroke(true);
		table_chkin_1.setFillsViewportHeight(true);
		
				table_chkin_1.setCellSelectionEnabled(false);
				table_chkin_1.setColumnSelectionAllowed(true);
				table_chkin_1.setRowSelectionAllowed(true);
				
						scrollPane_chkin.setViewportView(table_chkin_1);
							table_chkin_1.setModel(model4);
							
							btnNewButton_1.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent arg0) {
									String chkinbook = textField_chkinbook.getText();
									String chkincard = textField_chkincard.getText();
									String chkinborrower = textField_chkinborrower.getText();
									Library lib_chkin = new Library();
									String chkin_query=null;
								//	String cur_date = "select curdate();";
									
							//	String date_chkin = "select date_in from book_loans where card_no = "+chkincard+" OR isbn='"+chkinbook+"";
							//	System.out.println(cur_date+" "+date_chkin);
								try{
										System.out.println("inside getbooks");
										for(int i=0; i<model4.getRowCount();i++)
											 model4.removeRow(i);
										
										if(chkinbook.isEmpty() && chkincard.isEmpty() && chkinborrower.isEmpty()){
											message_chkin.setText("Please enter any of the above fields *");
											message_chkin.setVisible(true);
											throw new WrongInputException();
										}
										else if(!chkinbook.isEmpty()&&!chkincard.isEmpty()&&!chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where card_no="+chkincard+" OR isbn='"+chkinbook+"' OR CONCAT(Fname,Lname) like '%"+chkinborrower+"%';"; 
											}
										else if(!chkinbook.isEmpty()&&!chkincard.isEmpty()&&chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where card_no="+chkincard+" OR isbn='"+chkinbook+"';"; 
										}
										else if(chkinbook.isEmpty()&&!chkincard.isEmpty()&&!chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where card_no="+chkincard+" OR CONCAT(Fname,Lname) like '%"+chkinborrower+"%';"; 
										}
										else if(!chkinbook.isEmpty()&&chkincard.isEmpty()&&!chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where isbn="+chkinbook+" OR CONCAT(Fname,Lname) like '%"+chkinborrower+"%';"; 
										}
										else if(!chkinbook.isEmpty()&&chkincard.isEmpty()&&chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where isbn="+chkinbook+";";
										}
										else if(chkinbook.isEmpty()&&!chkincard.isEmpty()&&chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where card_no="+chkincard+";"; 
										}
										else if(chkinbook.isEmpty()&&chkincard.isEmpty()&&!chkinborrower.isEmpty()){
											chkin_query = "SELECT * from book_loans natural join borrower where CONCAT(Fname,Lname) like '%"+chkinborrower+"%';"; 
										}
										if(chkin_query == null){
											throw new WrongInputException();
										}
											System.out.println("before rs");
											ResultSet rs_chkin = lib_chkin.Connection(chkin_query);
											while(rs_chkin.next()){
									
												String r1 = rs_chkin.getString("Loan_id");
												String r2 = rs_chkin.getString("isbn");
												String r3 = rs_chkin.getString("Branch_id");
												String r4 = rs_chkin.getString("Card_no");
												String r5 = rs_chkin.getString("Date_out");
												String r6 = rs_chkin.getString("Due_date");
												String r7= rs_chkin.getString("Date_in");
							                    Object[] ob1={false, r1,r2,r3,r4,r5,r6};
							                    
							                    String curdate = "select curdate();";
												ResultSet curdate1 = lib_chkin.Connection(curdate);
												
											//	int dt1 = Integer.parseInt(r7);
												System.out.println("begor msg");
													if(r7==null){
														message_chkin.setText("");
														model4.addRow(ob1);	//adding a row to jtable
														scrollPane_chkin.setVisible(true);      
												    	Check_in.revalidate();
												
													}
													else
													{
													
														message_chkin.setText("Books already checkedin");
														
													}
											}
										
										textField_chkinbook.setText("");
										textField_chkincard.setText("");
										textField_chkinborrower.setText("");
									}
									catch ( SQLException | WrongInputException ex ) {
								           System.out.println( ex.getMessage( ) );
								       }
								}
							});
							btnChkin.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									int count = 0;
									message_chkin.setText("");
									try{
										for(int i=0;i<table_chkin_1.getRowCount();i++){
											
											Boolean checked = Boolean.valueOf(table_chkin_1.getValueAt(i, 0).toString());
											if(checked){
												Library library5 = new Library();
												
												System.out.println(count);
												if(count>1){
													throw new WrongInputException();
												}
												count++;
												String chkin_loan = table_chkin_1.getValueAt(i, 1).toString();
												String query = "UPDATE BOOK_LOANS SET Date_in=CURDATE() WHERE Loan_id='"+chkin_loan+"';";
												//Library library5 = new Library();
												int rs = library5.Connection1(query);
												if(rs!=0){
													message_chkin.setText("Loan ID: " +chkin_loan + " check in Success!!");
													message_chkin.setForeground(Color.blue);
													//System.out.println(model4.getRowCount());
													model4.removeRow(i);
													
												}
												else{
													message_chkin.setText("Loan ID: " +chkin_loan + " check in Failure. Please try again");
													message_chkin.setForeground(Color.RED);
												}
											}
										}
									if(count<1){
										message_chkin.setText("Please Select one of the below books:");
										message_chkin.setForeground(Color.RED);
									}	
									}
									catch(WrongInputException ex){
										System.out.println("Multiple rows selected");
									}
								}
							});
							
							Check_in.add(btnChkin, "4, 12");
							
							Check_in.add(btnNewButton_1, "7, 12, left, default");
							
							Check_in.add(message_chkin, "4, 14, 4, 1");
							
							Check_in.add(lblMessagechkin, "7, 16");
							
							
							Check_in.add(scrollPane_chkin, "2, 18, 9, 1, fill, fill");
/***************************************************************************************************************/
/************************************BORROWER CREATION**********************************************************/
							textField_Zip.setColumns(10);
							textField_Add2.setColumns(10);
							textField_Add1.setColumns(10);
							textField_Fname.setColumns(10);
							
							Borrower.setForeground(Color.RED);
							
							tabbedPane.addTab("Borrower", null, Borrower, null);
							tabbedPane.setDisplayedMnemonicIndexAt(4, 4);
							Borrower.setLayout(new FormLayout(new ColumnSpec[] {
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.RELATED_GAP_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,
									FormFactory.DEFAULT_COLSPEC,},
								new RowSpec[] {
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,
									FormFactory.RELATED_GAP_ROWSPEC,
									FormFactory.DEFAULT_ROWSPEC,}));
							lblNewLabel_2.setForeground(new Color(204, 51, 51));
							lblNewLabel_2.setBorder(null);
							lblNewLabel_2.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
							
							Borrower.add(lblNewLabel_2, "4, 2, 9, 1, center, default");
							lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblFirstName, "2, 6, left, center");
							
							Borrower.add(textField_Fname, "4, 6, 3, 1, fill, default");
							lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblLastName, "12, 6, right, default");
							textField_Lname.setColumns(10);
							
							Borrower.add(textField_Lname, "14, 6, 10, 1, left, default");
							frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{frame.getContentPane(), tabbedPane, Library, lblNewLabel, btnBookSearch, btnCheckInBooks, btnCheckOutBooks, btnBorrower, btnFines, Book_Search, lblNewLabel_1, lblTitle, lblAuthor, textField_bookid, textField_title, textField_author, btnSearchButton, searchScrollPane, table, Book_Loans, lblBookId_1, textField_chkbook, lblBranchId, textField_chkbranch, lblCardNumber, textField_chkcard, btnCheckOut, lblMessage_chkout, Check_in, lblBookId_2, textField_chkinbook, lblCardNumber_1, textField_chkincard, lblBorrowerName, textField_chkinborrower, btnChkin, btnNewButton_1, message_chkin, scrollPane_chkin, table_chkin_1, Borrower, lblFirstName, textField_Fname, lblLastName, textField_Lname, lblAddress, textField_Add1, lblCity, textField_City, lblAddress_1, textField_Add2, lblState, textField_State, lblZip, textField_Zip, lblPhone, textField_Phone, btnCreateBorrower, lblMessage}));
							lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblAddress, "2, 8, left, default");
							
							Borrower.add(textField_Add1, "4, 8, 3, 1, fill, default");
							lblCity.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblCity, "12, 8, left, default");
							textField_City.setColumns(10);
							
							Borrower.add(textField_City, "14, 8, 10, 1, left, default");
							lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblAddress_1, "2, 10, left, default");
							
							Borrower.add(textField_Add2, "4, 10, 3, 1, fill, default");
							lblState.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblState, "12, 10, left, default");
							textField_State.setColumns(10);
							
							Borrower.add(textField_State, "14, 10, 10, 1, left, default");
							lblZip.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblZip, "2, 12, left, default");
							
							Borrower.add(textField_Zip, "4, 12, 3, 1, fill, default");
							btnCreateBorrower.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									lblMessage.setVisible(false);
									String lblFirstName = textField_Fname.getText(); 
									String lblLastName =  textField_Lname.getText();
									String lblAddress =	 textField_Add1.getText();
									String lblCity =	textField_City.getText();
									String lblAddress1 =	textField_Add2.getText(); //ssn
									String lblState =	textField_State.getText();
									String lblZip	=	textField_Zip.getText(); //email
									String lblPhone	=	textField_Phone.getText();
									int card_no; 
									String Address_db = lblAddress;
									try{
								//	if(!lblAddress1.isEmpty()){
								//		Address_db = lblAddress+","+lblCity+","+lblAddress1+","+lblState+","+lblZip;	
								//	}
								//	else{
								//		Address_db = lblAddress+","+lblCity+","+lblState+","+lblZip;
								//	}
										
										if(lblAddress1.matches("^[0-9]{3}\\-[0-9]{2}\\-[0-9]{4}$")){
										Library borrower1 = new Library();
										String ssnquery= "select count(*) form borrower where ssn="+lblAddress1+";";
										ResultSet ssnq = borrower1.Connection(ssnquery);
							
								
											
									String query_existing = "SELECT card_no from BORROWER WHERE  ssn ='"+lblAddress1+"';";//OR  Fname "+lblFirstName+" AND  Lname="+lblLastName+" AND Address= "+Address_db+";";
									
									ResultSet rs_existing = borrower1.Connection(query_existing);
									System.out.println("done");
									
									if(rs_existing.next()){
										System.out.println("entered loop");
										String card_existing = rs_existing.getString(1);
										//System.out.println(card_existing);
										lblMessage.setText("Failed:Borrower already exists with ssn having card number:"+card_existing);
										}
									else{
										System.out.println("entered else");
											String query_card_no = "SELECT MAX(BORROWER.card_no) AS card FROM BORROWER;";
											Library borrower = new Library();
											ResultSet rs_card_no = borrower.Connection(query_card_no);
											//if(!rs_card_no.isBeforeFirst())
												if(rs_card_no.next()){
													String card_no1 = rs_card_no.getString(1);
													card_no = Integer.parseInt(card_no1)+1;
												}
												else{
													card_no = 111;
												}
												if (!lblAddress1.isEmpty() && !lblAddress.isEmpty() && !lblFirstName.isEmpty() && !lblLastName.isEmpty() && !lblCity.isEmpty() && !lblState.isEmpty())
													//if(!lblAddress1.isEmpty() && !lblFirstName.isEmpty() && !lblLastName.isEmpty() && !lblAddress.isEmpty() && !lblCity.isEmpty() && !lblZip.isEmpty() && !lblState.isEmpty() && !lblPhone.isEmpty()){
													{	
													String query = "INSERT INTO BORROWER(Card_no,ssn,Fname,Lname,email,Address,city,state,Phone) VALUES("+card_no+",'"+lblAddress1+"','"+lblFirstName+"','"+lblLastName+"','"+lblZip+"','"+lblAddress+"','"+lblCity+"','"+lblState+"','"+lblPhone+"');";
														Library library2= new Library();
														int affectedrows=library2.Connection1(query);
															if(affectedrows != 0){
													
																lblMessage.setText("Borrower created with card number : "+card_no);
											//					System.out.println("Borrower created with card number : "+card_no);
															}
															else{
																lblMessage.setText("Fail to create Borrower. Please try again");
										//						System.out.println("Fail to create Borrower. Please try again");
															}
													}
													else{
													lblMessage.setText("Please enter all required fields *");
										//		System.out.println("Please enter all required fields *");
													}
												
										}
										}
										else{
											lblMessage.setText("please enter ssn in valid format");
										}
									lblMessage.setVisible(true);
									textField_Fname.setText(""); 
									textField_Lname.setText("");
									textField_Add1.setText("");
									textField_City.setText("");
									textField_Add2.setText("");
									textField_State.setText("");
									textField_Zip.setText("");
									textField_Phone.setText("");
									}
									//}
									catch( SQLException ex ) {
												           System.out.println( ex.getMessage( ) );
												       }	
								}
							});
							lblPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
							
							Borrower.add(lblPhone, "12, 12, left, default");
							textField_Phone.setColumns(10);
							
							Borrower.add(textField_Phone, "14, 12, 10, 1, left, default");
							
							Borrower.add(btnCreateBorrower, "4, 14");
							
							Borrower.add(lblMessage, "2, 16, 24, 1, fill, default");
							
						//	-----------------------------------------------------------------------
							//********************************FINES*********************************************
							//-------------------------------------------------------------------------------
							
						//	JPanel login = new JPanel();
							
							tabbedPane.addTab("Fines", null, login, null);
							login.setLayout(null);

							JScrollPane scrollPane_fines = new JScrollPane();
							scrollPane_fines.setBounds(72, 217, 517, 187);
							login.add(scrollPane_fines);
							JLabel lblLoanId = new JLabel("Loan Id*");
							lblLoanId.setBounds(94, 39, 70, 14);
							login.add(lblLoanId);
							JLabel lblfinemsg = new JLabel("New label");
							lblfinemsg.setBounds(181, 165, 316, 14);
							login.add(lblfinemsg);
							textField_2_loanid = new JTextField();
							textField_2_loanid.setBounds(176, 36, 86, 20);
							login.add(textField_2_loanid);
							textField_2_loanid.setColumns(10);
							table_1_fines = new JTable();
							table_1_fines.setModel(new DefaultTableModel(
								new Object[][] {
								},
								new String[] {
									"card number", "fine amount(in dollars)", "Is paid?"
								}
							));
							table_1_fines.getColumnModel().getColumn(0).setPreferredWidth(107);
							table_1_fines.getColumnModel().getColumn(1).setPreferredWidth(133);
							scrollPane_fines.setViewportView(table_1_fines);
							DefaultTableModel dm = (DefaultTableModel) table_1_fines.getModel();
							
							lblfinemsg.setText("");
							JButton btnUpdateFines = new JButton("Update Fines");
							btnUpdateFines.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									//*******************************************
									Library lib = new Library();
									ResultSet rs, rs1;
									
									try{
										String query = "SELECT loan_id from book_loans where date_in IS NULL;";
	
										 rs= lib.Connection(query);
								/***************************************************************************************/		
										while(rs.next()){
											String fine_id= rs.getString("Loan_id");
										
											String query1 = "SELECT  datediff(CURDATE(),due_date)*0.25 as result from book_loans where loan_id = "+fine_id+";";
											//Library lib1 = new Library();
											 rs1 = lib.Connection(query1);
											if(rs1.next()){
											float fine_amt = Float.parseFloat(rs1.getString(1));
									
											if(fine_amt<0){
												lblfinemsg.setVisible(true);
												lblfinemsg.setText("fines updated successfully!!!");
												
											}
											else{
										
												String query3 = "Select * from fines where loan_id = "+fine_id+";";
											//	Library lib2 = new Library();
												 ResultSet rs2 = lib.Connection(query3);
											
												if(rs2 != null){
													String query4 = "UPDATE FINES SET FINE_AMT="+fine_amt+" where loan_id = "+fine_id+";";
													//Library lib3 = new Library();
												//	int rs3 = lib3.Connection1(query4);
													if(lib.Connection1(query4) !=0){
												//		System.out.println("Fines Updated Successfully");
														lblfinemsg.setVisible(true);
														lblfinemsg.setText("Fines Updated Successfully");
													}
													else{
													//	System.out.println("entered correctly");
														String query6 = "INSERT INTO FINES VALUES("+fine_id+","+fine_amt+",0);";
													//	Library lib6 = new Library();
													//	int rs6 =  lib6.Connection1(query6);
														if(lib.Connection1(query6) !=0){
															lblfinemsg.setVisible(true);
															lblfinemsg.setText("Loan_id :" + fine_id + " Added Successfullly");
												//			System.out.println("Loan_id :" + fine_id + " Added Successfullly");
														}
														else{
															lblfinemsg.setVisible(true);
															lblfinemsg.setText("Loan_id :" + fine_id + " Failed to add");
												//			System.out.println("Loan_id :" + fine_id + " Failed to add");
														}
													}	
												}
											}
											
										}
											else{
											//	System.out.print(rs1.getString(1));
												lblfinemsg.setVisible(true);
												lblfinemsg.setText("fines updated successfully...");
												}
								}
									}
							
								catch(Exception e4)
								{
									
								}
									
									
										
									
									
									
									//*******************************************************
								}		
							});
							
							
							btnUpdateFines.setBounds(499, 35, 130, 23);
							login.add(btnUpdateFines);
							
							JComboBox comboBox = new JComboBox();
							comboBox.setModel(new DefaultComboBoxModel(new String[] {"[Select]", "Yes", "No"}));
							comboBox.setBounds(143, 103, 70, 20);
							login.add(comboBox);
							
							
							
							JLabel lblPaid = new JLabel("paid?");
							lblPaid.setBounds(85, 106, 48, 14);
							login.add(lblPaid);
						//	DefaultTableModel dm = (DefaultTableModel) table_1_fines.getModel();
							JButton btnUpdate = new JButton("Update ");
							btnUpdate.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									//############################################
									
									String loan_fine = textField_2_loanid.getText();
									String combo = comboBox.getSelectedItem().toString();
									Library lib_fine = new Library();
									int paid_fine = 0;
									if(!loan_fine.isEmpty()){
									if(combo=="Yes"){
										paid_fine = 1;
									}
									else if(combo=="No"){
										paid_fine=0;
									}
								/*	else{
										lblfinemsg.setVisible(true);
										lblfinemsg.setText("Please select paid Yes/No:");
								//		System.out.println("Please select paid Yes/No:");
									}*/
									if(combo=="Yes" || combo=="No"){
									try {
										String fine_query = "SELECT * FROM FINES WHERE loan_id="+loan_fine+" AND paid=0;";
										ResultSet fine_rs = lib_fine.Connection(fine_query);
										
										if(fine_rs.next()){
											System.out.println("loan fine is"+loan_fine);
											String fine_query1 = "SELECT * FROM BOOK_LOANS WHERE loan_id="+loan_fine+" AND date_in is null;";
											ResultSet fine_rs1 = lib_fine.Connection(fine_query1);
											if(fine_rs1.next()){
												lblfinemsg.setVisible(true);
												lblfinemsg.setText("cannot pay fine untill book is returned");
										//	System.out.println("cannot pay fine untill book is returned");	
											}	
											else{
												
												String fine_query2 = "UPDATE FINES SET PAID="+paid_fine+" WHERE LOAN_ID="+loan_fine+";";
												int fine_rs2 = lib_fine.Connection1(fine_query2);
												if(fine_rs2 !=0){
													lblfinemsg.setVisible(true);
													lblfinemsg.setText("paid successfuly updated for loan id:"+loan_fine);
										//			System.out.println("paid successfuly updated for loan id:"+loan_fine);
												}
												else{
													lblfinemsg.setVisible(true);
													lblfinemsg.setText("Failed to update paid for loan id:"+loan_fine);
											//		System.out.println("Failed to update paid for loan id:"+loan_fine);
												}
											}
										}
										else{
											lblfinemsg.setVisible(true);
											lblfinemsg.setText("loan id not found or fine already paid");
									//		System.out.println("loan id not found or fine already paid");
										}
										
									}	
									
									
									 catch (SQLException exp) {
										exp.printStackTrace();
									}
									}
									else
									{
										lblfinemsg.setVisible(true);
										lblfinemsg.setText("Please select paid Yes/No:");
										
									}
									}
									else
									{
										lblfinemsg.setVisible(true);
										lblfinemsg.setText("enterloanid");
										
									}
									
									
									//############################################################
									
								}
							});
							btnUpdate.setBounds(248, 102, 89, 23);
							login.add(btnUpdate);
							
							
							
							btngetfinedetails.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									for(int i=0; i<dm.getRowCount();i++)
										dm.removeRow(i);
									
									String loanid= textField_2_loanid.getText();
									System.out.println(loanid);
									if(!loanid.isEmpty()) {
									String query = "select * from fines where loan_id='"+loanid+"' ;";
									Library lib= new Library();
									ResultSet rs= lib.Connection(query);
									try {
										
										if(rs.next())
										{
											System.out.println("entered if of details");
											String lid= rs.getString("loan_id");
											String qu ="select card_no from book_loans where loan_id='"+lid+"';";
											ResultSet r=lib.Connection(qu);
											String cno = "111";
											if(r.next())
											{
												 cno= r.getString("card_no");
											}
											String paid = rs.getString("paid");
											String fineamt=rs.getString("fine_amt");
											
											if(paid.equals("0"))
											{
												paid="No";
											}
											else
											{
												paid="Yes";
											}
											
											Object obj[] = {cno, fineamt,paid};
											dm.addRow(obj);
											
										}
										else
										{
											System.out.println("entered if of details");
											lblfinemsg.setVisible(true);
											lblfinemsg.setText("you dont have fines");
										}
									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
									
								}
									else
									{
										lblfinemsg.setVisible(true);
										lblfinemsg.setText("enter loan id");
									}
								}
								
							});
							btngetfinedetails.setBounds(289, 35, 130, 23);
							
							login.add(btngetfinedetails);
							lblFines.setFont(new Font("Imprint MT Shadow", Font.BOLD, 15));
							lblFines.setForeground(new Color(128, 0, 128));
							lblFines.setBounds(58, 11, 75, 14);
							
							login.add(lblFines);
							
							
						
						
							
							
							
							
								}
	}
/*********************************************************************************************************************/
/*********************************************************************************************************************/