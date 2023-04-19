/**
 * 
 */
package com.main.algorithams;

import java.util.LinkedList;

/**
 * @author Akash.d
 *
 */
class SortedNode {
	SortedNode next;
	int data;

	public SortedNode(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "" + ((next == null) ? "" : next + " , ") + data + "";
	}

}

class SortedLinkList {
	SortedNode head;

	public void append(int data) {

		if (head == null) {
			head = new SortedNode(data);
			return;
		}
		SortedNode current = head;
		while (current.next != null) {
			current = current.next;

		}
		current.next = new SortedNode(data);
	}

	public void appendSorted(int data) {
		SortedNode temp = null;
		boolean flag = true;
		if (head == null) {
			head = new SortedNode(data);
			return;
		} else if (head.data < data) {
			temp = new SortedNode(data);
			temp.next = head;
			head = null;
			head = temp;
			flag = false;
		}
		SortedNode current = head;
		boolean inserted = true;
		if (flag) {
			while (current.next != null) {
				if ((current.data > data) && (current.next.data < data)) {
					temp = new SortedNode(data);
					temp.next = current.next;
					current.next = temp;
					inserted = false;
					break;
				}
				current = current.next;
			}
			if (inserted)
				current.next = new SortedNode(data);

		}

	}

	public void appendSortedDesc(int data) {
		SortedNode temp = null;
		boolean flag = true;
		if (head == null) {
			head = new SortedNode(data);
			return;
		} else if (head.data > data) {
			temp = new SortedNode(data);
			temp.next = head;
			head = null;
			head = temp;
			flag = false;
		}
		SortedNode current = head;
		boolean inserted = true;
		if (flag) {
			while (current.next != null) {
				if ((current.data < data) && (current.next.data > data)) {
					temp = new SortedNode(data);
					temp.next = current.next;
					current.next = temp;
					inserted = false;
					break;
				}
				current = current.next;
			}
			if (inserted)
				current.next = new SortedNode(data);

		}

	}

	public void prepend(int data) {
		SortedNode newHead = new SortedNode(data);
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
		SortedNode current = head;
		SortedNode temp = head;
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

public class SortedDoubleLink {
	public static void main(String[] args) {
		SortedLinkList ls = new SortedLinkList();
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
		// System.out.println(lst);

		SortedLinkList ls_sorted = new SortedLinkList();

		ls_sorted.appendSorted(1);
		ls_sorted.appendSorted(3);
		ls_sorted.appendSorted(5);
		ls_sorted.appendSorted(10);
		ls_sorted.appendSorted(6);
		ls_sorted.appendSorted(7);
		ls_sorted.appendSorted(2);
		ls_sorted.appendSorted(4);
		// ls_sorted.deleteWithValue(10);
		System.out.println("sorted : " + ls_sorted);

		SortedLinkList ls_sorted_desc = new SortedLinkList();

		ls_sorted_desc.appendSortedDesc(1);
		ls_sorted_desc.appendSortedDesc(3);
		ls_sorted_desc.appendSortedDesc(5);
		ls_sorted_desc.appendSortedDesc(10);
		ls_sorted_desc.appendSortedDesc(6);
		ls_sorted_desc.appendSortedDesc(7);
		ls_sorted_desc.appendSortedDesc(2);
		ls_sorted_desc.appendSortedDesc(4);
		ls_sorted_desc.appendSortedDesc(8);
		ls_sorted_desc.appendSortedDesc(12);
		ls_sorted_desc.appendSortedDesc(0);
		// ls_sorted.deleteWithValue(10);
		System.out.println("sorted desc : " + ls_sorted_desc);
	}

}
