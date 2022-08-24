package uz.exemple.less6_task6_nestedrecyclerview_java.model;

import java.util.List;

public class ParentModel {
    public String title;
    public List<ChildModel> childModelList;

    public ParentModel(String title, List<ChildModel> childModelList) {
        this.title = title;
        this.childModelList = childModelList;
    }
}
