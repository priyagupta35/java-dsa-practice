// Problem: Circular Queue using Array
// Topic: Queue

// Description:
// Implement a circular queue to efficiently use array space.

// Approach:
// - Use modulo (%) for circular movement
// - Track front, rear, and size

// Time Complexity:
// Add: O(1)
// Remove: O(1)

// Space Complexity: O(n)
// */

package queue;

//import java.security.spec.ECFieldF2m;

public class Circularqarray
{
    public static class Cqa{
        int front =-1;
        int rear=-1;
        int size=0;
        int []arr=new int[5];
        //add
        public void add(int val) throws Exception{
            if(size==arr.length)
            {
                throw new Exception("queue is full:");
             }
             else if(size==0)
             {
                front=rear=0;
                arr[0]=val;
             }
             
             
             else if(rear<arr.length-1)  //normal case
             {
                arr[++rear]=val;
             }
             else {
            //(rear==arr.length-1)
                rear=0;
            arr[0]=val;
        }      
        size++;
    }
        
    //remove
    public int remove()
    {
       // int size = 0;
        if(size==0)
        {
            System.out.println("queue is empty:");
            return -1;
        }
        else {
            int val=arr[front];
            if(front==arr.length-1)
                front=0;
            else
                front++;

            size--;
            return val;

    }
}
        

//peek
public int peek() 
{
    if(size==0)
    {
       System.out.println("queue is empty:");
    }
    return arr[front];
}

public boolean isEmpty()
{
    if(size==0)
        return true;
       else
        return false;
}
    //display
    public void display()
    {
            if(size==0){
                System.out.println("QUEUE IS EMPTY:");
            return;}

            else if(front<=rear)
            for(int i=front;i<=rear;i++)
        {
            System.out.println(arr[i]+" ");
        }
        else{
            for(int i=front;i<arr.length;i++)
            {
                System.out.println(arr[i]+" ");
            }
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]+" ");
            }
        }
        System.out.println();
}
    }

public static void main(String[] args) throws Exception {
    Cqa cq=new Cqa();
    cq.add(3);
    cq.add(2);
    cq.add(6);
    cq.add(7);
    cq.add(0);
    cq.display();
    System.out.println("peek:" +cq.peek());
    cq.remove();
     cq.display();

}
    }




