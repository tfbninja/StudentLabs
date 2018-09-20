/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab07c_rock_paper_scissors_GUI_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GraphicsRunner extends Application{

    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;
    //this variable is the area to which all text is written
    private TextArea textOutput;
    //these are the buttons that can be clicked
    private Button rock;
    private Button paper;
    private Button scissors;
    //use these variables to keep track of the players
    private Player player;
    private Computer computer;
    //use these variables to keep track of the score
    private int playerWinCount;
    private int computerWinCount;
    
    //this keeps track of the most recent result
    private int computerWin;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //these will hold the buttons and the output text box
        VBox root = new VBox();
        HBox buttons = new HBox();
        
        //initialize player / computer and the counts
        player = new Player("player");
        
        //initializes the buttons for the player to use
        rock = new Button();
        rock.setText("Rock");
        rock.setMinSize(100,50);
        rock.setOnAction(new ClickHandler("rock"));
        
        paper = new Button();
        paper.setText("Paper");
        paper.setMinSize(100, 50);
        paper.setOnAction(new ClickHandler("paper"));
        
        scissors = new Button();
        scissors.setText("Scissors");
        scissors.setMinSize(100, 50);
        scissors.setOnAction(new ClickHandler("scissors"));
        
        textOutput = new TextArea();
        Font font = new Font("Verdana", 18);
        textOutput.setFont(font);
        textOutput.setEditable(false);
        textOutput.setStyle("-fx-text-fill: green");
        textOutput.setText("WELCOME TO ROCK-PAPER-SCISSORS!!!");
        textOutput.setMinSize(WIDTH, HEIGHT-50);
        
        root.getChildren().add(textOutput);
        buttons.getChildren().addAll(rock, paper, scissors);
        root.getChildren().add(buttons);
        
        Scene primaryScene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Rock Paper Scissors");
        primaryStage.setScene(primaryScene);
        primaryStage.show();
        //
    }
    
    public void findWinner() {
        computerWin = computer.didIWin(player);
        if (computerWin == 1) {
            computerWinCount++;
        } else if (computerWin == -1) {
            playerWinCount++;
        }
    }
    
    public void updateText() {
        String text = "";
        //show what the player and computer chose
        
        //show who won
        
        //show the player's score and the computer's score
        text += "\n\nPick Again!";
        
        textOutput.setText(text);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public class ClickHandler implements EventHandler<ActionEvent> {

        private String choice;
        
        public ClickHandler(String choice) {
            this.choice = choice;
        }
        
        @Override
        public void handle(ActionEvent event) {
            System.out.println("handling");
            player.setChoice(choice);
            computer.randomSetChoice();
            findWinner();
            updateText();
        }
        
    }
}
