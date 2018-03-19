package net.eeyes.app.xjtu_box;

import java.util.List;

/**
 * Created by zhaohang on 2018/3/19.
 */

public class Article {
    @Override
    public String toString() {
        return "Article{" +
                "viewCount=" + viewCount +
                ", id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", favouritesCount=" + favouritesCount +
                ", likeCount=" + likeCount +
                ", replyCount=" + replyCount +
                ", auther=" + auther +
                ", briefContent=" + briefContent +
                ", catagory='" + catagory + '\'' +
                ", tags=" + tags +
                '}';
    }

    /**
     * viewCount : 0
     * id : 1
     * image : https://www.hdwallpapers.in/walls/star_wars_the_force_unleashed__2-normal.jpg
     * title : 测试文章1
     * publishTime : 2018-02-05 10:10:19.0
     * favouritesCount : 0
     * likeCount : 1
     * replyCount : 29
     * auther : {"userId":"zh","name":"卢本","portrait":"http://47.93.26.176:8080/zhao_hang/eeyeschuangyigongfang/1.0.0/file/image/hXspyuQjSJADl3HMD6jVTGlIB4fLLfkPgscTT84KpRD3yU0YUvjLfirOqgpKTgMq.jpg","personalSignature":"45°仰望的sb"}
     * briefContent : null
     * catagory : 测试
     * tags : ["学习资料","教程"]
     */

    private int viewCount;
    private String id;
    private String image;
    private String title;
    private String publishTime;
    private int favouritesCount;
    private int likeCount;
    private int replyCount;
    private AutherBean auther;
    private Object briefContent;
    private String catagory;
    private List<String> tags;

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

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

    public Object getBriefContent() {
        return briefContent;
    }

    public void setBriefContent(Object briefContent) {
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
        @Override
        public String toString() {
            return "AutherBean{" +
                    "userId='" + userId + '\'' +
                    ", name='" + name + '\'' +
                    ", portrait='" + portrait + '\'' +
                    ", personalSignature='" + personalSignature + '\'' +
                    '}';
        }

        /**
         * userId : zh
         * name : 卢本
         * portrait : http://47.93.26.176:8080/zhao_hang/eeyeschuangyigongfang/1.0.0/file/image/hXspyuQjSJADl3HMD6jVTGlIB4fLLfkPgscTT84KpRD3yU0YUvjLfirOqgpKTgMq.jpg
         * personalSignature : 45°仰望的sb
         */

        private String userId;
        private String name;
        private String portrait;
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
}
