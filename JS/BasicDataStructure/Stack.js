class Stack {
  constructor() {
    this.stack = [];
  }

  push(item) {
    this.stack.push(item);
  }
  pop() {
    if (!this.isEmpty()) {
      return this.stack.pop();
    } else {
      throw new Error('Stack is empty');
    }
  }
  peek() {
    if (!this.isEmpty()) {
      return this.stack[this.stack.length - 1];
    } else {
      throw new Error('Stack is empty');
    }
  }
  size() {
    return this.stack.length;
  }
  isEmpty() {
    return this.stack.length === 0;
  }
}