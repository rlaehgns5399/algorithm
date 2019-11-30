class SingleLinkedList {
  constructor() {
    this.size = 0;
    this.head = undefined;
  }

  add(item) {
    if (this.head === undefined) {
      this.head = item;
    } else {
      this.get(this.size - 1).next = item;
    }
    this.size++;

    return this.size;
  }
  isEmpty() {
    return this.size === 0;
  }
  isValidIndex(index) {
    if (index > this.size - 1 || index < 0) throw this.throwOutOfIndex();
    if (this.isEmpty()) throw this.throwListIsEmpty();
    return true;
  }
  throwOutOfIndex() {
    return new Error('OutOfIndex');
  }
  throwListIsEmpty() {
    return new Error('List is empty');
  }
  get(index) {
    if (this.isValidIndex(index)) {
      let counter = 0;
      let node = this.head;
      while (counter < index) {
        node = node.next;
        counter++;
      }
      return node;
    }
  }
  remove(index) {
    if (this.isValidIndex(index)) {
      let node = this.get(index);
      if (node == this.head) {
        this.head = node.next;
        node.next = undefined;
      } else {
        let prevNode = this.get(index-1);
        prevNode.next = node.next;
        node.next = undefined;
      }
      this.size--;
      return node.value;
    }
  }
}

class Node {
  constructor(value) {
    this.value = value;
    this.next = undefined;
  }
}
