package collection.deque.test.stack;

public class BrowserHistoryTest {

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visitPage("youtube.com");
        browser.visitPage("google.com");
        browser.visitPage("facebook.com");

        String currentPage1 = browser.goBack();
        System.out.println("currentPage1 = " + currentPage1);
        String currentPage2 = browser.goBack();
        System.out.println("currentPage2 = " + currentPage2);
        /*
        방문 = youtube.com
        방문 = google.com
        방문 = facebook.com
        뒤로 가기 = google.com
        currentPage1 = google.com
        뒤로 가기 = youtube.com
        currentPage2 = youtube.com
        */
    }
}