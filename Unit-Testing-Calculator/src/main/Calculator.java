package main;

public class Calculator {

    private Integer a;
    private Integer b;
    private Integer c;

    public Calculator(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     *
     * @return the maximum of three numbers
     */
    public Integer getMax() {

        if (a == null ) {
            return Math.max(b,c);
        }
        if (b == null) {
            return Math.max(a,c);
        }
        if (c == null) {
            return Math.max(a,b);
        }

        int max1 = Math.max(a, b);
        return Math.max(max1, c);
    }

    /**
     *
     * @return the minimum of three numbers
     */
    public Integer getMin() {
        if(a == null){
            return Math.min(b, c);
        }
        if(b == null){
            return Math.min(a, c);
        }
        if(c == null){

            return Math.min(a, b);
        }

        int min1 = Math.min(a, b);
        return Math.min(min1, c);
    }

    /**
     *
     * @return the average of three numbers
     */
    public Double getAverage() {

       if( a == null){
           return (double) (b + c) / 2;
       }
       if(b == null){
           return (double) (a + c) / 2;
       }
       if( c == null){
           return (double) (a + b) / 2;
       }

       return (double) (a + b + c) / 3;

    }

    /**
     * check if the value of a is positive
     * @return true if the a is positive and false is a is negaive
     */
    public boolean isAPositive() {
       if(a == null){
           return false;
       }

        if (a > 0)
            return true;
        else
            return false;

    }

    /**
     * the method verify if a is even
     *
     * @return has to be true only if a is even, if a is null has to be false
     */
    public Boolean isAEven() {
        if (a == null) {
            return false;
        }
        if (a % 2 == 0)
            return true;
        else
            return false;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
