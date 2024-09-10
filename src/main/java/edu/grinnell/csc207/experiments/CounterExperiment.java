package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;
import edu.grinnell.csc207.util.Counter;

/**
 * Experiments with Counters.
 *
 * @author Maral Bat-Erdene, Khanh Do
 */
public class CounterExperiment {
  /**
   * Run some experiments on counters.
   *
   * @param args
   *   Command-line arguments
   *
   * @throws Exception
   *   If something goes unexpectedly wrong
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    c1.increment();
    c1.increment();
    c2.increment();
    pen.println("c1: " + c1);
    pen.println("c2: " + c2);

    Counter c3 = new Counter(10);
    Counter c4 = new Counter();
    c3.increment();
    c3.increment();
    c4.increment();
    pen.println("c3: " + c3);
    pen.println("c4: " + c4);
    c3.reset();
    c4.reset();
    pen.println("c3: " + c3);
    pen.println("c4: " + c4);
    pen.close();
  } // main(String[])
} // class CounterExperiment
