package com.house.s1.qna;

import com.house.s1.board.BoardVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class QnaVO extends BoardVO {

    private Integer qna_ref; //질문과답변 ref
    private Integer qna_step; //질문과답변 step
    private Integer qna_depth; //질문과답변 depth

    public Integer getQna_ref() {
        return qna_ref;
    }

    public void setQna_ref(Integer qna_ref) {
        this.qna_ref = qna_ref;
    }

    public Integer getQna_step() {
        return qna_step;
    }

    public void setQna_step(Integer qna_step) {
        this.qna_step = qna_step;
    }

    public Integer getQna_depth() {
        return qna_depth;
    }

    public void setQna_depth(Integer qna_depth) {
        this.qna_depth = qna_depth;
    }
}

