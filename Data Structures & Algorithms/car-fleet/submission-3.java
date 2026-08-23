class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        // Store each car as [position, speed]
        int[][] cars = new int[n][2];

        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Sort cars from closest to target -> farthest from target
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        // Stack stores the arrival time of each fleet
        Stack<Double> stack = new Stack<>();

        for (int[] car : cars) {

            int positionOfCar = car[0];
            int speedOfCar = car[1];

            // Time needed for this car to reach the target
            double time = (double) (target - positionOfCar) / speedOfCar;

            // If this car takes longer than the fleet ahead,
            // it cannot catch that fleet.
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

            // Otherwise, this car catches the fleet ahead,
            // so we don't add a new fleet to the stack.
        }

        return stack.size();
    }
}