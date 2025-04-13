package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.swiftsoft.anixartd.C2507R;

@RestrictTo
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {

    /* renamed from: b */
    public TextView f18862b;

    /* renamed from: c */
    public Button f18863c;

    /* renamed from: d */
    public final TimeInterpolator f18864d;

    /* renamed from: e */
    public int f18865e;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18864d = MotionUtils.m10185d(context, C2507R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.f17343b);
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    /* renamed from: a */
    public void mo10375a(int i2, int i3) {
        this.f18862b.setAlpha(0.0f);
        long j2 = i3;
        long j3 = i2;
        this.f18862b.animate().alpha(1.0f).setDuration(j2).setInterpolator(this.f18864d).setStartDelay(j3).start();
        if (this.f18863c.getVisibility() == 0) {
            this.f18863c.setAlpha(0.0f);
            this.f18863c.animate().alpha(1.0f).setDuration(j2).setInterpolator(this.f18864d).setStartDelay(j3).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    /* renamed from: b */
    public void mo10376b(int i2, int i3) {
        this.f18862b.setAlpha(1.0f);
        long j2 = i3;
        long j3 = i2;
        this.f18862b.animate().alpha(0.0f).setDuration(j2).setInterpolator(this.f18864d).setStartDelay(j3).start();
        if (this.f18863c.getVisibility() == 0) {
            this.f18863c.setAlpha(1.0f);
            this.f18863c.animate().alpha(0.0f).setDuration(j2).setInterpolator(this.f18864d).setStartDelay(j3).start();
        }
    }

    /* renamed from: c */
    public final boolean m10381c(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f18862b.getPaddingTop() == i3 && this.f18862b.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.f18862b;
        if (ViewCompat.m2176P(textView)) {
            ViewCompat.m2226t0(textView, ViewCompat.m2159B(textView), i3, ViewCompat.m2157A(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f18863c;
    }

    public TextView getMessageView() {
        return this.f18862b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f18862b = (TextView) findViewById(C2507R.id.snackbar_text);
        this.f18863c = (Button) findViewById(C2507R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (m10381c(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (m10381c(0, r0, r0) != false) goto L26;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165321(0x7f070089, float:1.7944856E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165320(0x7f070088, float:1.7944854E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f18862b
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = 1
            goto L33
        L32:
            r3 = 0
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f18865e
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f18863c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f18865e
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.m10381c(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.m10381c(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = 0
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f18865e = i2;
    }
}
