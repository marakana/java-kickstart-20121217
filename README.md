Java Kickstart for Test Developers, 17-19 December 2012
=======================================================

Objects
-------

  * fields: properties (some immutable, some mutable)
  * methods: behavior (may affect the mutable state)
  * identity:
    - reference identity: based on memory location, using `==`
    - structural identity: based on object fields, using `.equals()`. Only immutable (`final`) fields should be used for this.

Unit Testing
------------

White-box, specifying behavior for the smallest atomic chunks of code.

  * positive testcases: things work as expected
  * negative testcases: things fail as expected

Collections
-----------

Important ones:

  * `Collection<E>`
    * `List<E>`
      * `ArrayList<E>`
      * `LinkedList<E>`
    * `Set<E>`
      * `HashSet<E>`
      * `SortedSet<E>`
        * `TreeSet<E>`
  * `Map<K, V>`
    * `HashMap<K, V>`
    * `SortedMap<K, V>`
      * `TreeMap<K, V>`

Concurrency
-----------

Benefits:

  * parallelism (multithreading): ability to do multiple things at the same time
  * performance: things don't have to wait for each other
  * resource utilization: take advantage of multi-core / multi-processor hardware

Problems:

  * race conditions: two threads are trying to modify shared memory or shared resources simultaneously
  * deadlocks: two or more threads with a lock graph cycle
  * thread starvation: one thread acquires a lock and holds it forever, or thread scheduler is never allowed to context switch

Solutions:

  * monitors (locks / mutexes / critical sections), `synchronized` methods or blocks
  * semaphores (`wait` + `notify`)
  * ... better solutions: `BlockingQueue` and other utilities in `java.util.concurrent`

Videos
------

Day 1

  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/1.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/1.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/1.3.mov

Day 2

  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/2.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/2.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/2.3.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/2.4.mov

Day 3

  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/3.1.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/3.2.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/3.3.mov
  * https://mrkn.s3.amazonaws.com/recordings/java-kickstart-20121217/3.4.mov

Resources
---------

  * "Effective Java"
  * "Java Concurrency in Practice"
  * "Design Patterns"