public abstract class AbstractCodes {

    public void execute(){

        getReady();
        prepareTheDish();
        cleanup();
        
    }

    abstract void getReady();
    abstract void prepareTheDish();
    abstract void cleanup();
    //prepare
    //recipe
    //cleanup
    


public static void main(String[] args) {
    Codes1 code = new Codes1();
    code.execute();

    CodeWithAbstraction codes = new CodeWithAbstraction();
    codes.execute();
}
}


