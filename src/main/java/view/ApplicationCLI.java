package view;

import games.RockPaperScissorsGame;

public class ApplicationCLI {

    private Menu menu;
    public ApplicationCLI(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        menu.showWelcomeMessage();
        menu.letTheGamesBegin();
        knockKnock();
    }

    public void knockKnock() {
        String userSelection = menu.doYouAnswerTheDoor();

        if (userSelection.equalsIgnoreCase("Y")) {
           menu.answerTheDoor();
           menu.rockPaperScissorsGame();;
        } else if (userSelection.equalsIgnoreCase("N")) {
           menu.dontAnswerTheDoor();
           menu.rockPaperScissorsGame();
        } else {
            menu.tellUserInvalidSelection();
            knockKnock();
        }
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
        ApplicationCLI cli = new ApplicationCLI(menu);
        cli.run();
    }
}
