package aplicacao;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class programshape {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number od shapes");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");

            Color color;
            while (true) {
                try {
                    color = Color.valueOf(sc.next().trim().toUpperCase());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.print("Invalid color! Please enter BLACK, BLUE, or RED: ");
                }
            }
            if(ch == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double heigth = sc.nextDouble();
                list.add(new Rectangle(color, width, heigth));
            }
            else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                boolean add = list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("Shape areas: ");
        for( Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
    }
}
