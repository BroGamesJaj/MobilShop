package hu.petrik.mobilshop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitApiService {

    // GET all users
    @GET("ZuaXBD/data")
    Call<List<Mobil>> getAllMobil();

    // POST (create a new user)
    @POST("ZuaXBD/data")
    Call<Mobil> createMobil(@Body Mobil people);

    // DELETE (delete a user by ID)
    @DELETE("ZuaXBD/data/{id}")
    Call<Void> deleteMobil(@Path("id") int id);
}
