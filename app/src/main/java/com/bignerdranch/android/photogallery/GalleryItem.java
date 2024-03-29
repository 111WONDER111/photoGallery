package com.bignerdranch.android.photogallery;

/**
 * author : Wonder
 * e-mail : 2581343872@qq.com
 * date   : 2019/7/16 12:00
 * desc   : 创建模型对象类p380
 * version:
 */
public class GalleryItem {
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    private String mCaption;
    private String mId;
    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }
}
