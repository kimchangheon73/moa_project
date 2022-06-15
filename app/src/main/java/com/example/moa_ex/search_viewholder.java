package com.example.moa_ex;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class search_viewholder {

    private ImageView img;
    private TextView tv_sname;
    private TextView tv_sbirth;
    private TextView tv_sphone;
    private Button btn_calender;
    private Button btn_alert;

    public search_viewholder(View itemView){
        img = itemView.findViewById(R.id.img);
        tv_sname = itemView.findViewById(R.id.tv_sname);
        tv_sbirth = itemView.findViewById(R.id.tv_sbirth);
        tv_sphone = itemView.findViewById(R.id.tv_sphone);
    }

    public ImageView getImg() {
        return img;
    }

    public TextView getTv_sname(){return tv_sname;}

    public TextView getTv_sbirth(){return tv_sbirth;}

    public TextView getTv_sphone(){return tv_sphone;}

    public Button getBtn_calender(){return btn_calender;}

    public Button getBtn_alert(){return btn_alert;}

}
