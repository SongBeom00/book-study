package abstraction01;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null; // 객체 참조 변수 mickey가 더 이상 힙 영역에 존재하는 Mouse 객체를 참조하지 않아서 가비지 컬렉터(Garbage Collector)가 정리한다.

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();
    }
}
