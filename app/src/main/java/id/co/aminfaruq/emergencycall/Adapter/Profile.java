package id.co.aminfaruq.emergencycall.Adapter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;
import id.co.aminfaruq.emergencycall.R;

public class Profile extends AppCompatActivity {

    @BindView(R.id.imgProfile)
    CircleImageView imgProfile;
    @BindView(R.id.txtProfile)
    TextView txtProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);

        Glide.with(this).load(R.drawable.profile).into(imgProfile);
    }

    public void btnIntagram(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aminfaruq.fa/?hl=en"));
        startActivity(intent);
    }
}
