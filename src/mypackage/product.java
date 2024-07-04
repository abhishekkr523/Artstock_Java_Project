package mypackage;
import java.util.Scanner;


public class product{
    static Scanner sc = new Scanner(System.in);
//    String pTitle, pDescription, pPrice, pSize;
    static String[][] images=new String[16][10];
    static String[][] clips=new String[16][10];
    static String[][] videos=new String[16][10];
    static String[][] nfts=new String[16][10];
    static String[][] paintings=new String[16][10];
    String[] artProduct=new String[10];
//    static int imgrow;
//    static int imgcol;
//    static int clprow;
//    static int clpcol;
//    static int vidrow;
//    static int vidcol;
//    static int nftrow;
//    static int nftcol;
//    static int pntrow;
//    static int pntcol;
//    static void showProducts(){
//        System.out.println("Here are the latest products from our collection: ");
//        System.out.println("Choose what you want to see: ");
//        System.out.println("Choice 1: Images.");
//        System.out.println("Choice 2: Clips.");
//        System.out.println("Choice 3: Videos.");
//        System.out.println("Choice 4: NFTs.");
//        System.out.println("Choice 5: Paintings.");
//        System.out.println("Choice 6: Back.");
//    }
//    static void image(){
//        System.out.println("Here is a collection of Images for you: ");
//    }
//    static void clips(){
//        System.out.println("Here is a collection of Images for you: ");
//        for (clprow = 0; clprow<4; clprow++ ){
//            for (clpcol = 0; clpcol<4; clpcol++){
//                System.out.print("  CLIPS  ");
//            }
//            System.out.println(" ");
//        }
//    }
//    static void videos(){
//        System.out.println("Here is a collection of Images for you: ");
//        for (vidrow = 0; vidrow<4; vidrow++ ){
//            for (vidcol = 0; vidcol<4; vidcol++){
//                System.out.print("  VIDEOS  ");
//            }
//            System.out.println(" ");
//        }
//    }
//    static void nft(){
//        System.out.println("Here is a collection of Images for you: ");
//        for (nftrow = 0; nftrow<4; nftrow++ ){
//            for (nftcol = 0; nftcol<4; nftcol++){
//                System.out.print("  NFTs  ");
//            }
//            System.out.println(" ");
//        }
//    }
//    static void painting(){
//        System.out.println("Here is a collection of Images for you: ");
//        for (pntrow = 0; pntrow<4; pntrow++ ){
//            for (pntcol = 0; pntcol<4; pntcol++){
//                System.out.print("  PAINTINGS  ");
//            }
//            System.out.println(" ");
//        }
//    }
//    void showProductDetails(){
//        System.out.println("Product Name: ");
//        System.out.println("Product Type: ");
//        System.out.println("Product Size: ");
//        System.out.println("Product Price: ");
//        System.out.println("Product Key: ");
//    }
static void sellProduct(){
        int getProRow, getProCol;
        int whatTypePro,toBreak;
        System.out.println("What type of product do want to sell: ");
        System.out.println("Type 1: Images. ");
        System.out.println("Type 2: Clips. ");
        System.out.println("Type 3: Videos. ");
        System.out.println("Type 4: NFTs. ");
        System.out.println("Type 5: Paintings. ");
        whatTypePro=sc.nextInt();
        switch (whatTypePro){
            case 1:
                for (getProRow=0; getProRow<16; getProRow++){
                    for (getProCol=0; getProCol<10; getProRow++){
                        System.out.println("Here Enter the details about your product: ");
                        System.out.println("Prodct Title: ");
                        images[getProRow][0]=sc.nextLine();
                        System.out.println("Enter Product Description: ");
                        images[getProRow][1]=sc.nextLine();
                        System.out.println("Enter Product Size: ");
                        images[getProRow][2]=sc.nextLine();
                        System.out.println("Enter Product Price: ");
                        images[getProRow][3]=sc.nextLine();
                        System.out.println("Or enter 1 to exit.");
                        System.out.println("Or 2 to continue.");
                        toBreak=sc.nextInt();
                        switch (toBreak){
                            case 1:
                                break;
                            case 2:
                                continue;
                        }

                    }
                }
            case 2:
                for (getProRow=0; getProRow<16; getProRow++){
                    for (getProCol=0; getProCol<10; getProRow++){
                        System.out.println("Here Enter the details about your product: ");
                        System.out.println("Prodct Title: ");
                        clips[getProRow][0]=sc.nextLine();
                        System.out.println("Enter Product Description: ");
                        clips[getProRow][1]=sc.nextLine();
                        System.out.println("Enter Product Size: ");
                        clips[getProRow][2]=sc.nextLine();
                        System.out.println("Enter Product Price: ");
                        clips[getProRow][3]=sc.nextLine();
                        System.out.println("Or enter 1 to exit.");
                        System.out.println("Or 2 to continue.");
                        toBreak=sc.nextInt();
                        switch (toBreak){
                            case 1:
                                break;
                            case 2:
                                continue;
                        }
                    }
                }
            case 3:
                for (getProRow=0; getProRow<16; getProRow++){
                    for (getProCol=0; getProCol<10; getProRow++){
                        System.out.println("Here Enter the details about your product: ");
                        System.out.println("Prodct Title: ");
                        videos[getProRow][0]=sc.nextLine();
                        System.out.println("Enter Product Description: ");
                        videos[getProRow][1]=sc.nextLine();
                        System.out.println("Enter Product Size: ");
                        videos[getProRow][2]=sc.nextLine();
                        System.out.println("Enter Product Price: ");
                        videos[getProRow][3]=sc.nextLine();
                        System.out.println("Or enter 1 to exit.");
                        System.out.println("Or 2 to continue.");
                        toBreak=sc.nextInt();
                        switch (toBreak){
                            case 1:
                                break;
                            case 2:
                                continue;
                        }
                    }
                }
            case 4:
                for (getProRow=0; getProRow<16; getProRow++){
                    for (getProCol=0; getProCol<10; getProRow++){
                        System.out.println("Here Enter the details about your product: ");
                        System.out.println("Prodct Title: ");
                        nfts[getProRow][0]=sc.nextLine();
                        System.out.println("Enter Product Description: ");
                        nfts[getProRow][1]=sc.nextLine();
                        System.out.println("Enter Product Size: ");
                        nfts[getProRow][2]=sc.nextLine();
                        System.out.println("Enter Product Price: ");
                        nfts[getProRow][3]=sc.nextLine();
                        System.out.println("Or enter 1 to exit.");
                        System.out.println("Or 2 to continue.");
                        toBreak=sc.nextInt();
                        switch (toBreak){
                            case 1:
                                break;
                            case 2:
                                continue;
                        }
                    }
                }
            case 5:
                for (getProRow=0; getProRow<16; getProRow++){
                    for (getProCol=0; getProCol<10; getProRow++){
                        System.out.println("Here Enter the details about your product: ");
                        System.out.println("Prodct Title: ");
                        paintings[getProRow][0]=sc.nextLine();
                        System.out.println("Enter Product Description: ");
                        paintings[getProRow][1]=sc.nextLine();
                        System.out.println("Enter Product Size: ");
                        paintings[getProRow][2]=sc.nextLine();
                        System.out.println("Enter Product Price: ");
                        paintings[getProRow][3]=sc.nextLine();
                        System.out.println("Or enter 1 to exit.");
                        System.out.println("Or 2 to continue.");
                        toBreak=sc.nextInt();
                        switch (toBreak){
                            case 1:
                                break;
                            case 2:
                                continue;
                        }
                    }
                }
            default:
                System.out.println("Please enter correct choice: ");
        }

//        artProduct[0]=pTitle;
//        artProduct[1]=pDescription;
//        artProduct[2]=pSize;
//        artProduct[3]=pPrice;

    }
    static void showMyProduct(){
        int getArray;
        String[][] proArray;
        do {
            System.out.println("Which category of products do you want to see: ");
            System.out.println("Type 1: Images. ");
            System.out.println("Type 2: Clips. ");
            System.out.println("Type 3: Videos. ");
            System.out.println("Type 4: NFTs. ");
            System.out.println("Type 5: Paintings. ");
            System.out.println("Type 6: Back.");
            getArray=sc.nextInt();
            switch (getArray){
                case 1:
                    System.out.println("Your products are as shown below: ");
                    for (int showrow=0 ; showrow<16; showrow++){
                        for (int showcolumn=0; showcolumn<10; showcolumn++){
                            System.out.println(images[showrow][showcolumn]+" ");
                        }
                    }
                case 2:
                    System.out.println("Your products are as shown below: ");
                    for (int showrow=0 ; showrow<16; showrow++){
                        for (int showcolumn=0; showcolumn<10; showcolumn++){
                            System.out.println(clips[showrow][showcolumn]+" ");
                        }
                    }
                case 3:
                    System.out.println("Your products are as shown below: ");
                    for (int showrow=0 ; showrow<16; showrow++){
                        for (int showcolumn=0; showcolumn<10; showcolumn++){
                            System.out.println(videos[showrow][showcolumn]+" ");
                        }
                    }
                case 4:
                    System.out.println("Your products are as shown below: ");
                    for (int showrow=0 ; showrow<16; showrow++){
                        for (int showcolumn=0; showcolumn<10; showcolumn++){
                            System.out.println(nfts[showrow][showcolumn]+" ");
                        }
                    }
                case 5:
                    System.out.println("Your products are as shown below: ");
                    for (int showrow=0 ; showrow<16; showrow++){
                        for (int showcolumn=0; showcolumn<10; showcolumn++){
                            System.out.println(paintings[showrow][showcolumn]+" ");
                        }
                    }
                default :
                    System.out.println("Please enter correct choice: ");
            }

        }while(getArray!=6);
    }
}

