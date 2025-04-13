package com.yandex.div.core.player;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: DivPlayerPlaybackConfig.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/player/DivPlayerPlaybackConfig;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class DivPlayerPlaybackConfig {

    /* renamed from: a */
    public final boolean f31295a;

    /* renamed from: b */
    public final boolean f31296b;

    /* renamed from: c */
    public final boolean f31297c;

    /* renamed from: d */
    @Nullable
    public final JSONObject f31298d;

    public DivPlayerPlaybackConfig() {
        this.f31295a = false;
        this.f31296b = false;
        this.f31297c = false;
        this.f31298d = null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivPlayerPlaybackConfig)) {
            return false;
        }
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = (DivPlayerPlaybackConfig) obj;
        return this.f31295a == divPlayerPlaybackConfig.f31295a && this.f31296b == divPlayerPlaybackConfig.f31296b && this.f31297c == divPlayerPlaybackConfig.f31297c && Intrinsics.m32174c(this.f31298d, divPlayerPlaybackConfig.f31298d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f31295a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.f31296b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.f31297c;
        int i5 = (i4 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        JSONObject jSONObject = this.f31298d;
        return i5 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DivPlayerPlaybackConfig(autoplay=");
        m24u.append(this.f31295a);
        m24u.append(", isMuted=");
        m24u.append(this.f31296b);
        m24u.append(", repeatable=");
        m24u.append(this.f31297c);
        m24u.append(", payload=");
        m24u.append(this.f31298d);
        m24u.append(')');
        return m24u.toString();
    }

    public DivPlayerPlaybackConfig(boolean z, boolean z2, boolean z3, @Nullable JSONObject jSONObject) {
        this.f31295a = z;
        this.f31296b = z2;
        this.f31297c = z3;
        this.f31298d = jSONObject;
    }
}
