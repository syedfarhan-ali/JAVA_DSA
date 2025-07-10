public class TaxCalculator{
    public static void main(String args[]){
        int income = 600000;
        if(income < 500000){
            System.out.println("Tax is 0% = "+ 0);
        }else if(income >= 500000 && income < 1000000){
            System.out.println("Tax is 20% = "+ (income*0.20));
        }else{
            System.out.println("Tax is 30% = "+ (income*0.30));
        }
    }    
}