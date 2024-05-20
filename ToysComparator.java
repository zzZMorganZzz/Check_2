import java.util.Comparator;
import java.util.PriorityQueue;

public class ToysComparator implements Comparator <Toys>{

    @Override
    public int compare (Toys o1, Toys o2)
    {
        int Result =0;
        if (o1.Weight>o2.Weight)
        {
            Result =1;
        }
        if (o1.Weight <o2.Weight)
        {
            Result =-1;
        }
        return Result;
    }
    
}
