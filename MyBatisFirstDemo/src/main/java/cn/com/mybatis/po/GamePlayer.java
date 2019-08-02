package cn.com.mybatis.po;

import java.util.Map;
import lombok.Data;


@Data
public class GamePlayer {
    private int id;
    private String username;
    private String uGender;
    private int uLevel;
    private Map professionalAttributes;
}
