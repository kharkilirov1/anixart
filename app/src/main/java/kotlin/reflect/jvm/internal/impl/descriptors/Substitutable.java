package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import org.jetbrains.annotations.NotNull;

/* compiled from: Substitutable.kt */
/* loaded from: classes3.dex */
public interface Substitutable<T extends DeclarationDescriptorNonRoot> {
    @NotNull
    /* renamed from: c */
    T mo32503c(@NotNull TypeSubstitutor typeSubstitutor);
}
