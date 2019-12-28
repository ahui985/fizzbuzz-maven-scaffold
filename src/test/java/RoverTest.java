import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class RoverTest {
    @Test
    public void should_land_on_area(){
        Point a = new Point(10,10,Direction.E);
        Point b = new Point(-10,10,Direction.E);
        Point c = new Point(-10,-10,Direction.E);
        Point d = new Point(10,-10,Direction.E);
        Area area = new Area(a,b,c,d);
        Rover rover = new Rover();
        Point position = rover.getPoint();
        Point res = new Point(6,5,Direction.E);
        Assert.assertEquals(position,res);
    }
    @Test
    public void should_move_forward(){
        Point a = new Point(10,10,Direction.E);
        Point b = new Point(-10,10,Direction.E);
        Point c = new Point(-10,-10,Direction.E);
        Point d = new Point(10,-10,Direction.E);
        Area area = new Area(a,b,c,d);
        Rover rover = new Rover();
        Move move = new Move() {
            @Override
            public Point execute(Point point) {
                return null;
            }
        };
        rover.move();
         Point position = rover.getPoint();
        Point res = new Point(6,5,Direction.E);
        Assert.assertEquals(position,res);
    }
/*
    @Test
    public void should_execute_batch_commands() {
        Rover rover = new Rover();
        RoverController roverController = new RoverController(rover);
        String mission = "10,10,5,5,E,M,L,M,R";
        String position = roverController.execute(mission);
        Assert.assertEquals(position,"66E");
    }*/
}



