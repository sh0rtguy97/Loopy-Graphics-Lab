// Lab05Fst.java
// This is the student, starting version of Lab 05F which is divided into 8 cells.
// The first cell -- "Draw Red Horizontal Lines" -- is provided as an example.
// Students need to complete the other 7 cells on their own.

import java.awt.*;
import java.applet.*;

public class Lab05Fst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        Expo.drawLine(g,250,0,250,650);
        Expo.drawLine(g,500,0,500,650);
        Expo.drawLine(g,750,0,750,650);
        Expo.drawLine(g,0,325,1000,325);

        int x1, y1, x2, y2, x, y, r;

        // Draw Red Horizontal Lines
        Expo.setColor(g,Expo.red);
        x1 = 0;
        y1 = 5;
        x2 = 250;
        y2 = 5;
        for (int j = 1; j <= 32; j++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y1 += 10;
            y2 += 10;
        }


        // Draw Blue Vertical Lines
       Expo.setColor(g,Expo.blue);
       x1=260;
       y1=0;
       x2=260;
       y2=325;
       for (int k=1; k <=25; k++)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            x1+= 10;
            x2+= 10;
        }
       
        // Draw Gray Diagonal Dots
       Expo.setColor(g,Expo.gray);
       x1=510;
       y1=300;
       for (int h=1; h<=24; h++)
       { 
           Expo.drawPoint(g,x1,y1);
           x1 += 10;
           y1 -= 10;
        }




        // Draw Green Concentric Circles
        Expo.setColor(g,Expo.green);
        x1=875;
        y1=163;
        r=10;
        for (int p=1; p<=12; p++)
        {
            Expo.drawCircle(g,x1,y1,r);
            r += 10;
        }
        // Draw Purple Concentric Ovals
        Expo.setColor(g,Expo.purple);
        x1=125;
        y1=489;
        int r1=3;
        int r2=6;
        for (int z=1; z<=23; z++)
        {
            Expo.drawOval(g,x1,y1,r1,r2);
            r1 += 5;
            r2 += 7;
        }
        // Draw Pink Concentric Arcs
        Expo.setColor(g,Expo.pink);
        x1=250;
        y1=650;
        r1=5;
        r2=15;
        int d1=0;
        int d2=90;
        for (int z=1; z<=20; z++)
        {
            Expo.drawArc(g,x1,y1,r1,r2,d1,d2);
            r1 += 10;
            r2 += 15;
        }
        // Draw Brown Concentric Rectangles
        Expo.setColor(g,Expo.brown);
        x1=620;
        x2=640;
        y1=450;
        y2=550;
        for (int z=1; z<=11; z++)
        {
            Expo.drawRectangle(g,x1,y1,x2,y2);
            x1-=10;
            x2+=10;
            y1-=10;
            y2+=10;
        }




        // Draw Gold Sphere
        Expo.setColor(g,Expo.gold);




    }
}




