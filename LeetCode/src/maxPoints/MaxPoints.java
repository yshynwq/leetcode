package maxPoints;

import java.util.HashMap;
import java.util.Map;

import utils.Point;

public class MaxPoints {
	public static void main(String[] args) {
		// [(4,0),(4,-1),(4,5)]

		Point p1 = new utils.Point(4, 0);
		Point p2 = new utils.Point(4, -1);
		Point p3 = new utils.Point(4, 5);
		Point[] points = { p1, p2, p3 };
		Solution s = new Solution();
		System.out.println(s.maxPoints(points));
	}
}

class Solution {
	public int maxPoints(Point[] points) {
		if (points == null || points.length==0)
			return 0;
		if (points.length == 1)
			return 1;

		Point base = points[0];

		Map<String, Integer> map = new HashMap<String, Integer>();

		Point tmp;
		int carry = 0;
		for (int i = 1; i < points.length; i++) {
			tmp = points[i];
			if (tmp.x == base.x && tmp.y != base.y) {
				if (map.containsKey("base"))
					map.put("base", map.get("base")+1);
				else
					map.put("base", 1);
			} else if (tmp.x == base.x && tmp.y == base.y) {
				carry++;
			} else {
				String slope = getSlope(base, tmp);
				if (map.containsKey(slope))
					map.put(slope, map.get(slope) + 1);
				else
					map.put(slope, 1);
			}
		}
		int max = 0;
		for (String slope : map.keySet()) {
			if (map.get(slope) > max) {
				max = map.get(slope);
			}
		}
		return max + 1 + carry;

	}

	public String getSlope(Point base, Point p) {
		double slope = (p.y - base.y) / (p.x - base.x);
		return String.valueOf(slope);
	}
}
