package _3._0328;

//1. FreeBoard 클래스 (자유게시판 엔티티)
//1-1. id, title(게시글 제목), content(게시글 내용), loginId(작성자) 필드필수 나머지 필요하다고 생각되는 필드는 각자 추가
//1-2. List<Reply> replies 필드 사용
//     : Reply 클래스와의 관계를 따로 외부 클래스로 작성하지 않고 내부에 List타입으로 저장

import java.util.List;
import java.util.ArrayList;


public class FreeBoard {
    int freeBoardId;
    String freeBoardTitle;
    String freeBoardContent;
    String freeBoardLoginId;
    List<Reply> replies = new ArrayList<>();

    public FreeBoard() {
    }

    public FreeBoard(int freeBoardId, String freeBoardTitle, String freeBoardContent, String freeBoardLoginId) {
        this.freeBoardId = freeBoardId;
        this.freeBoardTitle = freeBoardTitle;
        this.freeBoardContent = freeBoardContent;
        this.freeBoardLoginId = freeBoardLoginId;
    }

    public FreeBoard(int freeBoardId, String freeBoardTitle, String freeBoardContent, String freeBoardLoginId, List<Reply> replies) {
        this.freeBoardId = freeBoardId;
        this.freeBoardTitle = freeBoardTitle;
        this.freeBoardContent = freeBoardContent;
        this.freeBoardLoginId = freeBoardLoginId;
        this.replies = replies;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    public String getFreeBoardTitle() {
        return freeBoardTitle;
    }

    public void setFreeBoardTitle(String freeBoardTitle) {
        this.freeBoardTitle = freeBoardTitle;
    }

    public String getFreeBoardContent() {
        return freeBoardContent;
    }

    public void setFreeBoardContent(String freeBoardContent) {
        this.freeBoardContent = freeBoardContent;
    }

    public String getFreeBoardLoginId() {
        return freeBoardLoginId;
    }

    public void setFreeBoardLoginId(String freeBoardLoginId) {
        this.freeBoardLoginId = freeBoardLoginId;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

    public String toString(){
        return freeBoardId+", "+freeBoardTitle+", "+freeBoardContent+", "+freeBoardId+", "+replies;
    }
}
