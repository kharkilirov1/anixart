package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: d */
    public static final Object f15325d = new Object();

    /* renamed from: e */
    public static final GoogleApiAvailability f15326e = new GoogleApiAvailability();

    /* renamed from: c */
    public static final int f15324c = GoogleApiAvailabilityLight.f15327a;

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public Intent mo7916a(@Nullable Context context, int i2, @Nullable String str) {
        return super.mo7916a(context, i2, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    /* renamed from: c */
    public int mo7917c(@NonNull Context context, int i2) {
        return super.mo7917c(context, i2);
    }

    @HideFirstParty
    /* renamed from: d */
    public int m7918d(@NonNull Context context) {
        return mo7917c(context, GoogleApiAvailabilityLight.f15327a);
    }

    /* renamed from: e */
    public boolean m7919e(@NonNull Activity activity, int i2, int i3, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog m7920f = m7920f(activity, i2, zag.m8185b(activity, super.mo7916a(activity, i2, "d"), i3), onCancelListener);
        if (m7920f == null) {
            return false;
        }
        m7922h(activity, m7920f, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Nullable
    /* renamed from: f */
    public final Dialog m7920f(@NonNull Context context, int i2, zag zagVar, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.m8180b(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i2 != 1 ? i2 != 2 ? i2 != 3 ? resources.getString(android.R.string.ok) : resources.getString(C2507R.string.common_google_play_services_enable_button) : resources.getString(C2507R.string.common_google_play_services_update_button) : resources.getString(C2507R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, zagVar);
        }
        String m8181c = com.google.android.gms.common.internal.zac.m8181c(context, i2);
        if (m8181c != null) {
            builder.setTitle(m8181c);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i2)), new IllegalArgumentException());
        return builder.create();
    }

    @Nullable
    /* renamed from: g */
    public final zabx m7921g(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(zabwVar);
        context.registerReceiver(zabxVar, intentFilter);
        zabxVar.f15548a = context;
        if (GooglePlayServicesUtilLight.m7927b(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.mo8037a();
        zabxVar.m8068a();
        return null;
    }

    /* renamed from: h */
    public final void m7922h(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
                Preconditions.m8132g(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                supportErrorDialogFragment.f15342b = dialog;
                if (onCancelListener != null) {
                    supportErrorDialogFragment.f15343c = onCancelListener;
                }
                supportErrorDialogFragment.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Preconditions.m8132g(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        errorDialogFragment.f15318b = dialog;
        if (onCancelListener != null) {
            errorDialogFragment.f15319c = onCancelListener;
        }
        errorDialogFragment.show(fragmentManager, str);
    }

    @TargetApi
    /* renamed from: i */
    public final void m7923i(Context context, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        NotificationCompat.Builder builder;
        NotificationManager notificationManager;
        int i3;
        NotificationManager notificationManager2;
        int i4;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i2), null), new IllegalArgumentException());
        if (i2 == 18) {
            new zac(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i2 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String m8183e = i2 == 6 ? com.google.android.gms.common.internal.zac.m8183e(context, "common_google_play_services_resolution_required_title") : com.google.android.gms.common.internal.zac.m8181c(context, i2);
        if (m8183e == null) {
            m8183e = context.getResources().getString(C2507R.string.common_google_play_services_notification_ticker);
        }
        String m8182d = (i2 == 6 || i2 == 19) ? com.google.android.gms.common.internal.zac.m8182d(context, "common_google_play_services_resolution_required_text", com.google.android.gms.common.internal.zac.m8179a(context)) : com.google.android.gms.common.internal.zac.m8180b(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        Objects.requireNonNull(systemService, "null reference");
        NotificationManager notificationManager3 = (NotificationManager) systemService;
        NotificationCompat.Builder builder2 = new NotificationCompat.Builder(context, null);
        builder2.f3195r = true;
        builder2.m1611e(16, true);
        builder2.m1610d(m8183e);
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.m1606h(m8182d);
        if (builder2.f3190m != bigTextStyle) {
            builder2.f3190m = bigTextStyle;
            bigTextStyle.m1619g(builder2);
        }
        if (DeviceProperties.m8239a(context)) {
            builder2.f3203z.icon = context.getApplicationInfo().icon;
            builder2.f3188k = 2;
            if (DeviceProperties.m8240b(context)) {
                notificationManager = notificationManager3;
                i3 = 1;
                builder2.f3179b.add(new NotificationCompat.Action(IconCompat.m1865f(null, "", C2507R.drawable.common_full_open_on_phone), resources.getString(C2507R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, 0, true, false, false));
                builder = builder2;
            } else {
                builder = builder2;
                notificationManager = notificationManager3;
                i3 = 1;
                builder.f3184g = pendingIntent;
            }
        } else {
            builder = builder2;
            notificationManager = notificationManager3;
            i3 = 1;
            builder.f3203z.icon = android.R.drawable.stat_sys_warning;
            builder.m1615i(resources.getString(C2507R.string.common_google_play_services_notification_ticker));
            builder.f3203z.when = System.currentTimeMillis();
            builder.f3184g = pendingIntent;
            builder.m1609c(m8182d);
        }
        if (PlatformVersion.m8244a()) {
            Preconditions.m8133h(PlatformVersion.m8244a());
            synchronized (f15325d) {
            }
            notificationManager2 = notificationManager;
            NotificationChannel notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
            SimpleArrayMap<String, String> simpleArrayMap = com.google.android.gms.common.internal.zac.f15756a;
            String string = context.getResources().getString(C2507R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager2.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager2.createNotificationChannel(notificationChannel);
            }
            builder.f3200w = "com.google.android.gms.availability";
        } else {
            notificationManager2 = notificationManager;
        }
        Notification m1608a = builder.m1608a();
        if (i2 == i3 || i2 == 2 || i2 == 3) {
            GooglePlayServicesUtilLight.f15332a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager2.notify(i4, m1608a);
    }

    /* renamed from: j */
    public final boolean m7924j(@NonNull Activity activity, @NonNull LifecycleFragment lifecycleFragment, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog m7920f = m7920f(activity, i2, zag.m8186c(lifecycleFragment, super.mo7916a(activity, i2, "d"), 2), onCancelListener);
        if (m7920f == null) {
            return false;
        }
        m7922h(activity, m7920f, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
