package uz.exemple.less6_task6_nestedrecyclerview_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import uz.exemple.less6_task6_nestedrecyclerview_java.R;
import uz.exemple.less6_task6_nestedrecyclerview_java.model.ChildModel;
import uz.exemple.less6_task6_nestedrecyclerview_java.model.ParentModel;

public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ViewHolder> {
    List<ParentModel> parentModelList;
    Context context;

    public ParentAdapter(List<ParentModel> parentModelList, Context context) {
        this.parentModelList = parentModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ParentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_rv_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentAdapter.ViewHolder holder, int position) {
        holder.tv_parent_title.setText(parentModelList.get(position).title);

        ChildAdapter childAdapter;
        childAdapter = new ChildAdapter(parentModelList.get(position).childModelList,context);
        holder.rv_child.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.rv_child.setAdapter(childAdapter);
        childAdapter.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return parentModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerView rv_child;
        TextView tv_parent_title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rv_child = itemView.findViewById(R.id.rv_child);
            tv_parent_title = itemView.findViewById(R.id.tv_parent_title);
        }
    }
}
