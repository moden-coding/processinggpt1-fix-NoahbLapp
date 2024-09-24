import processing.core.PApplet;

public class App extends PApplet {


    public void settings() {
        size(800,600);
    }

    public void setup() {
        background(80,250,60);
        fill(250,250,80);
        ellipse(450,50,60,70);
        stroke(150,38,200);
        strokeWeight(5);
        line(400,60,500,40);
        fill(0,240,70);
        triangle(500,50,400,40,400,60);
        fill(255,0,0);
        rect(400,400,400,400);
    }

    public static void main(String[] args) {
        PApplet.main("App");
    }
}
