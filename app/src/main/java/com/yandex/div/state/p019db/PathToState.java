package com.yandex.div.state.p019db;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DivStateEntity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/db/PathToState;", "", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final /* data */ class PathToState {

    /* renamed from: a */
    @NotNull
    public final String f34380a;

    /* renamed from: b */
    @NotNull
    public final String f34381b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathToState)) {
            return false;
        }
        PathToState pathToState = (PathToState) obj;
        return Intrinsics.m32174c(this.f34380a, pathToState.f34380a) && Intrinsics.m32174c(this.f34381b, pathToState.f34381b);
    }

    public int hashCode() {
        return this.f34381b.hashCode() + (this.f34380a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("PathToState(path=");
        m24u.append(this.f34380a);
        m24u.append(", stateId=");
        return C0576a.m4118q(m24u, this.f34381b, ')');
    }
}
