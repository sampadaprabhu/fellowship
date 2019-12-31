package com.bridgelabz.fellowship.DataStructurePrograms;


public class QueueForCalendar<T> {
	
		public class Node<T> {
			public Node next;
			public T data;
			public T data1;
			public T current;

		}

		Node<T> head;
		Node<T> current;
		int position = -1;

		// public UnOrderedLinkedList list() {
		// return new UnOrderedLinkedList();
		// }

		public void add(T obj) {
			Node<T> node = new Node<T>();
			node.data = (T) obj;
			if (head == null)
				head = node;
			else {
				Node<T> insert = head;
				while (insert.next != null) {
					insert = insert.next;
				}
				insert.next = node;
			}
		}

		public void remove(T data) {
			Node<T> temp = head, prev = null;

			if (temp.data.equals(data)) {
				head = temp.next;
				return;
			}

			while (temp != null && !temp.data.equals(data)) {
				prev = temp;
				temp = temp.next;
			}

			if (temp == null)
				return;

			prev.next = temp.next;

		}

		public boolean search(Object obj) {
			Node<Object> search = new Node<Object>();
			search.data = obj;
			Node<T> check = head;
			while (check != null) {
				if (check.data.equals(search.data))
					return true;
				check = check.next;
			}
			return false;

		}

		public boolean isEmpty() {
			if (head == null)
				return true;
			else
				return false;
		}

		public int size() {
			Node<T> temp = head;
			int count = 0;
			while (temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}

		public void append(Object obj) {
			Node<T> node = new Node<T>();
			node.data = (T) obj;
			if (head == null)
				head = node;
			else {
				Node<T> insert = head;
				while (insert.next != null) {
					insert = insert.next;
				}
				insert.next = node;
			}
		}

		// removes element at the passed index
		public void removeAtIndex(int index) {
			if (index == 0)
				head = head.next;
			else {
				Node<T> n = head;
				Node<T> n1 = null;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
			}
			
		}

		public void display() {
			Node<T> display = head;
			while (display != null) {

				System.out.print(display.data + " ");
				display = display.next;
			}
		}

		public int index(T item) {
			Node<T> temp = head;
			int count = 0;
			while (item != (temp.data)) {
				count++;
				temp = temp.next;

			}
			return count;
		}

		public void insert(T data, int position) {

			Node<T> new_data = new Node<T>();
			new_data.data = data;
			Node<T> temp = head;

			while (position > 1) {
				temp = temp.next;
				position--;
			}
			new_data.next = temp.next;
			temp.next = new_data;
		}

		public T pop() {
			Node<T> temp = head;
			Node<T> poping = null;
			while (temp.next != null) {
				poping = temp;
				temp = temp.next;
			}
			Node<T> value = poping;
			poping.next = null;
			return value.data;
		}

		public T pop(int location) {
			Node<T> tc = head;
			Node<T> tp = null;
			int pos = 0;
			position--;
			while (pos != location) {
				tp = tc;
				tc = tc.next;
				pos++;
			}
			if (tc == head) {
				head = head.next;
				return tc.data;
			} else if (tc == current) {
				current = tp;
				tp.next = tc.next;
				return tc.data;
			} else {
				tp.next = tc.next;
				return tc.data;
			}
		}

		public void insertQueues(T data) {
			Node<T> node = new Node<T>();
			node.data1 = data;
			node.next = null;

			if (head == null) {
				head = node;
			} else {
				Node<T> n = head;
				while (n.next != null) {
					n = n.next;
				}
				n.next = node;
			}

		}

		public void queuePrint() {
			Node<T> node = head;
			while (node.next != null) {
				System.out.println(node.data);
				node = node.next;

			}
			System.out.println(node.data);
		}

		/**
		 * 
		 * @return
		 */
		public T dequeueFront() {
			T data;
			Node<T> n = head;
			data = n.data;
			head = n.next;
			return data;
		}

		/**
		 * 
		 * @return
		 */
		public Object dequeueRear() {
			Object data;
			Node<T> n = head;
			Node<T> prev = n;
			while (n.next != null) {
				prev = n;
				n = n.next;
			}
			data = n.data;
			prev.next = null;
			return data;
		}

		/**
		 * 
		 * @param location
		 * @return
		 */
		public T popAt(int location) {
			Node<T> tc = head;
			Node<T> tp = null;
			int pos = 0;
			position--;
			while (pos != location) {
				tp = tc;
				tc = tc.next;
				pos++;
			}

			if (tc == head) {
				head = head.next;
				return tc.data;
			}
			if (tc == current) {
				current = tp;
				tp.next = tc.next;
				return tc.data;
			} else {
				tp.next = tc.next;
				return tc.data;
			}
		}

	}
