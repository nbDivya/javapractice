package samplejavaprogram;

import java.util.*;

public class ReverseAString {
        public void StringBufferExample()
        {
            String given = "siva";
            //Here we use String Buffer or String Builder it can be Mutable(change)
           StringBuffer buffer = new StringBuffer();
            buffer.append(given);
            System.out.println("The Original String is =" + given);
            System.out.println("The Reverse String is ==" + buffer.reverse());
        }

        public void OwnMethod()
        {
            String given="perk";
         char[] chararray=given.toCharArray();
         String reversed="";
         for(int i=chararray.length-1;i>=0;i--)
         {
             reversed=reversed+chararray[i];

             System.out.println(reversed);
         }
        }

        public void UsingCollection()
        {
            String given="akshid";
            char[]array=given.toCharArray();
            List<Character> list=new ArrayList<Character>();
            for(Character character:array)
            {
                list.add(character);

            }
            Collections.reverse(list);
            ListIterator ite= list.listIterator();
            while(ite.hasNext())
            {
                System.out.println(ite.next());
            }

        }
    public static void main(String[] args) {
        ReverseAString rev=new ReverseAString();
        //rev.StringBufferExample();
         //rev.OwnMethod();
         rev.UsingCollection();
    }
    }

