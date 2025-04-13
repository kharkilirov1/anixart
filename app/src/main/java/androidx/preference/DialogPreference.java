package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceManager;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: P */
    public CharSequence f4898P;

    /* renamed from: Q */
    public CharSequence f4899Q;

    /* renamed from: R */
    public Drawable f4900R;

    /* renamed from: S */
    public CharSequence f4901S;

    /* renamed from: T */
    public CharSequence f4902T;

    /* renamed from: U */
    public int f4903U;

    public interface TargetFragment {
        @Nullable
        /* renamed from: t0 */
        <T extends Preference> T mo3340t0(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5101c, i2, i3);
        String m1754f = TypedArrayUtils.m1754f(obtainStyledAttributes, 9, 0);
        this.f4898P = m1754f;
        if (m1754f == null) {
            this.f4898P = this.f4971i;
        }
        String string = obtainStyledAttributes.getString(8);
        this.f4899Q = string == null ? obtainStyledAttributes.getString(1) : string;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f4900R = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string2 = obtainStyledAttributes.getString(11);
        this.f4901S = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        String string3 = obtainStyledAttributes.getString(10);
        this.f4902T = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        this.f4903U = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo3339B() {
        PreferenceManager.OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.f4965c.f5087i;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.mo3403k2(this);
        }
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.m1749a(context, C2507R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), 0);
    }
}
