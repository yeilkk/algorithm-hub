class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] arr = new int[num2-num1+1];
        int idx=0;
        for(int i=num1; i<=num2; i++){
            arr[idx++] = numbers[i];
        }
        return arr;
    }
}