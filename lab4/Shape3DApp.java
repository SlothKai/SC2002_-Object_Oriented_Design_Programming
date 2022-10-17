import java.util.Scanner;

public class Shape3DApp {
    public static void main(java.lang.String[] args){
        int userIn,choice;
        int choice2 = 1;
        double para1, para2;
        double finalA = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of shapes: ");
        userIn = sc.nextInt();
        double[] area = new double[userIn];
        System.out.print("\n");
        for(int i=0; i<userIn; i++){
            System.out.println("Choose shape: "+ (i+1));
            System.out.println("1) Sphere");
            System.out.println("2) Tetrahedron");
            System.out.println("3) Cube");
            System.out.println("4) Cone");
            System.out.println("5) Cylinder");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            System.out.print("");
            switch(choice){
                case 1:
                    System.out.print("Radius: ");
                    para1 = sc.nextDouble();
                    area[i] = new Sphere(para1).getArea();
                    break;
                case 2:
                    System.out.print("a: ");
                    para1 = sc.nextDouble();
                    System.out.print("");
                    area[i] = new Tetrahedron(para1).getArea();
                    break;
                case 3:
                    System.out.print("a: ");
                    para1 = sc.nextDouble();
                    System.out.print("");
                    area[i] = new Cube(para1).getArea();
                    break;
                case 4:
                    System.out.print("Radius: ");
                    para1 = sc.nextDouble();
                    System.out.print("");
                    System.out.print("Length: ");
                    para2 = sc.nextDouble();
                    System.out.print("");
                    area[i] = new Cone(para1, para2).getArea();
                    break;
                case 5:
                    System.out.print("Radius: ");
                    para1 = sc.nextDouble();
                    System.out.print("");
                    System.out.print("Height: ");
                    para2 = sc.nextDouble();
                    System.out.print("");
                    area[i] = new Cylinder(para1, para2).getArea();
                    break;
            }
        }
        
        while (choice2 != 3){
            System.out.println("1) Calculate area for Sphere, Tetrahedron & Cube");
            System.out.println("2) Calculate area for Cone & Cylinder");
            System.out.println("3) Exit");
            System.out.print("Enter Choice: ");
            choice2 = sc.nextInt();
            System.out.println("");
            switch(choice2){
                case 1: 
                    for(int i =0; i< userIn; i++){
                        finalA += area[i];
                    }
                    System.out.printf("Area of Sphere: %.2f\n", area[0]);
                    System.out.printf("Area of Tetrahedron: %.2f\n", area[1]);
                    System.out.println("Area of Cube: " + area[2]);
                    System.out.printf("Total area of 3D Shape : %.2f\n", finalA); 
                    break;
                case 2: 
                    for(int i =0; i< userIn; i++){
                        finalA += area[i];
                    }
                    System.out.printf("Area of Cone: %.2f\n", area[0]);
                    System.out.printf("Area of Cylinder: %.2f\n", area[1]);
                    System.out.printf("Total area of 3D Shape : %.2f\n", finalA); 
            }
        }
    }
}
