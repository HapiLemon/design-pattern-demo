package org.example.request;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author keminfeng
 * @date 2022-03-21 11:38
 */
@Data
@AllArgsConstructor
public class Request {

    private String type;

    private int number;

}
