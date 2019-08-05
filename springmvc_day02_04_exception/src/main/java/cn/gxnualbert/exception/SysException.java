package cn.gxnualbert.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @auther gxnualbert
 * @create 2019-08-05-22:04
 */
@Data
@AllArgsConstructor
public class SysException extends Exception {
    private String message;
}
