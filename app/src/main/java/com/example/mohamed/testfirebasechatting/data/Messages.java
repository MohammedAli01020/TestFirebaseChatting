package com.example.mohamed.testfirebasechatting.data;


public class Messages {
    private String mText;
    private String mName;

    public Messages() {
    }

    public Messages(String mText, String mName) {
        this.mText = mText;
        this.mName = mName;
    }

    public String getmText() {
        return mText;
    }

    public String getmName() {
        return mName;
    }
}
