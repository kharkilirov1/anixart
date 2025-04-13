package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: V */
    public CharSequence[] f4935V;

    /* renamed from: W */
    public CharSequence[] f4936W;

    /* renamed from: X */
    public Set<String> f4937X;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiSelectListPreference(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968980(0x7f040194, float:1.7546629E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = androidx.core.content.res.TypedArrayUtils.m1749a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.f4937X = r2
            int[] r2 = androidx.preference.C0485R.styleable.f5104f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 2
            java.lang.CharSequence[] r5 = androidx.core.content.res.TypedArrayUtils.m1755g(r4, r5, r1)
            r3.f4935V = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L2e
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L2e:
            r3.f4936W = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    @Nullable
    /* renamed from: F */
    public Object mo3345F(@NonNull TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        m3369R(savedState.f4938b);
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
        savedState.f4938b = this.f4937X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: I */
    public void mo3348I(Object obj) {
        m3369R(m3383j((Set) obj));
    }

    /* renamed from: R */
    public void m3369R(Set<String> set) {
        this.f4937X.clear();
        this.f4937X.addAll(set);
        if (m3374P() && !set.equals(m3383j(null))) {
            m3384k();
            SharedPreferences.Editor m3450a = this.f4965c.m3450a();
            m3450a.putStringSet(this.f4975m, set);
            if (!this.f4965c.f5083e) {
                m3450a.apply();
            }
        }
        mo3344o();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.MultiSelectListPreference.SavedState.1
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
        public Set<String> f4938b;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f4938b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f4938b, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4938b.size());
            Set<String> set = this.f4938b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
