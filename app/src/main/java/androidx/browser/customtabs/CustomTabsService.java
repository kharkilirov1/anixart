package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsService;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: b */
    public final SimpleArrayMap<IBinder, IBinder.DeathRecipient> f1738b = new SimpleArrayMap<>();

    /* renamed from: c */
    public ICustomTabsService.Stub f1739c = new BinderC01591();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$1 */
    public class BinderC01591 extends ICustomTabsService.Stub {
        public BinderC01591() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: B1 */
        public boolean mo37B1(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            return m1035q(iCustomTabsCallback, m1034i(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: P */
        public boolean mo38P(@Nullable ICustomTabsCallback iCustomTabsCallback, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list) {
            return CustomTabsService.this.m1026b(new CustomTabsSessionToken(iCustomTabsCallback, m1034i(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: P1 */
        public boolean mo39P1(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable Bundle bundle) {
            return CustomTabsService.this.m1031g(new CustomTabsSessionToken(iCustomTabsCallback, m1034i(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: Q0 */
        public boolean mo40Q0(long j2) {
            return CustomTabsService.this.m1033i(j2);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: S */
        public boolean mo41S(@NonNull ICustomTabsCallback iCustomTabsCallback, int i2, @NonNull Uri uri, @Nullable Bundle bundle) {
            return CustomTabsService.this.m1032h(new CustomTabsSessionToken(iCustomTabsCallback, m1034i(bundle)), i2, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: U1 */
        public boolean mo42U1(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri) {
            return CustomTabsService.this.m1030f(new CustomTabsSessionToken(iCustomTabsCallback, null), uri);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: f0 */
        public boolean mo43f0(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, int i2, @Nullable Bundle bundle) {
            return CustomTabsService.this.m1029e(new CustomTabsSessionToken(iCustomTabsCallback, m1034i(bundle)), uri, i2, bundle);
        }

        @Nullable
        /* renamed from: i */
        public final PendingIntent m1034i(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* renamed from: q */
        public final boolean m1035q(@NonNull ICustomTabsCallback iCustomTabsCallback, @Nullable PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.BinderC01591 binderC01591 = CustomTabsService.BinderC01591.this;
                        CustomTabsSessionToken customTabsSessionToken2 = customTabsSessionToken;
                        CustomTabsService customTabsService = CustomTabsService.this;
                        Objects.requireNonNull(customTabsService);
                        try {
                            synchronized (customTabsService.f1738b) {
                                ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken2.f1741a;
                                IBinder asBinder = iCustomTabsCallback2 == null ? null : iCustomTabsCallback2.asBinder();
                                if (asBinder == null) {
                                    return;
                                }
                                asBinder.unlinkToDeath(customTabsService.f1738b.get(asBinder), 0);
                                customTabsService.f1738b.remove(asBinder);
                            }
                        } catch (NoSuchElementException unused) {
                        }
                    }
                };
                synchronized (CustomTabsService.this.f1738b) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f1738b.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.m1027c(customTabsSessionToken);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: s1 */
        public int mo44s1(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.m1028d(new CustomTabsSessionToken(iCustomTabsCallback, m1034i(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: w1 */
        public boolean mo45w1(@NonNull ICustomTabsCallback iCustomTabsCallback) {
            return m1035q(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: y1 */
        public boolean mo46y1(@NonNull ICustomTabsCallback iCustomTabsCallback, @NonNull Uri uri, @NonNull Bundle bundle) {
            return CustomTabsService.this.m1030f(new CustomTabsSessionToken(iCustomTabsCallback, m1034i(bundle)), uri);
        }

        @Override // android.support.customtabs.ICustomTabsService
        /* renamed from: z0 */
        public Bundle mo47z0(@NonNull String str, @Nullable Bundle bundle) {
            return CustomTabsService.this.m1025a(str, bundle);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    @Nullable
    /* renamed from: a */
    public abstract Bundle m1025a(@NonNull String str, @Nullable Bundle bundle);

    /* renamed from: b */
    public abstract boolean m1026b(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Uri uri, @Nullable Bundle bundle, @Nullable List<Bundle> list);

    /* renamed from: c */
    public abstract boolean m1027c(@NonNull CustomTabsSessionToken customTabsSessionToken);

    /* renamed from: d */
    public abstract int m1028d(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull String str, @Nullable Bundle bundle);

    /* renamed from: e */
    public abstract boolean m1029e(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri, int i2, @Nullable Bundle bundle);

    /* renamed from: f */
    public abstract boolean m1030f(@NonNull CustomTabsSessionToken customTabsSessionToken, @NonNull Uri uri);

    /* renamed from: g */
    public abstract boolean m1031g(@NonNull CustomTabsSessionToken customTabsSessionToken, @Nullable Bundle bundle);

    /* renamed from: h */
    public abstract boolean m1032h(@NonNull CustomTabsSessionToken customTabsSessionToken, int i2, @NonNull Uri uri, @Nullable Bundle bundle);

    /* renamed from: i */
    public abstract boolean m1033i(long j2);

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.f1739c;
    }
}
