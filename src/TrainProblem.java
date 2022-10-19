import java.util.Arrays;
import java.util.List;

public class TrainProblem {
    public void findPlatForm(List<Integer> arrivalList, List<Integer> departureList) {
        int schedule = arrivalList.size();
        int count = 1;
        for (int i = 0; i < schedule; i++) {
            int platFormCount = 1;
            for (int j = 0; j < schedule; j++) {
                if (i != j)
                    if (arrivalList.get(i) >= arrivalList.get(j) && departureList.get(j) >= arrivalList.get(i)) {
                        platFormCount++;
                    }
            }
            count = Math.max(platFormCount, count);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        TrainProblem trainProblem2 = new TrainProblem();
        trainProblem2.findPlatForm(Arrays.asList(1300, 1400, 1530, 1700), Arrays.asList(1330, 1410, 1800, 1830));
    }
}
