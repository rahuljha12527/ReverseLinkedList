
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
	public static void printReverseRecursive(LinkedListNode<Integer> head) {
        
      if(head==null){
           
            return;        
      }
        
        printReverseRecursive(head.next);

           System.out.print(head.data+" ");   
        
    }
}
