package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0055R;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f1678b;

    /* renamed from: c */
    public int f1679c;

    /* renamed from: d */
    public WeakReference<View> f1680d;

    /* renamed from: e */
    public LayoutInflater f1681e;

    /* renamed from: f */
    public OnInflateListener f1682f;

    public interface OnInflateListener {
        /* renamed from: a */
        void m1005a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1678b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0055R.styleable.f289C, 0, 0);
        this.f1679c = obtainStyledAttributes.getResourceId(2, -1);
        this.f1678b = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m1004a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1678b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1681e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1678b, viewGroup, false);
        int i2 = this.f1679c;
        if (i2 != -1) {
            inflate.setId(i2);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1680d = new WeakReference<>(inflate);
        OnInflateListener onInflateListener = this.f1682f;
        if (onInflateListener != null) {
            onInflateListener.m1005a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1679c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1681e;
    }

    public int getLayoutResource() {
        return this.f1678b;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f1679c = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1681e = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f1678b = i2;
    }

    public void setOnInflateListener(OnInflateListener onInflateListener) {
        this.f1682f = onInflateListener;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f1680d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i2);
            return;
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            m1004a();
        }
    }
}
