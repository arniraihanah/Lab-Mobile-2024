package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class tes implements Parcelable {
    String username;
    String name;

    public tes(String username, String name, String followers, String following, String desc, Integer profileImage, Integer postImage, Integer storyImage) {
        this.username = username;
        this.name = name;
        this.followers = followers;
        this.following = following;
        this.desc = desc;
        ProfileImage = profileImage;
        PostImage = postImage;
        StoryImage = storyImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(Integer profileImage) {
        ProfileImage = profileImage;
    }

    public Integer getPostImage() {
        return PostImage;
    }

    public void setPostImage(Integer postImage) {
        PostImage = postImage;
    }

    public Integer getStoryImage() {
        return StoryImage;
    }

    public void setStoryImage(Integer storyImage) {
        StoryImage = storyImage;
    }

    String followers;
    String following;
    String desc;
    Integer ProfileImage,PostImage,StoryImage;


    protected tes(Parcel in) {
        username = in.readString();
        name = in.readString();
        followers = in.readString();
        following = in.readString();
        desc = in.readString();
        if (in.readByte() == 0) {
            ProfileImage = null;
        } else {
            ProfileImage = in.readInt();
        }
        if (in.readByte() == 0) {
            PostImage = null;
        } else {
            PostImage = in.readInt();
        }
        if (in.readByte() == 0) {
            StoryImage = null;
        } else {
            StoryImage = in.readInt();
        }
    }

    public static final Creator<tes> CREATOR = new Creator<tes>() {
        @Override
        public tes createFromParcel(Parcel in) {
            return new tes(in);
        }

        @Override
        public tes[] newArray(int size) {
            return new tes[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(username);
        parcel.writeString(name);
        parcel.writeString(followers);
        parcel.writeString(following);
        parcel.writeString(desc);
        if (ProfileImage == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(ProfileImage);
        }
        if (PostImage == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(PostImage);
        }
        if (StoryImage == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(StoryImage);
        }
    }
}
