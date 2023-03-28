package entities;

public class CalculateArea {
    public double width;
    public double height;

    public double area;
    public double perimeter;
    public double diagonal;

    public void Area() {
        this.area = width * height;
    }

    public void Perimeter() {
        this.perimeter = 2 * (width + height);
    }
    
    public void Diagonal() {
        this.diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString() {
        return "A area do produto e: " + String.format("%.2f", area ) + "\n" 
        + "O Perimetro do retangulo e: " + String.format("%.2f", perimeter ) + "\n"
        + "A Diagonal do retangulo e: " + String.format("%.2f", diagonal ) + "\n";
    }
}
