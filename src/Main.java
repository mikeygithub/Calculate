import java.awt.*;
import java.awt.event.*;
class calculator extends WindowAdapter implements ActionListener// implements Frame{
{
    public static TextField t;
    @Override
    public void windowClosing(WindowEvent e) {//监听关闭窗口
        System.exit(-1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String str1=calculator.t.getText();
        int  num1=Integer.parseInt(str1);

        calculator.t.setText(""+str1);

    }
    public void launch(){//创建gui窗口
            Frame f=new Frame("Calculator");
            Panel p1=new Panel();
            TextField t=new TextField();
            t.addActionListener(new calculator());

            f.setLocation(750,300);
            f.setSize(400,400);
            f.add(t,BorderLayout.NORTH);
            f.add(p1,BorderLayout.CENTER);
            f.setVisible(true);
            f.addWindowListener(new calculator());
            f.setResizable(false);//固定大小
            p1.setLayout(new GridLayout(4,4,5,5));//行列以及间隔

            Button b1=new Button("1");Button b2=new Button("2");
            Button b3=new Button("3");Button b4=new Button("4");
            Button b5=new Button("5");Button b6=new Button("6");
            Button b7=new Button("7");Button b8=new Button("8");
            Button b9=new Button("9");Button b10=new Button("+");
            Button b11=new Button("-");Button b12=new Button("*");
            Button b13=new Button("/");Button b14=new Button("=");
            Button b15=new Button("Delete");Button b16=new Button("0");

            p1.add(b16);p1.add(b1);p1.add(b2);p1.add(b3);
            p1.add(b4);p1.add(b5);p1.add(b6);p1.add(b7);
            p1.add(b8);p1.add(b9);p1.add(b10);p1.add(b11);
            p1.add(b12);p1.add(b13);p1.add(b14);p1.add(b15);

            b1.addActionListener(new calculator());
            b2.addActionListener(new calculator());
            b3.addActionListener(new calculator());
            b4.addActionListener(new calculator());
            b5.addActionListener(new calculator());
            b6.addActionListener(new calculator());
            b7.addActionListener(new calculator());
            b8.addActionListener(new calculator());
            b9.addActionListener(new calculator());
            b10.addActionListener(new calculator());
            b11.addActionListener(new calculator());
            b12.addActionListener(new calculator());
            b13.addActionListener(new calculator());
            b14.addActionListener(new calculator());
            b15.addActionListener(new calculator());
            b16.addActionListener(new calculator());
}
}

public class Main {

    public static void main(String[] args) {
        new calculator().launch();
    }
}
