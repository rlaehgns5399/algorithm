/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    var n1 = '', n2 = '';
    while(l1 !== null) {
        n1 += l1.val;
        l1 = l1.next;
    }
    while(l2 !== null) {
        n2 += l2.val;
        l2 = l2.next;
    }
    result = BigInt(n1.split('').reverse().join('')) + BigInt(n2.split('').reverse().join(''));
    result = (result.toString()).split('').reverse().join('');
    
    var returnNode = new ListNode(Number(result[0]));
    var node = returnNode;
    for(var i = 1; i < result.length; i++) {
        node.next = new ListNode(Number(result[i]));
        node = node.next;
    }
    
    return returnNode;
};