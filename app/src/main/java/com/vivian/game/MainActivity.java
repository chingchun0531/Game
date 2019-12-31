package com.vivian.game;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findviews();
        gameView=findViewById(R.id.game);
    }
    private void findviews(){
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);


    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_left :
            Log.d("MainActivity","LEFT");
            gameView.moveLeft();
            break;
            case R.id.arrow_right :
                Log.d("MainActivity","RIGHT");
                gameView.moveRight();
                break;
            case R.id.arrow_up :
                Log.d("MainActivity","UP");
                gameView.moveUp();
                break;
            case R.id.arrow_down :
                Log.d("MainActivity","DOWN");
                gameView.moveDown();
                break;
        }

    }
}

