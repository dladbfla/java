package _3._0328;

//2. Reply 클래스(답글 엔티티)
//2-1. id, content(댓글), loginId(작성자) 필드 필수. 나머지 필요하다고 생각되는 필드는 각자 추가
//2-2. freeBoard 필드 사용
//    : 댓글이 자유게시판의 어느 글의 댓글인지 저장
//2-3. Reply 객체가 생성될 때 1-2의 해당 글의 객체에 있는 replies에 등록되어야한다.
//    : 해결하기 위한 단계별 예시
//    : freeBoard를 이용하여 해당 FreeBoard 객체를 찾는다
//    : 위에서 찾은 FreeBoard 객체내에 setReplise 메서드를 이용하여 Reply 객체를 FreeBoard 객체의 replies에 추가한다
//      => 이때 setReplies 메서드의 내용을 변경할 필요가 있을 수 있음!

public class Reply extends FreeBoard{
    int replyId;
    String replyContent;
    String replyLoginId;
    int freeBoardId;

    public Reply() {
    }

    public Reply(int replyId, String replyContent, String replyLoginId, int freeBoardId) {
        this.replyId = replyId;
        this.replyContent = replyContent;
        this.replyLoginId = replyLoginId;
        this.freeBoardId = freeBoardId;
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyLoginId() {
        return replyLoginId;
    }

    public void setReplyLoginId(String replyLoginId) {
        this.replyLoginId = replyLoginId;
    }

    public int getFreeBoardId() {
        return freeBoardId;
    }

    public void setFreeBoardId(int freeBoardId) {
        this.freeBoardId = freeBoardId;
    }

    public String toString(){
        return replyId+", "+replyContent+", "+replyLoginId+", "+freeBoardId;
    }

    public void createReply(String replyContent, String replyLoginId, int freeBoardId){
        for (int i = 0; i<Main.freeBoards.size(); i++){
            if (Main.freeBoards.get(i).freeBoardId == freeBoardId){
                Main.freeBoards.get(i).replies.add(new Reply(replies.size(), replyContent, replyLoginId, freeBoardId));
                break;
            }
        }
    }
}
