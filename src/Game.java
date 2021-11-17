public class Game {
    public static final double HEAT_LOSS_PER_METER = 1;
    public static final double AMBIENT_TEMPERATURE = 20;
    public static final double GRAVITY_ACCELERATION = 1;//9.81;
    public static final double X_CENTER_OF_MASS = -100;
    public static final double Y_CENTER_OF_MASS = 0;

    public static class Circle {
        public double x;
        public double y;
        public double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public boolean circlesCollision(Circle circle){
            double r = this.radius + circle.radius;
            return to2(r) >= to2(this.x + circle.x) + to2(this.y + circle.y);
        }

        public static boolean circlesCollision(Circle circle1, Circle circle2){
            double r = circle1.radius + circle2.radius;
            return to2(r) >= to2(circle1.x + circle2.x) + to2(circle1.y + circle2.y);
        }

        public static boolean circlesCollision(double radius1, double radius2, double x1, double y1, double x2, double y2) {
            double r = radius1 + radius2;
            r *= r;
            return r < to2(x1 + x2) + to2(y1 + y1);
        }
    }
    public static void tick(){
        for(int i = 0; i < PhysicObject.instances.size(); i++) {
            PhysicObject physicObject = PhysicObject.instances.get(i).get();
            if (physicObject != null) {
                double distanceToCenterMass = PhysicObject.distance(X_CENTER_OF_MASS, Y_CENTER_OF_MASS, physicObject.getX(), physicObject.getY());
                System.out.println("Distance:" + distanceToCenterMass);
                physicObject.setVx(Math.sqrt(2 * GRAVITY_ACCELERATION * distanceToCenterMass));

                physicObject.tick();
            }
        }
    }

    private static double to2(double a){
        return a * a;
    }
}
