package view;

public class ApplicationCLI {

    private Menu menu;
    boolean continuePlaying = true;

    public ApplicationCLI(Menu menu) {
        this.menu = menu;
    }


    public void run() {
        menu.showWelcomeMessage();
        menu.prologue();
        while (continuePlaying) {
            knockKnock();
        }
    }
    
    public void knockKnock() {
        while (continuePlaying) {
            String userSelection = menu.doYouAnswerTheDoor();

            if (userSelection.equalsIgnoreCase("Y") || userSelection.equalsIgnoreCase("YES")) {
                menu.answerTheDoor();
            } else if (userSelection.equalsIgnoreCase("N") || (userSelection.equalsIgnoreCase("NO"))) {
                menu.dontAnswerTheDoor();
            } else if (userSelection.equalsIgnoreCase("Q") || (userSelection.equalsIgnoreCase("QUIT"))) {
                continuePlaying = false;
            } else {
                menu.tellUserInvalidSelection();
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        ApplicationCLI cli = new ApplicationCLI(menu);
        cli.run();
    }
}
