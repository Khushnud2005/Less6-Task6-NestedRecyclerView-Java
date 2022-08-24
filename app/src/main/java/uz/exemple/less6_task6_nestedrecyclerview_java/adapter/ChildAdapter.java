package uz.exemple.less6_task6_nestedrecyclerview_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.exemple.less6_task6_nestedrecyclerview_java.R;
import uz.exemple.less6_task6_nestedrecyclerview_java.model.ChildModel;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {
    public List<ChildModel> childModelList;
    Context context;

    public ChildAdapter(List<ChildModel> childModelList, Context context) {
        this.childModelList = childModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChildAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_rv_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(childModelList.get(position).image);
    }

    @Override
    public int getItemCount() {
        return childModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.iv_child_item);
        }
    }
}
