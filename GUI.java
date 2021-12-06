import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    JButton calculate,clear;
    JLabel x,y,z;
    JTextField i, j, k,ans;
    GUI(){
        this.setLayout(new GridLayout(3,1,5,5));

        JPanel three = new JPanel(new GridLayout(1,1,5,5));
        ans = new JTextField();
        ans.setEditable(false);
        three.add(ans);

        //set the first grid on left
        JPanel one = new JPanel(new GridLayout(3,2,5,5));

        //init JLabel
        x = new JLabel("X-axis");
        y = new JLabel("Y-axis");
        z = new JLabel("Z-axis");

        //init JTextField
        i = new JTextField();
        j = new JTextField();
        k = new JTextField();

        //Add to
        one.add(x);one.add(i);
        one.add(y);one.add(j);
        one.add(z);one.add(k);

        //set second grid on left
        JPanel two = new JPanel(new GridLayout(1,2,5,5));

        //init Jbutton
        calculate = new JButton("Calculate");
        clear = new JButton("Clear");

        //Add Action Listener
        calculate.addActionListener(this);
        clear.addActionListener(this);

        two.add(calculate);
        two.add(clear);

        this.add(three);
        this.add(one);
        this.add(two);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calculate){
            double a=Double.parseDouble(i.getText());
            double s=Double.parseDouble(j.getText());
            double d=Double.parseDouble(k.getText());
            ans.setText(String.valueOf(a*s*d));
        }
        if(e.getSource()==clear){
            i.setText("");
            j.setText("");
            k.setText("");
            ans.setText("");
        }
    }
}
