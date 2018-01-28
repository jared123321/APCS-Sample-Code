

final public class CompareThree { 
    public static Comparable largest(Comparable numberOne, Comparable numberTwo, Comparable numberThree) {
        
        Comparable maxNumber = 0;

        maxNumber = numberOne;

        if (numberTwo.compareTo(maxNumber) > 0) maxNumber = numberTwo;
        if (numberThree.compareTo(maxNumber) > 0) maxNumber = numberThree;

        return maxNumber;
    }

}