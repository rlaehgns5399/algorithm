class Queue {
  constructor() {
    this.queue = [];
  };
  offer(item) {
    this.queue.push(item);
  }
  poll() {
    if (!this.isEmpty()) {
      return this.queue.shift();
    } else {
      throw new Error('Queue is empty');
    }
  }
  size() {
    return this.queue.length;
  }
  isEmpty() {
    return this.queue.length === 0;
  }
  peek() {
    if (!this.isEmpty()) {
      return this.queue[0];
    } else {
      throw new Error('Queue is empty');
    }
  }
}