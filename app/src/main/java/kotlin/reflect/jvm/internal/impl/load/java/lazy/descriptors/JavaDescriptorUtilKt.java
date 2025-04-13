package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: JavaDescriptorUtil.kt */
/* loaded from: classes3.dex */
public final class JavaDescriptorUtilKt {
    /* renamed from: a */
    public static final boolean m32731a(@NotNull PropertyDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return receiver$0.getGetter() == null;
    }
}
