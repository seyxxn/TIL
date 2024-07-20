package construct.ex;

import java.sql.SQLOutput;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("","",0);
    }

    Book(String title, String author){
//        this.title = title;
//        this.author = author;
        this(title, author, 0);
        // 이렇게 this로 생성자를 재호출하는 방법도 있음
    }

    // 모든 필드를 매개변수로 받는 생성자
    Book(String title, String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: " + this.title + ", 저자: " + this.author + ", 페이지: " + this.page);
    }
}
