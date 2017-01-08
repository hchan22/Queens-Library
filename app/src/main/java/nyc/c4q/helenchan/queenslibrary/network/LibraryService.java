package nyc.c4q.helenchan.queenslibrary.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by helenchan on 12/27/16.
 */

public interface LibraryService {

    @GET("resource/b67a-vkqb.json")
    Call<List<QueensLibraryResponse>> getLibraries();

}
