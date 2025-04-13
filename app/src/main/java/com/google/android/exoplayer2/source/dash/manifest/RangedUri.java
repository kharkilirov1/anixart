package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.UriUtil;

/* loaded from: classes.dex */
public final class RangedUri {

    /* renamed from: a */
    public final long f12970a;

    /* renamed from: b */
    public final long f12971b;

    /* renamed from: c */
    public final String f12972c;

    /* renamed from: d */
    public int f12973d;

    public RangedUri(@Nullable String str, long j2, long j3) {
        this.f12972c = str == null ? "" : str;
        this.f12970a = j2;
        this.f12971b = j3;
    }

    @Nullable
    /* renamed from: a */
    public RangedUri m7068a(@Nullable RangedUri rangedUri, String str) {
        String m7700c = UriUtil.m7700c(str, this.f12972c);
        if (rangedUri != null && m7700c.equals(UriUtil.m7700c(str, rangedUri.f12972c))) {
            long j2 = this.f12971b;
            if (j2 != -1) {
                long j3 = this.f12970a;
                if (j3 + j2 == rangedUri.f12970a) {
                    long j4 = rangedUri.f12971b;
                    return new RangedUri(m7700c, j3, j4 == -1 ? -1L : j2 + j4);
                }
            }
            long j5 = rangedUri.f12971b;
            if (j5 != -1) {
                long j6 = rangedUri.f12970a;
                if (j6 + j5 == this.f12970a) {
                    return new RangedUri(m7700c, j6, j2 == -1 ? -1L : j5 + j2);
                }
            }
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RangedUri.class != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        return this.f12970a == rangedUri.f12970a && this.f12971b == rangedUri.f12971b && this.f12972c.equals(rangedUri.f12972c);
    }

    public int hashCode() {
        if (this.f12973d == 0) {
            this.f12973d = this.f12972c.hashCode() + ((((527 + ((int) this.f12970a)) * 31) + ((int) this.f12971b)) * 31);
        }
        return this.f12973d;
    }

    public String toString() {
        String str = this.f12972c;
        long j2 = this.f12970a;
        long j3 = this.f12971b;
        StringBuilder sb = new StringBuilder(C0576a.m4106e(str, 81));
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j2);
        sb.append(", length=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
