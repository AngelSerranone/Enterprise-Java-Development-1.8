package com.ironhack.main;
import com.ironhack.classes.Movie;
import com.ironhack.classes.Truck;
import com.ironhack.classes.TvSeries;
import com.ironhack.classes.UtilityVehicles;
import com.ironhack.impl.IntArrayList;
import com.ironhack.impl.IntVector;
import com.ironhack.interfaces.IntList;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        /** 1. Using  the BigDecimal documentation, create a method that accepts a BigDecimal and returns a
        double of the BigDecimal number rounded to the nearest hundredth.*/
        BigDecimal bigDecimal1 = new BigDecimal("3.8774833");
        System.out.println("Result for exercise number 1");
        System.out.println(doubleBigDecimalToDouble(bigDecimal1));

        /** 2. Using the BigDecimal documentation, create a method that accepts a BigDecimal, reverses the sign (if the
         * parameter is positive, the result should be negative and vice verse), rounds the number to the nearest tenth
         * and returns the result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.*/
        BigDecimal bigDecimal2 = new BigDecimal("-3.2625658");
        System.out.println("Result for exercise number 2");
        System.out.println(reverseBigDecimal(bigDecimal2));

        /** 3. Suppose you are building a Car inventory system. All cars have a vinNumber, make, model, and mileage. But
         * no Car is just a Car. Each Car is either a Sedan, a UtilityVehicle, or a Truck. UtilityVehicles have a
         * boolean that represents whether they have fourWheelDrive. Trucks have a numeric towingCapacity. Create an
         * Abstract Class named Car and 3 classes that extend Car called Sedan, UtilityVehicle, and Truck. */
        Truck truck1 = new Truck("4590bsw", "Volvo", "RX", 103453, 5000);
        UtilityVehicles utilityVehicle1 = new UtilityVehicles("4561lke", "Seat", "León", 200202, true);
        System.out.println("Result for exercise number 3, with some examples");
        System.out.println(truck1.getTowingCapacity());
        System.out.println(truck1.getMake());
        System.out.println(utilityVehicle1.getFourWheelDrive());

        /** 4. Suppose you are building a Video streaming service. All Videos are either tvSeries or Movies. Create
         * classes tvSeries and Movie which extend an Abstract class Video. Add a few methods and properties to each.*/
        TvSeries tvSerie1 = new TvSeries("Lost", "2002", 5, "5");
        Movie movie1 = new Movie("Shutter Island", "2006", 5, 3);
        System.out.println("Result of exercise number 4, with some examples");
        System.out.println(tvSerie1.getVideoInfo());
        System.out.println(movie1.getVideoInfo());

        /** 5. Create an IntList Interface. An IntList is simply a way to store an ordered list of integers.

         All IntLists should have an add method by which a user can a new number to the list.
         All IntLists should have a get method by which users can retrieve an element by id.
         You will need two implementations of IntList.
         - The first implementation is IntArrayList. IntArrayList should store numbers in an array with length 10 by default.
         When the add method is called, you must first determine if the array is full. If it is, create a new array that
         is 50% larger, move all elements over to the new array and add the new element. (for example, an array of length
         10 would be increased to 15)
         - The second implementation is IntVector. IntVector should store numbers in an array with length 20 by default.
         When the add method is called, you must first determine if the array is full. If it is, create a new array that is
         double the size of the current array, move all elements over to the new array and add the new element. (for example,
         an array of length 10 would be increased to 20)
         - In your README.md include an example of when IntArrayList would be more efficient and when IntVector would be more efficient.*/
        IntList intArrayList1 = new IntArrayList();
        IntList intVector1 = new IntVector();

        System.out.println("Result for exercise number 5");

        intArrayList1.add(1);
        intArrayList1.add(2);
        intArrayList1.add(3);
        intArrayList1.add(4);
        intArrayList1.add(5);
        intArrayList1.add(6);
        intArrayList1.add(7);
        intArrayList1.add(8);
        intArrayList1.add(9);
        intArrayList1.add(10);
        intArrayList1.add(11);
        intArrayList1.add(12);
        intArrayList1.add(13);
        intArrayList1.add(14);
        intArrayList1.add(15);
        intArrayList1.add(16);
        intArrayList1.add(17);


        System.out.println(intArrayList1.get(0));
        System.out.println(intArrayList1.get(5));
        System.out.println(intArrayList1.get(11));
        System.out.println(intArrayList1.get(16));


        intVector1.add(1);
        intVector1.add(2);
        intVector1.add(3);
        intVector1.add(4);
        intVector1.add(5);
        intVector1.add(6);
        intVector1.add(7);
        intVector1.add(8);
        intVector1.add(9);
        intVector1.add(10);
        intVector1.add(11);
        intVector1.add(12);
        intVector1.add(13);
        intVector1.add(14);
        intVector1.add(15);
        intVector1.add(16);
        intVector1.add(17);

        System.out.println(intVector1.get(0));
        System.out.println(intVector1.get(5));
        System.out.println(intVector1.get(11));
        System.out.println(intVector1.get(16));

    }

    /** Method for exercise 1 */
    public static double doubleBigDecimalToDouble (BigDecimal bigDecimal){
        double convertedBigDecimalToDouble = 2*bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        return convertedBigDecimalToDouble;
    }

    /** Method for exercise 2*/
    public static BigDecimal reverseBigDecimal (BigDecimal bigDecimal) {
        BigDecimal reversedBigDecimal = bigDecimal.negate().setScale(1, RoundingMode.HALF_UP);
        return reversedBigDecimal;
    }
}
