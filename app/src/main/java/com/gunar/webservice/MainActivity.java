package com.gunar.webservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.gunar.webservice.data.Base;
import com.gunar.webservice.rest.APIService;
import com.gunar.webservice.rest.ApiUtils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIService mAPIService;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (TextView) findViewById(R.id.textView);

        mAPIService = ApiUtils.getApiServices();

        Call<Base> respuesta = mAPIService.llamar();

        respuesta.enqueue(new Callback<Base>() {

            @Override
            public void onResponse(Call<Base> call, Response<Base> response) {
//                if (response.isSuccessful()) {

                    Base base = response.body();
                    String res = "";
                    res+= "Success:" + base.getSuccess() + "\n";
                    for(int i=0; i<base.getProductos().size(); i++){
                        res+=base.getProductos().get(i).getCod() + "\t\t\t\t\t\t" + base.getProductos().get(i).getDes() + "\t\t\t\t\t\t" + base.getProductos().get(i).getUem() + "\n";
                    }
                    info.setText(res);
//                }
            }

            @Override
            public void onFailure(Call<Base> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }
}

