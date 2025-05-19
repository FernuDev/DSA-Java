package misc.classes;

public class Main {

    public static void main(String[] args) {

        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("red");

        cookieOne.setColor("yellow");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}