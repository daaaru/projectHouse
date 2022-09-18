package com.house.s1.housewarming;

import com.house.s1.board.BoardVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class HouseWarmingVO extends BoardVO {

    private Integer house_type; // 주거형태 1:본인방,2:원룸 3:오피스텔 4:빌라&연립 5:아파트 6:단독주택
    private Integer family_type; //가족형태 1:싱글라이프 2:신혼/부부 3:자녀가있는집 4:부모님과함께 5:룸메이트와함께 6:기타
    private Integer work_type; //작업분야 1:홈스타일링 2:리모델링 3:부분시공 4:건축
    private Integer house_ref; //집들이 ref
    private Integer house_step; //집들이 step
    private Integer house_depth; //집들이 depth

    public Integer getHouse_type() {
        return house_type;
    }

    public void setHouse_type(Integer house_type) {
        this.house_type = house_type;
    }

    public Integer getFamily_type() {
        return family_type;
    }

    public void setFamily_type(Integer family_type) {
        this.family_type = family_type;
    }

    public Integer getWork_type() {
        return work_type;
    }

    public void setWork_type(Integer work_type) {
        this.work_type = work_type;
    }

    public Integer getHouse_ref() {
        return house_ref;
    }

    public void setHouse_ref(Integer house_ref) {
        this.house_ref = house_ref;
    }

    public Integer getHouse_step() {
        return house_step;
    }

    public void setHouse_step(Integer house_step) {
        this.house_step = house_step;
    }

    public Integer getHouse_depth() {
        return house_depth;
    }

    public void setHouse_depth(Integer house_depth) {
        this.house_depth = house_depth;
    }
}
