public class SmallestRoute {

    public static void main(String...s)
    {
        int[]  array = {1,2,3,4};
        int start = 0;
        int destination = 3;

        int sumClockWise = 0;
        int sumAntiClockWise = 0;
        for(int i =start;i!=destination;i++)
        {
            sumClockWise += array[i];
            if(i==array.length)
            {
                i = 0;
            }
        }
        for(int i = start;i!=destination; i--)
        {

            if(i == 0)
            {
                i = array.length;
            }
            if(sumAntiClockWise>sumClockWise)
            {
                break;
            }
            sumAntiClockWise += array[i-1];
        }
//        System.out.println(sumClockWise);
//        System.out.println(sumAntiClockWise);
System.out.println("Minimum sum is "+ Math.min(sumClockWise, sumAntiClockWise));
    }
}
