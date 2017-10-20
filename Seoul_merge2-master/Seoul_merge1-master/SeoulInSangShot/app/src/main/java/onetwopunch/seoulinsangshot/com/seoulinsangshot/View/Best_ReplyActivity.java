package onetwopunch.seoulinsangshot.com.seoulinsangshot.View;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import onetwopunch.seoulinsangshot.com.seoulinsangshot.R;

public class Best_ReplyActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best__reply);
//        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#050518")));

        Drawable d = getResources().getDrawable(R.drawable.actionbar);
        getSupportActionBar().setBackgroundDrawable(d);


        Intent intent = getIntent();
        TextView best_email=(TextView)findViewById(R.id.txt_best_name);
        TextView best_tip=(TextView)findViewById(R.id.txt_best_tip);
        TextView best_phone=(TextView)findViewById(R.id.txt_best_theme);
        TextView best_app=(TextView)findViewById(R.id.txt_best_theme2);
        ImageView best_img=(ImageView)findViewById(R.id.img_best_cover);

        Picasso.with(this).load(intent.getStringExtra("image")).into(best_img);

        best_email.setText(intent.getStringExtra("email"));
        best_tip.setText(intent.getStringExtra("tip"));
        best_phone.setText(intent.getStringExtra("phoneType"));
        best_app.setText(intent.getStringExtra("phoneApp"));



    }
}
