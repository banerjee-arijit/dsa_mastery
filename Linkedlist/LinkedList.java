package Linkedlist;

import java.util.ArrayList;

import java.util.List;

public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node insertAtfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        return newNode;
    }

    public Node insertLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
        tail=newNode;
        return newNode;
    }

    public Node insertAtIndex(int index, int data){
        Node newNode=new Node(data);
        if(head==null || index<0){
            System.out.println("Invalid Index");
            return null;
        }
        if(index==0){
            return insertAtfirst(data);
        }
        else{
            Node currentNode=head;
            for(int i=0;i<index-1;i++){
                currentNode=currentNode.next;
            }
            newNode.next=currentNode.next;
            currentNode.next=newNode;
        }
        return newNode;
    }

    public Node deleteLastNode(){
        if(head==null){
            System.out.println("list is empty");
            return null;
        }
        Node currentNode=head;
        while (currentNode!=null && currentNode.next!=null) {
            currentNode=currentNode.next;
        }
        currentNode.next=null;
        return head;

    }

    public int searchNode(int data){
        if(head==null){
            System.out.println("List is empty");
            return -1;
        }
        if(head.data==data){
            return 0;
        }
        Node currentNode=head;
        int index=0;
        while(currentNode!=null){
            if(currentNode.data==data){
                return index;
            }
            else{
                currentNode=currentNode.next;
                index++;
            }
        }
        return -1;

    }
    public void reversedList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node current=head;
        Node prev=null;
        Node next=null;

        while (current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

    // public void removeNthNode(int index){
    //     if(head==null){
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     if(index==1){
    //         deleteLastNode();
    //         return;
    //     }
    //     reversedList();
    //     Node currentNode=head;
    //     for(int i=1;i<index-1;i++){
    //         currentNode=currentNode.next;
    //     }
    //     currentNode.next=currentNode.next.next;
    //     reversedList();

        
    // }

    public int getLength(){
        if(head==null){
            return 0;
        }
        Node currentNode=head;
        int length=0;
        while (currentNode!=null) {
            currentNode=currentNode.next;
            length++;
        }
        return length;
    }

    public void removeNthNode(int index) {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    int size = getLength();

    if (index < 0 || index > size) {
        System.out.println("Invalid index");
        return;
    }

    if (index == size) {
        head = head.next;
        return;
    }

    Node currentNode = head;
    for (int i = 1; i < size - index; i++) {
        currentNode = currentNode.next;
    }

    currentNode.next = currentNode.next.next;
}

// public boolean isPalindrome(){
//     List<Integer>list=new ArrayList<>();
//     if(head==null){
//         return true;
//     }
//     Node currentNode=head;
//     while (currentNode!=null) {
//         list.add(currentNode.data);
//         currentNode=currentNode.next;
//     }
//     int start=0;
//     int end=list.size()-1;
//     while (start<end){
//         if(list.get(start)!=list.get(end)){
//             return false;
//         }
//         start++;
//         end--;
//     }
//     return true;
// }

public Node findMiddle(){
    if(head==null){
        System.out.println("List is empty");
        return null;
    }
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

public boolean isPalindrome(){
    //find the middle
    if(head==null || head.next==null){
        return true;
    }
    Node middle=findMiddle();
    //reverse the right half
    Node current=middle;
    Node next=null;
    Node prev=null;
    while (current!=null) {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    Node rightHead=prev;
    Node leftHead=head;
    while (rightHead!=null) {
        if(rightHead.data!=leftHead.data){
            return false;
        }
        else{
            leftHead=leftHead.next;
            rightHead=rightHead.next;
        }
        
    }
    return true;
    //check if the left half is equal to the reversed right half
}
    public void display(){
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        Node newNode=new Node(10);
        linkedList.head=newNode;
        newNode=new Node(20);
        linkedList.head.next=newNode;
        newNode=new Node(30);
        
    }
    
}
