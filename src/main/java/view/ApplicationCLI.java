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
        } else if (userSelection.equalsIgnoreCase("N")) {
           menu.dontAnswerTheDoor();
        } else {
            menu.tellUserInvalidSelection();
            knockKnock();
        }
    }

    //Todo put in random logic to have the game keep going, switching randomly between games each day

    public static void main(String[] args) {
        Menu menu = new Menu();
        ApplicationCLI cli = new ApplicationCLI(menu);
        cli.run();
    }
}
