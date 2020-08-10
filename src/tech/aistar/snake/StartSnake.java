package tech.aistar.snake;

import java.util.Scanner;

/**
 * 本类用来演示:开始游戏
 *
 * @author: success
 * @date: 2020/8/10 2:49 下午
 */
public class StartSnake {
    public static void main(String[] args) {
        SnakeGame game = new SnakeGame();

        //为了获取内部类Snake对象
        SnakeGame.Snake snake = game.getSnake();

        Scanner sc = new Scanner(System.in);
        while(true){
            game.printGames();
            System.out.print("请您输入>");
            String dirs = sc.nextLine();
            switch (dirs){
                case "w":
                    //向上走..
                    snake.steps(SnakeGame.Snake.UP);
                    break;
                case "s":
                    //向下走..
                    snake.steps(SnakeGame.Snake.DOWN);
                    break;
                case "a":
                    //向上走..
                    snake.steps(SnakeGame.Snake.LEFT);
                    break;
                case "d":
                    //向上走..
                    snake.steps(SnakeGame.Snake.RIGHT);
                    break;

            }
        }

    }
}
