import java.util.LinkedList;


public class Rover {

    private Point point;

    public void deploy(Point point) {
        this.point = point;
    }

    public Point move(Instruction instruction) {
        if (null == point) {
            throw new RuntimeException("请初始化坐标");
        }
        return instruction.execute(point);
    }

    public Point getPoint() {
        return point;
    }

}
