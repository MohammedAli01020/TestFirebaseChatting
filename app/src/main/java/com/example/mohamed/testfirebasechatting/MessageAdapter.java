package com.example.mohamed.testfirebasechatting;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.example.mohamed.testfirebasechatting.data.Messages;


public class MessageAdapter extends ArrayAdapter<Messages> {

    public MessageAdapter(@NonNull Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        Messages currentMessage = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);

            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.text.setText(currentMessage.getmText());
        holder.name.setText(currentMessage.getmName());

        return convertView;
    }

    private static class ViewHolder {
        TextView text;
        TextView name;

        ViewHolder (View listItem){
            text = listItem.findViewById(R.id.tv_text);
            name = listItem.findViewById(R.id.tv_name);
        }
    }
}
