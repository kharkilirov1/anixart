package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ClassDescriptorFactory.kt */
/* loaded from: classes3.dex */
public interface ClassDescriptorFactory {
    @NotNull
    /* renamed from: a */
    Collection<ClassDescriptor> mo32425a(@NotNull FqName fqName);

    /* renamed from: b */
    boolean mo32426b(@NotNull FqName fqName, @NotNull Name name);

    @Nullable
    /* renamed from: c */
    ClassDescriptor mo32427c(@NotNull ClassId classId);
}
