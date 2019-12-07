package edu.neu.coe.info6205.life.Interface;

import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import java.awt.*;

public class Patterns extends JFrame {
    JButton select;

    public Patterns()
    {
        intiComponent();
        select=new JButton("select");
        select.setForeground(Color.BLUE);
        this.setLayout(new GridLayout(2,1,1,1));
        this.add(select,"North");
        this.setLocation(300, 150);
        this.setSize(300, 400);
        this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }
    private void intiComponent()
    {
        String[] columnNames =
                { "PatternName","Points", "others"};
        Object[][] obj=new Object[8][3];
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<8;j++)
            {
                switch (j)
                {
                    case 0:
                        obj[0][0] = " Blip";
                        obj[0][1] = "0 0";
                        obj[0][2] = " ";

                        break;
                    case 1:
                        obj[1][0] = " Blip2";
                        obj[1][1] = "0 0, 1 0";
                        obj[1][2] = "";

                        break;
                    case 2:
                        obj[2][0] = " Block";
                        obj[2][1] = "1 1, 1 2, 2 2, 2 1";
                        obj[2][2] = " ";

                        break;
                    case 3:
                        obj[3][0] =" Beehive";
                        obj[3][1] = "1 2, 2 1, 3 1, 4 2, 3 3, 2 3";
                        obj[3][2] = " ";

                        break;
                    case 4:
                        obj[4][0] =" Loaf";
                        obj[4][1] = "1 3, 2 4, 3 4, 4 3, 4 2, 3 1, 2 2";
                        obj[4][2] = " ";

                        break;
                    case 5:
                        obj[5][0] =" Blinker";
                        obj[5][1] = "0 -1, 0 0, 0 1";
                        obj[5][2] = " ";

                        break;
                    case 6:
                        obj[6][0] =" Glider1";
                        obj[6][1] = "0 0, 1 0, 2 0, 2 -1, 1 -2";
                        obj[6][2] = " ";

                        break;
                    case 7:
                        obj[7][0] =" Glider2";
                        obj[7][1] = "";
                        obj[7][2] = "  ";

                        break;
                }
            }
        }

        JTable table=new JTable(obj, columnNames);
        TableColumn column=null;
        int colunms = table.getColumnCount();
        for(int i=0;i<colunms;i++)
        {
            column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth(200);
        }
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setSize(300, 50);
        add(scroll);
        this.setVisible(true);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    public static void main(String[] args)
    {
        new Patterns();
    }
}
