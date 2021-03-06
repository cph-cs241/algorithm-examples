package dk.cphbusiness.algorithm.examples.utils;

import java.io.PrintStream;

public class Histogram {
  private static final String template =
      "##################################################"+
      "##################################################";
  private final int scale;
  
  public Histogram(int scale) {
    this.scale = scale;
    }
  
  private String histoline(int value) {
    if (value > 100*scale) return "*** "+value+" ***";
    return template.substring(0, value/scale);
    }
  
  public void print(PrintStream out, int[] list) {
    for (int i = 0; i < list.length; i++)
        out.println(histoline(list[i]));
    }
  
  public void print(int[] list) { print(System.out, list); }

  /**
   * Usage example.
   * @param args are not used
   */
  public static void main(String[] args) {
    int[] list = new int[] {1, 2, 3, 1, 10, 11};
    Histogram histogram = new Histogram(1);
    histogram.print(list);
    }
  
  }
