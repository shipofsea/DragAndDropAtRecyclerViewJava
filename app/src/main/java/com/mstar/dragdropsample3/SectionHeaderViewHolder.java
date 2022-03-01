package com.mstar.dragdropsample3;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Mstar on 02-28-2022.
 */

public class SectionHeaderViewHolder extends RecyclerView.ViewHolder {

    TextView sectionTitle;

    public SectionHeaderViewHolder(View itemView) {
        super(itemView);
        sectionTitle = itemView.findViewById(R.id.tvSectionHeader);
    }
}
