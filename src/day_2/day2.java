package day_2;

public class day2 {
    public double solution(int[] arr) {
        // 배열 arr을 입력으로 받아 평균값을 반환하는 solution 메서드 선언
        double answer = 0;
        // 평균값을 저장할 변수 answer 초기화
        int sum = 0;
        // 배열의 합을 저장할 변수 sum 초기화
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // 배열의 각 요소를 sum에 더함
        }
        answer = sum / (double) arr.length;
        // 배열의 합을 배열의 길이로 나누어 평균값 계산
        // 이때 (double)을 사용하여 정수를 실수로 변환하여 정확한 평균값 얻음
        return answer;
    }
    public static void main(String[] args) {
        day2 instance = new day2();
        int[] arr = {1, 2, 3, 4};
        
        double average = instance.solution(arr);
        
        System.out.println(average);
}
}
