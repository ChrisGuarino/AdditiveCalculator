import javax.swing.JFrame;
import javax.swing.JButton; 
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.Dimension; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class AdditiveCalculator extends JFrame implements ActionListener{
        JTextField textField;
        public static void main(String[] args){
            new AdditiveCalculator().display(); 
        }
        private void display(){
            setSize(new Dimension(400, 300)); 
            Container c = getContentPane(); 
            c.setLayout(null);
            
            JButton show = new JButton("Show"); 
            show.setBounds(44,40,90,21);
            show.addActionListener(this);
    
            JButton clear = new JButton("Clear");
            clear.setBounds(44,61,90,21); 
            clear.addActionListener(this);
    
            textField = new JTextField(); 
            textField.setBounds(149,40,200,21);
            c.add(show);
            c.add(clear);
            c.add(textField);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent evt){
            String s = evt.getActionCommand(); 
            String text = textField.getText(); 
            text = textField.getText(); 
            if (s.equals("Clear"))
                textField.setText(""); 
            else if (text.equals(""))
                textField.setText("Have a fucked day!");  
            else 
                System.out.println("TEST: "+ text); 

        }
}
