class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

  // declare variables
    int total;
    double blue;
    double brown;
    double green;
    double orange;
    double red;
    double yellow;

  // calculate variables
    total = 55 * 11;
    blue = total * .24;
    brown = total * .13;
    green = total * .16;
    orange = total * .20;
    red = total * .13;
    yellow = total * .14;

  // print color totals
    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);

    double sum;
    sum = blue + brown + green + orange + red + yellow;
    System.out.println("sum: " + sum);

  // comparisons
    if ( blue < brown & red > orange) {
     System.out.println("Blue under Brown and Red over Orange");
    }

    if (brown >= green) {
     System.out.println("Brown is greater than or equal to Green");
    }

    if (sum == total) {
     System.out.println("Numbers match");
    }
  }
}