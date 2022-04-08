package cretorpark.ds.linear.list.poly;


public class PolyNode {

    int coefficient;
    int exponent;
    PolyNode next;

    public PolyNode(int coefficient, int exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    @Override
    public String toString() {

        return coefficient + "x^" + exponent;
    }
}
