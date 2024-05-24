public class ChessGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
        System.out.println("Move peice down");
    }

    @Override
    public void left() {
        System.out.println("Move peice left");
    }

    @Override
    public void right() {
        System.out.println("Move peice right");
    }

    public static void main(String[] args) {
        ChessGame game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();
    }

    
}