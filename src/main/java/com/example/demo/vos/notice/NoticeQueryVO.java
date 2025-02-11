package com.example.demo.vos.notice;

import com.example.demo.common.Page;

/**
 * @author 青菜白玉堂
 * @create 2021-06-17
 */
public class NoticeQueryVO extends Page {
    private String noticeTitle;

    private String noticeContent;

    @Override
    public String toString() {
        return "NoticeQueryVO{" +
                "noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                '}';
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : "%" + noticeTitle + "%";
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent == null ? null : "%" + noticeContent + "%";
    }
}
