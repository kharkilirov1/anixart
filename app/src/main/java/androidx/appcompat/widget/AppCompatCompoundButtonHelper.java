package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;

/* loaded from: classes.dex */
class AppCompatCompoundButtonHelper {

    /* renamed from: a */
    @NonNull
    public final CompoundButton f1158a;

    /* renamed from: b */
    public ColorStateList f1159b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1160c = null;

    /* renamed from: d */
    public boolean f1161d = false;

    /* renamed from: e */
    public boolean f1162e = false;

    /* renamed from: f */
    public boolean f1163f;

    public AppCompatCompoundButtonHelper(@NonNull CompoundButton compoundButton) {
        this.f1158a = compoundButton;
    }

    /* renamed from: a */
    public void m724a() {
        Drawable m2575a = CompoundButtonCompat.m2575a(this.f1158a);
        if (m2575a != null) {
            if (this.f1161d || this.f1162e) {
                Drawable mutate = DrawableCompat.m1845q(m2575a).mutate();
                if (this.f1161d) {
                    DrawableCompat.m1842n(mutate, this.f1159b);
                }
                if (this.f1162e) {
                    DrawableCompat.m1843o(mutate, this.f1160c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1158a.getDrawableState());
                }
                this.f1158a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x007e, TryCatch #1 {all -> 0x007e, blocks: (B:3:0x001c, B:5:0x0022, B:8:0x0028, B:10:0x0039, B:12:0x003f, B:14:0x0045, B:15:0x0052, B:17:0x0059, B:18:0x0062, B:20:0x0069), top: B:2:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {all -> 0x007e, blocks: (B:3:0x001c, B:5:0x0022, B:8:0x0028, B:10:0x0039, B:12:0x003f, B:14:0x0045, B:15:0x0052, B:17:0x0059, B:18:0x0062, B:20:0x0069), top: B:2:0x001c }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m725b(@androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1158a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.C0055R.styleable.f303n
            r8 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.m951r(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1158a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1582b
            r7 = 0
            r4 = r10
            r6 = r11
            androidx.core.view.ViewCompat.m2194d0(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.m967p(r10)     // Catch: java.lang.Throwable -> L7e
            if (r11 == 0) goto L36
            int r11 = r0.m964m(r10, r8)     // Catch: java.lang.Throwable -> L7e
            if (r11 == 0) goto L36
            android.widget.CompoundButton r1 = r9.f1158a     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L7e
            android.content.Context r2 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L7e
            android.graphics.drawable.Drawable r11 = androidx.appcompat.content.res.AppCompatResources.m497b(r2, r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L7e
            r1.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L7e
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 != 0) goto L52
            boolean r10 = r0.m967p(r8)     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L52
            int r10 = r0.m964m(r8, r8)     // Catch: java.lang.Throwable -> L7e
            if (r10 == 0) goto L52
            android.widget.CompoundButton r11 = r9.f1158a     // Catch: java.lang.Throwable -> L7e
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L7e
            android.graphics.drawable.Drawable r10 = androidx.appcompat.content.res.AppCompatResources.m497b(r1, r10)     // Catch: java.lang.Throwable -> L7e
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L7e
        L52:
            r10 = 2
            boolean r11 = r0.m967p(r10)     // Catch: java.lang.Throwable -> L7e
            if (r11 == 0) goto L62
            android.widget.CompoundButton r11 = r9.f1158a     // Catch: java.lang.Throwable -> L7e
            android.content.res.ColorStateList r10 = r0.m954c(r10)     // Catch: java.lang.Throwable -> L7e
            androidx.core.widget.CompoundButtonCompat.m2578d(r11, r10)     // Catch: java.lang.Throwable -> L7e
        L62:
            r10 = 3
            boolean r11 = r0.m967p(r10)     // Catch: java.lang.Throwable -> L7e
            if (r11 == 0) goto L78
            android.widget.CompoundButton r11 = r9.f1158a     // Catch: java.lang.Throwable -> L7e
            r1 = -1
            int r10 = r0.m961j(r10, r1)     // Catch: java.lang.Throwable -> L7e
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.DrawableUtils.m852d(r10, r1)     // Catch: java.lang.Throwable -> L7e
            androidx.core.widget.CompoundButtonCompat.m2579e(r11, r10)     // Catch: java.lang.Throwable -> L7e
        L78:
            android.content.res.TypedArray r10 = r0.f1582b
            r10.recycle()
            return
        L7e:
            r10 = move-exception
            android.content.res.TypedArray r11 = r0.f1582b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCompoundButtonHelper.m725b(android.util.AttributeSet, int):void");
    }
}
