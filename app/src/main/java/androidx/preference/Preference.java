package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.preference.PreferenceManager;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A */
    public boolean f4949A;

    /* renamed from: B */
    public boolean f4950B;

    /* renamed from: C */
    public boolean f4951C;

    /* renamed from: D */
    public boolean f4952D;

    /* renamed from: E */
    public boolean f4953E;

    /* renamed from: F */
    public int f4954F;

    /* renamed from: G */
    public int f4955G;

    /* renamed from: H */
    public OnPreferenceChangeInternalListener f4956H;

    /* renamed from: I */
    public List<Preference> f4957I;

    /* renamed from: J */
    public PreferenceGroup f4958J;

    /* renamed from: K */
    public boolean f4959K;

    /* renamed from: L */
    public boolean f4960L;

    /* renamed from: M */
    public OnPreferenceCopyListener f4961M;

    /* renamed from: N */
    public SummaryProvider f4962N;

    /* renamed from: O */
    public final View.OnClickListener f4963O;

    /* renamed from: b */
    @NonNull
    public final Context f4964b;

    /* renamed from: c */
    @Nullable
    public PreferenceManager f4965c;

    /* renamed from: d */
    public long f4966d;

    /* renamed from: e */
    public boolean f4967e;

    /* renamed from: f */
    public OnPreferenceChangeListener f4968f;

    /* renamed from: g */
    public OnPreferenceClickListener f4969g;

    /* renamed from: h */
    public int f4970h;

    /* renamed from: i */
    public CharSequence f4971i;

    /* renamed from: j */
    public CharSequence f4972j;

    /* renamed from: k */
    public int f4973k;

    /* renamed from: l */
    public Drawable f4974l;

    /* renamed from: m */
    public String f4975m;

    /* renamed from: n */
    public Intent f4976n;

    /* renamed from: o */
    public String f4977o;

    /* renamed from: p */
    public Bundle f4978p;

    /* renamed from: q */
    public boolean f4979q;

    /* renamed from: r */
    public boolean f4980r;

    /* renamed from: s */
    public boolean f4981s;

    /* renamed from: t */
    public String f4982t;

    /* renamed from: u */
    public Object f4983u;

    /* renamed from: v */
    public boolean f4984v;

    /* renamed from: w */
    public boolean f4985w;

    /* renamed from: x */
    public boolean f4986x;

    /* renamed from: y */
    public boolean f4987y;

    /* renamed from: z */
    public boolean f4988z;

    public static class BaseSavedState extends AbsSavedState {

        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR = new Parcelable.Creator<BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            @Override // android.os.Parcelable.Creator
            public BaseSavedState createFromParcel(Parcel parcel) {
                return new BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public BaseSavedState[] newArray(int i2) {
                return new BaseSavedState[i2];
            }
        };

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface OnPreferenceChangeInternalListener {
        /* renamed from: b */
        void mo3391b(@NonNull Preference preference);

        /* renamed from: d */
        void mo3392d(@NonNull Preference preference);

        /* renamed from: i */
        void mo3393i(@NonNull Preference preference);
    }

    public interface OnPreferenceChangeListener {
        /* renamed from: a */
        boolean mo3394a(@NonNull Preference preference, Object obj);
    }

    public interface OnPreferenceClickListener {
        /* renamed from: c */
        boolean mo3395c(@NonNull Preference preference);
    }

    public static class OnPreferenceCopyListener implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b */
        public final Preference f4990b;

        public OnPreferenceCopyListener(@NonNull Preference preference) {
            this.f4990b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence mo3366l = this.f4990b.mo3366l();
            if (!this.f4990b.f4952D || TextUtils.isEmpty(mo3366l)) {
                return;
            }
            contextMenu.setHeaderTitle(mo3366l);
            contextMenu.add(0, 0, 0, C2507R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f4990b.f4964b.getSystemService("clipboard");
            CharSequence mo3366l = this.f4990b.mo3366l();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", mo3366l));
            Context context = this.f4990b.f4964b;
            Toast.makeText(context, context.getString(C2507R.string.preference_copied, mo3366l), 0).show();
            return true;
        }
    }

    public interface SummaryProvider<T extends Preference> {
        @Nullable
        /* renamed from: a */
        CharSequence mo3351a(@NonNull T t);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2, int i3) {
        this.f4970h = Integer.MAX_VALUE;
        this.f4979q = true;
        this.f4980r = true;
        this.f4981s = true;
        this.f4984v = true;
        this.f4985w = true;
        this.f4986x = true;
        this.f4987y = true;
        this.f4988z = true;
        this.f4950B = true;
        this.f4953E = true;
        this.f4954F = C2507R.layout.preference;
        this.f4963O = new View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Preference.this.mo3336J(view);
            }
        };
        this.f4964b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0485R.styleable.f5105g, i2, i3);
        this.f4973k = TypedArrayUtils.m1753e(obtainStyledAttributes, 23, 0, 0);
        String string = obtainStyledAttributes.getString(26);
        this.f4975m = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f4971i = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f4972j = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f4970h = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.f4977o = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.f4954F = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, C2507R.layout.preference));
        this.f4955G = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.f4979q = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.f4980r = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.f4981s = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.f4982t = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.f4987y = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.f4980r));
        this.f4988z = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.f4980r));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f4983u = mo3345F(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f4983u = mo3345F(obtainStyledAttributes, 11);
        }
        this.f4953E = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f4949A = hasValue;
        if (hasValue) {
            this.f4950B = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.f4951C = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.f4986x = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.f4952D = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public void mo3339B() {
    }

    /* renamed from: E */
    public void mo3370E() {
        m3375Q();
        this.f4959K = true;
    }

    @Nullable
    /* renamed from: F */
    public Object mo3345F(@NonNull TypedArray typedArray, int i2) {
        return null;
    }

    /* renamed from: G */
    public void mo3346G(@Nullable Parcelable parcelable) {
        this.f4960L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @Nullable
    /* renamed from: H */
    public Parcelable mo3347H() {
        this.f4960L = true;
        return AbsSavedState.EMPTY_STATE;
    }

    /* renamed from: I */
    public void mo3348I(@Nullable Object obj) {
    }

    @RestrictTo
    /* renamed from: J */
    public void mo3336J(@NonNull View view) {
        Intent intent;
        PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (mo3386n() && this.f4980r) {
            mo3339B();
            OnPreferenceClickListener onPreferenceClickListener = this.f4969g;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.mo3395c(this)) {
                PreferenceManager preferenceManager = this.f4965c;
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.f5086h) == null || !onPreferenceTreeClickListener.mo3402a3(this)) && (intent = this.f4976n) != null) {
                    this.f4964b.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: K */
    public boolean m3371K(String str) {
        if (!m3374P()) {
            return false;
        }
        if (TextUtils.equals(str, m3382i(null))) {
            return true;
        }
        m3384k();
        SharedPreferences.Editor m3450a = this.f4965c.m3450a();
        m3450a.putString(this.f4975m, str);
        if (!this.f4965c.f5083e) {
            m3450a.apply();
        }
        return true;
    }

    /* renamed from: L */
    public final void m3372L(@NonNull View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m3372L(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: M */
    public void mo3362M(@Nullable CharSequence charSequence) {
        if (this.f4962N != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f4972j, charSequence)) {
            return;
        }
        this.f4972j = charSequence;
        mo3344o();
    }

    /* renamed from: N */
    public final void m3373N(boolean z) {
        if (this.f4986x != z) {
            this.f4986x = z;
            OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.f4956H;
            if (onPreferenceChangeInternalListener != null) {
                onPreferenceChangeInternalListener.mo3392d(this);
            }
        }
    }

    /* renamed from: O */
    public boolean mo3349O() {
        return !mo3386n();
    }

    /* renamed from: P */
    public boolean m3374P() {
        return this.f4965c != null && this.f4981s && m3385m();
    }

    /* renamed from: Q */
    public final void m3375Q() {
        List<Preference> list;
        PreferenceScreen preferenceScreen;
        String str = this.f4982t;
        if (str != null) {
            PreferenceManager preferenceManager = this.f4965c;
            Preference preference = null;
            if (preferenceManager != null && (preferenceScreen = preferenceManager.f5085g) != null) {
                preference = preferenceScreen.m3425S(str);
            }
            if (preference == null || (list = preference.f4957I) == null) {
                return;
            }
            list.remove(this);
        }
    }

    /* renamed from: a */
    public boolean m3376a(Object obj) {
        OnPreferenceChangeListener onPreferenceChangeListener = this.f4968f;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.mo3394a(this, obj);
    }

    /* renamed from: b */
    public void mo3377b(@NonNull Bundle bundle) {
        Parcelable parcelable;
        if (!m3385m() || (parcelable = bundle.getParcelable(this.f4975m)) == null) {
            return;
        }
        this.f4960L = false;
        mo3346G(parcelable);
        if (!this.f4960L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* renamed from: c */
    public void mo3378c(@NonNull Bundle bundle) {
        if (m3385m()) {
            this.f4960L = false;
            Parcelable mo3347H = mo3347H();
            if (!this.f4960L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (mo3347H != null) {
                bundle.putParcelable(this.f4975m, mo3347H);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Preference preference) {
        Preference preference2 = preference;
        int i2 = this.f4970h;
        int i3 = preference2.f4970h;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.f4971i;
        CharSequence charSequence2 = preference2.f4971i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.f4971i.toString());
    }

    @NonNull
    /* renamed from: d */
    public Bundle m3379d() {
        if (this.f4978p == null) {
            this.f4978p = new Bundle();
        }
        return this.f4978p;
    }

    /* renamed from: e */
    public long mo3361e() {
        return this.f4966d;
    }

    /* renamed from: f */
    public boolean m3380f(boolean z) {
        if (!m3374P()) {
            return z;
        }
        m3384k();
        return this.f4965c.m3451b().getBoolean(this.f4975m, z);
    }

    /* renamed from: h */
    public int m3381h(int i2) {
        if (!m3374P()) {
            return i2;
        }
        m3384k();
        return this.f4965c.m3451b().getInt(this.f4975m, i2);
    }

    /* renamed from: i */
    public String m3382i(String str) {
        if (!m3374P()) {
            return str;
        }
        m3384k();
        return this.f4965c.m3451b().getString(this.f4975m, str);
    }

    /* renamed from: j */
    public Set<String> m3383j(Set<String> set) {
        if (!m3374P()) {
            return set;
        }
        m3384k();
        return this.f4965c.m3451b().getStringSet(this.f4975m, set);
    }

    @Nullable
    /* renamed from: k */
    public PreferenceDataStore m3384k() {
        PreferenceManager preferenceManager = this.f4965c;
        if (preferenceManager != null) {
            Objects.requireNonNull(preferenceManager);
        }
        return null;
    }

    @Nullable
    /* renamed from: l */
    public CharSequence mo3366l() {
        SummaryProvider summaryProvider = this.f4962N;
        return summaryProvider != null ? summaryProvider.mo3351a(this) : this.f4972j;
    }

    /* renamed from: m */
    public boolean m3385m() {
        return !TextUtils.isEmpty(this.f4975m);
    }

    /* renamed from: n */
    public boolean mo3386n() {
        return this.f4979q && this.f4984v && this.f4985w;
    }

    /* renamed from: o */
    public void mo3344o() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.f4956H;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.mo3393i(this);
        }
    }

    /* renamed from: p */
    public void mo3387p(boolean z) {
        List<Preference> list = this.f4957I;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference = list.get(i2);
            if (preference.f4984v == z) {
                preference.f4984v = !z;
                preference.mo3387p(preference.mo3349O());
                preference.mo3344o();
            }
        }
    }

    /* renamed from: q */
    public void m3388q() {
        OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.f4956H;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.mo3391b(this);
        }
    }

    /* renamed from: r */
    public void mo3389r() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.f4982t)) {
            return;
        }
        String str = this.f4982t;
        PreferenceManager preferenceManager = this.f4965c;
        Preference preference = null;
        if (preferenceManager != null && (preferenceScreen = preferenceManager.f5085g) != null) {
            preference = preferenceScreen.m3425S(str);
        }
        if (preference == null) {
            StringBuilder m24u = C0000a.m24u("Dependency \"");
            m24u.append(this.f4982t);
            m24u.append("\" not found for preference \"");
            m24u.append(this.f4975m);
            m24u.append("\" (title: \"");
            m24u.append((Object) this.f4971i);
            m24u.append("\"");
            throw new IllegalStateException(m24u.toString());
        }
        if (preference.f4957I == null) {
            preference.f4957I = new ArrayList();
        }
        preference.f4957I.add(this);
        boolean mo3349O = preference.mo3349O();
        if (this.f4984v == mo3349O) {
            this.f4984v = !mo3349O;
            mo3387p(mo3349O());
            mo3344o();
        }
    }

    /* renamed from: s */
    public void m3390s(@NonNull PreferenceManager preferenceManager) {
        SharedPreferences sharedPreferences;
        long j2;
        this.f4965c = preferenceManager;
        if (!this.f4967e) {
            synchronized (preferenceManager) {
                j2 = preferenceManager.f5080b;
                preferenceManager.f5080b = 1 + j2;
            }
            this.f4966d = j2;
        }
        m3384k();
        if (m3374P()) {
            if (this.f4965c != null) {
                m3384k();
                sharedPreferences = this.f4965c.m3451b();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f4975m)) {
                mo3348I(null);
                return;
            }
        }
        Object obj = this.f4983u;
        if (obj != null) {
            mo3348I(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo3338t(@androidx.annotation.NonNull androidx.preference.PreferenceViewHolder r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo3338t(androidx.preference.PreferenceViewHolder):void");
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f4971i;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence mo3366l = mo3366l();
        if (!TextUtils.isEmpty(mo3366l)) {
            sb.append(mo3366l);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public Preference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.m1749a(context, C2507R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(@NonNull Context context) {
        this(context, null);
    }
}
