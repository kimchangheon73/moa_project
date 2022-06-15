package com.example.moa_ex;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;

public class ToggleButtonGroupTableLayout extends TableLayout implements View.OnClickListener {

    private static final String TAG = "ToggleButtonGroupTableLayout";
    private RadioButton activeRadioButton;

    /**
     * @param context
     */
    public ToggleButtonGroupTableLayout(Context context) {
        super(context);

    }

    /**
     * @param context
     * @param attrs
     */
    public ToggleButtonGroupTableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    public void onClick(View v) {
        final RadioButton rb = (RadioButton) v;
        if ( activeRadioButton != null ) {
            activeRadioButton.setChecked(false);
        }
        rb.setChecked(true);
        activeRadioButton = rb;
    }


    @Override
    public void addView(View child, int index,
                        android.view.ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        setChildrenOnClickListener((TableRow)child);
    }

    @Override
    public void addView(View child, android.view.ViewGroup.LayoutParams params) {
        super.addView(child, params);
        setChildrenOnClickListener((TableRow)child);
    }


    private void setChildrenOnClickListener(TableRow tr) {
        final int c = tr.getChildCount();
        for (int i=0; i < c; i++) {
            final View v = tr.getChildAt(i);
            if ( v instanceof RadioButton ) {
                v.setOnClickListener(this);
            }
        }
    }

    public String getCheckedRadioButtonText(){
        if ( activeRadioButton != null ) {
            return activeRadioButton.getText().toString();
        }

        return null;
    }

    public int getCheckedRadioButtonId() {
        if ( activeRadioButton != null ) {
            return activeRadioButton.getId();
        }

        return -1;
    }

    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
    }
}