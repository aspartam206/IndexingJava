
import data.structure.mabd.radityopw.LinkedListNode;
import data.structure.mabd.radityopw.pojo.Person;

/*
 * The MIT License
 *
 * Copyright 2016 wicaku.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
/**
 *
 * @author wicaku
 */
public class LinkedList_5213100072 {

    class Node {

        protected int index;
        protected Node next, prev;

        /* Constructor when no input*/
        public Node() {
            next = null;
            prev = null;
            index = 0;
        }

        /* Constructor with input */
        public Node(int in, Node head, Node tail) {
            index = in;
            next = head;
            prev = tail;
        }

        /* Function to set link to next node */
        public void setLinkNext(Node head) {
            next = head;
        }

        /* Function to set link to previous node */
        public void setLinkPrev(Node tail) {
            prev = tail;
        }

        /* Funtion to get link to next node */
        public Node getLinkNext() {
            return next;
        }

        /* Function to get link to previous node */
        public Node getLinkPrev() {
            return prev;
        }

        /* Function to set index to node */
        public void setData(int d) {
            index = d;
        }

        /* Function to get index from node */
        public int getData() {
            return index;
        }
    }

}
