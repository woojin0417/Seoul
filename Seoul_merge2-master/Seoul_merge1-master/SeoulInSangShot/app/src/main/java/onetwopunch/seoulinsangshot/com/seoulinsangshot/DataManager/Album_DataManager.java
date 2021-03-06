package onetwopunch.seoulinsangshot.com.seoulinsangshot.DataManager;

import android.util.Log;

import java.util.List;

import onetwopunch.seoulinsangshot.com.seoulinsangshot.Controller.Constants;
import onetwopunch.seoulinsangshot.com.seoulinsangshot.DataManager.Data.ImageVO;
import onetwopunch.seoulinsangshot.com.seoulinsangshot.DataManager.Remote.RetrofitService;
import onetwopunch.seoulinsangshot.com.seoulinsangshot.Model.Model_Image;
import onetwopunch.seoulinsangshot.com.seoulinsangshot.View.BaseActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kwakgee on 2017. 10. 17..
 */

public class Album_DataManager {

    public List<Model_Image> tempList;
    public ImageVO repoList;
    public void loadData(){

       // BaseActivity.imageList= new ArrayList<>();
        Retrofit client = new Retrofit.Builder().baseUrl(Constants.req_URL).addConverterFactory(GsonConverterFactory.create()).build();
        RetrofitService service = client.create(RetrofitService.class);

        Call<ImageVO> call = service.getImageData();
        call.enqueue(new Callback<ImageVO>() {
            @Override
            public void onResponse(Call<ImageVO> call, Response<ImageVO> response) {
                if(response.isSuccessful()){
                    repoList=response.body();
                    tempList=repoList.getList();
                    for(int i=0; i< tempList.size();i++){
                        String url= tempList.get(i).getUrl();
                        String id=tempList.get(i).getId();
                        String tip=tempList.get(i).getTip();
                        String likecount=tempList.get(i).getLikecount();
                        String view=tempList.get(i).getView();
                        String nowdate= tempList.get(i).getNowdate();
                        Log.d("날짜가왜 ", tempList.get(i).getNowdate().toString());
                        Log.d("why???what id",tempList.get(i).getId().toString());
                        Log.d("why???",tempList.get(0).getUrl().toString());

                        BaseActivity.imageList.add(new Model_Image(url,id,tip,likecount,view, nowdate));
                    }
                }
            }

            @Override
            public void onFailure(Call<ImageVO> call, Throwable t) {
            }
        });
    }

}
