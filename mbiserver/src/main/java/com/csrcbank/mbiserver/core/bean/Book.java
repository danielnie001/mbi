package com.csrcbank.mbiserver.core.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : Admin
 * @addTime : 13:46
 */
@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
}
