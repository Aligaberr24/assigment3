import java.util.ArrayList;

public class q2 {
    public int max(ArrayList<Integer> a)
    {
        if(a.size()==0)
            return 0;
        int max=a.get(0);
        for(int x: a)
        {
            if(x>max)
                max=x;
        }
        return max;
    }
}
