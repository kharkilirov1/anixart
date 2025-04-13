package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

@RestrictTo
/* loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {

    /* renamed from: a */
    @NonNull
    public final CheckedTextView f1152a;

    /* renamed from: b */
    public ColorStateList f1153b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1154c = null;

    /* renamed from: d */
    public boolean f1155d = false;

    /* renamed from: e */
    public boolean f1156e = false;

    /* renamed from: f */
    public boolean f1157f;

    public AppCompatCheckedTextViewHelper(@NonNull CheckedTextView checkedTextView) {
        this.f1152a = checkedTextView;
    }

    /* renamed from: a */
    public void m723a() {
        Drawable checkMarkDrawable = this.f1152a.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1155d || this.f1156e) {
                Drawable mutate = DrawableCompat.m1845q(checkMarkDrawable).mutate();
                if (this.f1155d) {
                    DrawableCompat.m1842n(mutate, this.f1153b);
                }
                if (this.f1156e) {
                    DrawableCompat.m1843o(mutate, this.f1154c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1152a.getDrawableState());
                }
                this.f1152a.setCheckMarkDrawable(mutate);
            }
        }
    }
}
