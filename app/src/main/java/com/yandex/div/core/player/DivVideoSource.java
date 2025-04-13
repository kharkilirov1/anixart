package com.yandex.div.core.player;

import android.net.Uri;
import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DivVideoSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/player/DivVideoSource;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class DivVideoSource {

    /* renamed from: a */
    @NotNull
    public final Uri f31309a;

    /* renamed from: b */
    @NotNull
    public final String f31310b;

    /* renamed from: c */
    @Nullable
    public final DivVideoResolution f31311c;

    /* renamed from: d */
    @Nullable
    public final Long f31312d;

    public DivVideoSource(@NotNull Uri url, @NotNull String mimeType, @Nullable DivVideoResolution divVideoResolution, @Nullable Long l2) {
        Intrinsics.m32179h(url, "url");
        Intrinsics.m32179h(mimeType, "mimeType");
        this.f31309a = url;
        this.f31310b = mimeType;
        this.f31311c = divVideoResolution;
        this.f31312d = l2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        return Intrinsics.m32174c(this.f31309a, divVideoSource.f31309a) && Intrinsics.m32174c(this.f31310b, divVideoSource.f31310b) && Intrinsics.m32174c(this.f31311c, divVideoSource.f31311c) && Intrinsics.m32174c(this.f31312d, divVideoSource.f31312d);
    }

    public int hashCode() {
        int m4107f = C0576a.m4107f(this.f31310b, this.f31309a.hashCode() * 31, 31);
        DivVideoResolution divVideoResolution = this.f31311c;
        int hashCode = (m4107f + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l2 = this.f31312d;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DivVideoSource(url=");
        m24u.append(this.f31309a);
        m24u.append(", mimeType=");
        m24u.append(this.f31310b);
        m24u.append(", resolution=");
        m24u.append(this.f31311c);
        m24u.append(", bitrate=");
        m24u.append(this.f31312d);
        m24u.append(')');
        return m24u.toString();
    }
}
