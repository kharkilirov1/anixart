package com.google.android.play.core.splitinstall.testing;

import android.content.Intent;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzo implements com.google.android.play.core.splitinstall.zzf {

    /* renamed from: a */
    public final /* synthetic */ List f20254a;

    /* renamed from: b */
    public final /* synthetic */ List f20255b;

    /* renamed from: c */
    public final /* synthetic */ long f20256c;

    /* renamed from: d */
    public final /* synthetic */ boolean f20257d;

    /* renamed from: e */
    public final /* synthetic */ List f20258e;

    /* renamed from: f */
    public final /* synthetic */ FakeSplitInstallManager f20259f;

    public zzo(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j2, boolean z, List list3) {
        this.f20259f = fakeSplitInstallManager;
        this.f20254a = list;
        this.f20255b = list2;
        this.f20256c = j2;
        this.f20257d = z;
        this.f20258e = list3;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    /* renamed from: a */
    public final void mo10983a(int i2) {
        FakeSplitInstallManager fakeSplitInstallManager = this.f20259f;
        int i3 = FakeSplitInstallManager.f20221k;
        fakeSplitInstallManager.m10975d(6, i2, null, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    /* renamed from: u */
    public final void mo10984u() {
        FakeSplitInstallManager fakeSplitInstallManager = this.f20259f;
        List<String> list = this.f20254a;
        List<String> list2 = this.f20255b;
        long j2 = this.f20256c;
        int i2 = FakeSplitInstallManager.f20221k;
        fakeSplitInstallManager.m10974c(list, list2, j2);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    /* renamed from: v */
    public final void mo10985v() {
        if (this.f20257d) {
            return;
        }
        FakeSplitInstallManager fakeSplitInstallManager = this.f20259f;
        List<Intent> list = this.f20258e;
        List<String> list2 = this.f20254a;
        List<String> list3 = this.f20255b;
        long j2 = this.f20256c;
        int i2 = FakeSplitInstallManager.f20221k;
        fakeSplitInstallManager.m10973b(list, list2, list3, j2, true);
    }
}
