package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ConfigurationCompat;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.swiftsoft.anixartd.C2507R;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zac {

    /* renamed from: a */
    @GuardedBy
    public static final SimpleArrayMap<String, String> f15756a = new SimpleArrayMap<>();

    /* renamed from: b */
    @Nullable
    @GuardedBy
    public static Locale f15757b;

    /* renamed from: a */
    public static String m8179a(Context context) {
        String packageName = context.getPackageName();
        try {
            PackageManagerWrapper m8251a = Wrappers.m8251a(context);
            return m8251a.f15914a.getPackageManager().getApplicationLabel(m8251a.f15914a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @NonNull
    /* renamed from: b */
    public static String m8180b(Context context, int i2) {
        Resources resources = context.getResources();
        String m8179a = m8179a(context);
        if (i2 == 1) {
            return resources.getString(C2507R.string.common_google_play_services_install_text, m8179a);
        }
        if (i2 == 2) {
            return DeviceProperties.m8240b(context) ? resources.getString(C2507R.string.common_google_play_services_wear_update_text) : resources.getString(C2507R.string.common_google_play_services_update_text, m8179a);
        }
        if (i2 == 3) {
            return resources.getString(C2507R.string.common_google_play_services_enable_text, m8179a);
        }
        if (i2 == 5) {
            return m8182d(context, "common_google_play_services_invalid_account_text", m8179a);
        }
        if (i2 == 7) {
            return m8182d(context, "common_google_play_services_network_error_text", m8179a);
        }
        if (i2 == 9) {
            return resources.getString(C2507R.string.common_google_play_services_unsupported_text, m8179a);
        }
        if (i2 == 20) {
            return m8182d(context, "common_google_play_services_restricted_profile_text", m8179a);
        }
        switch (i2) {
            case 16:
                return m8182d(context, "common_google_play_services_api_unavailable_text", m8179a);
            case 17:
                return m8182d(context, "common_google_play_services_sign_in_failed_text", m8179a);
            case 18:
                return resources.getString(C2507R.string.common_google_play_services_updating_text, m8179a);
            default:
                return resources.getString(C2507R.string.common_google_play_services_unknown_issue, m8179a);
        }
    }

    @Nullable
    /* renamed from: c */
    public static String m8181c(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(C2507R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C2507R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C2507R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m8183e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m8183e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i2);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m8183e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m8183e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: d */
    public static String m8182d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m8183e = m8183e(context, str);
        if (m8183e == null) {
            m8183e = resources.getString(C2507R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m8183e, str2);
    }

    @Nullable
    /* renamed from: e */
    public static String m8183e(Context context, String str) {
        Resources resources;
        SimpleArrayMap<String, String> simpleArrayMap = f15756a;
        synchronized (simpleArrayMap) {
            Locale m1956b = ConfigurationCompat.m1950a(context.getResources().getConfiguration()).m1956b(0);
            if (!m1956b.equals(f15757b)) {
                simpleArrayMap.clear();
                f15757b = m1956b;
            }
            String orDefault = simpleArrayMap.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i2 = GooglePlayServicesUtil.f15331e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            f15756a.put(str, string);
            return string;
        }
    }
}
