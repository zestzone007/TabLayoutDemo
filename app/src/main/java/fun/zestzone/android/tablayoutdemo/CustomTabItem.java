package fun.zestzone.android.tablayoutdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class CustomTabItem extends LinearLayout {
    private final ImageView tabImg;
    private final TextView tabTv;

    private CustomTabItem(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.layout_tab, this, true);
        tabImg = findViewById(R.id.img_tab);
        tabTv = findViewById(R.id.tv_tab);
    }

    public CustomTabItem(Context context, @DrawableRes int drawable, @StringRes int id) {
        this(context);
        tabImg.setBackgroundResource(drawable);
        tabTv.setText(id);
    }
}
