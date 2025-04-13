package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.model.SplitInstallSessionStatus;
import java.util.List;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zza extends SplitInstallSessionState {

    /* renamed from: a */
    public final int f20267a;

    /* renamed from: b */
    public final int f20268b;

    /* renamed from: c */
    public final int f20269c;

    /* renamed from: d */
    public final long f20270d;

    /* renamed from: e */
    public final long f20271e;

    /* renamed from: f */
    public final List<String> f20272f;

    /* renamed from: g */
    public final List<String> f20273g;

    /* renamed from: h */
    public final PendingIntent f20274h;

    /* renamed from: i */
    public final List<Intent> f20275i;

    public zza(int i2, int i3, int i4, long j2, long j3, @Nullable List<String> list, @Nullable List<String> list2, @Nullable PendingIntent pendingIntent, @Nullable List<Intent> list3) {
        this.f20267a = i2;
        this.f20268b = i3;
        this.f20269c = i4;
        this.f20270d = j2;
        this.f20271e = j3;
        this.f20272f = list;
        this.f20273g = list2;
        this.f20274h = pendingIntent;
        this.f20275i = list3;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    /* renamed from: a */
    public final long mo10960a() {
        return this.f20270d;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallErrorCode
    /* renamed from: c */
    public final int mo10961c() {
        return this.f20269c;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        List<Intent> list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SplitInstallSessionState) {
            SplitInstallSessionState splitInstallSessionState = (SplitInstallSessionState) obj;
            if (this.f20267a == splitInstallSessionState.mo10965g() && this.f20268b == splitInstallSessionState.mo10966h() && this.f20269c == splitInstallSessionState.mo10961c() && this.f20270d == splitInstallSessionState.mo10960a() && this.f20271e == splitInstallSessionState.mo10967i() && ((list = this.f20272f) != null ? list.equals(splitInstallSessionState.mo10969k()) : splitInstallSessionState.mo10969k() == null) && ((list2 = this.f20273g) != null ? list2.equals(splitInstallSessionState.mo10968j()) : splitInstallSessionState.mo10968j() == null) && ((pendingIntent = this.f20274h) != null ? pendingIntent.equals(splitInstallSessionState.mo10964f()) : splitInstallSessionState.mo10964f() == null) && ((list3 = this.f20275i) != null ? list3.equals(splitInstallSessionState.mo10970l()) : splitInstallSessionState.mo10970l() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    @Deprecated
    /* renamed from: f */
    public final PendingIntent mo10964f() {
        return this.f20274h;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    /* renamed from: g */
    public final int mo10965g() {
        return this.f20267a;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @SplitInstallSessionStatus
    /* renamed from: h */
    public final int mo10966h() {
        return this.f20268b;
    }

    public final int hashCode() {
        int i2 = this.f20267a;
        int i3 = this.f20268b;
        int i4 = this.f20269c;
        long j2 = this.f20270d;
        long j3 = this.f20271e;
        int i5 = (((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        List<String> list = this.f20272f;
        int hashCode = (i5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f20273g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f20274h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f20275i;
        return hashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    /* renamed from: i */
    public final long mo10967i() {
        return this.f20271e;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    /* renamed from: j */
    public final List<String> mo10968j() {
        return this.f20273g;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    /* renamed from: k */
    public final List<String> mo10969k() {
        return this.f20272f;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @Nullable
    /* renamed from: l */
    public final List<Intent> mo10970l() {
        return this.f20275i;
    }

    public final String toString() {
        int i2 = this.f20267a;
        int i3 = this.f20268b;
        int i4 = this.f20269c;
        long j2 = this.f20270d;
        long j3 = this.f20271e;
        String valueOf = String.valueOf(this.f20272f);
        String valueOf2 = String.valueOf(this.f20273g);
        String valueOf3 = String.valueOf(this.f20274h);
        String valueOf4 = String.valueOf(this.f20275i);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + valueOf3.length() + valueOf4.length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i2);
        sb.append(", status=");
        sb.append(i3);
        sb.append(", errorCode=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", moduleNamesNullable=");
        C0000a.m2C(sb, valueOf, ", languagesNullable=", valueOf2, ", resolutionIntent=");
        return C0000a.m22s(sb, valueOf3, ", splitFileIntents=", valueOf4, "}");
    }
}
