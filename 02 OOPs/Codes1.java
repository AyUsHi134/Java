public class Codes1 extends AbstractCodes{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the utensils");
    }

    @Override
    void prepareTheDish() {
        System.out.println("Prepare the dishes");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the utensils");
    }
    
}
