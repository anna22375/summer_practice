package sample.summer_practice;

import sample.summer_practice.HeapSort;
import sample.summer_practice.Test;
import sample.summer_practice.Hand;
import sample.summer_practice.GUI;
import sample.summer_practice.GUI1;
import sample.summer_practice.GUI2;
import sample.summer_practice.Visual;

public class Main
{
    public static void main (String[] args)
    {
        /** Запуск графического интерфейса */
        GUI app = new GUI();
        app.setVisible(true);

        GUI1 ap = new GUI1();
        ap.setVisible(true);

        GUI2 a = new GUI2();
        a.setVisible(true);

        Visual vis = new Visual();
        vis.setVisible(true);
    }
}