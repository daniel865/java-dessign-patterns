package facadepattern;

public class RobotFacade {

    private RobotColor robotColor;
    private RobotMetal robotMetal;
    private RobotBody robotBody;

    public RobotFacade() {
        robotColor = new RobotColor();
        robotMetal = new RobotMetal();
        robotBody = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("Creation of the Robot start");
        robotColor.setColor(color);
        robotMetal.setMetal(metal);
        robotBody.createBody();
        System.out.println("Robot Creation End");
        System.out.println();
    }

}
