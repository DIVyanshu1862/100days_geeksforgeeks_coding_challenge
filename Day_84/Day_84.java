class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
      Node ptr1 = head1;
      Node ptr2 = head2;
      Node ans = null; 
     
        ArrayList<Integer> sp = new ArrayList<>();
        
        while(ptr1 != null){
            sp.add(ptr1.data);
            ptr1 = ptr1.next;
            
            
        }
         
        while(ptr2 != null){
            sp.add(ptr2.data);
            ptr2 = ptr2.next;
            
            
        }
        
        Collections.sort(sp);
        Node head = new Node(sp.get(0));
        Node p  = head;
        for( int i = 1 ; i<sp.size(); i++){
            
            p.next = new Node(sp.get(i));
            p = p.next;
            
        }
        
       return head; 
     
   } 
}