public class Project {


    interface Test {
        void nothing();
         default void nothing1() { // helps in default implementation

         }
    
    }

    class Class1 implements Test{
        public void nothing() {

        }
    }

    class Class2 implements Test{
        public void nothing() {

        }
    }

    public static void main(String[] args) {



        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10, 20));
         
        
    }
    
}
