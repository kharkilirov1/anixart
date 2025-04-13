package io.grpc.internal;

import java.util.ArrayList;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class InsightBuilder {

    /* renamed from: a */
    public final ArrayList<String> f58728a = new ArrayList<>();

    /* renamed from: a */
    public InsightBuilder m31115a(@Nullable Object obj) {
        this.f58728a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public InsightBuilder m31116b(String str, @Nullable Object obj) {
        this.f58728a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f58728a.toString();
    }
}
