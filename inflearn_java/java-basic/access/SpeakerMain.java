package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // volume 필드의 외부 접근을 막는 방법이 필요하다
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; -> private으로 선언하니 에러 발생
        speaker.showVolume();
    }
}
