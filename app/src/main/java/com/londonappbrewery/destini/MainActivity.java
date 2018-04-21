package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 3 - Declare member variables here:
    private TextView tvStory;
    private Button btnTop;
    private Button btnBottom;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 4 - Wire up the 3 views from the layout to the member variables:
        tvStory = (TextView) findViewById(R.id.storyTextView);
        btnTop = (Button) findViewById(R.id.buttonTop);
        btnBottom = (Button) findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    tvStory.setText(R.string.T3_Story);
                    btnTop.setText(R.string.T3_Ans1);
                    btnBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else {
                    tvStory.setText(R.string.T6_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }
            }
        });

        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    tvStory.setText(R.string.T2_Story);
                    btnTop.setText(R.string.T2_Ans1);
                    btnBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    tvStory.setText(R.string.T4_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    tvStory.setText(R.string.T5_End);
                    btnTop.setVisibility(View.GONE);
                    btnBottom.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
