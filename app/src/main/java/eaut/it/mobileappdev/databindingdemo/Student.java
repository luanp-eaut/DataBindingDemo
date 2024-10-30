package eaut.it.mobileappdev.databindingdemo;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Student extends BaseObservable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
