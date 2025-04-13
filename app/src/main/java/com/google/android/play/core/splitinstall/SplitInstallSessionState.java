package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public abstract class SplitInstallSessionState {
    /* renamed from: b */
    public static SplitInstallSessionState m10958b(int i2, @SplitInstallSessionStatus int i3, @SplitInstallErrorCode int i4, long j2, long j3, List<String> list, List<String> list2) {
        if (i3 != 8) {
            return new zza(i2, i3, i4, j2, j3, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* renamed from: m */
    public static SplitInstallSessionState m10959m(Bundle bundle) {
        return new zza(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* renamed from: a */
    public abstract long mo10960a();

    @SplitInstallErrorCode
    /* renamed from: c */
    public abstract int mo10961c();

    @NonNull
    /* renamed from: d */
    public List<String> m10962d() {
        return mo10968j() != null ? new ArrayList(mo10968j()) : new ArrayList();
    }

    @NonNull
    /* renamed from: e */
    public List<String> m10963e() {
        return mo10969k() != null ? new ArrayList(mo10969k()) : new ArrayList();
    }

    @Nullable
    @Deprecated
    /* renamed from: f */
    public abstract PendingIntent mo10964f();

    /* renamed from: g */
    public abstract int mo10965g();

    @SplitInstallSessionStatus
    /* renamed from: h */
    public abstract int mo10966h();

    /* renamed from: i */
    public abstract long mo10967i();

    @Nullable
    /* renamed from: j */
    public abstract List<String> mo10968j();

    @Nullable
    /* renamed from: k */
    public abstract List<String> mo10969k();

    @Nullable
    /* renamed from: l */
    public abstract List<Intent> mo10970l();
}
