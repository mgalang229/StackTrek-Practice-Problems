import java.util.*;
import java.lang.*;

public class Solution {
	public static List<Object> GetCoordinates(double initialVelocity, double angleInDegrees, double time) {
		double x = Math.round(initialVelocity * Math.cos(Math.toRadians(angleInDegrees)) * time);
		double y = Math.round(initialVelocity * Math.sin(Math.toRadians(angleInDegrees)) * time - 0.5 * 9.81 * time * time);
		List<Object> coordinates = new ArrayList<Object>();
		coordinates.add((int) (x));
		coordinates.add((int) (y));
		return coordinates;
	}
}
