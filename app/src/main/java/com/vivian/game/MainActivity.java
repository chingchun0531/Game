package com.vivian.game;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    public GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();

    }
    private void findviews(){
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.game);

    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_left :
            Log.d("MainActivity","LEFT");
                gameView.setPosX(gameView.getPosX()-50);
                gameView.invalidate();
            break;
            case R.id.arrow_right :
                Log.d("MainActivity","RIGHT");
                gameView.setPosX(gameView.getPosX()+50);
                gameView.invalidate();
            break;
            case R.id.arrow_up :
                Log.d("MainActivity","UP");
                gameView.setPosY(gameView.getPosY()-50);
                gameView.invalidate();
                break;
            case R.id.arrow_down :
                Log.d("MainActivity","DOWN");
                gameView.setPosY(gameView.getPosY()+50);
                gameView.invalidate();
                break;
        }

    }
}

