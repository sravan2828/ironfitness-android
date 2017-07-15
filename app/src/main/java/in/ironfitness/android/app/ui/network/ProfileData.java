package in.ironfitness.android.app.ui.network;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.List;

import in.ironfitness.android.app.IronFitnessApplication;
import in.ironfitness.android.app.ui.pojo.ProfilePhotoList;
import in.ironfitness.android.app.ui.pojo.User;



public class ProfileData {
    private static ProfilePhotoList profilePhotoList = new ProfilePhotoList();
    private RequestQueue queue = IronFitnessApplication.queue;
    private static User userObj = new User();
    private Gson gson = new Gson();
    private List<String> photos;
    private User user;

    public ProfileData() {
        this.user =getUser(user);
        this.photos = getProfileImages(user);
    }

    public List<String> getProfileImages(User user){

        final String url ="http://www.mocky.io/v2/5967c6a91100007d19b6c2f4";
        // prepare the Request
        JsonObjectRequest profileImageListRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.d("Response", response.toString());
                        profilePhotoList = gson.fromJson(response.toString(), ProfilePhotoList.class);
                        Log.d("list",profilePhotoList.photos.toString());
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", error.getMessage());
                    }
                }
        );

        // add it to the RequestQueue
        queue.add(profileImageListRequest);


        return profilePhotoList.photos;

    }

    public User getUser(User user){

        final String url = "http://www.mocky.io/v2/5967c32a1100006719b6c2e6";
        // prepare the Request
        JsonObjectRequest getRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        // display response
                        Log.d("Response", response.toString());
                        userObj = gson.fromJson(response.toString(), User.class);
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error.Response", error.getMessage());
                    }
                }
        );

        // add it to the RequestQueue
        queue.add(getRequest);
        return userObj;

    }
}
