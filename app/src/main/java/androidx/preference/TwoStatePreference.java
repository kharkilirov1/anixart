package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: P */
    public boolean f5138P;

    /* renamed from: Q */
    public CharSequence f5139Q;

    /* renamed from: R */
    public CharSequence f5140R;

    /* renamed from: S */
    public boolean f5141S;

    /* renamed from: T */
    public boolean f5142T;

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: B */
    public void mo3339B() {
        boolean z = !this.f5138P;
        if (m3376a(Boolean.valueOf(z))) {
            m3461R(z);
        }
    }

    @Override // androidx.preference.Preference
    @Nullable
    /* renamed from: F */
    public Object mo3345F(@NonNull TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    @Override // androidx.preference.Preference
    /* renamed from: G */
    public void mo3346G(@Nullable Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3346G(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3346G(savedState.getSuperState());
        m3461R(savedState.f5143b);
    }

    @Override // androidx.preference.Preference
    @Nullable
    /* renamed from: H */
    public Parcelable mo3347H() {
        Parcelable mo3347H = super.mo3347H();
        if (this.f4981s) {
            return mo3347H;
        }
        SavedState savedState = new SavedState(mo3347H);
        savedState.f5143b = this.f5138P;
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: I */
    public void mo3348I(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m3461R(m3380f(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    /* renamed from: O */
    public boolean mo3349O() {
        return (this.f5142T ? this.f5138P : !this.f5138P) || super.mo3349O();
    }

    /* renamed from: R */
    public void m3461R(boolean z) {
        boolean z2 = this.f5138P != z;
        if (z2 || !this.f5141S) {
            this.f5138P = z;
            this.f5141S = true;
            if (m3374P() && z != m3380f(!z)) {
                m3384k();
                SharedPreferences.Editor m3450a = this.f4965c.m3450a();
                m3450a.putBoolean(this.f4975m, z);
                if (!this.f4965c.f5083e) {
                    m3450a.apply();
                }
            }
            if (z2) {
                mo3387p(mo3349O());
                mo3344o();
            }
        }
    }

    /* renamed from: S */
    public void m3462S(@Nullable CharSequence charSequence) {
        this.f5140R = charSequence;
        if (this.f5138P) {
            return;
        }
        mo3344o();
    }

    /* renamed from: T */
    public void m3463T(@Nullable CharSequence charSequence) {
        this.f5139Q = charSequence;
        if (this.f5138P) {
            mo3344o();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.RestrictTo
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m3464U(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f5138P
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.f5139Q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.f5139Q
            r5.setText(r0)
        L1a:
            r0 = 0
            goto L2e
        L1c:
            boolean r1 = r4.f5138P
            if (r1 != 0) goto L2e
            java.lang.CharSequence r1 = r4.f5140R
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2e
            java.lang.CharSequence r0 = r4.f5140R
            r5.setText(r0)
            goto L1a
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r1 = r4.mo3366l()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3e
            r5.setText(r1)
            r0 = 0
        L3e:
            r1 = 8
            if (r0 != 0) goto L43
            goto L45
        L43:
            r2 = 8
        L45:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4e
            r5.setVisibility(r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.m3464U(android.view.View):void");
    }

    /* renamed from: V */
    public void m3465V(@NonNull PreferenceViewHolder preferenceViewHolder) {
        m3464U(preferenceViewHolder.m3455a(android.R.id.summary));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.TwoStatePreference.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* renamed from: b */
        public boolean f5143b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5143b = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5143b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TwoStatePreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
