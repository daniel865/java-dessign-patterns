package facadepattern;

public class FacadePatternEx {

    public static void main(String[] args) {
        System.out.println("*** Facade Pattern Demo ***");
        RobotFacade robotFacade = new RobotFacade();
        robotFacade.constructRobot("Green", "Iron");
        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.constructRobot("Blue", "Steel");
    }

}
