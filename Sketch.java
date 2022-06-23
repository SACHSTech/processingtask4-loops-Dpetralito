import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    strokeWeight((float)0.0005 * height);
    stroke(0, 0, 0);  

    // Q1
    for (int i = height / 25; i <= height / 2; i += height / 25) {
      line(i, 0, i, height / 2);
      line(0, i, width / 2, i);
  }

    // Q2
    fill(230, 57, 230);
    for (int circleY = ((height) / 15); circleY <= ((height / 15) * 7); circleY += ((height) / 12)) {
    for (int circleX = ((width) / 15) + 250; circleX <= ((width / 15) * 7) + 250; circleX += ((width) / 12)) {
    ellipse(circleX, circleY, 25, 25);
      }
      }

    // Q3
    strokeWeight((float)0.0005 * height);
    for (int i = 0; i <= height / 2; i++) {
    stroke(i, i, i);
    line(i, height / 2, i, height);
      }

    //Q4
    for (int intAngle = 0; intAngle < 360; intAngle += 45) {
    stroke(0, 0, 0);
    strokeWeight(1);
    fill(242, 153, 29);

    pushMatrix();
    translate(width * 3 / 4, height * 3 / 4);
    rotate(radians(intAngle));
    ellipse(0, 0, width / 16, height / 3);
    popMatrix();
      }

    fill(55, 120, 46);
    noStroke();
    ellipse((width / 2) + width / 4, (height / 2) + height / 4, 60, 60);
    
    
    }
  // define other methods down here.
}