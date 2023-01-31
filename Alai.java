package MeisterJustus;
import robocode.*;

public class Alai extends JuniorRobot
{
	public void escape()
	{
		turnGunRight(360);

		if(scannedDistance < 70)
		{
			//move in opposite direction of enemy
			turnTo(scannedHeading - scannedHeading + 30);
			ahead(100);
		}
	}

	
	public void run() {
	
		setColors(orange, blue, white, yellow, black);
		

		while(true) 
		{
			turnGunRight(360);
		}
	}


	public void onScannedRobot() 
	{
		turnTo(scannedAngle);
		turnGunTo(scannedAngle);
		ahead(100);

		if(scannedDistance <= 50)  //shoot if enemy is close
		{
			fire(1);
		}
	}


	public void onHitByBullet() 
	{
		escape();
	}
	

	public void onHitWall() 
	{
		turnGunRight(360);
		turnTo(scannedAngle);
		ahead(100);
	}	
}
