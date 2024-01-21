class Queue
{
    Stack<Integer> input = new Stack<Integer>(); 
    Stack<Integer> output = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    // Your code here
	    while(input.size() > 1){
	        output.push(input.pop());
	    }
	   int val = input.pop();
	    while(output.size() > 0)input.push(output.pop());
	    return val;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    // Your code here
	    input.push(x);
    }
}
 