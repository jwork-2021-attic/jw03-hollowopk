package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import example.classloader.SteganographyClassLoader;

public class Scene {

    public static void main(String[] args) throws Exception {

        Line line = new Line(7);
        line.put(Gourd.ONE, 6);
        line.put(Gourd.TWO, 3);
        line.put(Gourd.THREE, 1);
        line.put(Gourd.FOUR, 5);
        line.put(Gourd.FIVE, 2);
        line.put(Gourd.SIX, 4);
        line.put(Gourd.SEVEN, 0);

        Geezer theGeezer = Geezer.getTheGeezer();

        SteganographyClassLoader bLoader = new SteganographyClassLoader(
                new URL("file:///home/hollow/java/jw03-hollowopk/example.BubbleSorter.png"));
        SteganographyClassLoader qLoader = new SteganographyClassLoader(
                new URL("file:///home/hollow/java/jw03-hollowopk/example.QuickSorter.png"));
        SteganographyClassLoader sLoader = new SteganographyClassLoader(
                new URL("file:///home/hollow/java/jw03-hollowopk/example.SelectSorter.png"));
        //SteganographyClassLoader jzxLoader = new SteganographyClassLoader(
                //new URL("file:///home/hollow/java/jw03-hollowopk/example.JZXQuickSorter.png"));
        
        Class b = bLoader.loadClass("example.BubbleSorter");
        Class q = qLoader.loadClass("example.QuickSorter");
        Class s = sLoader.loadClass("example.SelectSorter");
        //Class jzx = jzxLoader.loadClass("example.QuickSorter");
        
        Sorter bubbleSorter = (Sorter) b.newInstance();
        Sorter quickSorter = (Sorter) q.newInstance();
        Sorter selectSorter = (Sorter) s.newInstance();
        //Sorter jzxQuickSorter = (Sorter) jzx.newInstance();

        //theGeezer.setSorter(bubbleSorter);
        //theGeezer.setSorter(quickSorter);
        theGeezer.setSorter(selectSorter);
        //theGeezer.setSorter(jzxQuickSorter);

        String log = theGeezer.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}
