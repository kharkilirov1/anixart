package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface JavaClassFinder {
    @Nullable
    /* renamed from: a */
    JavaClass mo32344a(@NotNull ClassId classId);

    @Nullable
    /* renamed from: b */
    JavaPackage mo32345b(@NotNull FqName fqName);

    @Nullable
    /* renamed from: c */
    Set<String> mo32346c(@NotNull FqName fqName);
}
