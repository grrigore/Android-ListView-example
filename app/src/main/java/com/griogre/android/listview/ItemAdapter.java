package com.griogre.android.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Cristi on 13-Dec-17.
 */

public class ItemAdapter extends BaseAdapter {

    private ArrayList<Item> mItemList;
    private Context mContext;

    public ItemAdapter(Context mContext, ArrayList mItemList) {
        this.mContext = mContext;
        this.mItemList = mItemList;
    }

    @Override
    public int getCount() {
        return mItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return mItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Item currentItem = (Item) getItem(position);


        viewHolder.column1.setText(currentItem.getColumn1());
        viewHolder.column2.setText(currentItem.getColumn2());
        viewHolder.column3.setText(currentItem.getColumn3());

        return convertView;
    }

    public static class ViewHolder {
        TextView column1;
        TextView column2;
        TextView column3;


        public ViewHolder(View convertView) {
            column1 = convertView.findViewById(R.id.text_column1);
            column2 = convertView.findViewById(R.id.text_column2);
            column3 = convertView.findViewById(R.id.text_column3);
        }
    }
}
