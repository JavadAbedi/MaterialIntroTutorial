package za.co.riggaroo.materialhelptutorial.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

import za.co.riggaroo.materialhelptutorial.R;

public class StyledButton extends Button {

    public StyledButton(Context context) {
        super(context);
        init();
    }

    public StyledButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StyledButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), getContext().getString(R.string.font_address)));
    }

    @Override
    public void setText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
    }

    public void setPlainText(CharSequence text, TextView.BufferType type) {
        super.setText(text, type);
    }

}
