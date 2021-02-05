package com.csrcbank.mbiserver.core.bean;

import lombok.Data;

/**
 * 系统用户类
 * @author : Admin
 * @addTime : 11:47
 */
@Data
public class SysUser {
    private String userId;
    private String userName;
    private String userPass;
    private String roleId;
    private String userTelephone;
    private String userEmail;
    private String userGenger;
    private String status;
    private String userOrgan;
    private String userOrgans;
    private int loginCount;
    private String lastLoginDate;
    private String lastLoginIP;
    private String dDate;
    private String dDip;
    private String headImage;
    private String validateCode;
    private String deviceId;
    private String firstLoginDate;
    private String userFlag;
}
