package androidx.core.content.p002pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ShortcutManagerCompat {

    /* renamed from: androidx.core.content.pm.ShortcutManagerCompat$1 */
    public class C02321 extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ IntentSender f3311a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.f3311a.sendIntent(context, 0, null, null, null);
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    @RequiresApi
    public static class Api25Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShortcutMatchFlags {
    }

    /* renamed from: a */
    public static boolean m1712a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (ContextCompat.m1668a(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1713b(@NonNull Context context, @NonNull ShortcutInfoCompat shortcutInfoCompat, @Nullable IntentSender intentSender) {
        Bitmap bitmap;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ShortcutInfo.Builder intents = new ShortcutInfo.Builder(shortcutInfoCompat.f3304a, shortcutInfoCompat.f3305b).setShortLabel(shortcutInfoCompat.f3307d).setIntents(shortcutInfoCompat.f3306c);
            IconCompat iconCompat = shortcutInfoCompat.f3308e;
            if (iconCompat != null) {
                intents.setIcon(iconCompat.m1874n(shortcutInfoCompat.f3304a));
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setLongLabel(null);
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setDisabledMessage(null);
            }
            intents.setRank(0);
            PersistableBundle persistableBundle = shortcutInfoCompat.f3309f;
            if (persistableBundle != null) {
                intents.setExtras(persistableBundle);
            }
            if (i2 >= 29) {
                intents.setLongLived(false);
            } else {
                if (shortcutInfoCompat.f3309f == null) {
                    shortcutInfoCompat.f3309f = new PersistableBundle();
                }
                shortcutInfoCompat.f3309f.putBoolean("extraLongLived", false);
                intents.setExtras(shortcutInfoCompat.f3309f);
            }
            return shortcutManager.requestPinShortcut(intents.build(), null);
        }
        if (!m1712a(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        Intent[] intentArr = shortcutInfoCompat.f3306c;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", shortcutInfoCompat.f3307d.toString());
        IconCompat iconCompat2 = shortcutInfoCompat.f3308e;
        if (iconCompat2 != null) {
            Context context2 = shortcutInfoCompat.f3304a;
            iconCompat2.m1867c(context2);
            int i3 = iconCompat2.f3401a;
            if (i3 == 1) {
                bitmap = (Bitmap) iconCompat2.f3402b;
            } else if (i3 == 2) {
                try {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat2.m1869h(), 0), iconCompat2.f3405e));
                } catch (PackageManager.NameNotFoundException e2) {
                    StringBuilder m24u = C0000a.m24u("Can't find package ");
                    m24u.append(iconCompat2.f3402b);
                    throw new IllegalArgumentException(m24u.toString(), e2);
                }
            } else {
                if (i3 != 5) {
                    throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
                }
                bitmap = IconCompat.m1864e((Bitmap) iconCompat2.f3402b, true);
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        context.sendBroadcast(intent);
        return true;
    }
}
