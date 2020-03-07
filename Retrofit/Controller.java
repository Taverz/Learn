



public class Controller implements Callback<List<Items>> {

    static final String BASE_URL = "https://gmail.com";

    public void start(){

        Gson gson = new GsonBuilder()
                            .setLenient() //
                            .create();    //
        
        Retrofit retrofit = new Retrofit.BUilder()
                                            .baseUrl(BASE_URL)
                                            .addConverterFactory(GsonConverterFactory.create(gson))
                                            .build();
    }                       
}