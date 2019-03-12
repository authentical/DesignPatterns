package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

interface  RobotInterface{

    void print();

}
class SmallRobot  implements  RobotInterface{

    @Override
    public void print() {
        System.out.println("Small robot");
    }
}
class LargeRobot  implements  RobotInterface{

    @Override
    public void print() {
        System.out.println("Large Robot");
    }
}

class RobotFactory{ // Supposed to be immutable

    Map<String, RobotInterface> robots = new HashMap<>();

    public int totalObjectsCreated() {
        return robots.size();
    }

    ///// Structural.Flyweight mechanism /////////////////
    public RobotInterface getRobotFromFactory(String robotCategory) throws Exception{

        RobotInterface concreteRobot = null;

        if(robots.containsKey(robotCategory)){

            concreteRobot = robots.get(robotCategory);
        } else{
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have a small Robot.  So we are creating a small Robot now");
                    concreteRobot = new SmallRobot();
                    robots.put("Small", concreteRobot);
                    break;
                case "large":
                    System.out.println("We do not have large Robot. So we are creating a large Robot now .");
                    concreteRobot = new LargeRobot();
                    robots.put("Large", concreteRobot);
                    break;
                default:
                    throw new Exception(" Robot Creational.Factory can create only small and large Robots");
            }
        }

        return concreteRobot;
    }
    ///////////////////////////////////////////
}








public class FlyweightMain {


    public static void main(String[] args) throws Exception {

        RobotFactory myfactory = new RobotFactory();

        RobotInterface robot = myfactory.getRobotFromFactory("small");
        robot = myfactory.getRobotFromFactory("small");
        robot = myfactory.getRobotFromFactory("small");
        robot = myfactory.getRobotFromFactory("small");

        robot.print();

        int NumOfDistinctRobots = myfactory.totalObjectsCreated();
        System.out.println("Distinct Robots created: "+ NumOfDistinctRobots);
    }




}
