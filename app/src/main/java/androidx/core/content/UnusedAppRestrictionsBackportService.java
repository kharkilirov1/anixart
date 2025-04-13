package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: b */
    public IUnusedAppRestrictionsBackportService.Stub f3300b = new IUnusedAppRestrictionsBackportService.Stub() { // from class: androidx.core.content.UnusedAppRestrictionsBackportService.1
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        /* renamed from: t0 */
        public void mo1664t0(@Nullable IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws RemoteException {
            if (iUnusedAppRestrictionsBackportCallback == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.m1703a(new UnusedAppRestrictionsBackportCallback(iUnusedAppRestrictionsBackportCallback));
        }
    };

    /* renamed from: a */
    public abstract void m1703a(@NonNull UnusedAppRestrictionsBackportCallback unusedAppRestrictionsBackportCallback);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.f3300b;
    }
}
