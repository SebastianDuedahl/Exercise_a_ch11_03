package Chapter_11_a_03;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Exercise_03
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i <= 20 ; i++)
        {
            list.add(i);
        }

        System.out.println(removeEvenInRange(list,5,13));
    }


    public static LinkedList<Integer> removeEvenInRange(LinkedList<Integer> list, int startIndex, int endIndex){

        LinkedList<Integer> removeEvenNumb = new LinkedList<Integer>();

        removeEvenNumb.addAll(list);

        while(endIndex > startIndex)
        {
            if (removeEvenNumb.get(startIndex) % 2 == 0)
            {
                removeEvenNumb.remove(startIndex);
                startIndex++;
            } else
                {
                startIndex++;
                }
        }
       return removeEvenNumb;
    }

}
