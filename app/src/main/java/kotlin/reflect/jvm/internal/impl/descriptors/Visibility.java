package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Visibility.kt */
/* loaded from: classes3.dex */
public abstract class Visibility {

    /* renamed from: a */
    @NotNull
    public final String f63999a;

    /* renamed from: b */
    public final boolean f64000b;

    public Visibility(@NotNull String name, boolean z) {
        Intrinsics.m32180i(name, "name");
        this.f63999a = name;
        this.f64000b = z;
    }

    @Nullable
    /* renamed from: a */
    public Integer mo32584a(@NotNull Visibility visibility) {
        Intrinsics.m32180i(visibility, "visibility");
        Visibility visibility2 = Visibilities.f63984a;
        if (this == visibility) {
            return 0;
        }
        Map<Visibility, Integer> map = Visibilities.f63993j;
        Integer num = map.get(this);
        Integer num2 = map.get(visibility);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    @NotNull
    /* renamed from: b */
    public String mo32583b() {
        return this.f63999a;
    }

    /* renamed from: c */
    public abstract boolean mo32582c(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    /* renamed from: d */
    public Visibility mo32585d() {
        return this;
    }

    @NotNull
    public final String toString() {
        return mo32583b();
    }
}
