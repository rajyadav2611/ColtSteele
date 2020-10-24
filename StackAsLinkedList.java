
public class StackAsLinkedList {

    StackNode root;

    // A linked list node
    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)//Constructor
        {
            this.data = data;
        }
    }

    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }

    public void push(int data)
    {
        StackNode newNode = new StackNode(data);

        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");//Printing a statement to denote sucessfull Pushing of data
    }

    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {//Error Handling when stack is empty
            System.out.println("Stack is Empty");
        }
        else {//Popping an element when the stack contains atleast one element
            popped = root.data;
            root = root.next;
        }
        return popped;// Retunrning the popped element to the calling function
    }

    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }

    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);//Filling Up the stack
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
        System.out.println("Checking if the stack is Empty " + sll.isEmpty());
    }
}