package day_1;
public class day1 { 
  public int[] solution(long n) { // 숫자를 문자열로 변환하여 길이 구함
      int length = Long.toString(n).length(); // 결과 저장할 배열 초기화
      int[] answer = new int[length];

      for (int i = 0; i < length; i++) {
          answer[i] = (int) (n % 10);
          n /= 10;
      }
      return answer;
  }

  public static void main(String[] args) {
      day1 sol = new day1();
      long n = 12345;
      int[] result = sol.solution(n);

      for (int num : result) {
          System.out.print(num + " ");
      }
  }
}



