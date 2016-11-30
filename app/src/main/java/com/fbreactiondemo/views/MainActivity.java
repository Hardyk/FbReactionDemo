package com.fbreactiondemo.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.fbreactiondemo.R;
import com.hkv.fbreaction.reactions.ReactionView;

public class MainActivity extends AppCompatActivity {

    private ReactionView reactionView;
    private Button btnFacbookDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initCompo();
        setListner();
    }

    private void initCompo() {
        reactionView = (ReactionView) findViewById(R.id.activity_main_reactView);
        btnFacbookDemo = (Button) findViewById(R.id.activity_main_btnReact);
    }

    private void setListner() {
        btnFacbookDemo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                reactionView.show(motionEvent);
                return false;
            }
        });
    }

}