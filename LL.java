class LL {
    
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addAtIndex(int position, int data){
        
        if(head == null){
            if(position == 1){
                Node newNode = new Node(data);
                head = newNode;
                return;
            }
            else{
                System.out.println("Not possible");
            }         
        }
        
        if(position == 1){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        if(position > size){
            System.out.println("Index out of bounds");
            return;
        }
        
        int count = 0;
        Node temp = head;
        
        while (temp != null) {
            count++;
            
            if(count == position - 1){
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
    }

    public void addBeforeValue(int data, int val){
        
        if(head == null){
            return;         
        }
        
        if(head.data == val){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node temp = head;
        
        while (temp.next != null) {
            
            if(temp.next.data == val){
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found value " + val);
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        // System.out.println("Deleted " + head.data);
        head = head.next;
    }

    public void deleteIndex(int k){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        
        if(k > size){
            System.out.println("The index is out of bounds");
            return;
        }

        if(k == 1){
            // Node temp = head;
            head = head.next;
            size--;
            return;
        }

        int count = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            count++;

            if(count == k){
                prev.next = prev.next.next;
                size--;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

    }
    
    public void deleteByValue(int val){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }

        if(head.data == val){
            // Node temp = head;
            head = head.next;
            size--;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {

            if(temp.data != val && temp.next == null){
                System.out.println("Not found " + val);
            }

            if(temp.data == val){
                
                prev.next = prev.next.next;
                size--;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
    }
    
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            size--;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next = null;
    }

    public void showList(){
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(54);        
        list.addLast(78);
        list.addAtIndex(4, 30);
        list.addBeforeValue(40, 78);
        list.showList();


        list.deleteFirst();
        list.deleteLast();
        list.deleteIndex(38);
        list.deleteByValue(547);


        
        list.showList();

        System.out.println("Size = " + list.getSize());
    }    
}
