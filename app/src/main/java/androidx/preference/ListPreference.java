package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: V */
    public CharSequence[] f4920V;

    /* renamed from: W */
    public CharSequence[] f4921W;

    /* renamed from: X */
    public String f4922X;

    /* renamed from: Y */
    public String f4923Y;

    /* renamed from: Z */
    public boolean f4924Z;

    public static final class SimpleSummaryProvider implements Preference.SummaryProvider<ListPreference> {

        /* renamed from: a */
        public static SimpleSummaryProvider f4926a;

        @Override // androidx.preference.Preference.SummaryProvider
        @Nullable
        /* renamed from: a */
        public CharSequence mo3351a(@NonNull ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            return TextUtils.isEmpty(listPreference2.m3364S()) ? listPreference2.f4964b.getString(C2507R.string.not_set) : listPreference2.m3364S();
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5103e, i2, i3);
        this.f4920V = TypedArrayUtils.m1755g(obtainStyledAttributes, 2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(3);
        this.f4921W = textArray == null ? obtainStyledAttributes.getTextArray(1) : textArray;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (SimpleSummaryProvider.f4926a == null) {
                SimpleSummaryProvider.f4926a = new SimpleSummaryProvider();
            }
            this.f4962N = SimpleSummaryProvider.f4926a;
            mo3344o();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5105g, i2, i3);
        this.f4923Y = TypedArrayUtils.m1754f(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
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
        m3365U(savedState.f4925b);
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
        savedState.f4925b = this.f4922X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    /* renamed from: I */
    public void mo3348I(Object obj) {
        m3365U(m3382i((String) obj));
    }

    @Override // androidx.preference.Preference
    /* renamed from: M */
    public void mo3362M(@Nullable CharSequence charSequence) {
        super.mo3362M(charSequence);
        if (charSequence == null) {
            this.f4923Y = null;
        } else {
            this.f4923Y = charSequence.toString();
        }
    }

    /* renamed from: R */
    public int m3363R(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f4921W) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f4921W[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    @Nullable
    /* renamed from: S */
    public CharSequence m3364S() {
        CharSequence[] charSequenceArr;
        int m3363R = m3363R(this.f4922X);
        if (m3363R < 0 || (charSequenceArr = this.f4920V) == null) {
            return null;
        }
        return charSequenceArr[m3363R];
    }

    /* renamed from: T */
    public void mo3341T(CharSequence[] charSequenceArr) {
        this.f4920V = charSequenceArr;
    }

    /* renamed from: U */
    public void m3365U(String str) {
        boolean z = !TextUtils.equals(this.f4922X, str);
        if (z || !this.f4924Z) {
            this.f4922X = str;
            this.f4924Z = true;
            m3371K(str);
            if (z) {
                mo3344o();
            }
        }
    }

    /* renamed from: V */
    public void mo3342V(int i2) {
        CharSequence[] charSequenceArr = this.f4921W;
        if (charSequenceArr != null) {
            m3365U(charSequenceArr[i2].toString());
        }
    }

    @Override // androidx.preference.Preference
    @Nullable
    /* renamed from: l */
    public CharSequence mo3366l() {
        Preference.SummaryProvider summaryProvider = this.f4962N;
        if (summaryProvider != null) {
            return summaryProvider.mo3351a(this);
        }
        CharSequence m3364S = m3364S();
        CharSequence mo3366l = super.mo3366l();
        String str = this.f4923Y;
        if (str == null) {
            return mo3366l;
        }
        Object[] objArr = new Object[1];
        if (m3364S == null) {
            m3364S = "";
        }
        objArr[0] = m3364S;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, mo3366l)) {
            return mo3366l;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.ListPreference.SavedState.1
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
        public String f4925b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4925b = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f4925b);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ListPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.m1749a(context, C2507R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), 0);
    }
}
