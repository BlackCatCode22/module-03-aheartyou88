package mystuff;

public class Stuff {

    public static void main(String[] args) {

        Driver myDriver1 = new Driver();
        myDriver1.firstName = "Amanda";
        myDriver1.lastName = "You";
        myDriver1.licenseNumber = "D4652037";
        myDriver1.licenseClass = "C";
        myDriver1.licenseDonor = "No";
        myDriver1.licenseDOB = "02/06/1988";
        myDriver1.age = 36;

        System.out.println("\n" + "The driver's first name is: " + myDriver1.firstName);
        System.out.println("The driver's last name is: " + myDriver1.lastName);
        System.out.println("The driver's license number is: " + myDriver1.licenseNumber);
        System.out.println("The driver's license is Class: " + myDriver1.licenseClass);
        System.out.println("Is the driver a donor? : " + myDriver1.licenseDonor);
        System.out.println("The driver's date of birth is: " + myDriver1.licenseDOB);
        System.out.println("The driver's age is: " + myDriver1.age + "\n");

        Driver myDriver2 = new Driver();
        myDriver2.firstName = "Jason";
        myDriver2.lastName = "You";
        myDriver1.licenseNumber = "D8726505";
        myDriver2.licenseClass = "A";
        myDriver2.licenseDonor = "Yes";
        myDriver2.licenseDOB = "09/28/1984";
        myDriver2.age = 39;

        System.out.println("\n" + "The driver's first name is: " + myDriver2.firstName);
        System.out.println("The driver's last name is: " + myDriver2.lastName);
        System.out.println("The driver's license number is: " + myDriver2.licenseNumber);
        System.out.println("The driver's license is Class: " + myDriver2.licenseClass);
        System.out.println("Is the driver a donor? : " + myDriver2.licenseDonor);
        System.out.println("The driver's date of birth is: " + myDriver2.licenseDOB);
        System.out.println("The driver's age is: " + myDriver2.age + "\n");
    }
}
