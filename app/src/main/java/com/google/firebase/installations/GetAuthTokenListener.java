package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes2.dex */
class GetAuthTokenListener implements StateListener {

    /* renamed from: a */
    public final Utils f23150a;

    /* renamed from: b */
    public final TaskCompletionSource<InstallationTokenResult> f23151b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.f23150a = utils;
        this.f23151b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    /* renamed from: a */
    public boolean mo12575a(Exception exc) {
        this.f23151b.m9717c(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    /* renamed from: b */
    public boolean mo12576b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.m12605j() || this.f23150a.m12581d(persistedInstallationEntry)) {
            return false;
        }
        TaskCompletionSource<InstallationTokenResult> taskCompletionSource = this.f23151b;
        AutoValue_InstallationTokenResult.Builder builder = new AutoValue_InstallationTokenResult.Builder();
        String mo12583a = persistedInstallationEntry.mo12583a();
        Objects.requireNonNull(mo12583a, "Null token");
        builder.f23123a = mo12583a;
        builder.f23124b = Long.valueOf(persistedInstallationEntry.mo12584b());
        builder.f23125c = Long.valueOf(persistedInstallationEntry.mo12589g());
        String str = builder.f23123a == null ? " token" : "";
        if (builder.f23124b == null) {
            str = C0000a.m14k(str, " tokenExpirationTimestamp");
        }
        if (builder.f23125c == null) {
            str = C0000a.m14k(str, " tokenCreationTimestamp");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(C0000a.m14k("Missing required properties:", str));
        }
        taskCompletionSource.m9716b(new AutoValue_InstallationTokenResult(builder.f23123a, builder.f23124b.longValue(), builder.f23125c.longValue(), null));
        return true;
    }
}
