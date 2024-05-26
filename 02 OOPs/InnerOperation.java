interface Operation {
    int perform(int x, int y);
}

class Add implements Operation {
        @Override
        public int perform(int x,int y) {
            return x + y;

        }
}

class Subtract implements Operation{

    @Override
    public int perform(int x, int y) {
        return x - y;
    }


}

class Divide implements Operation {

    @Override
    public int perform(int x, int y) {
        if(y == 0){
            return -1;
        }
        return x / y;
    }

}
    
public class InnerOperation {
    public static void main(String[] args) {
        
    }

    
}