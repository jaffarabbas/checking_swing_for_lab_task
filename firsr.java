import java.util.Scanner;
class one
{
    
    Scanner c = new Scanner(System.in);
    int a=c.nextInt();
    two b;
    one(two b)
    {
        this.b=b;
    }
    void dis()
    {
        b.dis();
        System.out.println("Value is : "+b.b);
    }
}

class two
{
    Scanner c = new Scanner(System.in);

    int b;
    two(int b)
    {
        this.b = b = c.nextInt();
    }
    void dis()
    {
        System.out.println("Your value is : "+b);
    }
}



class firsr
{
    public static void main(String[] args) {
        
        two obj = new two(3);
        one obj2 = new one(obj);


        obj2.dis();
    }
}