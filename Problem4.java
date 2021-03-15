import java.util.*;

public class Stat {
	public int[] data;
	public int n;

	public Stat(int[] data) {
		this.data = data;
		n = (int) (data.length);
		Arrays.sort(data);
	}

	public float mean() {
	  float sum = 0;
	  for (int i = 0; i < n; i++) {
	    sum += data[i];
	  }
	  return sum / n;
	}

	public Double median() {
	  if (n % 2 == 0) {
	   double middle = ((double) (data[n / 2 - 1]) + (double) (data[n / 2])) / 2;
	   return middle;
	  } else {
	    return (double) (data[(n / 2) + 1]);
	  }
	}

	public List<Integer> mode() {
		List<Integer> mode_list = new ArrayList<Integer>();
		int[] counter = new int[((int) (data[n - 1])) + 1];
		for (int i = 0; i < n; i++) {
		  counter[data[i]]++;
		}
		int most_frequent = 0;
		for (int i = 0; i < counter.length; i++) {
		  most_frequent = Math.max(most_frequent, counter[i]);
		}
		if (most_frequent == 1 && n > 1) {
		  return mode_list;
		}
		Set<Integer> check_duplicates = new HashSet<Integer>();
    for (int i = 0; i < n; i++) {
      if (counter[data[i]] == most_frequent && !check_duplicates.contains(data[i])) {
        check_duplicates.add(data[i]);
        mode_list.add(data[i]);
      }
    }
		return mode_list;
	}

	public Integer range() {
	  return data[n - 1] - data[0];
	}
}
