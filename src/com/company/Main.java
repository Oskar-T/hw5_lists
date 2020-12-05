package com.company;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = new List<> (new Integer[5]);

        for (int i = 1; !list.isFull () && i < 100; i += 2)
            list.addFirst (i);
        System.out.println (list);

        list.removeLast ();
        list.removeLast ();
        System.out.println (list);

        // implement these methods
        list.addLast (99);
        list.add (1, -33);
        System.out.println (list);

        while (!list.isEmpty ()) {
            System.out.print(list.removeFirst() + " ");

        }
        System.out.println("");

    }
}
