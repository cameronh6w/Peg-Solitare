import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class boardtest extends JFrame {
    
    
    
    
    
    
    
    //global variables so Action Listener can access them 
    private JButton[][] buttons = new JButton[7][7];


    private int[][] boardState = {
        {-1, -1, 1, 1, 1, -1, -1},
        {-1, 1, 1, 1, 1, 1, -1},
        {1, 1, 1, 1, 1, 1, 1},
        {1, 1, 1, 0, 1, 1, 1}, // Center hole is empty initially
        {1, 1, 1, 1, 1, 1, 1},
        {-1, 1, 1, 1, 1, 1, -1},
        {-1, -1, 1, 1, 1, -1, -1}
    };

    
    boardtest(){

        // 1. Set the main Frame's layout to BorderLayout (default for Frame)
        setLayout(new BorderLayout());

    
        JButton new_game_button = new JButton();
        new_game_button.setText("New Game");
        add(new_game_button, BorderLayout.EAST);

        // 3. Create a Panel for the South region and set its layout to GridLayout
        Panel centerPanel = new Panel();
        //southPanel.setLayout(new GridLayout(1, 3)); // 1 row, 3 columns
        centerPanel.setLayout(new GridLayout(7,7));


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (boardState[i][j] != -1) {
                    buttons[i][j] = new JButton();
                    
                    
                    // Set initial text or appearance based on boardState[i][j]
                    buttons[i][j].setText(boardState[i][j] == 1 ? "P" : "O"); // "P" for Peg, "O" for Empty
                    

                    //buttons[i][j].addActionListener(new PegListener(i, j)); // Add an action listener
                    centerPanel.add(buttons[i][j]);
                    //add(buttons[i][j]);
                } else {
                    centerPanel.add(new Label("")); // Add an empty label for inaccessible areas
                }
            }
        }

        // 5. Add the southPanel to the main Frame's South region
        add(centerPanel, BorderLayout.CENTER);



         //create a title with a black border at the top of the frame
        JLabel board_title = new JLabel();
        board_title.setText("Board Type");
        board_title.setFont(new Font("MV  Boli", Font.PLAIN,16));
        board_title.setOpaque(true);
        board_title.setBounds(0,75,250,30);
        
        // Create the radio buttons 
        JRadioButton eng_rb,hex_rb,diam_rb;
        eng_rb = new JRadioButton("English");
        eng_rb.setBounds(0,100,150,50);
        
        hex_rb = new JRadioButton("Hexagon");
        hex_rb.setBounds(0,125,150,50);
        
        diam_rb = new JRadioButton("Diamond");
        diam_rb.setBounds(0,150,150,50);
    
     
        // Group the radio buttons. This ensures only one is selectable.
        ButtonGroup group = new ButtonGroup();
        group.add(eng_rb);
        group.add(hex_rb);
        group.add(diam_rb);

        add(board_title, BorderLayout.WEST);
        add(eng_rb, BorderLayout.WEST);
        add(hex_rb, BorderLayout.WEST);
        add(diam_rb, BorderLayout.WEST);


       
       

      




        //additional frame settinigs
        this.setSize(700, 500);
        this.setTitle("Sprint 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        this.setVisible(true);  
    }


}