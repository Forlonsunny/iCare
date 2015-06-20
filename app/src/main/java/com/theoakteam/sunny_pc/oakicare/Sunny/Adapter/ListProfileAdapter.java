package com.theoakteam.sunny_pc.oakicare.Sunny.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.theoakteam.sunny_pc.oakicare.Sunny.Module.Profile;
import com.theoakteam.sunny_pc.oakicare.R;

import java.util.List;


public class ListProfileAdapter extends BaseAdapter {
	
	public static final String TAG = "ListProfilesAdapter";
	
	private List<Profile> mItems;
	private LayoutInflater mInflater;
	
	public ListProfileAdapter(Context context, List<Profile> listProfiles) {
		this.setItems(listProfiles);
		this.mInflater = LayoutInflater.from(context);
	}
	

	@Override
	public int getCount() {
		return (getItems() != null && !getItems().isEmpty()) ? getItems().size() : 0 ;
	}

	@Override
	public Profile getItem(int position) {
		return (getItems() != null && !getItems().isEmpty()) ? getItems().get(position) : null ;
	}

	@Override
	public long getItemId(int position) {
		return (getItems() != null && !getItems().isEmpty()) ? getItems().get(position).getId() : position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		ViewHolder holder;
		if(v == null) {
			v = mInflater.inflate(R.layout.list_item_profile, parent, false);
			holder = new ViewHolder();
			holder.txtProfileName = (TextView) v.findViewById(R.id.txt_profile_name);

			v.setTag(holder);
		}
		else {
			holder = (ViewHolder) v.getTag();
		}
		
		// fill row data
		Profile currentItem = getItem(position);
		if(currentItem != null) {
			holder.txtProfileName.setText(currentItem.getmName());

		}
		
		return v;
	}
	
	public List<Profile> getItems() {
		return mItems;
	}

	public void setItems(List<Profile> mItems) {
		this.mItems = mItems;
	}

	class ViewHolder {
		TextView txtProfileName;

			}

}
