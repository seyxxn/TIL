package nested.test.ex1;

public class Library {
    private Book[] books;
    private int cnt;

    public Library(int size) {
        books = new Book[size]; // Book 객체 배열을 사용해서 도서 목록 관리
        cnt = 0;
    }

    // Book 클래스는 Library 내부에서만 사용, 외부로 노출하면 안됨
    private static class Book {
        private String title; // 도서 제목
        private String author; // 저자명

        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고
        if (cnt >= books.length){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정상 로직을 처리
        books[cnt++] = new Book(title, author);
    }


    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < cnt; i++){
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

}
