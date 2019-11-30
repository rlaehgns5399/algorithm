class TreeNode {
  constructor(value) {
    this.value = value;
    this.children = [];
    this.parent = null;
  }

  setParent(node) {
    this.parent = node;
  }

  getParent() {
    return this.parent;
  }

  add(node) {
    node.setParent(this);
    this.children.push(node);
  }

  getChildren() {
    return this.children;
  }

  removeChildren() {
    return this.children.splice(0, this.children.length);
  }
}