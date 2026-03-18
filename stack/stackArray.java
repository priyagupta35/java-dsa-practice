package stack;

public class stackArray
 {
        private int[]stack;
        private int top;
        private int size;
    
        stackArray(int size)
        {
            this.size=size;
            stack=new int[size];
            top=-1;
        }
        public  int push(int value)
        {
        if(top==size-1)
        {
            System.out.println("STACK OVERFLOW: ");
            return -1;
        }
         stack[++top]=value;
        return value;

        }
        public int pop()
        {
            if(top==-1)
            {
                System.out.println("STACK UNDERFLOW:");
                return -1;
            }
            return stack[top--];
        }
        public int peek()
        {
                if(top==-1)
                {
                    System.out.println("STACK IS EMPTY:");
                    return -1;
                }
                return stack[top];
        }
        public boolean isEmpty()
        {
            return top==-1;
        }
        void display()
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]+ " ");
            }
            System.out.println();
        }
       
    
    public static void main(String[] args) {
        stackArray s=new stackArray(5);
        s.push(3);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(66);
        s.display();
        System.out.println("POP:" + s.pop()); //66
        System.out.println("PEEK:" +s.peek()); //8  //top elemeny after poping the element on the top that is 66 
        s.display();
    }
 }

