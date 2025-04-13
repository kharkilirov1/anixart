package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: h */
    public int f6506h;

    /* renamed from: i */
    public boolean f6507i;

    /* renamed from: j */
    public boolean f6508j;

    /* renamed from: k */
    public boolean f6509k;

    /* renamed from: l */
    public float f6510l;

    /* renamed from: m */
    public float f6511m;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$1 */
    class ViewOnClickListenerC06591 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            throw null;
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$2 */
    class ViewOnClickListenerC06602 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: c */
    public void mo4339c(int i2, float f2, boolean z) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.f6507i;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f6506h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f6509k) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f6510l = x;
            this.f6511m = y;
            this.f6509k = false;
        } else {
            if (action == 1) {
                throw null;
            }
            if (action == 2) {
                float f2 = 0;
                if (Math.abs(x - this.f6510l) > f2 || Math.abs(y - this.f6511m) > f2) {
                    this.f6509k = true;
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
        super.setBackgroundColor(i2);
        if (this.f6508j) {
            return;
        }
        this.f6507i = (i2 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f6508j) {
            return;
        }
        this.f6507i = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        if (this.f6508j) {
            return;
        }
        this.f6507i = i2 == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f6507i = z;
        this.f6508j = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        if (i5 < 0) {
            i5 = 0;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public void setTabIndicatorColor(@ColorInt int i2) {
        this.f6506h = i2;
        throw null;
    }

    public void setTabIndicatorColorResource(@ColorRes int i2) {
        setTabIndicatorColor(ContextCompat.m1670c(getContext(), i2));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        super.setTextSpacing(i2);
    }
}
