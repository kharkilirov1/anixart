package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class DivViewState {

    /* renamed from: a */
    public final long f31335a;

    /* renamed from: b */
    @NonNull
    public final Map<String, BlockState> f31336b;

    public interface BlockState {
    }

    public DivViewState(long j2) {
        ArrayMap arrayMap = new ArrayMap();
        this.f31335a = j2;
        this.f31336b = arrayMap;
    }

    @Nullable
    /* renamed from: a */
    public <T extends BlockState> T m16721a(@NonNull String str) {
        return (T) this.f31336b.get(str);
    }

    public DivViewState(long j2, @NonNull Map<String, BlockState> map) {
        this.f31335a = j2;
        this.f31336b = map;
    }
}
