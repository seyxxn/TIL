package nested.nested.ex2;

public class Network {
    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // 정적 중첩 클래스 + private으로 선언
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content){
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }
}
