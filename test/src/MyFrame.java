import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
    //global variables so Action Listener can access them
    JButton button;
    JPanel outputSquare;
    JRadioButton rb1,rb2,rb3;
    JCheckBox checkBox;
    
    MyFrame(){
        //create a title with a black border at the top of the frame
        JLabel title = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.BLACK);
         
        title.setText("Sample  Java GUI");
        title.setFont(new Font("MV  Boli", Font.PLAIN,20));
        title.setOpaque(true);
        title.setVerticalAlignment(JLabel.TOP);
        title.setBorder(border);

        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(100,0,250,30);

       
        //the output square is a panel that changes color based on the buttons
        outputSquare = new JPanel();
        outputSquare.setBackground(Color.BLACK);
        outputSquare.setBounds(100,100,100,100);
      
        //creates button that turns the square red
        button = new JButton();
        button.setBounds(400,100,100,50);
        button.addActionListener(this);
        button.setText("Red");

        // Create the radio buttons 
        rb1 = new JRadioButton("Blue");
        rb1.setBounds(0,200,150,50);
        rb2 = new JRadioButton("Green");
        rb2.setBounds(0,250,150,50);
        rb3 = new JRadioButton("Yellow");
        rb3.setBounds(0,300,150,50);
    
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        // Group the radio buttons. This ensures only one is selectable.
        ButtonGroup group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        

        //checkbox that changes the square's visibility
        checkBox = new JCheckBox("Visible", true);
        checkBox.setBounds(0,0,100,100);
        checkBox.addActionListener(this);

       
        //add  all items into the frame
        this.add(title);
        this.add(button);
        this.add(outputSquare);
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(checkBox);

        //additional frame settinigs
        this.setSize(500, 500);
        this.setTitle("Sprint 0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);  
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //changes the color of the output square based on the input
        if(e.getSource() == checkBox){
            System.out.println("checkBox" + checkBox.isSelected());
            outputSquare.setVisible(checkBox.isSelected());
        }  
        if(e.getSource() == button){
            System.out.println("button");
            outputSquare.setBackground(Color.RED);
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
    }
}