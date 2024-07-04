package mypackage;

import java.util.Arrays;
import java.util.Objects;

import static mypackage.UserDetails.arruser;

public class login2 extends ArtistDetails{
    String  testartistname, testartpassword;
    public void artistlogin(){
                System.out.println("Enter Your Artistname: ");
                testartistname=String.valueOf(sc.nextLine());
                System.out.println("Enter Your Password: ");
                testartpassword=String.valueOf(sc.nextLine());
                int[] ans= searchArtist(testartistname,testartpassword);
                System.out.println("Element found on: "+ Arrays.toString(ans));
                current= Integer.parseInt(Arrays.toString(ans));
                makeItArtist(current);
//                        arruser[0][1] = name1;
//                        arruser[0][2] = username1;
//                        arruser[0][3] = address1;
//                        arruser[0][4] = dob1;
//                        arruser[0][5] = String.valueOf(postcode1);
//                        arruser[0][6] = mobile1;
//                        arruser[0][7] = gender1;
//                System.out.println("Enter 1 for Back OR Enter 2 to Continue...");
//                varlog=sc.nextInt();
//                afterArtistSignin();
//
//        while (!Objects.equals(testartistname, username1) || !Objects.equals(testartpassword, password1)){
//            System.out.println("**********Please Enter Correct Detail********** ");
//            System.out.println("Enter Your Username: ");
//            testartistname=String.valueOf(sc.nextLine());
//            System.out.println("Enter Your Password: ");
//            testartpassword=String.valueOf(sc.nextLine());
//        }
    }
    void makeItArtist(int d1){
        arruser[0]=arrartist[d1][0];
        arruser[1]=arrartist[d1][1];
        arruser[2]=arrartist[d1][2];
        arruser[3]=arrartist[d1][3];
        arruser[4]=arrartist[d1][4];
        arruser[5]=arrartist[d1][5];
        arruser[6]=arrartist[d1][6];
        System.out.println("..........WELCOME "+arrartist[d1][0]+"..........");
    }
}
