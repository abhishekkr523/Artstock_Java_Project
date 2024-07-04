package mypackage;
import java.util.Scanner;
public class Artstock {
    public static void main (String[] args){
        int a,i,j,k;
        do {
            Scanner sc = new Scanner(System.in);
            UserDetails udetails = new UserDetails();
            ArtistDetails adetails = new ArtistDetails();
            product products = new product();
            login dologin = new login();
            login2 dologin2 = new login2();
            order doorders = new order();
            System.out.println("...***<<<||| WELCOME TO THE ARTSTOCK.COM |||>>>***....");
            System.out.println("Type 1: Login");
            System.out.println("Type 2: SignUp");
            System.out.println("Type 3: Exit");
            j = sc.nextInt();

            switch (j) {
                case 1:
                    System.out.println("How do you want to login: ");
                    System.out.println("Choice 1: Login as an user");
                    System.out.println("Choice 2: Login as an Artist: ");

                    int varlog;
                    varlog=sc.nextInt();
                    if(varlog==1) {
                        dologin.login();
                        udetails.afterUserSignin();
                    } else if (varlog==2) {
                        dologin2.artistlogin();
                        adetails.afterArtistSignin();
                    }
                case 2:
                    udetails.choose();
                    i = sc.nextInt();
                    if (i < 1 || i > 3) {
                        System.out.println("**********Please Enter Correct Choice**********");
                    } else if (i == 1) {
                        int u;
                        udetails.setUserDetails();
                        udetails.afterUserSignin();
                    } else if (i == 2) {
                        adetails.setArtistDetails();
                        int z;
                        do {
                            System.out.println("Choice 1: Show my profile.");
                            System.out.println("Choice 2: Sell products.");
                            System.out.println("Choice 3: Show my Products.");
                            System.out.println("Choice 4: Back.");
                            z= sc.nextInt();
                            switch(z){
                                case 1:
                                    adetails.showArtistDetails();
                                case 2:
                                    product.sellProduct();
                                case 3:
                                    product.showMyProduct();
                                default:
                                    System.out.println("**********Please enter correct choice.**********");
                            }
                        }while (z!=4);
                    }
            }
        }while (j!=3);

    }

}
