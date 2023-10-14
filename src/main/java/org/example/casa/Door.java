package org.example.casa;

public class Door{
    public String form;
    public boolean myDoor;
    private String color;
    public String handle;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public boolean isMyDoor() {
        return myDoor;
    }

    public void setMyDoor(boolean myDoor) {
        this.myDoor = myDoor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    @Override
    public String toString() {
        return "Door{" +
                "form='" + form + '\'' +
                ", myDoor=" + myDoor +
                ", color='" + color + '\'' +
                ", handle='" + handle + '\'' +
                '}';
    }
}

