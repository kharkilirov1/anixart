package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: inlineClassesUtils.kt */
/* loaded from: classes3.dex */
public final class InlineClassesUtilsKt {
    /* renamed from: a */
    public static final boolean m33486a(@NotNull KotlinType kotlinType) {
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        return mo32449b != null && (mo32449b instanceof ClassDescriptor) && ((ClassDescriptor) mo32449b).isInline();
    }
}
