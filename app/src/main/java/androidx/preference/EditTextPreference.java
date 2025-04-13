package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.Preference;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: V */
    public String f4909V;

    public interface OnBindEditTextListener {
    }

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<EditTextPreference> {

        /* renamed from: a */
        public static SimpleSummaryProvider f4911a;

        @Override // androidx.preference.Preference.SummaryProvider
        @Nullable
        /* renamed from: a */
        public CharSequence mo3351a(@NonNull EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            return TextUtils.isEmpty(editTextPreference2.f4909V) ? editTextPreference2.f4964b.getString(C2507R.string.not_set) : editTextPreference2.f4909V;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969031(0x7f0401c7, float:1.7546732E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = androidx.core.content.res.TypedArrayUtils.m1749a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = androidx.preference.C0485R.styleable.f5102d
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = androidx.core.content.res.TypedArrayUtils.m1750b(r4, r1, r1, r1)
            if (r5 == 0) goto L2c
            androidx.preference.EditTextPreference$SimpleSummaryProvider r5 = androidx.preference.EditTextPreference.SimpleSummaryProvider.f4911a
            if (r5 != 0) goto L25
            androidx.preference.EditTextPreference$SimpleSummaryProvider r5 = new androidx.preference.EditTextPreference$SimpleSummaryProvider
            r5.<init>()
            androidx.preference.EditTextPreference.SimpleSummaryProvider.f4911a = r5
        L25:
            androidx.preference.EditTextPreference$SimpleSummaryProvider r5 = androidx.preference.EditTextPreference.SimpleSummaryProvider.f4911a
            r3.f4962N = r5
            r3.mo3344o()
        L2c:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    /* renamed from: F */
    public Object mo3345F(@NonNull TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
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
        m3350R(savedState.f4910b);
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
        savedState.f4910b = this.f4909V;
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: I */
    public void mo3348I(Object obj) {
        m3350R(m3382i((String) obj));
    }

    @Override // androidx.preference.Preference
    /* renamed from: O */
    public boolean mo3349O() {
        return TextUtils.isEmpty(this.f4909V) || super.mo3349O();
    }

    /* renamed from: R */
    public void m3350R(@Nullable String str) {
        boolean mo3349O = mo3349O();
        this.f4909V = str;
        m3371K(str);
        boolean mo3349O2 = mo3349O();
        if (mo3349O2 != mo3349O) {
            mo3387p(mo3349O2);
        }
        mo3344o();
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.EditTextPreference.SavedState.1
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
        public String f4910b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4910b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f4910b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
