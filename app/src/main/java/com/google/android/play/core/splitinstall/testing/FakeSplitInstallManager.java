package com.google.android.play.core.splitinstall.testing;

import android.content.Intent;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.zzaf;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class FakeSplitInstallManager implements SplitInstallManager {

    /* renamed from: j */
    public static final long f20220j = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: k */
    public static final /* synthetic */ int f20221k = 0;

    /* renamed from: a */
    public final Handler f20222a;

    /* renamed from: b */
    public final zzaf<SplitInstallSessionState> f20223b;

    /* renamed from: c */
    public final zzaf<SplitInstallSessionState> f20224c;

    /* renamed from: d */
    public final Executor f20225d;

    /* renamed from: e */
    public final com.google.android.play.core.splitinstall.zzg f20226e;

    /* renamed from: f */
    public final AtomicReference<SplitInstallSessionState> f20227f;

    /* renamed from: g */
    public final Set<String> f20228g;

    /* renamed from: h */
    public final Set<String> f20229h;

    /* renamed from: i */
    public final AtomicBoolean f20230i;

    @Nullable
    /* renamed from: a */
    public final SplitInstallSessionState m10972a() {
        return this.f20227f.get();
    }

    /* renamed from: b */
    public final void m10973b(List<Intent> list, List<String> list2, List<String> list3, long j2, boolean z) {
        this.f20226e.mo10992u().mo10845a(list, new zzo(this, list2, list3, j2, z, list));
    }

    /* renamed from: c */
    public final void m10974c(List<String> list, List<String> list2, long j2) {
        this.f20228g.addAll(list);
        this.f20229h.addAll(list2);
        Long valueOf = Long.valueOf(j2);
        m10975d(5, 0, valueOf, valueOf, null, null, null);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [com.google.android.play.core.splitinstall.testing.zzi] */
    /* renamed from: d */
    public final boolean m10975d(final int i2, final int i3, @Nullable final Long l2, @Nullable final Long l3, @Nullable List<String> list, @Nullable Integer num, @Nullable List<String> list2) {
        final SplitInstallSessionState m10982a;
        final Integer num2 = null;
        final List list3 = null;
        final List list4 = null;
        ?? r13 = new zzp() { // from class: com.google.android.play.core.splitinstall.testing.zzi
            /* renamed from: a */
            public final SplitInstallSessionState m10982a(SplitInstallSessionState splitInstallSessionState) {
                Integer num3 = num2;
                int i4 = i2;
                int i5 = i3;
                Long l4 = l2;
                Long l5 = l3;
                List<String> list5 = list3;
                List<String> list6 = list4;
                int i6 = FakeSplitInstallManager.f20221k;
                SplitInstallSessionState m10958b = splitInstallSessionState == null ? SplitInstallSessionState.m10958b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : splitInstallSessionState;
                return SplitInstallSessionState.m10958b(num3 == null ? m10958b.mo10965g() : num3.intValue(), i4, i5, l4 == null ? m10958b.mo10960a() : l4.longValue(), l5 == null ? m10958b.mo10967i() : l5.longValue(), list5 == null ? m10958b.m10963e() : list5, list6 == null ? m10958b.m10962d() : list6);
            }
        };
        synchronized (this) {
            SplitInstallSessionState m10972a = m10972a();
            m10982a = r13.m10982a(m10972a);
            if (!this.f20227f.compareAndSet(m10972a, m10982a)) {
                m10982a = null;
            }
        }
        if (m10982a == null) {
            return false;
        }
        this.f20222a.post(new Runnable() { // from class: com.google.android.play.core.splitinstall.testing.zzm
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplitInstallManager fakeSplitInstallManager = FakeSplitInstallManager.this;
                SplitInstallSessionState splitInstallSessionState = m10982a;
                fakeSplitInstallManager.f20223b.m10832a(splitInstallSessionState);
                fakeSplitInstallManager.f20224c.m10832a(splitInstallSessionState);
            }
        });
        return true;
    }
}
