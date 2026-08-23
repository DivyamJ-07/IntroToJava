public class LinearSearchToolkit 
{
    public boolean contains(int[] values, int target)
    {
        if(values.length==0)
        {
            System.err.println("Nothing inside the array passed.");
            return false;
        }
        else
        {
            for(int i=0;i<values.length;i++)
            {
                if (values[i]==target)
                return true;
            }
        }
        return false;
    }
    public int firstIndexOf(int[] values, int target)
    {
        if (values == null || values.length == 0)
        {
            System.err.println("Nothing inside the array passed, it is either null or empty.");
            return -1;
        }
        else
        {
            for(int i=0;i<values.length;i++)
                if(values[i]==target)
                return i;
        }
        return -1;
    }
    public int lastIndexOf(int[] values, int target)
    {  
        int i=values.length-1;
        if (values == null || values.length == 0)
        {
            System.err.println("Nothing inside the array passed, it is either null or empty.");
            return -1;
        }
        else
        {
            for(;i>=0;i--)
            {
                if (values[i]==target)
                    return i;
            }
        }
        return -1;
    }
}
