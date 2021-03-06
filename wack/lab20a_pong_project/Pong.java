package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;

import javafx.stage.Screen;

/**
 *
 * @author wkranz
 */
public class Pong extends Application {

    private static int width = 800;
    private static int height = 600;
    private static int smallW = 100;
    private static int smallH = 100;
    private static Canvas canvas;
    RedrawTimer timer = new RedrawTimer();
    private int leftScore = 0;
    private int rightScore = 0;
    private int paddleMargin = 25;
    private int paddleHeight = 125;
    private int paddleWidth = 35;
    private Block bg = new Block(0, 0, width, height, Color.BLACK);
    private Ball ball;
    private Paddle left;
    private Paddle right;

    private double apprxmtBallStartingSpeed = 20.2;
    private double ballAccelerationPerHit = 0.4;
    private double topPaddleSpeed = 25;

    private int paddleSpeed = 22;
    private boolean paddleKeepsRatio = true;

    private boolean paused = true;
    private int keyHits = 0;
    private final boolean AI = true;
    private final boolean rAI = true;
    private static boolean devPerms = false;
    private double xVel = apprxmtBallStartingSpeed;
    private double yVel = apprxmtBallStartingSpeed;

    private Color ballColor = Color.LAWNGREEN;
    private int frame = 0;

    @Override
    public void start(Stage primaryStage) {
        Rectangle2D border = Screen.getPrimary().getBounds();
        width = (int) border.getWidth();
        height = (int) border.getHeight();
        canvas = new Canvas(width, height);
        canvas.setWidth(width);
        canvas.setHeight(height);
        bg.setWidth(width);
        bg.setHeight(height);
        primaryStage.setMinWidth(smallW);
        primaryStage.setMinHeight(smallH);
        primaryStage.setResizable(false);
        primaryStage.setWidth(smallW);
        primaryStage.setHeight(smallH);
        primaryStage.setFullScreen(true);
        StackPane root = new StackPane();

        root.getChildren().add(canvas);
        ball = new Ball(width / 2, height / 2, 20, 20, ballColor, apprxmtBallStartingSpeed, ballAccelerationPerHit);
        ball.setBounds(0, 0, width, height);

        //instantiate a left Paddle
        left = new Paddle(paddleMargin, height / 2 - paddleHeight / 2, paddleWidth, paddleHeight, Color.BLUE, paddleSpeed);
        left.setYBounds(0, height);
        left.setKeepsSpeedRatio(paddleKeepsRatio);
        left.setTopSpeed(topPaddleSpeed);

        //instantiate a right Paddle
        right = new Paddle(width - paddleMargin - paddleWidth, height / 2 - paddleHeight / 2, paddleWidth, paddleHeight, Color.RED, paddleSpeed);
        right.setYBounds(0, height);
        right.setKeepsSpeedRatio(paddleKeepsRatio);
        right.setTopSpeed(topPaddleSpeed);

        ball.addPaddles(left, right);
        left.setBall(ball);
        right.setBall(ball);
        Scene scene = new Scene(root, width, height);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (keyHits == 0) {
                    paused = false;
                }
                keyHits++;
                if (!rAI) {
                    if (event.getCode() == KeyCode.UP) {
                        right.up();
                    }
                    if (event.getCode() == KeyCode.DOWN) {
                        right.down();
                    }
                }
                if (!AI) {
                    if (event.getCode() == KeyCode.W) {
                        left.up();
                    }
                    if (event.getCode() == KeyCode.S) {
                        left.down();
                    }
                }
                if (event.getCode() == KeyCode.ESCAPE) {
                    primaryStage.close();
                }
            }
        });
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int mX = (int) event.getX();
                int mY = (int) event.getY();
                if (event.isPrimaryButtonDown()) {
                    if (devPerms) {
                        ball.setXPos(mX);
                        ball.setYPos(mY);
                        ball.setXSpeed(xVel);
                        ball.setYSpeed(yVel);
                    }
                } else if (event.isSecondaryButtonDown()) {
                    xVel = ball.getXSpeed();
                    yVel = ball.getYSpeed();
                } else if (event.isAltDown()) {
                    enableDevPerms();
                }
            }
        });
        scene.setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent event) {
                disableDevPerms();
            }
        });
        scene.setOnKeyReleased(
                new EventHandler<KeyEvent>() {
                    @Override
                    public void handle(KeyEvent event
                    ) {
                        if (event.getCode() == KeyCode.UP) {
                            right.stop();
                        }
                        if (event.getCode() == KeyCode.DOWN) {
                            right.stop();
                        }
                        if (event.getCode() == KeyCode.W) {
                            left.stop();
                        }
                        if (event.getCode() == KeyCode.S) {
                            left.stop();
                        }
                        if (event.getCode() == KeyCode.P) {
                            paused = !paused;
                        }
                        if (event.getCode() == KeyCode.F11) {
                            primaryStage.setTitle("Pranked");
                        }
                    }
                }
        );
        primaryStage.setTitle(
                "The game of realizing that you should probably go outside and play some tennis or badminton.");
        primaryStage.setFullScreenExitHint(
                "Press any key to begin");
        primaryStage.setScene(scene);

        primaryStage.show();

        timer.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static void enableDevPerms() {
        devPerms = true;
    }

    public static void disableDevPerms() {
        devPerms = false;
    }

    public boolean withinMargin(double amt, double target, double margin) {
        return amt > target - margin && amt < target + margin;
    }

    public double finalBallYPos(double ballX, double ballY, double ballXSpeed, double ballYSpeed, double ballWidth, double targetXPos) {
        while (!withinMargin(ballX, targetXPos, ballWidth) && ballX > targetXPos) {
            if (ballY > canvas.getHeight() || ballY < 0) {
                ballYSpeed = -ballYSpeed;
            }
            ballX += ballXSpeed;
            ballY += ballYSpeed;
        }
        return ballY;
    }

    public double rFinalBallYPos(double ballX, double ballY, double ballXSpeed, double ballYSpeed, double ballWidth, double targetXPos) {
        while (!withinMargin(ballX, targetXPos, ballWidth) && ballX < targetXPos) {
            if (ballY > canvas.getHeight() || ballY < 0) {
                ballYSpeed = -ballYSpeed;
            }
            ballX += ballXSpeed;
            ballY += ballYSpeed;
        }
        return ballY;
    }

    public void compute(Ball b, Paddle self) {
        double x = self.getX(), y = self.getY(), w = self.getWidth(), h = self.getHeight(), bX = b.getX(), bY = b.getY(), bW = b.getWidth(), bH = b.getHeight(), bXS = b.getXSpeed(), bYS = b.getYSpeed();
        double moveToY;
        if (bXS < 0) {
            moveToY = finalBallYPos(bX, bY, bXS, bYS, bW, x + w) - self.getHeight() / 2 + b.getHeight() / 2;
            if (Math.abs(b.getYSpeed()) > 13) {
                // danger zone
                moveToY += b.getYSpeed();
            }

        } else if (bXS == 0) {
            moveToY = height / 2;
        } else {
            moveToY = bY - h + bW;
        }
        if (!withinMargin(y, moveToY, self.getSpeed())) {
            if (y < moveToY) {
                self.down();
            } else {
                self.up();
            }
        } else {
            self.stop();
        }
    }

    public void rCompute(Ball b, Paddle self) {
        double x = self.getX(), y = self.getY(), w = self.getWidth(), h = self.getHeight(), bX = b.getX(), bY = b.getY(), bW = b.getWidth(), bH = b.getHeight(), bXS = b.getXSpeed(), bYS = b.getYSpeed();
        double moveToY;
        if (bXS > 0) {
            moveToY = rFinalBallYPos(bX, bY, bXS, bYS, bW, x + w) - self.getHeight() / 2 + b.getHeight();
            if (Math.abs(b.getYSpeed()) > 13) {
                // danger zone
                moveToY += b.getYSpeed();
            }
        } else if (bXS == 0) {
            moveToY = height / 2;
        } else {
            moveToY = bY - h + bW;
        }
        if (!withinMargin(y, moveToY, self.getSpeed())) {
            if (y < moveToY) {
                self.down();
            } else {
                self.up();
            }
        } else {
            self.stop();
        }
    }

    public class RedrawTimer extends AnimationTimer {

        @Override
        public void handle(long now) {
            frame++;
            GraphicsContext gc = canvas.getGraphicsContext2D();
            bg.draw(canvas, bg.getColor()); // clear background
            gc.setFont(new Font("Impact", 50));
            gc.setFill(bg.getColor().invert()); // 'cuz dark theme kicks butt
            // draw scores
            gc.fillText("" + leftScore, width / 2 - 100 - gc.getFont().getSize() / 2, 50);
            gc.fillText("" + rightScore, width / 2 + 100, 50);
            left.draw(canvas, left.getColor());
            right.draw(canvas, right.getColor());
            ball.draw(canvas, ball.getColor());
            if (!paused) {
                if (AI) {
                    compute(ball, left);
                }
                if (rAI) {
                    rCompute(ball, right);
                }

                left.update(canvas);
                right.update(canvas);
                ball.update(canvas);

                if (frame % 5 == 0) {
                    ball.setColor(ball.getColor().invert());
                }

                int scoreChange = ball.pongBehavior();
                if (scoreChange == -1) {
                    rightScore++;
                } else if (scoreChange == 1) {
                    leftScore++;
                }
            }
        }
    }
}
