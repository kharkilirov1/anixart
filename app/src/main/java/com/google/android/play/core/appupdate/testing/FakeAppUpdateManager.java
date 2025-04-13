package com.google.android.play.core.appupdate.testing;

import androidx.annotation.Nullable;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class FakeAppUpdateManager implements AppUpdateManager {

    /* renamed from: a */
    @InstallStatus
    public int f19599a;

    /* renamed from: b */
    @Nullable
    @AppUpdateType
    public Integer f19600b;

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: a */
    public Task<Void> mo10646a() {
        int i2 = this.f19599a;
        if (i2 != 11) {
            return i2 == 3 ? Tasks.m11006b(new InstallException(-8)) : Tasks.m11006b(new InstallException(-7));
        }
        this.f19599a = 3;
        Integer num = 0;
        if (num.equals(this.f19600b)) {
            throw null;
        }
        return Tasks.m11007c(null);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: b */
    public Task<AppUpdateInfo> mo10647b() {
        throw null;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: c */
    public void mo10648c(InstallStateUpdatedListener installStateUpdatedListener) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if ((r2.m10644a(com.google.android.play.core.appupdate.AppUpdateOptions.m10652c(r3.mo10655b())) != null) != false) goto L16;
     */
    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo10649d(com.google.android.play.core.appupdate.AppUpdateInfo r2, @com.google.android.play.core.install.model.AppUpdateType int r3, android.app.Activity r4, int r5) {
        /*
            r1 = this;
            com.google.android.play.core.appupdate.AppUpdateOptions$Builder r3 = com.google.android.play.core.appupdate.AppUpdateOptions.m10653d(r3)
            com.google.android.play.core.appupdate.AppUpdateOptions r3 = r3.mo10656a()
            android.app.PendingIntent r4 = r2.m10644a(r3)
            r5 = 1
            r0 = 0
            if (r4 == 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            if (r4 != 0) goto L39
            int r4 = r3.mo10655b()
            com.google.android.play.core.appupdate.AppUpdateOptions r4 = com.google.android.play.core.appupdate.AppUpdateOptions.m10652c(r4)
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L37
            int r4 = r3.mo10655b()
            com.google.android.play.core.appupdate.AppUpdateOptions r4 = com.google.android.play.core.appupdate.AppUpdateOptions.m10652c(r4)
            android.app.PendingIntent r2 = r2.m10644a(r4)
            if (r2 == 0) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 == 0) goto L37
            goto L39
        L37:
            r5 = 0
            goto L4c
        L39:
            int r2 = r3.mo10655b()
            if (r2 != r5) goto L46
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.f19600b = r2
            goto L4c
        L46:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.f19600b = r2
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.mo10649d(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean");
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateManager
    /* renamed from: e */
    public void mo10650e(InstallStateUpdatedListener installStateUpdatedListener) {
        throw null;
    }
}
