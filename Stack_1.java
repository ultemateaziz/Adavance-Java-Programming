import java.util.Scanner;
class StackArray
{
    private final int maxsize;
    private final long[] stackarray;
    private int top;
    public StackArray(int s)
    {
        maxsize = s;
        stackarray = new long[maxsize];
        top = -1;
    }
    public void push(long j)  //push methond
    {
        stackarray[++top] = j;
    }
    public long pop()   //pop method
    {
        return stackarray[top-1];
    }
    public void display()  //displaymethod
    {
        System.out.println("\nStack =");
        if(isempty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i = top; i >= 0; i--)
            System.out.println(stackarray[i]+"");
            System.out.println();
        }
    }
    public boolean isempty() //isempty method
    {
        return (top == -1);
    }
    public boolean isfull()  //isfull method
    {
        return (top == maxsize -1 );
    }
}
  public class Stack_1
    {
        public static void main(String[] args)
        {
            try
            {
                System.out.println("Size of the Stack:"); //First ask Outputstaement
                Scanner s=new Scanner(System.in);
                int n = s.nextInt();
                stack newStack = new stack(5);
                for(;;)
                {
                    System.out.println("Menu\n1-Push\n2-Pop\n3-Display\n4-Exit\nEnter Your Choices:"); //Menus
                    int ch = s.nextInt();
                    switch(ch)
                    {
                        case 1: //option-1
                            if(newStack.isfull())
                            {
                                System.out.println("Stack Is Full");
                            }
                            else
                            {
                                System.out.println("Item To be pushed");
                                int datastack = s.nextInt();
                                newStack.push(datastack);
                            }
                            break;
                        case 2: //option-2
                            if(newStack.isempty())
                            {
                                System.out.println("Stack is empty");
                            }
                            else
                            {
                                long popeddata = newStack.pop();
                                System.out.println(popeddata);
                            }
                            break;
                        case 3: //option-3
                            newStack.display();
                            break;
                        case 4: //option-4
                            break;
                    }
                    if(ch == 4)
                        break;
                 }
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
