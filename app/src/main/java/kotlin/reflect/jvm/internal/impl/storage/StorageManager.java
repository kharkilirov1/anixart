package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StorageManager.kt */
/* loaded from: classes3.dex */
public interface StorageManager {
    @NotNull
    /* renamed from: a */
    <K, V> CacheWithNotNullValues<K, V> mo33621a();

    @NotNull
    /* renamed from: b */
    <T> NotNullLazyValue<T> mo33622b(@NotNull Function0<? extends T> function0, @NotNull T t);

    @NotNull
    /* renamed from: c */
    <T> NotNullLazyValue<T> mo33623c(@NotNull Function0<? extends T> function0);

    @NotNull
    /* renamed from: d */
    <T> NullableLazyValue<T> mo33624d(@NotNull Function0<? extends T> function0);

    @NotNull
    /* renamed from: e */
    <T> NotNullLazyValue<T> mo33625e(@NotNull Function0<? extends T> function0, @Nullable Function1<? super Boolean, ? extends T> function1, @NotNull Function1<? super T, Unit> function12);

    @NotNull
    /* renamed from: f */
    <K, V> MemoizedFunctionToNotNull<K, V> mo33626f(@NotNull Function1<? super K, ? extends V> function1);

    @NotNull
    /* renamed from: g */
    <K, V> MemoizedFunctionToNullable<K, V> mo33627g(@NotNull Function1<? super K, ? extends V> function1);
}
