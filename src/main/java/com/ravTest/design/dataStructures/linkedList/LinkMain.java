package com.ravTest.design.dataStructures.linkedList;

public class LinkMain {

    LinkNode head;

    LinkNode insertAtBegin (int data,LinkNode head){
        LinkNode tempNode = new LinkNode(data);
        if (head == null)
            head = tempNode;
        else {
            tempNode.next = head;
            head = tempNode;
        }
        return head;
    }

    LinkNode insertAtEnd (int data, LinkNode head){
        LinkNode tempNode = new LinkNode(data);
        LinkNode tempHead = head;
         if(head == null) {
             head = tempNode;
         }
         else{
                while (tempHead.next!=null)
                        tempHead = tempHead.next;
                tempHead.next = tempHead.next.next;
                head = tempHead.next;
         }

        return head;
    }
}
