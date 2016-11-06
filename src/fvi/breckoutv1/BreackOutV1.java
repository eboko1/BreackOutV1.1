package fvi.breckoutv1;

/**
 * Created by Vika on 06.11.2016.
 */
public class BreackOutV1 {
    //application window in pixel
    private   static  final int APPLICATION_WIDTH=400;
    private   static  final int APPLICATION_HEIGHT=600;

    // dimensions of game board
    private   static  final int WIDTH=APPLICATION_WIDTH;
    private   static  final int HEIGHT=APPLICATION_HEIGHT;

    //Dimensions of paddle up from the bottom
    private   static  final int PADDLE_WIDTH=60;
    private   static  final int PADDLE_HEIGTH=10;

    //offset of the paddle up from the bottom
    private   static  final int PADDLE_Y_OFFSET=30;

    //number of bricks per row
    private   static  final int NBRICKS_PER_ROW=10;

    // number of rows of bricks
    private   static  final int NBRICK_ROWS=10;

    // separation between bricks
    private static final int BRICK_SEP=4;

    // width between bricks
    private static final double BRICK_WIDTH=(WIDTH-(NBRICKS_PER_ROW-1)*BRICK_SEP)/NBRICKS_PER_ROW;

    //height of a brick
    private static final int BRICK_HEIGHT=8;

    //radius of the ball in pixel
    private static final int BALL_RADIUS=10;

    //offset of the top brick row from the top
    private static final int BRICK_Y_OFFSET=70;

    //number of turns
    private static final int NTURNS=3;

    public void  run(){
        
    }


}
