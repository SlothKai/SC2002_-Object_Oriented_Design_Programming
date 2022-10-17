import java.util.Scanner;

public class Shape2DApp {
    public static void main(java.lang.String[] args){
        int userIn,choice;
        int choice2 =1;
        double para1, para2;
        double finalA = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of shapes: ");
        userIn = sc.nextInt();
        double[] area = new double[userIn];
        System.out.print("\n");
        for(int i=0; i<userIn; i++){
            System.out.println("Choose shape: "+ (i+1));
            System.out.println("1) Circle");
            System.out.println("2) Triangle");
            System.out.println("3) Rectangle");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            System.out.print("");
            switch(choice){
                case 1:
                    System.out.print("Radius: ");
                    para1 = sc.nextDouble();
                    area[i] = new Circle(para1).getArea();
                    break;
                case 2:
                    System.out.print("Height: ");
                    para1 = sc.nextDouble();
                    System.out.print("");
                    System.out.print("Base: ");
                    para2 = sc.nextDouble();
                    System.out.print("");
                    area[i] = new Triangle(para1, para2).getArea();
                    break;
                case 3:
                    System.out.print("Length: ");
                    para1 = sc.nextDouble();
                    System.out.print("");
                    System.out.print("Breadth: ");
                    para2 = sc.nextDouble();
                    System.out.print("");
                    area[i] = new Rectangle(para1, para2).getArea();
                    break;
            }
        }
        while (choice2 != 2){
            System.out.println("1) Calculate area");
            System.out.println("2) Exit");
            System.out.print("Enter Choice: ");
            choice2 = sc.nextInt();
            System.out.println("");
            switch(choice2){
                case 1: 
                    for(int i =0; i< userIn; i++){
                        finalA += area[i];
                    }
                    System.out.printf("Area of Circle : %.2f\n", area[0]);
                    System.out.println("Area of Triangle : " + area[1]);
                    System.out.println("Area of Rectangle : " + area[2]);
                    System.out.printf("Total area of 2D Shape : %.2f\n", finalA);
                    break;
            }
        }
    
    }
}
