package mypackage;

import java.util.Scanner;

public class ArtistDetails {
    int artrow;
    int current;
    Scanner sc = new Scanner(System.in);
    String name2, artistname, artcountry, artstate, artdistrict, artaddress, artpassword, artgender;
    int artmonth, artday, artyear, artpostcode, artmobile;

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname;
    }

    public String getArtcountry() {
        return artcountry;
    }

    public void setArtcountry(String artcountry) {
        this.artcountry = artcountry;
    }

    public String getArtstate() {
        return artstate;
    }

    public void setArtstate(String artstate) {
        this.artstate = artstate;
    }

    public String getArtdistrict() {
        return artdistrict;
    }

    public void setArtdistrict(String artdistrict) {
        this.artdistrict = artdistrict;
    }

    public String getArtaddress() {
        return artaddress;
    }

    public void setArtaddress(String artaddress) {
        this.artaddress = artaddress;
    }

    public String getArtpassword() {
        return artpassword;
    }

    public void setArtpassword(String artpassword) {
        this.artpassword = artpassword;
    }

    public int getArtmonth() {
        return artmonth;
    }

    public void setArtmonth(int artmonth) {
        this.artmonth = artmonth;
    }

    public int getArtday() {
        return artday;
    }

    public void setArtday(int artday) {
        this.artday = artday;
    }

    public int getArtyear() {
        return artyear;
    }

    public void setArtyear(int artyear) {
        this.artyear = artyear;
    }

    public int getArtpostcode() {
        return artpostcode;
    }

    public void setArtpostcode(int artpostcode) {
        this.artpostcode = artpostcode;
    }

    public int getArtmobile() {
        return artmobile;
    }

    public void setArtmobile(int artmobile) {
        this.artmobile = artmobile;
    }

    public String[][] getArrartist() {
        return arrartist;
    }

    public void setArrartist(String[] arrartist) {
        this.arrartist = new String[][]{arrartist};
    }

    String[][] arrartist = new String[20][20];

    void afterArtistSignin() {
        int q;
        int r;
        do {
            System.out.println("Now choose what do you want to do:");
            System.out.println("Choice 1: See My Profile.");
            System.out.println("Choice 2: See Latest Products.");
            System.out.println("Choice 3: Order History.");
            System.out.println("Choice 4: Back.");
            q = sc.nextInt();
            switch (q) {
                case 1:
                    showArtistDetails();
                    break;
                case 2:
//                    do {
//                        product.showProducts();
//                        r = sc.nextInt();
//                        switch (r) {
//                            case 1:
//                                product.image();
//                            case 2:
//                                product.clips();
//                            case 3:
//                                product.videos();
//                            case 4:
//                                product.nft();
//                            case 5:
//                                product.painting();
//                            default:
//                                System.out.println("Please Enter Correct Choice: ");
//                        }
//                    } while (r != 6);
                default:
                    System.out.println("Please Enter Correct Choice: ");
            }
        } while (q != 4);

    }
    void setArtistDetails() {
        int artistArray;
        do {
            artrow=0;
            System.out.println("Enter your details here as an Artist.");
            System.out.println("Enter your full name here: ");
            arrartist[artrow][0]=name2 = sc.nextLine();
            System.out.println("Enter your artist here: ");
            arrartist[artrow][1]=artistname = sc.nextLine();
            System.out.println("Enter your address here: ");
            System.out.println("Enter Your Country: ");
            arrartist[artrow][8]=artcountry = sc.nextLine();
            System.out.println("Enter Your State: ");
            arrartist[artrow][9]=artstate = sc.nextLine();
            System.out.println("Enter Your Disrict: ");
            arrartist[artrow][10]=artdistrict = sc.nextLine();
            arrartist[artrow][2]=artaddress = artdistrict +", " + artstate + ", "+artcountry;
            System.out.println("Enter your postal code: ");
            arrartist[artrow][3]= String.valueOf(artpostcode=sc.nextInt());
            System.out.println("Enter your gender: ");
            arrartist[artrow][4]=artgender = sc.nextLine();
            System.out.println("Enter your Date of Birth here:");
            System.out.println("Enter the Day of Birth: ");
            arrartist[artrow][11]= String.valueOf(artday = sc.nextInt());
            while (artday > 31 || artday < 0 || artday == 0) {
                System.out.println("Please enter the correct detail:");
                arrartist[artrow][11]= String.valueOf(artday = sc.nextInt());
            }

            System.out.println("Enter the Month: ");
            arrartist[artrow][12]= String.valueOf(artmonth = sc.nextInt());
            while (artmonth < 0 || artmonth > 13 || artmonth == 13) {
                System.out.println("Please enter correct detail:");
                arrartist[artrow][12]= String.valueOf(artmonth = sc.nextInt());
            }
            System.out.println("Enter the Year: ");
            arrartist[artrow][13]= String.valueOf(artyear = sc.nextInt());
            while (artyear > 2023 || artyear < 0 || artyear == 0) {
                System.out.println("Please enter correct detail:");
                arrartist[artrow][13]= String.valueOf(artyear = sc.nextInt());
            }
            String artdob;
            arrartist[artrow][5]=artdob = artday + "/" + artmonth + "/" + artyear;
            System.out.println("Enter your mobile number here: ");
            arrartist[artrow][6]= String.valueOf(artmobile=sc.nextInt());
            System.out.println("Enter your password here: ");
            System.out.println("Use alphabets(A-Z and a-z), numbers(0-1), special symbols");
            System.out.println("The password should contain 8 characters.");
            arrartist[artrow][7]=artpassword = sc.nextLine();
            while(artpassword.length()!=8){
                System.out.println("Your password should contain 8 characters.");
                System.out.println("Please enter your password again: ");
                arrartist[artrow][7]=artpassword = sc.nextLine();
            }
//        arrartist[0] = name2;
//        arrartist[1] = artistname;
//        arrartist[2] = artaddress;
//        arrartist[3] = artdob;
//        arrartist[4] = String.valueOf(artpostcode);
//        arrartist[5] = String.valueOf(artmobile);
            System.out.println("Enter 1 if you are done: ");
            artistArray=sc.nextInt();
        }while (artistArray!=1);
    }

    void showArtistDetails() {
        System.out.println("Name: " + arrartist[current][0]);
        System.out.println("Artistname: " + arrartist[current][1]);
        System.out.println("Address: " + arrartist[current][2]);
        System.out.println("Postal Code: " + arrartist[current][3]);
        System.out.println("Gender: " + arrartist[current][4]);
        System.out.println("Date of Birth: " + arrartist[current][5]);
        System.out.println("Mobile Number: "+ arrartist[current][6]);
        System.out.println("Password: "+ arrartist[current][7]);
    }

    int x1;
    int x2;
//    int[] searchArtist(String searchArtistname, String searchArtPassword) {
//        for (x1 = 0; x1 < arrartist.length; x1++) {
//            for (x2 =0; x2< arrartist[x1].length; x2++){
//                if (arrartist[x1][x2].equals(searchArtistname) && arrartist[x1][x2].equals(searchArtPassword)) {
//                    return new int[] {x1,x2};
//                }
//
//            }
//        }
//        return new int[] {-1, -1};
//    }
    int[] searchArtist(String searchArtistname, String searchArtPassword) {
        for(x1 =0; x1<20 ; x1++){
            if(!arrartist[x1][1].equals(searchArtistname) && !arrartist[x1][7].equals(searchArtPassword)){
                System.out.print("Element not found!");
            }
        }
        return new int[]{x1};
    }
}
