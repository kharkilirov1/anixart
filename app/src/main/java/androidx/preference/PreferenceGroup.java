package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: P */
    public final SimpleArrayMap<String, Long> f5042P;

    /* renamed from: Q */
    public final Handler f5043Q;

    /* renamed from: R */
    public final List<Preference> f5044R;

    /* renamed from: S */
    public boolean f5045S;

    /* renamed from: T */
    public int f5046T;

    /* renamed from: U */
    public boolean f5047U;

    /* renamed from: V */
    public int f5048V;

    /* renamed from: W */
    public final Runnable f5049W;

    @RestrictTo
    public interface OnExpandButtonClickListener {
    }

    public interface PreferencePositionCallback {
        /* renamed from: f */
        int mo3430f(@NonNull Preference preference);

        /* renamed from: j */
        int mo3431j(@NonNull String str);
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f5042P = new SimpleArrayMap<>();
        this.f5043Q = new Handler(Looper.getMainLooper());
        this.f5045S = true;
        this.f5046T = 0;
        this.f5047U = false;
        this.f5048V = Integer.MAX_VALUE;
        this.f5049W = new Runnable() { // from class: androidx.preference.PreferenceGroup.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (this) {
                    PreferenceGroup.this.f5042P.clear();
                }
            }
        };
        this.f5044R = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5108j, i2, i3);
        this.f5045S = TypedArrayUtils.m1750b(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            m3429W(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: E */
    public void mo3370E() {
        super.mo3370E();
        this.f5047U = false;
        int m3427U = m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            m3426T(i2).mo3370E();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: G */
    public void mo3346G(@Nullable Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3346G(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f5048V = savedState.f5051b;
        super.mo3346G(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    @NonNull
    /* renamed from: H */
    public Parcelable mo3347H() {
        return new SavedState(super.mo3347H(), this.f5048V);
    }

    /* renamed from: R */
    public boolean m3424R(@NonNull Preference preference) {
        long j2;
        if (this.f5044R.contains(preference)) {
            return true;
        }
        if (preference.f4975m != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.f4958J;
                if (preferenceGroup2 == null) {
                    break;
                }
                preferenceGroup = preferenceGroup2;
            }
            String str = preference.f4975m;
            if (preferenceGroup.m3425S(str) != null) {
                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
            }
        }
        int i2 = preference.f4970h;
        if (i2 == Integer.MAX_VALUE) {
            if (this.f5045S) {
                int i3 = this.f5046T;
                this.f5046T = i3 + 1;
                if (i3 != i2) {
                    preference.f4970h = i3;
                    preference.m3388q();
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f5045S = this.f5045S;
            }
        }
        int binarySearch = Collections.binarySearch(this.f5044R, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        boolean mo3349O = mo3349O();
        if (preference.f4985w == mo3349O) {
            preference.f4985w = !mo3349O;
            preference.mo3387p(preference.mo3349O());
            preference.mo3344o();
        }
        synchronized (this) {
            this.f5044R.add(binarySearch, preference);
        }
        PreferenceManager preferenceManager = this.f4965c;
        String str2 = preference.f4975m;
        if (str2 == null || !this.f5042P.containsKey(str2)) {
            synchronized (preferenceManager) {
                j2 = preferenceManager.f5080b;
                preferenceManager.f5080b = 1 + j2;
            }
        } else {
            j2 = this.f5042P.get(str2).longValue();
            this.f5042P.remove(str2);
        }
        preference.f4966d = j2;
        preference.f4967e = true;
        try {
            preference.m3390s(preferenceManager);
            preference.f4967e = false;
            if (preference.f4958J != null) {
                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
            }
            preference.f4958J = this;
            if (this.f5047U) {
                preference.mo3389r();
            }
            m3388q();
            return true;
        } catch (Throwable th) {
            preference.f4967e = false;
            throw th;
        }
    }

    @Nullable
    /* renamed from: S */
    public <T extends Preference> T m3425S(@NonNull CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f4975m, charSequence)) {
            return this;
        }
        int m3427U = m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            PreferenceGroup preferenceGroup = (T) m3426T(i2);
            if (TextUtils.equals(preferenceGroup.f4975m, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.m3425S(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: T */
    public Preference m3426T(int i2) {
        return this.f5044R.get(i2);
    }

    /* renamed from: U */
    public int m3427U() {
        return this.f5044R.size();
    }

    /* renamed from: V */
    public boolean m3428V(@NonNull Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.m3375Q();
            if (preference.f4958J == this) {
                preference.f4958J = null;
            }
            remove = this.f5044R.remove(preference);
            if (remove) {
                String str = preference.f4975m;
                if (str != null) {
                    this.f5042P.put(str, Long.valueOf(preference.mo3361e()));
                    this.f5043Q.removeCallbacks(this.f5049W);
                    this.f5043Q.post(this.f5049W);
                }
                if (this.f5047U) {
                    preference.mo3370E();
                }
            }
        }
        m3388q();
        return remove;
    }

    /* renamed from: W */
    public void m3429W(int i2) {
        if (i2 != Integer.MAX_VALUE && !m3385m()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f5048V = i2;
    }

    @Override // androidx.preference.Preference
    /* renamed from: b */
    public void mo3377b(@NonNull Bundle bundle) {
        super.mo3377b(bundle);
        int m3427U = m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            m3426T(i2).mo3377b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public void mo3378c(@NonNull Bundle bundle) {
        super.mo3378c(bundle);
        int m3427U = m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            m3426T(i2).mo3378c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public void mo3387p(boolean z) {
        super.mo3387p(z);
        int m3427U = m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            Preference m3426T = m3426T(i2);
            if (m3426T.f4985w == z) {
                m3426T.f4985w = !z;
                m3426T.mo3387p(m3426T.mo3349O());
                m3426T.mo3344o();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo3389r() {
        super.mo3389r();
        this.f5047U = true;
        int m3427U = m3427U();
        for (int i2 = 0; i2 < m3427U; i2++) {
            m3426T(i2).mo3389r();
        }
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.preference.PreferenceGroup.SavedState.1
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
        public int f5051b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5051b = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f5051b);
        }

        public SavedState(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f5051b = i2;
        }
    }

    public PreferenceGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
