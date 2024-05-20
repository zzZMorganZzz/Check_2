import java.util.Comparator;

public class Toys implements Comparator <Toys> {
    int Id;
    int Weight;
    String Name;

    public Toys (String row)
    {
         String [] arr = row.split(";");
         Id = Integer.parseInt(arr[0]);
         Weight = Integer.parseInt(arr[2]);
         Name = arr[1];

    }
   
    @Override
    public int compare(Toys o1, Toys o2) {
        int Result = 0;
        if(o1.Weight>o2.Weight)
        {
            Result =1;
        }
        if (o1.Weight<o2.Weight)
        {Result = -1;}
        return Result;

        
    }

}
