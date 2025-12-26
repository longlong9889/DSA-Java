class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasFilled = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGasFilled += gas[i];
            totalCost += cost[i];
        }
        if (totalCost > totalGasFilled) {
            return -1;
        }
        int currentGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }
        return start;
    }
}