import java.io.*;
class DivisibleBy7{
    static boolean div(int num){
        if(num<0)
        return div(-num);
        if(num==0||num==7)
        return true;
        if(num<10)
        return false;
                return div( num / 10 - 2 * ( num - num / 10 * 10 ) );
    }
     
    // Driver program
    public static void main (String[] args) 
    {
        int num = 616;
        if(div(num))
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");

    }
}