package com.example.yura.porakormitkota;

import android.app.Activity;
        import android.os.Bundle;
        import android.view.Gravity;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        Toast toast3 = Toast.makeText(getApplicationContext(),
                R.string.catfood, Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast3.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.hungrycat);
        toastContainer.addView(catImageView, 0);
        toast3.show();

    }
}

