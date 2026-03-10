import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
    //global variables so Action Listener can access them 
    JButton new_game_button;
    JRadioButton eng_rb,hex_rb,diam_rb;

    
    MyFrame(){
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
    
       
        //creates button that turns the square red
        new_game_button = new JButton();
        new_game_button.setBounds(550,100, 100,50);
        new_game_button.addActionListener(this);
        new_game_button.setText("New Game");

       
        eng_rb.addActionListener(this);
        hex_rb.addActionListener(this);
        diam_rb.addActionListener(this);

        // Group the radio buttons. This ensures only one is selectable.
        ButtonGroup group = new ButtonGroup();
        group.add(eng_rb);
        group.add(hex_rb);
        group.add(diam_rb);


       

        
        

        //add  all items into the frame
        this.add(board_title);
        this.add(new_game_button);
        this.add(eng_rb);
        this.add(hex_rb);
        this.add(diam_rb);
       

        //additional frame settinigs
        this.setSize(700, 500);
        this.setTitle("Sprint 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);  
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == new_game_button){
           
            
        }
        /* 
        //changes the color of the output square based on the input
        if(e.getSource() == checkBox){
            System.out.println("checkBox" + checkBox.isSelected());
            outputSquare.setVisible(checkBox.isSelected());
        }  
        
        if(e.getSource() == rb1){
            System.out.println("rb1");
            outputSquare.setBackground(Color.BLUE);
        }
         if(e.getSource() == rb2){
            System.out.println("rb2");
            outputSquare.setBackground(Color.GREEN);
        }
         if(e.getSource() == rb3){
            System.out.println("rb3");
            outputSquare.setBackground(Color.YELLOW);
        }  
            */
    }
}