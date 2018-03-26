package net.eeyes.app.xjtu_box.twitter;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhaohang on 3/26/2018.
 * 这是演示用类，正式开发时将删除。
 */

public class DateFromNet {


    /**
     * id : 666
     * image : https://www.bing.com/az/hprichbg/rb/VF5NASA_ZH-CN11291360478_1920x1080.jpg
     * title : 教务处一件评教。
     * publishTime : 2018.1.1
     * viewCount : 0
     * favouritesCount : 13
     * likeCount : 0
     * replyCount : 0
     * auther : {"userId":"string","name":"todo","portrait":"string","personalSignature":"string"}
     * briefContent : string
     * catagory : string
     * tags : ["string"]
     */

    @SerializedName("id")
    private String id;
    @SerializedName("image")
    private String image;
    @SerializedName("title")
    private String title;
    @SerializedName("publishTime")
    private String publishTime;
    @SerializedName("viewCount")
    private int viewCount;
    @SerializedName("favouritesCount")
    private int favouritesCount;
    @SerializedName("likeCount")
    private int likeCount;
    @SerializedName("replyCount")
    private int replyCount;
    @SerializedName("auther")
    private AutherBean auther;
    @SerializedName("briefContent")
    private String briefContent;
    @SerializedName("catagory")
    private String catagory;
    @SerializedName("tags")
    private List<String> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(int favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public AutherBean getAuther() {
        return auther;
    }

    public void setAuther(AutherBean auther) {
        this.auther = auther;
    }

    public String getBriefContent() {
        return briefContent;
    }

    public void setBriefContent(String briefContent) {
        this.briefContent = briefContent;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public static class AutherBean {
        /**
         * userId : string
         * name : todo
         * portrait : string
         * personalSignature : string
         */

        @SerializedName("userId")
        private String userId;
        @SerializedName("name")
        private String name;
        @SerializedName("portrait")
        private String portrait;
        @SerializedName("personalSignature")
        private String personalSignature;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPortrait() {
            return portrait;
        }

        public void setPortrait(String portrait) {
            this.portrait = portrait;
        }

        public String getPersonalSignature() {
            return personalSignature;
        }

        public void setPersonalSignature(String personalSignature) {
            this.personalSignature = personalSignature;
        }
    }

    @Override
    public String toString() {
        return "DateFromNet{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", viewCount=" + viewCount +
                ", favouritesCount=" + favouritesCount +
                ", likeCount=" + likeCount +
                ", replyCount=" + replyCount +
                ", auther=" + auther +
                ", briefContent='" + briefContent + '\'' +
                ", catagory='" + catagory + '\'' +
                ", tags=" + tags +
                '}';
    }
}
