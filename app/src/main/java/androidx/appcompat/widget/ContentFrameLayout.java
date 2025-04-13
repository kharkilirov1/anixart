package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f1287b;

    /* renamed from: c */
    public TypedValue f1288c;

    /* renamed from: d */
    public TypedValue f1289d;

    /* renamed from: e */
    public TypedValue f1290e;

    /* renamed from: f */
    public TypedValue f1291f;

    /* renamed from: g */
    public TypedValue f1292g;

    /* renamed from: h */
    public final Rect f1293h;

    /* renamed from: i */
    public OnAttachListener f1294i;

    public interface OnAttachListener {
        /* renamed from: a */
        void mo435a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1293h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1291f == null) {
            this.f1291f = new TypedValue();
        }
        return this.f1291f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1292g == null) {
            this.f1292g = new TypedValue();
        }
        return this.f1292g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1289d == null) {
            this.f1289d = new TypedValue();
        }
        return this.f1289d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1290e == null) {
            this.f1290e = new TypedValue();
        }
        return this.f1290e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1287b == null) {
            this.f1287b = new TypedValue();
        }
        return this.f1287b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1288c == null) {
            this.f1288c = new TypedValue();
        }
        return this.f1288c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.f1294i;
        if (onAttachListener != null) {
            onAttachListener.mo435a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.f1294i;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.f1294i = onAttachListener;
    }
}
