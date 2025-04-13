package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class MultiInstanceInvalidationClient {

    /* renamed from: a */
    public final Context f5804a;

    /* renamed from: b */
    public final String f5805b;

    /* renamed from: c */
    public int f5806c;

    /* renamed from: d */
    public final InvalidationTracker f5807d;

    /* renamed from: e */
    public final InvalidationTracker.Observer f5808e;

    /* renamed from: f */
    @Nullable
    public IMultiInstanceInvalidationService f5809f;

    /* renamed from: g */
    public final Executor f5810g;

    /* renamed from: h */
    public final IMultiInstanceInvalidationCallback f5811h = new BinderC05471();

    /* renamed from: i */
    public final AtomicBoolean f5812i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ServiceConnection f5813j;

    /* renamed from: k */
    public final Runnable f5814k;

    /* renamed from: l */
    public final Runnable f5815l;

    /* renamed from: androidx.room.MultiInstanceInvalidationClient$1 */
    public class BinderC05471 extends IMultiInstanceInvalidationCallback.Stub {
        public BinderC05471() {
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        /* renamed from: b0 */
        public void mo4054b0(final String[] strArr) {
            MultiInstanceInvalidationClient.this.f5810g.execute(new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.1.1
                @Override // java.lang.Runnable
                public void run() {
                    InvalidationTracker invalidationTracker = MultiInstanceInvalidationClient.this.f5807d;
                    String[] strArr2 = strArr;
                    synchronized (invalidationTracker.f5788j) {
                        Iterator<Map.Entry<InvalidationTracker.Observer, InvalidationTracker.ObserverWrapper>> it = invalidationTracker.f5788j.iterator();
                        while (it.hasNext()) {
                            Map.Entry<InvalidationTracker.Observer, InvalidationTracker.ObserverWrapper> next = it.next();
                            InvalidationTracker.Observer key = next.getKey();
                            Objects.requireNonNull(key);
                            if (!(key instanceof C05515)) {
                                next.getValue().m4070a(strArr2);
                            }
                        }
                    }
                }
            });
        }
    }

    public MultiInstanceInvalidationClient(Context context, String str, Intent intent, InvalidationTracker invalidationTracker, Executor executor) {
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient.2
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IMultiInstanceInvalidationService proxy;
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                int i2 = IMultiInstanceInvalidationService.Stub.f5774a;
                if (iBinder == null) {
                    proxy = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    proxy = (queryLocalInterface == null || !(queryLocalInterface instanceof IMultiInstanceInvalidationService)) ? new IMultiInstanceInvalidationService.Stub.Proxy(iBinder) : (IMultiInstanceInvalidationService) queryLocalInterface;
                }
                multiInstanceInvalidationClient.f5809f = proxy;
                MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
                multiInstanceInvalidationClient2.f5810g.execute(multiInstanceInvalidationClient2.f5814k);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                multiInstanceInvalidationClient.f5810g.execute(multiInstanceInvalidationClient.f5815l);
                MultiInstanceInvalidationClient.this.f5809f = null;
            }
        };
        this.f5813j = serviceConnection;
        this.f5814k = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f5809f;
                    if (iMultiInstanceInvalidationService != null) {
                        multiInstanceInvalidationClient.f5806c = iMultiInstanceInvalidationService.mo4057s0(multiInstanceInvalidationClient.f5811h, multiInstanceInvalidationClient.f5805b);
                        MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
                        multiInstanceInvalidationClient2.f5807d.m4059a(multiInstanceInvalidationClient2.f5808e);
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
                }
            }
        };
        this.f5815l = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient.4
            @Override // java.lang.Runnable
            public void run() {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                multiInstanceInvalidationClient.f5807d.m4061c(multiInstanceInvalidationClient.f5808e);
            }
        };
        Context applicationContext = context.getApplicationContext();
        this.f5804a = applicationContext;
        this.f5805b = str;
        this.f5807d = invalidationTracker;
        this.f5810g = executor;
        this.f5808e = new InvalidationTracker.Observer((String[]) invalidationTracker.f5779a.keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.5
            @Override // androidx.room.InvalidationTracker.Observer
            /* renamed from: a */
            public void mo4069a(@NonNull Set<String> set) {
                if (MultiInstanceInvalidationClient.this.f5812i.get()) {
                    return;
                }
                try {
                    MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f5809f;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.mo4056q2(multiInstanceInvalidationClient.f5806c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e2);
                }
            }
        };
        applicationContext.bindService(intent, serviceConnection, 1);
    }
}
