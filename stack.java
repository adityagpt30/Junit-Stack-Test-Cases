package SoftwareProcess;
 class stack {
int arr[];
int first;
int count;
stack(int size)
{
arr = new int[size];
count = size;
first = -1;
}
public void push(int z)
{
if (isFull()) {
System.out.println("Stack is Full");
} else {
System.out.println("Inserting " + z);
arr[++first] = z;
}
}
public int pop()
{
if (isEmpty()) {
System.out.println("Stack is Empty");
return -1;
}
System.out.println("Removing ");
return arr[first--];
}
 public Boolean isEmpty()
{
return first == -1;
}

public Boolean isFull()
{
return first == count - 1;
}

public static void main (String[] args)
{
stack stack = new stack(4);
stack.push(1);
stack.push(2);
stack.pop();
stack.pop();
stack.push(3);
stack.push(4);
stack.pop();
stack.pop();
if (stack.isEmpty())
System.out.println("Stack is empty");
else
System.out.println("Stack is not empty");
}
}
