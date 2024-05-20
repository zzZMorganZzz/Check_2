import java.io.Console;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class App {
    public static void main (String [] args) throws FileNotFoundException
    {
        Comparator<Toys> ToysComparator = new ToysComparator();
        PriorityQueue<Toys> _collecion = new PriorityQueue<Toys>(ToysComparator);
        Toys tt = new Toys("1;машинка;30");
        _collecion.add(tt);
        Toys tt1 = new Toys("2;Toys;20");
        Toys tt2 = new Toys("3;Toys 2;10");
        Toys tt3 = new Toys ("4;Toys 4;80");
        Toys tt4 = new Toys("7;Toys 6;90");
        Toys tt6 = new Toys("10;Toys 7;32");
        _collecion.add(tt1);
        _collecion.add(tt3);
        _collecion.add(tt2);
        _collecion.add(tt4);
        _collecion.add(tt6);
        

        PrintWriter wr = new PrintWriter("out.txt");
        int size = _collecion.size();
        for (int i =0;i<size;i++)
        {
            var item = _collecion.poll();
            wr.write(String.format(" priority = %d , Name = %s , Id = %d \n",item.Weight,item.Name,item.Id ));
        }       
        wr.close();

    }
}
