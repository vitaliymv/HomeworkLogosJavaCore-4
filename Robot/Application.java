package JavaCore_4.Robot;

public class Application {

    public static void main(String[] args) {

        Robot robot = new Robot();
        Robot coffeeRobot = new CoffeeRobot();
        Robot robotDancer = new RobotDancer();
        Robot robotCooker = new RobotCooker();

        robot.work();
        coffeeRobot.work();
        robotDancer.work();
        robotCooker.work();

    }
}
