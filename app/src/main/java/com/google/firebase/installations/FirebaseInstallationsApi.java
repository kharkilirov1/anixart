package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface FirebaseInstallationsApi {
    @NonNull
    /* renamed from: a */
    Task<InstallationTokenResult> mo12560a(boolean z);

    @NonNull
    Task<String> getId();
}
