package mypackage;

import mypackage.product;

class order extends product {
    String orderID;
    String orderName;
    String trackingId;
    static String[][] orderHistory=new String[20][10];
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment;
    }

    public String getWhoOrdered() {
        return whoOrdered;
    }

    public void setWhoOrdered(String whoOrdered) {
        this.whoOrdered = whoOrdered;
    }

    String transactionId;
    String orderDetails;
    String orderDate;
    String orderPayment;
    String whoOrdered;
    static void buyProducts(){
        int chooseOrderCategory;
        int chooseOrder;
        int numberOr;
        do {
            System.out.println("Choose Which Type of Products Do You Want To Buy: ");
            System.out.println("Type 1: Images. ");
            System.out.println("Type 2: Clips. ");
            System.out.println("Type 3: Videos. ");
            System.out.println("Type 4: NFTs. ");
            System.out.println("Type 5: Paintings. ");
            System.out.println("Type 6: Back. ");
            chooseOrderCategory=sc.nextInt();
            switch (chooseOrderCategory){
                case 1:
                    do {
                        System.out.println("Enter the serial number of product you want to buy: ");
                        chooseOrder=sc.nextInt();
                        orderHistory[chooseOrder][10]=images[chooseOrder][10];
                        System.out.println("Enter 1 to Exit Or 2 to Continue.");
                        numberOr=sc.nextInt();
                    }while(numberOr!=1);
                case 2:
                    do {
                        System.out.println("Enter the serial number of product you want to buy: ");
                        chooseOrder=sc.nextInt();
                        orderHistory[chooseOrder][10]=clips[chooseOrder][10];
                        System.out.println("Enter 1 to Exit Or 2 to Continue.");
                        numberOr=sc.nextInt();
                    }while(numberOr!=1);
                case 3:
                    do {
                        System.out.println("Enter the serial number of product you want to buy: ");
                        chooseOrder=sc.nextInt();
                        orderHistory[chooseOrder][10]=videos[chooseOrder][10];
                        System.out.println("Enter 1 to Exit Or 2 to Continue.");
                        numberOr=sc.nextInt();
                    }while(numberOr!=1);
                case 4:
                    do {
                        System.out.println("Enter the serial number of product you want to buy: ");
                        chooseOrder=sc.nextInt();
                        orderHistory[chooseOrder][10]=nfts[chooseOrder][10];
                        System.out.println("Enter 1 to Exit Or 2 to Continue.");
                        numberOr=sc.nextInt();
                    }while(numberOr!=1);
                case 5:
                    do {
                        System.out.println("Enter the serial number of product you want to buy: ");
                        chooseOrder=sc.nextInt();
                        orderHistory[chooseOrder][10]=paintings[chooseOrder][10];
                        System.out.println("Enter 1 to Exit Or 2 to Continue.");
                        numberOr=sc.nextInt();
                    }while(numberOr!=1);

            }
        }while (chooseOrderCategory!=6);
    }
    static void seeOrderHistory(){
        int orhisrow,orhiscol;
        for (orhisrow=0; orhisrow<20; orhisrow++){
            for(orhiscol=0; orhiscol<10; orhiscol++){
                System.out.println(orderHistory[orhisrow][orhiscol]+" ");
            }
        }
    }
}

