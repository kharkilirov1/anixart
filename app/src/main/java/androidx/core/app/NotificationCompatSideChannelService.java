package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends Service {

    public class NotificationSideChannelStub extends INotificationSideChannel.Stub {

        /* renamed from: b */
        public final /* synthetic */ NotificationCompatSideChannelService f3229b;

        @Override // android.support.v4.app.INotificationSideChannel
        /* renamed from: p1 */
        public void mo60p1(String str, int i2, String str2) throws RemoteException {
            this.f3229b.m1625c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f3229b.m1623a(str, i2, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* renamed from: q0 */
        public void mo61q0(String str) {
            this.f3229b.m1625c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f3229b.m1624b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* renamed from: v2 */
        public void mo62v2(String str, int i2, String str2, Notification notification) throws RemoteException {
            this.f3229b.m1625c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                this.f3229b.m1626d(str, i2, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* renamed from: a */
    public abstract void m1623a(String str, int i2, String str2);

    /* renamed from: b */
    public abstract void m1624b(String str);

    /* renamed from: c */
    public void m1625c(int i2, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i2)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i2 + " is not authorized for package " + str);
    }

    /* renamed from: d */
    public abstract void m1626d(String str, int i2, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
