package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: collections.kt */
/* loaded from: classes3.dex */
public final class CollectionsKt {
    /* renamed from: a */
    public static final int m33771a(int i2) {
        if (i2 < 3) {
            return 3;
        }
        return (i2 / 3) + i2 + 1;
    }

    @NotNull
    /* renamed from: b */
    public static final <T> List<T> m33772b(@NotNull ArrayList<T> receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        int size = receiver$0.size();
        if (size == 0) {
            return EmptyList.f63144b;
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.m31993F(kotlin.collections.CollectionsKt.m32044u(receiver$0));
        }
        receiver$0.trimToSize();
        return receiver$0;
    }

    @NotNull
    /* renamed from: c */
    public static final <K, V> HashMap<K, V> m33773c(int i2) {
        return new HashMap<>(m33771a(i2));
    }
}
