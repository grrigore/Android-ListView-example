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


        viewHolder.position.setText(currentItem.getPosition());
        viewHolder.team.setText(currentItem.getTeam());
        viewHolder.matchesPlayed.setText(currentItem.getMatchesPlayed());
        viewHolder.goals.setText(currentItem.getGoals());
        viewHolder.points.setText(currentItem.getPoints());

        return convertView;
    }

    public static class ViewHolder {
        TextView position;
        TextView team;
        TextView matchesPlayed;
        TextView goals;
        TextView points;


        public ViewHolder(View convertView) {
            position = convertView.findViewById(R.id.text_position);
            team = convertView.findViewById(R.id.text_team);
            matchesPlayed = convertView.findViewById(R.id.text_matchesPlayed);
            goals = convertView.findViewById(R.id.text_goals);
            points = convertView.findViewById(R.id.text_points);
        }
    }
}
