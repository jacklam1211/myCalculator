import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Calculator extends JFrame implements ActionListener {
    ArrayList<JButton> numberPad;
    JButton add,sub,div,mul,eql,dot,clear;
    JTextArea display;
    String ans="0";
    int flag = 0;//0 1 2 3 4
    ArrayList<Double> ansStore = new ArrayList<>();
    Calculator(){
        numberPad = new ArrayList<>();
        this.setLayout(new GridLayout(2,1,5,5));

        //init button and textarea
        for (int i = 0; i < 10; i++) {
            numberPad.add(new JButton(String.valueOf(i)));
        }
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eql = new JButton("=");
        dot = new JButton(".");
        clear = new JButton("Clear");
        display = new JTextArea();
        display.setEditable(false);

        //set Layout
        JPanel first = new JPanel(new GridLayout(1,1,5,5));
        first.add(display);

        JPanel second = new JPanel(new GridLayout(5,4,5,5));
        second.add(clear);
        second.add(clear);
        second.add(clear);
        second.add(clear);
        second.add(numberPad.get(7));
        second.add(numberPad.get(8));
        second.add(numberPad.get(9));
        second.add(div);
        second.add(numberPad.get(4));
        second.add(numberPad.get(5));
        second.add(numberPad.get(6));
        second.add(mul);
        second.add(numberPad.get(1));
        second.add(numberPad.get(2));
        second.add(numberPad.get(3));
        second.add(sub);
        second.add(numberPad.get(0));
        second.add(dot);
        second.add(eql);
        second.add(add);
        this.add(first);
        this.add(second);

        //add Listener
        for (int i = 0; i < 10; i++) {
            numberPad.get(i).addActionListener(this);
        }

        div.addActionListener(this);
        mul.addActionListener(this);
        sub.addActionListener(this);
        add.addActionListener(this);
        dot.addActionListener(this);
        eql.addActionListener(this);
        clear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clear){
            flag=0;
            ans="0";
            ansStore=new ArrayList<>();
            display.setText(ans);
            System.gc();
        }
        if(e.getSource()==numberPad.get(0)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("0");
                }else {
                    ans="0";
                }
            }else{
                ans+=("0");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(1)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("1");
                }else {
                    ans="1";
                }
            }else{
                ans+=("1");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(2)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("2");
                }else {
                    ans="2";
                }
            }else{
                ans+=("2");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(3)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("3");
                }else {
                    ans="3";
                }
            }else{
                ans+=("3");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(4)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("4");
                }else {
                    ans="4";
                }
            }else{
                ans+=("4");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(5)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("5");
                }else {
                    ans="5";
                }
            }else{
                ans+=("5");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(6)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("6");
                }else {
                    ans="6";
                }
            }else{
                ans+=("6");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(7)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("7");
                }else {
                    ans="7";
                }
            }else{
                ans+=("7");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(8)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("8");
                }else {
                    ans="8";
                }
            }else{
                ans+=("8");
            }
            display.setText(ans);
        }
        if(e.getSource()==numberPad.get(9)){
            if(ans.charAt(0)=='0'){
                if(ans.contains(".")){
                    ans+=("9");
                }else {
                    ans="9";
                }
            }else{
                ans+=("9");
            }
            display.setText(ans);
        }
        if(e.getSource()==div){
            ansStore.add(Double.parseDouble(ans));
            calculate(flag);
            flag = 4;
            ans="0";
            display.setText(String.valueOf(ansStore.get(0)));
        }
        if(e.getSource()==mul){
            ansStore.add(Double.parseDouble(ans));
            calculate(flag);
            flag = 3;
            ans="0";
            display.setText(String.valueOf(ansStore.get(0)));
        }
        if(e.getSource()==sub){
            ansStore.add(Double.parseDouble(ans));
            calculate(flag);
            flag = 2;
            ans="0";
            display.setText(String.valueOf(ansStore.get(0)));
        }
        if(e.getSource()==add){
            ansStore.add(Double.parseDouble(ans));
            calculate(flag);
            flag = 1;
            ans="0";
            display.setText(String.valueOf(ansStore.get(0)));
        }
        if(e.getSource()==dot){
            if(!ans.contains(".")){
                ans+=".";
            }
            display.setText(ans);
        }
        if(e.getSource()==eql){
            ansStore.add(Double.parseDouble(ans));
            calculate(flag);
            ans="0";
            flag=0;
            display.setText(String.valueOf(ansStore.get(0)));
        }
    }

    private void calculate(int flag){
        System.out.println("START");
        System.out.println(ansStore.size());
        System.out.println(ansStore.toString());
        if(ansStore.size()==2){
            //add
            if (flag==1){
                ansStore.set(0,ansStore.get(0)+ansStore.get(1));
            }
            //sub
            if (flag==2){
                ansStore.set(0,ansStore.get(0)-ansStore.get(1));
            }
            //mul
            if (flag==3){
                ansStore.set(0,ansStore.get(0)*ansStore.get(1));
            }
            //div
            if (flag==4){
                ansStore.set(0,ansStore.get(0)/ansStore.get(1));
            }
            ansStore.remove(1);
            ansStore.trimToSize();
        }
        System.out.println("END");
        System.out.println(ansStore.size());
        System.out.println(ansStore.toString());
    }
}
