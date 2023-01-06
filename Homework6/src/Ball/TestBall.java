package Ball;

import Ball.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        for (int step = 0; step < 100; step++) {
            ball.move();
            System.out.println(ball);
        }
    }
}
