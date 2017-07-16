package in.ironfitness.android.app.ui.pojo;

/**
 * Created by sravan on 15/07/17.
 */

public class FeedItem {
    int postId, likesCount;

    public FeedItem(int i, boolean b) {
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public String getPostUserName() {
        return postUserName;
    }

    public void setPostUserName(String postUserName) {
        this.postUserName = postUserName;
    }

    public String getProfileImageIcon() {
        return profileImageIcon;
    }

    public void setProfileImageIcon(String profileImageIcon) {
        this.profileImageIcon = profileImageIcon;
    }

    public FeedItem(int postId, int likesCount, boolean isLiked, String postUserName, String profileImageIcon, String postImage) {
        this.postId = postId;
        this.likesCount = likesCount;
        this.isLiked = isLiked;
        this.postUserName = postUserName;
        this.profileImageIcon = profileImageIcon;
        this.postImage = postImage;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }

    boolean isLiked;
    String postUserName, profileImageIcon,postImage;

}
