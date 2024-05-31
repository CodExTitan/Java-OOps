package OopsLearnung;

import java.util.Scanner;

public class GettersSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Get_SettersClass nissan = new Get_SettersClass("Nissan", "GTX", 80000, 2024, "Red", "1000hp" );
        Get_SettersClass dodge = new Get_SettersClass("Dodge", "DG41", 70000, 2024, "Green", "900hp" );

        //below we are updating the values by using .setColor.
        nissan.setColor("Navy Blue");
        dodge.setColor("Sky blue");

        //below we are updating the prices of the cars by using .setPrice.
        nissan.setPrice(nissan.getPrice() / 2);
        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println("Enter name of the CarObjectExample: ");
        String chooseCar = sc.nextLine().toUpperCase();

        if(chooseCar.equals(nissan.getName().toUpperCase())) {
            System.out.println("\n" + nissan);
        }
        else if(chooseCar.equals(dodge.getName().toUpperCase())) {
            System.out.println("\n" + dodge);
        } else {
            System.out.println("\n CarObjectExample not found.");
        }
        sc.close();

    }

}