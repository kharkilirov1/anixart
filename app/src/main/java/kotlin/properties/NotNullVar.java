package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Delegates.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/properties/NotNullVar;", "", "T", "Lkotlin/properties/ReadWriteProperty;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class NotNullVar<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a */
    @Nullable
    public T f63362a;

    @Override // kotlin.properties.ReadWriteProperty
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.m32179h(property, "property");
        T t = this.f63362a;
        if (t != null) {
            return t;
        }
        StringBuilder m24u = C0000a.m24u("Property ");
        m24u.append(property.getName());
        m24u.append(" should be initialized before get.");
        throw new IllegalStateException(m24u.toString());
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @NotNull T value) {
        Intrinsics.m32179h(property, "property");
        Intrinsics.m32179h(value, "value");
        this.f63362a = value;
    }
}
