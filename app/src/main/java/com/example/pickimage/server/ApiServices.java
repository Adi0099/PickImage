package com.example.pickimage.server;



import com.example.pickimage.model.ResponseApiModel;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiServices {

    @Multipart
    @POST("uploadimage.php")
    Call<ResponseApiModel> uploadImage(@Part MultipartBody.Part image, @Part("name") RequestBody fname);

//    @Multipart
//    @POST("uploadimage.php")
//    Call<ResponseApiModel> uploadImage (@Part MultipartBody.Part image);

}
