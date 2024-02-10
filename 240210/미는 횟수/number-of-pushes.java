import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 문자열을 미는 함수
    public static String push(String a){
        String pushed = "" + a.charAt(a.length()-1); // a의 마지막 문자로 초기화
        int idx = 0;
        // 문자열 캐릭터를 하나씩 돌며 idx 1부터 문자열 a의 끝까지 붙이고, 그 후 다시 idx를 0으로 만들어 남은 앞의 캐릭터를 붙인다.
        while(true){
            if(pushed.length() >= a.length()){
                break;
            }
            if(idx >= a.length()){
                break;
            }
            pushed += a.charAt(idx);
            idx++;
        }
        return pushed;
    }
    public static void main(String[] args)  throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
        String b = br.readLine();

        int cnt = 0;
        String pushedA = "";
        String param = a;
        while(true){
            // 한자리씩 민 문자열 구하기
            pushedA = push(param);
            // 민 횟수 업데이트
            cnt++;
            // 밀었을 때 b와 동일해진다면 반복을 끝낸다.
            if(pushedA.equals(b)){
                break;
            }
            // 밀었는데 문자 개수만큼 다 한번씩 돌아봐서 다시 a와 동일해질땐 불가하므로 -1 출력
            if(pushedA.equals(a)){
                cnt = -1;
                break;
            } 
            // 한 자리 민 문자열로 다시 반복한다.
            param = pushedA;
            
        }
        System.out.print(cnt);
    }
}