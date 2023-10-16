package Q1.Prog213bCl;

public class Cl213b {
    private int myQuantity;
    private double myPrice;
    private double myAmt;

    public Cl213b(int quantity) {
        myQuantity = quantity;
        myPrice = 0;
        myAmt = 0;
    }

    public void calc() {
        if (myQuantity > 0 && myQuantity < 100) myPrice = 5.95;
        else if (myQuantity > 99 && myQuantity < 200) myPrice = 5.75;
        else if (myQuantity > 199 && myQuantity < 300) myPrice = 5.4;
        else if (myQuantity > 2990) myPrice = 5.15;
        myAmt = myPrice * myQuantity;
    }

    public String toString() {
        return String.format("Price = $%.2f\tAmount Due = $%.2f", myPrice, myAmt);
    }
}
/*
Price = $5.95	Amount Due = $89.25
Price = $5.95	Amount Due = $267.75
Price = $5.95	Amount Due = $327.25
Price = $5.95	Amount Due = $333.20
Price = $5.95	Amount Due = $249.90
Price = $5.75	Amount Due = $661.25
Price = $5.95	Amount Due = $547.40
Price = $5.95	Amount Due = $184.45
Price = $5.95	Amount Due = $446.25
Price = $5.95	Amount Due = $285.60
Price = $5.95	Amount Due = $345.10
Price = $5.95	Amount Due = $5.95
Price = $5.95	Amount Due = $148.75
Price = $5.95	Amount Due = $95.20
Price = $5.95	Amount Due = $113.05
 */
