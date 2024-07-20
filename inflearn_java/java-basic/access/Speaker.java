package access;

public class Speaker {
    // int volume;
    private int volume; // private 사용
    // private이 붙은 경우,
    // 해당 클래스 내부에서만 호출 가능

    // 생성자로 초기 음량 지정
    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if (volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
