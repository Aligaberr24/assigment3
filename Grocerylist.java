import java.util.ArrayList;

public class Grocerylist {

    ArrayList<groceryitemorder> list = new ArrayList<groceryitemorder>();
    public int size;
    public Grocerylist(){}
    public void add(groceryitemorder item)
    {
        this.size= list.size();
        if(size<10)
            list.add(item);
        else
            System.out.println("list is full");
    }
    public double gettotalcost(){
        double sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum=sum+list.get(i).getcost();
        }
        return sum;
    }
}
