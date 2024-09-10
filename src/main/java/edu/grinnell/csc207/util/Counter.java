package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 * Maral Bat-Erdene, Khanh Do
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  int starter;
  int count;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  public Counter(){
    this.count = 0;
    this.starter = 0;
  }

  public Counter(int _count) {
    this.starter = _count;
    this.count = _count;
  }
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  public void increment(){
    this.count ++;
  }

  public int get(){
    return this.count;
  }

  public String toString() {
    return String.valueOf(this.count);
  }

  public void reset() {
    this.count = this.starter;
  }

} // class Counter
