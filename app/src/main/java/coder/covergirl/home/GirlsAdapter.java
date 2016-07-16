package coder.covergirl.home;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

import coder.covergirl.data.bean.GirlsBean;

/**
 * adapter
 */
public class GirlsAdapter extends RecyclerArrayAdapter<GirlsBean.ResultsEntity> {

    public GirlsAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new GirlsViewHolder(parent);
    }
}
