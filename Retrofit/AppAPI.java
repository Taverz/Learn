
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface AppAPI {

    @GTE("changes/")
    Call<List<Items> loadChanges(@Query("q") String status);
}