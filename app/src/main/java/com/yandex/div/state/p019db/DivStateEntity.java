package com.yandex.div.state.p019db;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DivStateEntity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/db/DivStateEntity;", "", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class DivStateEntity {

    /* renamed from: a */
    public final int f34375a;

    /* renamed from: b */
    @NotNull
    public final String f34376b;

    /* renamed from: c */
    @NotNull
    public final String f34377c;

    /* renamed from: d */
    @NotNull
    public final String f34378d;

    /* renamed from: e */
    public final long f34379e;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStateEntity)) {
            return false;
        }
        DivStateEntity divStateEntity = (DivStateEntity) obj;
        return this.f34375a == divStateEntity.f34375a && Intrinsics.m32174c(this.f34376b, divStateEntity.f34376b) && Intrinsics.m32174c(this.f34377c, divStateEntity.f34377c) && Intrinsics.m32174c(this.f34378d, divStateEntity.f34378d) && this.f34379e == divStateEntity.f34379e;
    }

    public int hashCode() {
        int m4107f = C0576a.m4107f(this.f34378d, C0576a.m4107f(this.f34377c, C0576a.m4107f(this.f34376b, this.f34375a * 31, 31), 31), 31);
        long j2 = this.f34379e;
        return m4107f + ((int) (j2 ^ (j2 >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DivStateEntity(id=");
        m24u.append(this.f34375a);
        m24u.append(", cardId=");
        m24u.append(this.f34376b);
        m24u.append(", path=");
        m24u.append(this.f34377c);
        m24u.append(", stateId=");
        m24u.append(this.f34378d);
        m24u.append(", modificationTime=");
        m24u.append(this.f34379e);
        m24u.append(')');
        return m24u.toString();
    }
}
