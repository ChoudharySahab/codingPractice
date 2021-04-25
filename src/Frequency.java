public class Frequency {

public static int[] sort(int[] num)
{
int temp = 0;
    for(int i=0;i<num.length;i++)
    {
        for(int j=i+1;j<num.length;j++) {
            if (num[i] > num[j])
            {
             temp = num[i];
             num[i] = num[j];
             num[j] = temp;
            }
        }
    }
    return num;
}
    public static void main(String...s)
    {
        int[] num = {1,2,4};
        int k = 5;

        num = Frequency.sort(num);
int maxFrequency =0;
        for(int i=(num.length-1);i>0;i--)
        {
            int frequency = 0;
            int currentMax = num[i];
            int kInt = 0;
            int initJ = 0;
            for(int j=initJ;j<i;j++)
            {
                if(num[j] < num[i])
                {
                    kInt += currentMax - num[j];
                }
                if(j == i-1 && kInt > k)
                {
                    initJ+=1;
j=initJ-1;
                    kInt = 0;
                }

            }
            if(kInt<=k)
            {
                frequency = i-initJ+1;
             if(maxFrequency<=frequency)
             {
                 maxFrequency = frequency;
                 //System.out.println(frequency);
             }
                //break;
            }
        }
        System.out.println(maxFrequency);
    }
}
