package com.example.william.gallery;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Bitmap;

public class MainActivity extends AppCompatActivity {

    public class imageAdaptor extends BaseAdapter
    {
        class imageContainer
        {
            int position;
            ImageView thumbnail;
            URI location;
        }

        //Required overrides for extension of BaseAdaptor
        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return i;
        }
        @Override
        public int getCount() {
            return ; //TODO: Fix this;
        }
        @Override
        public View getView(final int i, View convertView, ViewGroup viewGroup) {
            imageContainer photo;
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.photo, viewGroup, false);
                photo = new imageContainer();
                photo.thumbnail = convertView.findViewById(R.id.photo);
                //TODO set thumbnail.bitmap
                convertView.setTag(photo);
            } else {
                photo = (imageContainer) convertView.getTag();
            }
            photo.position = i;
            photo.thumbnail.setImageBitmap(null);
            new AsyncTask<imageContainer, Void, Bitmap>()
            {
                private imageContainer photo;
                @Override
                protected Bitmap doInBackground(imageContainer... params)
                {
                    photo = params[0];
                    Bitmap bmp = null;
                    try
                    {
                        
                    }
                }
            }
            return convertView;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}