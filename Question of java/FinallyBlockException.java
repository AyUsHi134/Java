public class FinallyBlockException {
    public static void main(String[] args) {
        int a[] = new int[5];
       /*  try{
            System.out.println(a[8]);
        } catch(Exception e){
            System.out.println("exceptions handled");
        } finally{
            System.out.println("i always run");
        }
        System.out.println("bye guys");
    }*/
    try {
        getNumberFromArray(a);
    } catch (Exception e) { 
        System.out.println("exception handled" + e.getMessage());
    }
   
}


static int getNumberFromArray(int a[]) throws ArithmeticException{
    return a[8];
}
}