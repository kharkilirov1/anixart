package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.trusted.PackageIdentityUtils;
import androidx.core.app.NotificationManagerCompat;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: b */
    public NotificationManager f1750b;

    /* renamed from: c */
    public int f1751c = -1;

    /* renamed from: d */
    public final ITrustedWebActivityService.Stub f1752d = new ITrustedWebActivityService.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityService.1
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: G1 */
        public void mo53G1(Bundle bundle) {
            m1047i();
            TrustedWebActivityServiceConnection.m1048a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.m1048a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
            int i2 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            trustedWebActivityService.m1044b();
            trustedWebActivityService.f1750b.cancel(string, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
        
            if (androidx.browser.trusted.NotificationApiHelperForO.m1037a(r3.f1750b, r4) == false) goto L13;
         */
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: J1 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.os.Bundle mo54J1(android.os.Bundle r9) {
            /*
                r8 = this;
                r8.m1047i()
                java.lang.String r0 = "android.support.customtabs.trusted.PLATFORM_TAG"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.m1048a(r9, r0)
                java.lang.String r1 = "android.support.customtabs.trusted.PLATFORM_ID"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.m1048a(r9, r1)
                java.lang.String r2 = "android.support.customtabs.trusted.NOTIFICATION"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.m1048a(r9, r2)
                java.lang.String r3 = "android.support.customtabs.trusted.CHANNEL_NAME"
                androidx.browser.trusted.TrustedWebActivityServiceConnection.m1048a(r9, r3)
                java.lang.String r0 = r9.getString(r0)
                int r1 = r9.getInt(r1)
                android.os.Parcelable r2 = r9.getParcelable(r2)
                android.app.Notification r2 = (android.app.Notification) r2
                java.lang.String r9 = r9.getString(r3)
                androidx.browser.trusted.TrustedWebActivityService r3 = androidx.browser.trusted.TrustedWebActivityService.this
                r3.m1044b()
                androidx.core.app.NotificationManagerCompat r4 = new androidx.core.app.NotificationManagerCompat
                r4.<init>(r3)
                boolean r4 = r4.m1627a()
                if (r4 != 0) goto L3a
                goto L6f
            L3a:
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 26
                if (r4 < r5) goto L71
                java.lang.String r4 = androidx.browser.trusted.TrustedWebActivityService.m1043a(r9)
                android.app.NotificationManager r5 = r3.f1750b
                android.app.NotificationChannel r6 = new android.app.NotificationChannel
                r7 = 3
                r6.<init>(r4, r9, r7)
                r5.createNotificationChannel(r6)
                android.app.NotificationChannel r9 = r5.getNotificationChannel(r4)
                int r9 = r9.getImportance()
                if (r9 != 0) goto L5b
                r9 = 0
                goto L66
            L5b:
                android.app.Notification$Builder r9 = android.app.Notification.Builder.recoverBuilder(r3, r2)
                r9.setChannelId(r4)
                android.app.Notification r9 = r9.build()
            L66:
                r2 = r9
                android.app.NotificationManager r9 = r3.f1750b
                boolean r9 = androidx.browser.trusted.NotificationApiHelperForO.m1037a(r9, r4)
                if (r9 != 0) goto L71
            L6f:
                r9 = 0
                goto L77
            L71:
                android.app.NotificationManager r9 = r3.f1750b
                r9.notify(r0, r1, r2)
                r9 = 1
            L77:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
                r0.putBoolean(r1, r9)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.trusted.TrustedWebActivityService.BinderC01641.mo54J1(android.os.Bundle):android.os.Bundle");
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: K0 */
        public Bundle mo55K0(String str, Bundle bundle, IBinder iBinder) {
            m1047i();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (iBinder != null) {
                ITrustedWebActivityCallback.Stub.m52i(iBinder);
            }
            Objects.requireNonNull(trustedWebActivityService);
            return null;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: W */
        public Bundle mo56W() {
            m1047i();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            trustedWebActivityService.m1044b();
            if (Build.VERSION.SDK_INT < 23) {
                throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
            }
            StatusBarNotification[] activeNotifications = trustedWebActivityService.f1750b.getActiveNotifications();
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: h1 */
        public int mo57h1() {
            m1047i();
            return TrustedWebActivityService.this.m1046d();
        }

        /* renamed from: i */
        public final void m1047i() {
            boolean z;
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f1751c == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                Token m1042a = TrustedWebActivityService.this.m1045c().m1042a();
                PackageManager packageManager = TrustedWebActivityService.this.getPackageManager();
                if (m1042a != null) {
                    int length = packagesForUid.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        try {
                            z = (Build.VERSION.SDK_INT >= 28 ? new PackageIdentityUtils.Api28Implementation() : new PackageIdentityUtils.Pre28Implementation()).mo1039a(packagesForUid[i2], packageManager, null);
                        } catch (PackageManager.NameNotFoundException | IOException e2) {
                            Log.e("PackageIdentity", "Could not check if package matches token.", e2);
                            z = false;
                        }
                        if (z) {
                            TrustedWebActivityService.this.f1751c = Binder.getCallingUid();
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (TrustedWebActivityService.this.f1751c != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: l1 */
        public Bundle mo58l1() {
            m1047i();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int m1046d = trustedWebActivityService.m1046d();
            Bundle bundle = new Bundle();
            if (m1046d != -1) {
                bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService.getResources(), m1046d));
            }
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        /* renamed from: r1 */
        public Bundle mo59r1(Bundle bundle) {
            m1047i();
            TrustedWebActivityServiceConnection.m1048a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            String string = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            trustedWebActivityService.m1044b();
            boolean m1037a = !new NotificationManagerCompat(trustedWebActivityService).m1627a() ? false : Build.VERSION.SDK_INT < 26 ? true : NotificationApiHelperForO.m1037a(trustedWebActivityService.f1750b, TrustedWebActivityService.m1043a(string));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", m1037a);
            return bundle2;
        }
    };

    /* renamed from: a */
    public static String m1043a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void m1044b() {
        if (this.f1750b == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @NonNull
    @BinderThread
    /* renamed from: c */
    public abstract TokenStore m1045c();

    @BinderThread
    /* renamed from: d */
    public int m1046d() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public final IBinder onBind(@Nullable Intent intent) {
        return this.f1752d;
    }

    @Override // android.app.Service
    @CallSuper
    @MainThread
    public void onCreate() {
        super.onCreate();
        this.f1750b = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    @MainThread
    public final boolean onUnbind(@Nullable Intent intent) {
        this.f1751c = -1;
        return super.onUnbind(intent);
    }
}
