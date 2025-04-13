package com.google.android.play.core.splitinstall.testing;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzl implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FakeSplitInstallManager f20247b;

    /* renamed from: c */
    public final /* synthetic */ long f20248c;

    /* renamed from: d */
    public final /* synthetic */ List f20249d;

    /* renamed from: e */
    public final /* synthetic */ List f20250e;

    /* renamed from: f */
    public final /* synthetic */ List f20251f;

    @Override // java.lang.Runnable
    public final void run() {
        final FakeSplitInstallManager fakeSplitInstallManager = this.f20247b;
        final long j2 = this.f20248c;
        final List list = this.f20249d;
        final List list2 = this.f20250e;
        final List list3 = this.f20251f;
        Objects.requireNonNull(fakeSplitInstallManager);
        long j3 = j2 / 3;
        long j4 = 0;
        int i2 = 0;
        while (i2 < 3) {
            long min = Math.min(j2, j4 + j3);
            int i3 = i2;
            fakeSplitInstallManager.m10975d(2, 0, Long.valueOf(min), Long.valueOf(j2), null, null, null);
            SystemClock.sleep(FakeSplitInstallManager.f20220j);
            SplitInstallSessionState m10972a = fakeSplitInstallManager.m10972a();
            if (m10972a.mo10966h() == 9 || m10972a.mo10966h() == 7 || m10972a.mo10966h() == 6) {
                return;
            }
            i2 = i3 + 1;
            j4 = min;
        }
        fakeSplitInstallManager.f20225d.execute(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zze
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager fakeSplitInstallManager2 = FakeSplitInstallManager.this;
                List<Intent> list4 = list;
                List<String> list5 = list2;
                List<String> list6 = list3;
                long j5 = j2;
                if (fakeSplitInstallManager2.f20230i.get()) {
                    fakeSplitInstallManager2.m10975d(6, -6, null, null, null, null, null);
                } else if (fakeSplitInstallManager2.f20226e.mo10992u() != null) {
                    fakeSplitInstallManager2.m10973b(list4, list5, list6, j5, false);
                } else {
                    fakeSplitInstallManager2.m10974c(list5, list6, j5);
                }
            }
        });
    }
}
