package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: utils.kt */
/* loaded from: classes3.dex */
public final class EnumEntry extends JavaDefaultValue {

    /* renamed from: a */
    @NotNull
    public final ClassDescriptor f64338a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumEntry(@NotNull ClassDescriptor descriptor) {
        super(null);
        Intrinsics.m32180i(descriptor, "descriptor");
        this.f64338a = descriptor;
    }
}
