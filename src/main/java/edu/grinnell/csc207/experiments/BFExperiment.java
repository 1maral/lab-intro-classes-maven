package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BigFraction;

/**
 * A simple experiment using fractions.
 *
 * @author Samuel A. Rebelsky.
 * @author Maral Bat-Erdene, Khanh Do
 */
public class BFExperiment {
  /**
   * Generate a few fractions and print them out.
   *
   * @param args
   *   Command-line arguments; ignored.
   *
   * @throws Exception
   *   When we have some unexpected I/O issue.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BigFraction f1;
    f1 = new BigFraction(3, 10);
    BigFraction f2;
    f2 = new BigFraction(2, 5);
    pen.println("First fraction: " + f1);
    pen.println("Second fraction: " + f2);
    pen.println("Sum: " + (f1.add(f2)));

    pen.println("Fractional of 11, 3: " + (BigFraction.fractional(11, 3)));
    pen.println("Fractional of 1, 2: " + (BigFraction.fractional(1, 2)));
    pen.println("Fractional of 4, 2: " + (BigFraction.fractional(4, 2)));

    BigFraction f;
    f = new BigFraction("1/4");
    pen.println(f.numerator());   // 1
    pen.println(f.denominator()); //    PrintWriter pen = new PrintWriter(System.out, true); 4
    f = new BigFraction("11/5");
    pen.println(f.numerator());   // 11
    pen.println(f.denominator()); // 5
    f = new BigFraction("120/3");
    pen.println(f.doubleValue()); // Approximately 40
    
    pen.close();
  } // main(String[])
} // class BFExperiment
