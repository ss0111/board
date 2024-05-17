package hello.board.controller.board;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter @Setter
public class PostForm {

    @NotBlank(message = "제목을 입력해주세요.")
    private String title;

    @NotNull
    private String content;

    //게시글 수정시 작성일 update
    public void setRegisterDate(LocalDateTime registerDate) {
    }
}
