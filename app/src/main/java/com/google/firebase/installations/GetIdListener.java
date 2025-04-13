package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes2.dex */
class GetIdListener implements StateListener {

    /* renamed from: a */
    public final TaskCompletionSource<String> f23152a;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.f23152a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    /* renamed from: a */
    public boolean mo12575a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    /* renamed from: b */
    public boolean mo12576b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!(persistedInstallationEntry.mo12588f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) && !persistedInstallationEntry.m12605j() && !persistedInstallationEntry.m12603h()) {
            return false;
        }
        this.f23152a.m9718d(persistedInstallationEntry.mo12585c());
        return true;
    }
}
