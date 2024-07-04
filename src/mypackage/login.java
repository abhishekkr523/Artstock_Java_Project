package mypackage;

import java.util.Arrays;
import java.util.Objects;

class login extends UserDetails{
    static String testusername;
    static String testpassword;
    static String name1= "Test_Alpha";
    static String username1="test123";
    static String country1="India";
    static String state1="Rajasthan";
    static String district1="Jhalawar";
    static String password1="alphatest@1234";
    static String mobile1="7357633576";
    static int day1=30;
    static int month1=10;
    static int year1=2003;
    static String dob1 = day1+"/"+month1+"/"+year1;
    static int postcode1=326001;
    static String address1=district1 + ", " +state1 + ", "+country1;
    static String gender1="Male";
    public void login(){
                    System.out.println("Enter Your Username: ");
                    testusername=String.valueOf(sc.nextLine());
                    System.out.println("Enter Your Password: ");
                    testpassword=String.valueOf(sc.nextLine());
                    int[] ans= search(testusername,testpassword);
                    System.out.println("Element found on: "+ Arrays.toString(ans));
//                        arruser[0][1] = name1;
//                        arruser[0][2] = username1;
//                        arruser[0][3] = address1;
//                        arruser[0][4] = dob1;
//                        arruser[0][5] = String.valueOf(postcode1);
//                        arruser[0][6] = mobile1;
//                        arruser[0][7] = gender1;
                    makeItUser(Integer.parseInt(Arrays.toString(ans)));
                    afterUserSignin();
        while (!Objects.equals(testusername, username1) || !Objects.equals(testpassword, password1)){
            System.out.println("**********Please Enter Correct Detail********** ");
            System.out.println("Enter Your Username: ");
            testusername=String.valueOf(sc.nextLine());
            System.out.println("Enter Your Password: ");
            testpassword=String.valueOf(sc.nextLine());
        }
    }
    void makeItUser(int d1){
        arruser[0]=arrusers[d1][0];
        arruser[1]=arrusers[d1][1];
        arruser[2]=arrusers[d1][2];
        arruser[3]=arrusers[d1][3];
        arruser[4]=arrusers[d1][4];
        arruser[5]=arrusers[d1][5];
        arruser[6]=arrusers[d1][6];
        System.out.println("..........WELCOME "+arrusers[d1][0]+"..........");
    }
    static void ifused() {
        if (testusername.equals(username1) && testpassword.equals(password1)) {
            arruser[0] = name1;
            arruser[1] = username1;
            arruser[2] = address1;
            arruser[3] = dob1;
            arruser[4] = String.valueOf(postcode1);
            arruser[5] = mobile1;
            arruser[6] = gender1;
            System.out.println("..........WELCOME Test_Alpha..........");
        }
    }
}

