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
      if(this.head==null){
        return true
      }
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
      // create the node
      let node = new Node(data)
      console.log(node);
      
      // check if the list is empty
      if(this.isEmpty()){
        console.log('in empty', this.isEmpty());
        
        // if the list is empty we assign the node to the head (because there is no values to the list)
        this.head = node
        // we return the new list
        return this
      }
      // we set a variable called runner to the head of the list
      let runner = this.head
      // we loop through the linked list using the runner var while cheking if the runner.next is null
      while(runner.next != null){
        // if the runner.next is not null we assign its value to the runner
        runner = runner.next
        console.log(runner);
        
      }
      // we assign the node to the tail of the list
      runner.next = node
      // return the modified list
      return this
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
    insertAtBackRecursive(data, runner = this.head) {}
  
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
      //create an empty array to store the result
      const arr = [];
      //create a variable initialized to the head of the singly linked list
      let runner = this.head;
  
      //loop while the current node is not null
      while (runner) {
        //push the data of the current node to the result array
        arr.push(runner.data);
        //move the current node to its next node
        runner = runner.next;
      }
      //return the result array
      return arr;
    }
  }
  
  const emptyList = new SinglyLinkedList();
  console.log(emptyList);
  console.log(emptyList.insertAtBack(6));
  console.log(emptyList.insertAtBack(800));
  console.log(emptyList.insertAtBack(856));
  console.log(emptyList.insertAtBack(8077));
  console.log(emptyList.insertAtBack(8960));
  console.log(emptyList);
  
  
  // const singleNodeList = new SinglyLinkedList().insertAtBackMany([1]);
  // const biNodeList = new SinglyLinkedList().insertAtBackMany([1, 2]);
  // const firstThreeList = new SinglyLinkedList().insertAtBackMany([1, 2, 3]);
  // const secondThreeList = new SinglyLinkedList().insertAtBackMany([4, 5, 6]);
  // const unorderedList = new SinglyLinkedList().insertAtBackMany([
  //   -5, -10, 4, -3, 6, 1, -7, -2,
  // ]);
  
  /* node 4 connects to node 1, back to head */
  
  /* node 4 connects to node 2 */
  
  // const sortedDupeList = new SinglyLinkedList().insertAtBackMany([
  //   1, 1, 1, 2, 3, 3, 4, 5, 5,
  // ]);
  
  // Print your list like so:
  // console.log(sortedDupeList.toArr());