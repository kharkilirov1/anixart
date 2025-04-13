package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
class zzal<T> extends com.google.android.play.core.internal.zzv {

    /* renamed from: a */
    public final com.google.android.play.core.tasks.zzi<T> f19682a;

    /* renamed from: b */
    public final /* synthetic */ zzaw f19683b;

    public zzal(zzaw zzawVar, com.google.android.play.core.tasks.zzi<T> zziVar) {
        this.f19683b = zzawVar;
        this.f19682a = zziVar;
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: E2 */
    public final void mo10691E2(Bundle bundle, Bundle bundle2) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: G0 */
    public final void mo10692G0(Bundle bundle, Bundle bundle2) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onRemoveModule()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: J */
    public void mo10693J(List<Bundle> list) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: O1 */
    public final void mo10694O1(Bundle bundle, Bundle bundle2) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: V0 */
    public void mo10695V0(Bundle bundle, Bundle bundle2) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: c */
    public final void mo10696c(Bundle bundle) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onCancelDownloads()", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: d */
    public final void mo10697d(int i2, Bundle bundle) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onCancelDownload(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: g */
    public void mo10698g(Bundle bundle) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        int i2 = bundle.getInt("error_code");
        zzaw.f19696g.m10835b("onError(%d)", Integer.valueOf(i2));
        this.f19682a.m11014c(new AssetPackException(i2));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: k2 */
    public void mo10699k2(Bundle bundle, Bundle bundle2) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: p2 */
    public void mo10700p2(int i2, Bundle bundle) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onStartDownload(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: y */
    public void mo10701y(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: y2 */
    public final void mo10702y2(int i2, Bundle bundle) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.internal.zzw
    /* renamed from: z1 */
    public final void mo10703z1(Bundle bundle, Bundle bundle2) {
        this.f19683b.f19701d.m10843c(this.f19682a);
        zzaw.f19696g.m10837d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }
}
