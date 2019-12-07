package edu.neu.coe.info6205.life.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    JButton jb1,jb2,jb3=null;
    JPanel jp1,jp2,jp3,jp4=null;
    JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6=null;
    public static String patternName;

    public static void main(String[] args) {
        //JFrame MainFrame = new JFrame("Frame");
        MainFrame ui=new MainFrame();
        //ui.setContentPane(new Frame());

        ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ui.pack();
        ui.setVisible(true);
        ui.setSize(400,300);
        //patternName = args.length > 0 ? args[0] : "Blip";
        //patternName = TableDemo.getPatternName()!=null ? TableDemo.getPatternName() : "Blip";


    }

    public MainFrame()
    {

        jb1=new JButton("Play");
        jb1.setForeground(Color.BLUE);
        jb2=new JButton("Patterns");
        jb2.setForeground(Color.BLUE);
        jb3=new JButton("GA");
        jb3.setForeground(Color.BLUE);

        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();

        //jlb1=new JLabel("：");
        //jlb2=new JLabel("");
        //jlb3=new JLabel(TableDemo.getPatternName());
        //jlb3.setForeground(Color.red);
        //jlb4=new JLabel(TableDemo.getPatternName());
        //jlb5=new JLabel(new MainUI().tea_name);
        //jlb6=new JLabel(new MainUI().tea_num);

        //jp1.add(jlb1);
        //jp1.add(jlb5);
        //jp1.add(jlb2);
        //jp1.add(jlb6);
        jp1.add(jb1);
        jp2.add(jb2);
        jp3.add(jb3);

        //jp3.add(jlb3);
        //jp3.add(jlb4);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setLayout(new GridLayout(4,3,50,50)); //设置布局管理器
        this.setTitle("Game of Life");
        //this.setSize(400,300);
        this.setLocation(200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
    }
    public static String getPname(){
        return patternName;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb1){
            //dispose();

            GameFrame g = new GameFrame();

            patternName = TableDemo.getPatternName()!=null ? TableDemo.getPatternName() : "Glider2";//"Blip";
            g.play(patternName);
            //new GameFrame();    //创建一个新界面
        }else if(e.getSource() == jb2){
            //dispose();
            new TableDemo();    //创建一个新界面 TableDemo/Patterns
        }

    }

}
