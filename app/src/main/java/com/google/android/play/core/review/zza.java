package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zza extends ReviewInfo {

    /* renamed from: b */
    public final PendingIntent f20180b;

    /* renamed from: c */
    public final boolean f20181c;

    public zza(PendingIntent pendingIntent, boolean z) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f20180b = pendingIntent;
        this.f20181c = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: c */
    public final PendingIntent mo10933c() {
        return this.f20180b;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: d */
    public final boolean mo10934d() {
        return this.f20181c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f20180b.equals(reviewInfo.mo10933c()) && this.f20181c == reviewInfo.mo10934d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f20180b.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20181c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f20180b);
        boolean z = this.f20181c;
        StringBuilder sb = new StringBuilder(valueOf.length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(valueOf);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
