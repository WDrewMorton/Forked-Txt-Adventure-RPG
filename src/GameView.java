
import java.awt.*;
import javax.swing.*;

public class GameView extends JFrame {

	/**
	 * This class will handle configuring the GUI
	 * 
	 * @author Drew Morton
	 * @date 11/11/17
	 */

	    /**
	     * Creates new form Viewer
	     */
	    public GameView() {
	        initComponents();
	        //setStartVisible();
	    }

	    // Variables declaration - do not modify                     
	    //Start Panel Variables
	    /*
	    private JPanel startPanel;
	    private JButton cheatButton;
	    private JLabel jLabel1;
	    private JLabel jLabel2;
	    private JButton settingsButton;
	    private JButton startGameButton;
	    private JTextField testStart;	    
	    */
	    
	    //Game Panel Variables
	    private JPanel gamePanel;
	    private JButton attackButton;
	    private JButton homeButton;
	    private JButton moveButton;
	    private JTextArea characterStatText;
	    private JTextField moveText;
	    private JTextArea roomTxt;
	   // End of variables declaration                   

	       
	    private void initComponents() {

	    //Set the frame to center and give title 
	    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	    	setTitle("Text Adventure RPG");
	    	setLocationRelativeTo(null);
	    
	    //initStartPanel();
	    initGamePanel();
    	}
/*	    
 * Start Panel - Issue overlaps gamePanel. 
 * TODO: Create as JMenu instead of panel and provide multiple states of the game.
	    private void initStartPanel()
	    {
	    	//StartPanel
	        startPanel = new javax.swing.JPanel();
	        startGameButton = new javax.swing.JButton();
	        settingsButton = new javax.swing.JButton();
	        cheatButton = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        testStart = new javax.swing.JTextField();
	        
	        startPanel.setMinimumSize(new java.awt.Dimension(300, 300));
	        startPanel.setName(""); // NOI18N
	        startPanel.setRequestFocusEnabled(false);

	        startGameButton.setText("Start");
	        startGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                startGameButtonMouseClicked(evt);
	            }
	        });
	        startGameButton.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                startGameButtonKeyPressed(evt);
	            }
	        });

	        settingsButton.setText("Settings");
	        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                settingsButtonMouseClicked(evt);
	            }
	        });
	        settingsButton.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyPressed(java.awt.event.KeyEvent evt) {
	                settingsButtonKeyPressed(evt);
	            }
	        });

	        cheatButton.setText("DEV TEST");

	        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        jLabel1.setText("Weclome to Text Adventure RPG");

	        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
	        jLabel2.setText("Good Luck & Enjoy!");

	        testStart.setText("moveText");

	        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
	        startPanel.setLayout(startPanelLayout);
	        startPanelLayout.setHorizontalGroup(
	            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(startPanelLayout.createSequentialGroup()
	                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(startPanelLayout.createSequentialGroup()
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(jLabel2)
	                        .addGap(71, 71, 71)
	                        .addComponent(cheatButton))
	                    .addGroup(startPanelLayout.createSequentialGroup()
	                        .addGap(161, 161, 161)
	                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(startGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(settingsButton))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
	                        .addComponent(testStart, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap())
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(jLabel1)
	                .addGap(68, 68, 68))
	        );
	        startPanelLayout.setVerticalGroup(
	            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
	                .addGap(62, 62, 62)
	                .addComponent(jLabel1)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
	                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(startGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(testStart, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(settingsButton)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(cheatButton)
	                    .addComponent(jLabel2))
	                .addGap(22, 22, 22))
	        );
	        pack();
	    }
*/	    
	    private void initGamePanel() {
	        gamePanel  = new JPanel();
	    	//gamePanel.setVisible(false);
	        roomTxt = new JTextArea();
	        attackButton = new JButton();
	        homeButton = new JButton();
	        moveButton = new JButton();
	        moveText = new JTextField();
	        characterStatText = new JTextArea();

	        roomTxt.setEditable(false);
	        roomTxt.setBackground(new java.awt.Color(200, 200, 200));
	        roomTxt.setColumns(20);
	        roomTxt.setRows(5);

	        attackButton.setText("Attack");
	        attackButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                attackButtonActionPerformed(evt);
	            }
	        });

	        homeButton.setText("Home");

	        moveButton.setText("Move");
	        moveButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	moveButtonActionPerformed(evt);
	            }
	        });

	        moveText.setText("Move");

	        characterStatText.setBackground(new java.awt.Color(200, 200, 200));
	        characterStatText.setColumns(20);
	        characterStatText.setRows(5);
	        characterStatText.setText("Character Stats will go here ... Coming Soon");
	        
	        gameGuiLayout();
	        pack();
	     	}
	    
	    private void gameGuiLayout()
        {
	    	//TODO: Edit layout so that it can be resized and layout stays the same.
	        //Layout of components
	        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
	        gamePanel.setLayout(gamePanelLayout);
	        gamePanelLayout.setHorizontalGroup(
	            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(gamePanelLayout.createSequentialGroup()
	                .addComponent(characterStatText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(gamePanelLayout.createSequentialGroup()
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(homeButton))
	                    .addGroup(gamePanelLayout.createSequentialGroup()
	                        .addGap(68, 68, 68)
	                        .addComponent(attackButton)
	                        .addGap(0, 0, Short.MAX_VALUE))))
	            .addGroup(gamePanelLayout.createSequentialGroup()
	                .addGap(172, 172, 172)
	                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(gamePanelLayout.createSequentialGroup()
	                        .addComponent(roomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(gamePanelLayout.createSequentialGroup()
	                        .addComponent(moveText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
	                        .addComponent(moveButton)
	                        .addGap(117, 117, 117))))
	        );
	        gamePanelLayout.setVerticalGroup(
	            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(gamePanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(gamePanelLayout.createSequentialGroup()
	                        .addComponent(roomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(moveButton)
	                            .addComponent(moveText))
	                        .addGap(18, 18, 18)
	                        .addComponent(attackButton)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
	                        .addComponent(homeButton))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addComponent(characterStatText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addContainerGap()
	                    //.addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addContainerGap()))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                .addGroup(layout.createSequentialGroup()
	                    .addContainerGap()
	                    //.addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addContainerGap()))
	        );
        }

/*
 * Start Panel Listeners
	    private void startGameButtonKeyPressed(java.awt.event.KeyEvent evt) {                                           
	        // TODO add your handling code here:
	        if (evt.getKeyCode() == evt.VK_S)
	        {
	            //testStart.setText("Start Game");
	        	
	        }
	        
	    }                                          

	    private void startGameButtonMouseClicked(java.awt.event.MouseEvent evt) {                                             
	        // TODO add your handling code here:
	        testStart.setText("Start was clicked");
	    }                                            

	    private void settingsButtonKeyPressed(java.awt.event.KeyEvent evt) {                                          
	        if (evt.getKeyCode() == evt.VK_S)
	        {
	            testStart.setText("Start Game");
	        }
	        else if (evt.getKeyCode() == evt.VK_Z)
	        {
	            testStart.setText("Go To Settings");
	        }
	    }                                         

	    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {                                            
	        testStart.setText("Settings was clicked");
	    }                                           

*/	    
	    private void attackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    	roomTxt.setText("Character attacked");
	    }
	    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        //TODO: This should be on the Controller not View
	    	if (validMove())
	    		roomTxt.setText("Character moved " + moveText.getText());
	    	else
	    		roomTxt.setText("Character is unable to move " + moveText.getText());
	    	
	    	
	    	//Appending will take more time
	    	//roomTxt.append("\nCharacter moved " + moveText.getText());
	    }
	    private boolean validMove()
	    {
	    	String s = moveText.getText().toLowerCase();
	    	
	    	if (s.equals("up") || s.equals("down") || s.equals("left") || s.equals("right"))
	    		return true;
	    	else
	    		return false;
	    }

//TODO: Is this still needed?
	    public void setStartVisible()
	    {
	                java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new GameView().setVisible(true);
	            }
	        });
	    }

	
	}
	
