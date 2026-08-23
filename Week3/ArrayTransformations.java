public class ArrayTransformations 
{
    static void reverseInPlace(int[] values)
    {
        int temp;
        for(int i=0 ; i < values.length/2 ; i++)
        {
           temp = values[i];
           values[i] = values[values.length-1-i];
           values[values.length-1-i] = temp;
        }
    }
    static int[] reversedCopy(int[] values)
    {
        int[]a1 = new int[values.length];
        for(int i=0 ; i<values.length ; i++)
            {
                a1[i] = values[values.length-1-i];
            }
        return a1;
    }
    static int removeValue(int[] values , int target)
    {
        int i=0;
        for(int j=0 ; j<values.length ; j++)
        {
            if(values[j]!=target)
            {
                values[i]=values[j];
                i++;
            }
        }
        return i;
    }
    static int[] runningSum(int[] values)
    {
        int temp=0;
        for(int i=0;i<values.length;i++)
        {
            temp+=values[i];
            values[i]=temp;
        }
    return values;
    }
}
