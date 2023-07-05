public class cafe {
    public static void main(String[]args){

        double dripCoffee = 4.5 ;

        int latte = 12;
        int cappuccino = 15;
        int coffe = 13;
        int total = latte + coffe;

        String customer1 = "Sam";
        String customer2 ="Jimmy";
        String customer3 = "Noah";
        String customer4 ="Cindhuri";

        boolean isReady = true;

        System.out.println(customer4 + " ordered number " + cappuccino + " and his order status" +' ' + !isReady);

        if (!isReady){
            System.out.println(customer3 +" order price "+ cappuccino );
        }
        else{
            System.out.println(customer3 +" order has not Ready" );
        }


        if (isReady){
            System.out.println(customer1 + " order price " + latte*2);
        }

        System.out.println(customer2 + " must pay " + total );

    }
}

