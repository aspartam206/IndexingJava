import data.structure.mabd.radityopw.LinkedListNode;
import data.structure.mabd.radityopw.pojo.Person;

/*
  * The MIT License
  *
  * Copyright 2016 wicaku.
  *  
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
 * Created by user on 5/3/16.
 */
public class LinkedList_5213100072 implements LinkedListNode {
    Person person = null;
    LinkedListNode next, prev = null;

    @Override
    public LinkedListNode next() {
        return this.next;
    }

    @Override
    public LinkedListNode removeNext() {
        LinkedListNode temp = this.next;
        this.next=null;
        return temp;
    }

    @Override
    public void addNext(LinkedListNode linkedListNode) {
        this.next = linkedListNode;
    }

    @Override
    public LinkedListNode prev() {
        return this.prev;
    }

    @Override
    public LinkedListNode removePrev() {
        LinkedListNode temp = this.prev;
        this.prev = null;
        return temp;
    }

    @Override
    public void addPrev(LinkedListNode linkedListNode) {
        this.prev = linkedListNode;
    }

    @Override
    public Person value() {
        return this.person;
    }

    @Override
    public void setValue(Person person) {
        this.person = person;
    }
}
