import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
    JButton Red;
    JButton Blue;
    JPanel panel;
    
    MyFrame(){
        JLabel label = new JLabel();

        Border border = BorderFactory.createLineBorder(Color.BLACK);

        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(100,100,100,100);
       
        label.setText("Sample  Java GUI");
        label.setFont(new Font("MV  Booli", Font.PLAIN,20));
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBorder(border);

        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,0,250,30);

        Red = new JButton();
        Red.setBounds(400,100,100,50);
        createButton(Red, "Red");
        //button.addActionListener(e -> System.out.print("test"));

        Blue = new JButton();
        Blue.setBounds(400,160,100,50);
        createButton(Blue, "Blue");
        



        this.add(label);
        this.add(Red);
        this.add(Blue);
        this.add(panel);

        this.setSize(500, 500);
        this.setTitle("Peg Solitare");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == Red){
            System.out.println("Red");
            panel.setBackground(Color.RED);
            //button.setEnabled(false);
        }
        if(e.getSource() == Blue){
            System.out.println("Blue");
            panel.setBackground(Color.BLUE);
            //button.setEnabled(false);
        }
    }

    public void createButton(JButton button, String name){
        button.addActionListener(this);
        button.setText(name);
        //button.setFocusable(false);
    }
}