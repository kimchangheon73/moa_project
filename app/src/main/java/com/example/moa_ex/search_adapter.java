package com.example.moa_ex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moa_ex.user_data;

import java.util.ArrayList;

//어댑터의 역할 : 데이터와 레이아웃을 바인딩해서 listView에 출력될 수 있도록 변환해주는 역할
public class search_adapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<user_data> list;
    LayoutInflater inflater;
    search_viewholder holder; //list_item.xml에 배치된 View객체들을 초기화하는 역할

    public search_adapter(Context context, int layout, ArrayList<user_data> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
        inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        if(view == null) {
            view = inflater.inflate(layout, viewGroup, false);
            holder = new search_viewholder(view);
            view.setTag(holder); // 해당 뷰 객체 상태정보 저장 용도

        }else{
            holder = (search_viewholder) view.getTag();
        }


        user_data vo = list.get(i);


        holder.getImg().setImageResource(vo.getImgId());
        holder.getTv_sname().setText(vo.getS_name());
        holder.getTv_sbirth().setText(String.valueOf(vo.getS_birth()));
        holder.getTv_sphone().setText(String.valueOf(vo.getS_phone()));

        return view;
    }
}