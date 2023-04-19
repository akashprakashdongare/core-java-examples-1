/**
 * 
 */
package com.main.algorithams;

import java.util.LinkedList;

/**
 * @author Akash.d
 *
 */
class NodeLink {
	NodeLink next;
	int data;

	public NodeLink(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "" + ((next == null) ? "" : next + " , ") + data + "";
	}

}

class LinkList {
	NodeLink head;

	public void append(int data) {

		if (head == null) {
			head = new NodeLink(data);
			return;
		}
		NodeLink current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new NodeLink(data);
	}

	public void prepend(int data) {
		NodeLink newHead = new NodeLink(data);
		newHead = head;
		head = newHead;
	}

	public void deleteWithValue(int data) {
		if (head == null)
			return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		NodeLink current = head;
		NodeLink temp = head;
		while (temp.next != null) {
			if (temp.next.data == data) {
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
		current = current.next;
	}

	@Override
	public String toString() {
		return "[" + head + "]";
	}

}

public class DoubleLinkList {
	public static void main(String[] args) {

		LinkList ls = new LinkList();
		ls.append(4);
		ls.append(7);
		ls.append(8);
		ls.append(2);
		ls.append(5);
		ls.append(1);

		ls.deleteWithValue(5);
		ls.append(10);
		ls.append(20);
		ls.append(9);
		
		ls.deleteWithValue(10);
		System.out.println(ls);

		LinkedList<Integer> lst = new LinkedList<Integer>();
		lst.add(4);
		lst.add(7);
		lst.add(8);
		lst.add(2);
		lst.add(5);
		lst.add(1);
		System.out.println(lst);

	}

}
