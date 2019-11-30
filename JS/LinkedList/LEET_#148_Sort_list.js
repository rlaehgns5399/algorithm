/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var sortList = function(head) {
  if (head === null) return head;
  var array = [];
  while(head !== null) {
      array.push(head.val);
      head = head.next;
  }
  array.sort((a, b) => a - b);
  
  var result = new ListNode(array[0]);
  var cursor = result;
  for(var i = 1; i < array.length; i++) {
      cursor.next = new ListNode(array[i]);
      cursor = cursor.next;
  }
  return result;
};