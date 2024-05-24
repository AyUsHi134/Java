public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Goes into a hole");
    }

    @Override
    public void left() {
        System.out.println();
    }

    @Override
    public void right() {
        System.out.println("Go forward");
    }

    public static void main(String[] args) {
        GamingConsole game = new MarioGame();// 
        //ChessGame game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }

    
}