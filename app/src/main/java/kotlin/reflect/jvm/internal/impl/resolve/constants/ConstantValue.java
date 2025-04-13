package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public abstract class ConstantValue<T> {

    /* renamed from: a */
    public final T f65921a;

    public ConstantValue(T t) {
        this.f65921a = t;
    }

    @NotNull
    /* renamed from: a */
    public abstract KotlinType mo33521a(@NotNull ModuleDescriptor moduleDescriptor);

    /* renamed from: b */
    public T mo33522b() {
        return this.f65921a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            T mo33522b = mo33522b();
            if (!(obj instanceof ConstantValue)) {
                obj = null;
            }
            ConstantValue constantValue = (ConstantValue) obj;
            if (!Intrinsics.m32174c(mo33522b, constantValue != null ? constantValue.mo33522b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T mo33522b = mo33522b();
        if (mo33522b != null) {
            return mo33522b.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(mo33522b());
    }
}
