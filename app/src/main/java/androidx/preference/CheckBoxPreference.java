package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: U */
    public final Listener f4896U;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (CheckBoxPreference.this.m3376a(Boolean.valueOf(z))) {
                CheckBoxPreference.this.m3461R(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CheckBoxPreference(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968755(0x7f0400b3, float:1.7546173E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = androidx.core.content.res.TypedArrayUtils.m1749a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.CheckBoxPreference$Listener r2 = new androidx.preference.CheckBoxPreference$Listener
            r2.<init>()
            r3.f4896U = r2
            int[] r2 = androidx.preference.C0485R.styleable.f5100b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 5
            java.lang.String r5 = androidx.core.content.res.TypedArrayUtils.m1754f(r4, r5, r1)
            r3.m3463T(r5)
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L2f:
            r3.m3462S(r5)
            r5 = 3
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f5142T = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    @RestrictTo
    /* renamed from: J */
    public void mo3336J(@NonNull View view) {
        super.mo3336J(view);
        if (((AccessibilityManager) this.f4964b.getSystemService("accessibility")).isEnabled()) {
            m3337W(view.findViewById(android.R.id.checkbox));
            m3464U(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public final void m3337W(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5138P);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f4896U);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        m3337W(preferenceViewHolder.m3455a(android.R.id.checkbox));
        m3465V(preferenceViewHolder);
    }
}
