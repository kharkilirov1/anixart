package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: U */
    public final Listener f5134U;

    /* renamed from: V */
    public CharSequence f5135V;

    /* renamed from: W */
    public CharSequence f5136W;

    public class Listener implements CompoundButton.OnCheckedChangeListener {
        public Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (SwitchPreferenceCompat.this.m3376a(Boolean.valueOf(z))) {
                SwitchPreferenceCompat.this.m3461R(z);
            } else {
                compoundButton.setChecked(!z);
            }
        }
    }

    public SwitchPreferenceCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.switchPreferenceCompatStyle, 0);
        this.f5134U = new Listener();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5112n, C2507R.attr.switchPreferenceCompatStyle, 0);
        m3463T(TypedArrayUtils.m1754f(obtainStyledAttributes, 7, 0));
        String string = obtainStyledAttributes.getString(6);
        m3462S(string == null ? obtainStyledAttributes.getString(1) : string);
        String string2 = obtainStyledAttributes.getString(9);
        this.f5135V = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        mo3344o();
        String string3 = obtainStyledAttributes.getString(8);
        this.f5136W = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        mo3344o();
        this.f5142T = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    @RestrictTo
    /* renamed from: J */
    public void mo3336J(@NonNull View view) {
        super.mo3336J(view);
        if (((AccessibilityManager) this.f4964b.getSystemService("accessibility")).isEnabled()) {
            m3460W(view.findViewById(C2507R.id.switchWidget));
            m3464U(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public final void m3460W(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f5138P);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f5135V);
            switchCompat.setTextOff(this.f5136W);
            switchCompat.setOnCheckedChangeListener(this.f5134U);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: t */
    public void mo3338t(@NonNull PreferenceViewHolder preferenceViewHolder) {
        super.mo3338t(preferenceViewHolder);
        m3460W(preferenceViewHolder.m3455a(C2507R.id.switchWidget));
        m3465V(preferenceViewHolder);
    }
}
