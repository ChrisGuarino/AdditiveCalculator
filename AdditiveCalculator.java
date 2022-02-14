import javax.swing.JFrame;
import javax.swing.JButton; 
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Dimension; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class AdditiveCalculator extends JFrame implements ActionListener{
        JTextField bath_box,standard_box,bath_ideal_box,standard_ideal_box,volume_box;
        JLabel bath_label,standard_label,bath_ideal_label,standard_ideal_label,volume_label;
        // private JTextField standard_ideal_text;
        public static void main(String[] args){
            new AdditiveCalculator().display(); 
        }
        private void display(){
            setSize(new Dimension(400, 300)); 
            Container c = getContentPane(); 
            c.setLayout(null);
            
            JButton button = new JButton("Show"); 
            button.setBounds(25,140,100,20);
            button.addActionListener(this);
            
            bath_box = new JTextField(); 
            bath_box.setBounds(65,40,100,20);
            standard_box = new JTextField(); 
            standard_box.setBounds(65,60,100,20);
            bath_ideal_box = new JTextField(); 
            bath_ideal_box.setBounds(65,80,100,20);
            standard_ideal_box = new JTextField(); 
            standard_ideal_box.setBounds(65,100,100,20);
            volume_box = new JTextField(); 
            volume_box.setBounds(65,120,100,20);
            bath_label = new JLabel("Bath"); 
            bath_label.setBounds(25,40,100,20);
            standard_label = new JLabel("Standard");
            standard_label.setBounds(25,60,100,20); 
            bath_ideal_label = new JLabel("Bath Ideal"); 
            bath_ideal_label.setBounds(25,80,100,20);
            standard_ideal_label = new JLabel("Standard Ideal"); 
            standard_ideal_label.setBounds(25,100,100,20); 
            volume_label = new JLabel("Volume"); 
            volume_label.setBounds(25,120,100,20);
            c.add(button);
            c.add(bath_box);
            c.add(bath_label);
            c.add(standard_box);
            c.add(standard_label);
            c.add(bath_ideal_box);
            c.add(bath_ideal_label);
            c.add(standard_ideal_box);
            c.add(standard_ideal_label); 
            c.add(volume_box); 
            c.add(volume_label);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent evt){
            String s = evt.getActionCommand(); 
            String bath_text = bath_box.getText(); 
            String standard_text = standard_box.getText(); 
            String bath_ideal_text = bath_ideal_box.getText(); 
            String standard_ideal_text = standard_ideal_box.getText(); 
            String volume_text = volume_box.getText(); 
            //Casting
            int bath_num = Integer.parseInt(bath_text);
            int standard_num = Integer.parseInt(standard_text);
            int bath_ideal_num = Integer.parseInt(bath_ideal_text);
            int standard_ideal_num = Integer.parseInt(standard_ideal_text);
            int volume_num = Integer.parseInt(volume_text);

            if (bath_text == ""){
                bath_box.setText("Enter measured Bath value.");
            }
            else if (standard_text == ""){
                standard_box.setText("Enter measured Standard value.");
            } 
            else if (bath_ideal_text == ""){ 
                bath_ideal_box.setText("Enter measured Target Bath value."); 
            }  
            else if (standard_ideal_text == ""){
                standard_ideal_box.setText("Enter measured Target Standard value.");
            }
            else if (volume_text == ""){
                standard_ideal_box.setText("Enter bath volume.");
            }
            else{
                Calculations run_calc = new Calculations();
                int num = run_calc.additiveCalculation(bath_num, standard_num, bath_ideal_num, standard_ideal_num, volume_num);
                System.out.println(num);
            }

        }
}
