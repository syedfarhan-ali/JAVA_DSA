class TypePromotion{
    public static void main(String args[]){
        int a = 15;
        float b = 25f;
        double c = 100;
        long d = 100;
        double e = a+b+c+d;
        System.out.println(e);

        byte B = 5;
        B = (byte)(B*2);
        System.out.println(B);
    }
}