
import data.structure.mabd.radityopw.BinarySearchTreeIntInterface;
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
public class BinarySearchTree_5213100072 implements BinarySearchTreeIntInterface {

    int head = -1;
    Person data = null;
    BinarySearchTree_5213100072 left = null;
    BinarySearchTree_5213100072 right = null;

    @Override
    public void insert(int i, Person person) {
        if (head == -1) {
            this.head = i;
            this.data = person;
            left = new BinarySearchTree_5213100072();
            right = new BinarySearchTree_5213100072();
        } else if (head < i) {
            right.insert(i, person);
        } else if (head > i) {
            left.insert(i, person);
        } else if (head == i) {
            this.head = -1;
            this.data = new Person("null", "null", -1);
        }
    }

    @Override
    public BinarySearchTreeIntInterface find(int i) {
        if (head == i) {
            return this;
        }
        if (head < i && right != null) {
            return right.find(i);
        }
        if (head > i && left != null) {
            return left.find(i);
        }
        return null;
    }

    @Override
    public void display() {
        System.out.println(this.data);
    }

    @Override
    public void delete(int i) {
        find(i).insert(i, new Person("", "", -1));
    }

    @Override
    public Person data() {
        return this.data;
    }

}
