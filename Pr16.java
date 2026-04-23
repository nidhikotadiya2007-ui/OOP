interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "";
    }
}

public class Pr16 {
    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.getDivision(65));
    }
}
/*output:
First Division
  */
