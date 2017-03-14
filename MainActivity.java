package com.example.shubh.a111111;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
public class MainActivity extends AppCompatActivity {
    CarouselView carouselView;

    int[] sampleImages = {R.drawable.collage,R.drawable.rt,R.drawable.yu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
           /* if(position == 0)
            imageView.setImageResource(R.drawable.as);

            else
                imageView.setImageResource(R.drawable.qw);

//            Integer imageResource = sampleImages[position];
//            imageView.setImageResource(imageResource);*/

        }
    };
