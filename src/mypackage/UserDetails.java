package mypackage;
import java.util.Scanner;

public class UserDetails {
    int row,current;
    String[][] arrusers= new String[row][20];
    Scanner sc = new Scanner(System.in);
    int day;
    int month;
    int year;
    static int postcode;
    static String name;
    static String username;
    String country;
    String state;
    String district;
    String password;
    static String mobile;
    static String address;
    String gender;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public String[] getArruser() {
//        return arruser;
//    }
//
//    public void setArruser(String[] arruser) {
//        this.arruser = arruser;
//    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }
    static String[] arruser = new String[10];
    void setUserDetails() {
        int userArray;
       do {
           row = 0;
           System.out.println("Enter your details here as an User");
           System.out.println("Enter your full name here: ");
           arrusers[row][0]=name = sc.nextLine();
           System.out.println("Enter your username here: ");
           arrusers[row][1]=username = sc.nextLine();
           System.out.println("Enter your address here: ");
           System.out.println("Enter Country: ");
           arrusers[row][8]=country = sc.nextLine();
           System.out.println("Enter State: ");
           arrusers[row][9]=state = sc.nextLine();
           System.out.println("Enter District: ");
           arrusers[row][10]=district = sc.nextLine();
           arrusers[row][2]=address = country + ", " + state + ", " + district;
           System.out.println("Enter your Postal Code:");
           arrusers[row][3]=String.valueOf(postcode = sc.nextInt());
           System.out.println("Enter your gender here: ");
           arrusers[row][4]=gender = sc.nextLine();
           System.out.println("Enter your Date of Birth here:");
           System.out.println("Enter the Day of Birth: ");
           arrusers[row][11]=String.valueOf(day = sc.nextInt());
           while (day > 31 || day < 0 || day == 0) {
               System.out.println("Please enter the correct detail:");
               arrusers[row][11]=String.valueOf(day = sc.nextInt());
           }

           System.out.println("Enter the Month: ");
           arrusers[row][12]=String.valueOf(month = sc.nextInt());
           while (month < 0 || month > 13 || month == 13) {
               System.out.println("Please enter correct detail:");
               arrusers[row][12]=String.valueOf(month = sc.nextInt());
           }
           System.out.println("Enter the Year: ");
           arrusers[row][13]=String.valueOf(year = sc.nextInt());
           while (year > 2023 || year < 0 || year == 0) {
               System.out.println("Please enter correct detail:");
               arrusers[row][13]=String.valueOf(year = sc.nextInt());
           }
           String dob = day + " " + month + " " + year;
           arrusers[row][5]=dob;
           System.out.println("Enter your mobile number: ");
           arrusers[row][6]=mobile = sc.nextLine();
           System.out.println("Set your password: ");
           System.out.println("Use alphabets(A-Z and a-z), numbers(0-1), special symbols");
           System.out.println("The password should contain 8 characters.");
           arrusers[row][7]=password = sc.nextLine();
           while(password.length()!=8){
               System.out.println("Your password should contain 8 characters.");
               System.out.println("Please enter your password again: ");
               arrusers[row][7]=password = sc.nextLine();
           }
//        arruser[0] = name;
//        arruser[1] = username;
//        arruser[2] = address;
//        arruser[3] = dob;
//        arruser[4] = String.valueOf(postcode);
//        arruser[5] = String.valueOf(mobile);
//        arruser[6] = gender;
           row++;
           System.out.println("Enter 1 if you are done!");
           userArray=sc.nextInt();
       }while (userArray!=1);
    }

    void afterUserSignin() {
        login.ifused();
        int k;
        int u;
        do {
            System.out.println("Now choose what do you want to do:");
            System.out.println("Choice 1: See My Profile.");
            System.out.println("Choice 2: See Latest Products");
            System.out.println("Choice 3: Buy Products.");
            System.out.println("Choice 3: Order History.");
            System.out.println("Choice 4: Back.");
            u = sc.nextInt();
            switch (u) {
                case 1:
                    System.out.println("Name: " + arrusers[current][0]);
                    System.out.println("Username: " + arrusers[current][1]);
                    System.out.println("Address: " + arrusers[current][2]);
                    System.out.println("D.O.B.: " + arrusers[current][3]);
                    System.out.println("Postal Code: " + arrusers[current][4]);
                    System.out.println("Mobile Number: " + arrusers[current][5]);
                    System.out.println("Gender: "+ arrusers[current][6]);
                    break;
                case 2:
                    product.showMyProduct();
                case 3:
                    order.buyProducts();
                case 4:
                    order.seeOrderHistory();
                default:
                    System.out.println("Please Enter Correct Choice: ");
            }
        } while (u != 4);
    }


//    void showUserDetails() {
//        System.out.println("Name: " + arruser[0]);
//        System.out.println("Username: " + arruser[1]);
//        System.out.println("Address: " + arruser[2]);
//        System.out.println("D.O.B.: " + arruser[3]);
//        System.out.println("Postal Code: " + arruser[4]);
//        System.out.println("Mobile Number: " + arruser[5]);
//    }
//
    int d1;
    int d2;
//    int[] search(String searchUsername, String searchPassword) {
//        for (d1 = 0; d1 < arrusers.length; d1++) {
//            for (d2 =0; d2< arrusers[d1].length; d2++){
//                if (arrusers[d1][d2].equals(searchUsername) && arrusers[d1][d2].equals(searchPassword)) {
//                    return new int[] {d1,d2};
//                }
//
//            }
//        }
//        return new int[] {-1, -1};
//    }

    int[] search(String searchArtistname, String searchArtPassword) {
        for(d1 =0; d1<20 ; d1++){
            if(!arrusers[d1][1].equals(searchArtistname) && !arrusers[d1][7].equals(searchArtPassword)){
                System.out.print("Element not found!");
            }
        }
        return new int[]{d1};
    }
    void choose(){
        System.out.println("Enter Your Choice");
        System.out.println("What do you want to be.");
        System.out.println("Choice 1: Want to be an User.");
        System.out.println("Choice 2: Want to be an Artist.");
        System.out.println("Choice 3: Back.");
    }
}
