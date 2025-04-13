package kotlin.properties;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: Interfaces.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/properties/ReadWriteProperty;", "T", "V", "Lkotlin/properties/ReadOnlyProperty;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    V getValue(T t, @NotNull KProperty<?> kProperty);

    void setValue(T t, @NotNull KProperty<?> kProperty, V v);
}
