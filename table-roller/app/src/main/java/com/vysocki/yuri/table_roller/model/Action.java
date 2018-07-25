package com.vysocki.yuri.table_roller.model;

import com.vysocki.yuri.table_roller.R;

public class Action {
    private int slot = 5;
    private int iconId = R.drawable.action_empty;
    private String formula = "test";
    private String name = "Test Action";

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
