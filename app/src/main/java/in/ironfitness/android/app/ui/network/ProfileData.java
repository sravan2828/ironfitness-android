package in.ironfitness.android.app.ui.network;

import android.content.Context;

import java.util.List;

import in.ironfitness.android.app.R;
import in.ironfitness.android.app.ui.pojo.User;



public class ProfileData {

    public String[] getProfileImages(Context context){

        return context.getResources().getStringArray(R.array.user_photos);

    }

    public User getUser(User user){

        user.setName("Sravan Kumar");
        user.setUserName("@sravan");
        user.setBio("Crush IT");
        user.setPostCount(1000);
        user.setFollowerCount(500);
        user.setFollowingCount(200);
        return user;

    }
}
