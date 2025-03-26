/**
 * A class to represents a single item of a SinglyLinkedList that can be
 * linked to other Node instances to form a list of linked nodes.
 */
class Node {
    /**
     * Constructs a new Node instance. Executed when the 'new' keyword is used.
     * @param {any} data The data to be added into this new instance of a Node.
     *    The data can be anything, just like an array can contain strings,
     *    numbers, objects, etc.
     * @returns {Node} This new Node instance is returned automatically without
     *    having to be explicitly written (implicit return).
     */
    constructor(data) {
      this.data = data;
      /**
       * This property is used to link this node to whichever node is next
       * in the list. By default, this new node is not linked to any other
       * nodes, so the setting / updating of this property will happen sometime
       * after this node is created.
       *
       * @type {Node|null}
       */
      this.next = null;
    }
  }
  
  /**
   * This class keeps track of the start (head) of the list and to store all the
   * functionality (methods) that each list should have.
   */
  class SinglyLinkedList {
    /**
     * Constructs a new instance of an empty linked list that inherits all the
     * methods.
     * @returns {SinglyLinkedList} The new list that is instantiated is implicitly
     *    returned without having to explicitly write "return".
     */
    constructor() {
      /** @type {Node|null} */
      this.head = null;
    }
  
    /**
     * Determines if this list is empty.
     * - Time: O(1) constant.
     * - Space: O(1) constant.
     * @returns {boolean}
     */
    isEmpty() {
      // TODO: your code here
      //if the head is null return true else return false
      return this.head === null;
    }
  
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: O(n) linear, n = length of list.
     * - Space: O(1) constant.
     * @param {any} data The data to be added to the new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBack(data) {
      //create a const of type Node and pass it the data given in the parameter to create a node
      const newBack = new Node(data);
  
      //check if the list is empty add the created node to the head and return the instance (this)
      if (this.isEmpty()) {
        this.head = newBack;
        return this;
      }
      //else create a new variable initialized to the head
      let runner = this.head;
      // looping while the next node of current node is not null
      while (runner.next !== null) {
          // set the current node to its next node
        runner = runner.next;
      }
      //if we reach the end of the list
      //add the created node to the next of the current node and return the instance (this)
      runner.next = newBack;
      return this;
    }
  
    /**
     * Creates a new node with the given data and inserts it at the back of
     * this list.
     * - Time: O(n) linear, n = length of list.
     * - Space: O(n) linear due to the call stack.
     * @param {any} data The data to be added to the new node.
     * @param {?Node} runner The current node during the traversal of this list
     *    or null when the end of the list has been reached.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackRecursive(data, runner = this.head) {
      //check if the singly linked list is empty, create a new node using the given data and add it to the head and return the instance (this)
      if (this.isEmpty()) {
        this.head = new Node(data);
        return this;
      }
  
      //check if the next of the runner node is null, create a new node using the given data and add it to the next of the runner node and return the instance (this)
      if (runner.next === null) {
        runner.next = new Node(data);
        return this;
      }
      //else return the recursion of the function using the same data but the runner will point on the next not the head
      return this.insertAtBackRecursive(data, runner.next);
    }
  
    /**
     * Calls insertAtBack on each item of the given array.
     * - Time: O(n * m) n = list length, m = arr.length.
     * - Space: O(1) constant.
     * @param {Array<any>} vals The data for each new node.
     * @returns {SinglyLinkedList} This list.
     */
    insertAtBackMany(vals) {
      for (const item of vals) {
        this.insertAtBack(item);
      }
      return this;
    }
  
    /**
     * Converts this list into an array containing the data of each node.
     * - Time: O(n) linear.
     * - Space: O(n).
     * @returns {Array<any>} An array of each node's data.
     */
    toArr() {
      const arr = [];
      let runner = this.head;
  
      while (runner) {
        arr.push(runner.data);
        runner = runner.next;
      }
      return arr;
    }
  }
  
  const emptyList = new SinglyLinkedList();
  
  const singleNodeList = new SinglyLinkedList().insertAtBackMany([1]);
  const biNodeList = new SinglyLinkedList().insertAtBackMany([1, 2]);
  const firstThreeList = new SinglyLinkedList().insertAtBackMany([1, 2, 3]);
  const secondThreeList = new SinglyLinkedList().insertAtBackMany([4, 5, 6]);
  const unorderedList = new SinglyLinkedList().insertAtBackMany([
    -5, -10, 4, -3, 6, 1, -7, -2,
  ]);
  
  /* node 4 connects to node 1, back to head */
  const perfectLoopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
  perfectLoopList.head.next.next.next = perfectLoopList.head;
  
  /* node 4 connects to node 2 */
  const loopList = new SinglyLinkedList().insertAtBackMany([1, 2, 3, 4]);
  loopList.head.next.next.next = loopList.head.next;
  
  const sortedDupeList = new SinglyLinkedList().insertAtBackMany([
    1, 1, 1, 2, 3, 3, 4, 5, 5,
  ]);
  
  // Print your list like so:
  console.log(firstThreeList.toArr());