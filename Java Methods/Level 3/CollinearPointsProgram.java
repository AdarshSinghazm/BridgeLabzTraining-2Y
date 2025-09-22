public class CollinearPointsProgram {
    public static void main(String[] args) {
        double x1 = 2, y1 = 4;
        double x2 = 4, y2 = 6;
        double x3 = 6, y3 = 8;
        
        boolean slopeMethod = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaMethod = areCollinearByArea(x1, y1, x2, y2, x3, y3);
        
        System.out.println("Points A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");
        System.out.println("Collinear by slope method: " + slopeMethod);
        System.out.println("Collinear by area method: " + areaMethod);
    }
    
    public static boolean areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        
        return Math.abs(slopeAB - slopeBC) < 0.0001 && Math.abs(slopeBC - slopeAC) < 0.0001;
    }
    
    public static boolean areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 0.0001;
    }
}