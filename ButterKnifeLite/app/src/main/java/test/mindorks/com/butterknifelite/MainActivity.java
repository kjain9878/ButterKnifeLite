package test.mindorks.com.butterknifelite;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.mindorks.butterknifelite.ButterKnifeLite;
import com.mindorks.butterknifelite.annotations.BindView;
import com.mindorks.butterknifelite.annotations.OnClick;
import com.mindorks.butterknifelite.annotations.OnLongClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtView)
    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnifeLite.bind(this);
        txtView.setText("Testing");
    }

    @OnClick(R.id.btn1)
    private void onBtn1Click(){
        txtView.setText("Btn 1 click");
    }

    @OnClick(R.id.btn2)
    private void onBtn2Click(){
        txtView.setText("Btn 2 click");
    }

    @OnLongClick(R.id.btn2)
    private void onBtn2LongClick(){
        txtView.setText("Btn 2 long click");
    }
}
