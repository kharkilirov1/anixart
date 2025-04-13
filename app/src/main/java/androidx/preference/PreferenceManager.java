package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;

/* loaded from: classes.dex */
public class PreferenceManager {

    /* renamed from: a */
    public final Context f5079a;

    /* renamed from: b */
    public long f5080b = 0;

    /* renamed from: c */
    @Nullable
    public SharedPreferences f5081c = null;

    /* renamed from: d */
    @Nullable
    public SharedPreferences.Editor f5082d;

    /* renamed from: e */
    public boolean f5083e;

    /* renamed from: f */
    public String f5084f;

    /* renamed from: g */
    public PreferenceScreen f5085g;

    /* renamed from: h */
    public OnPreferenceTreeClickListener f5086h;

    /* renamed from: i */
    public OnDisplayPreferenceDialogListener f5087i;

    /* renamed from: j */
    public OnNavigateToScreenListener f5088j;

    public interface OnDisplayPreferenceDialogListener {
        /* renamed from: k2 */
        void mo3403k2(@NonNull Preference preference);
    }

    public interface OnNavigateToScreenListener {
        /* renamed from: E2 */
        void mo3400E2(@NonNull PreferenceScreen preferenceScreen);
    }

    public interface OnPreferenceTreeClickListener {
        /* renamed from: a3 */
        boolean mo3402a3(@NonNull Preference preference);
    }

    public static abstract class PreferenceComparisonCallback {
        /* renamed from: a */
        public abstract boolean mo3452a(@NonNull Preference preference, @NonNull Preference preference2);

        /* renamed from: b */
        public abstract boolean mo3453b(@NonNull Preference preference, @NonNull Preference preference2);
    }

    public static class SimplePreferenceComparisonCallback extends PreferenceComparisonCallback {
        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        /* renamed from: a */
        public boolean mo3452a(@NonNull Preference preference, @NonNull Preference preference2) {
            int i2;
            int i3;
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.f4959K) || !TextUtils.equals(preference.f4971i, preference2.f4971i) || !TextUtils.equals(preference.mo3366l(), preference2.mo3366l())) {
                return false;
            }
            if (preference.f4974l == null && (i3 = preference.f4973k) != 0) {
                preference.f4974l = AppCompatResources.m497b(preference.f4964b, i3);
            }
            Drawable drawable = preference.f4974l;
            if (preference2.f4974l == null && (i2 = preference2.f4973k) != 0) {
                preference2.f4974l = AppCompatResources.m497b(preference2.f4964b, i2);
            }
            Drawable drawable2 = preference2.f4974l;
            if ((drawable != drawable2 && (drawable == null || !drawable.equals(drawable2))) || preference.mo3386n() != preference2.mo3386n() || preference.f4980r != preference2.f4980r) {
                return false;
            }
            if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).f5138P == ((TwoStatePreference) preference2).f5138P) {
                return !(preference instanceof DropDownPreference) || preference == preference2;
            }
            return false;
        }

        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        /* renamed from: b */
        public boolean mo3453b(@NonNull Preference preference, @NonNull Preference preference2) {
            return preference.mo3361e() == preference2.mo3361e();
        }
    }

    @RestrictTo
    public PreferenceManager(@NonNull Context context) {
        this.f5079a = context;
        this.f5084f = context.getPackageName() + "_preferences";
    }

    @Nullable
    /* renamed from: a */
    public SharedPreferences.Editor m3450a() {
        if (!this.f5083e) {
            return m3451b().edit();
        }
        if (this.f5082d == null) {
            this.f5082d = m3451b().edit();
        }
        return this.f5082d;
    }

    @Nullable
    /* renamed from: b */
    public SharedPreferences m3451b() {
        if (this.f5081c == null) {
            this.f5081c = this.f5079a.getSharedPreferences(this.f5084f, 0);
        }
        return this.f5081c;
    }
}
