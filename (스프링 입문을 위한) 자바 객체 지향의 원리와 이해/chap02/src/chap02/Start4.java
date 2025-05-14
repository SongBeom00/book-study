package chap02;

// main() 메서드가 가진 변수 k와 square() 메서드가 가진 변수 k가 이름만 같지 실제로는 서로 별도의 변수 공간이다.
// -> Call By Value(값에 의한 호출)이라고 한다.
// 그래서 square() 메서드 안의 k 변수에 무슨 짓을 해도 main() 메서드 안의 k 변수는 영향이 없다.
// 메서드를 호출하면서 인자로 전달되는 것은 변수 자체가 아니라 변수가 저장한 값만을 복제해서 전달하기 때문이다.
public class Start4 {
    public static void main(String[] args) {
        int k = 5;
        int m;
        m = square(k);
    }

    private static int square(int k) {
        int result;
        k = 25;

        result = k;

        return  result;
    }
}
