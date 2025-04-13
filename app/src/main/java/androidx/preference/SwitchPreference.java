package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: U */
    public final Listener f5130U;

    /* renamed from: V */
    public CharSequence f5131V;

    /* renamed from: W */
    public CharSequence f5132W;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreference.this.m3376a(Boolean.valueOf(z))) {
                SwitchPreference.this.m3461R(z);
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
    public SwitchPreference(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969777(0x7f0404b1, float:1.7548245E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = androidx.core.content.res.TypedArrayUtils.m1749a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.SwitchPreference$Listener r2 = new androidx.preference.SwitchPreference$Listener
            r2.<init>()
            r3.f5130U = r2
            int[] r2 = androidx.preference.C0485R.styleable.f5111m
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = androidx.core.content.res.TypedArrayUtils.m1754f(r4, r5, r1)
            r3.m3463T(r5)
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L2f:
            r3.m3462S(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L3f
            java.lang.String r5 = r4.getString(r0)
        L3f:
            r3.f5131V = r5
            r3.mo3344o()
            r5 = 8
            r0 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L51
            java.lang.String r5 = r4.getString(r0)
        L51:
            r3.f5132W = r5
            r3.mo3344o()
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.f5142T = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    @RestrictTo
    /* renamed from: J */
    public void mo3336J(@NonNull View view) {
        super.mo3336J(view);
        if (((AccessibilityManager) this.f4964b.getSystemService("accessibility")).isEnabled()) {
            m3459W(view.findViewById(android.R.id.switch_widget));
            m3464U(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public final void m3459W(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5138P);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f5131V);
            r4.setTextOff(this.f5132W);
            r4.setOnCheckedChangeListener(this.f5130U);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        m3459W(preferenceViewHolder.m3455a(android.R.id.switch_widget));
        m3465V(preferenceViewHolder);
    }
}
