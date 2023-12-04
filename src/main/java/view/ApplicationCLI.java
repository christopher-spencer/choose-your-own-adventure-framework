package view;

import games.RockPaperScissorsGame;

public class ApplicationCLI {

    private Menu menu;
    boolean continuePlaying = true;

    public ApplicationCLI(Menu menu) {
        this.menu = menu;
    }


    public void run() {
        menu.showWelcomeMessage();
        menu.letTheGamesBegin();
        while (continuePlaying) {
            knockKnock();
        }
    }
    
    public void knockKnock() {
        String userSelection = menu.doYouAnswerTheDoor();

        if (userSelection.equalsIgnoreCase("Y") || userSelection.equalsIgnoreCase("YES")) {
           menu.answerTheDoor();
        } else if (userSelection.equalsIgnoreCase("N") || (userSelection.equalsIgnoreCase("NO"))) {
           menu.dontAnswerTheDoor();
        } else if (userSelection.equalsIgnoreCase("Q") || (userSelection.equalsIgnoreCase("QUIT"))) {
            continuePlaying = false;
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
