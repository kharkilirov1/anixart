package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import org.jetbrains.annotations.NotNull;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes3.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* renamed from: b */
    public final LazyJavaPackageFragment f64802b;

    public KotlinJvmBinaryPackageSourceElement(@NotNull LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f64802b = lazyJavaPackageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* renamed from: a */
    public SourceFile mo32339a() {
        return SourceFile.f63980a;
    }

    @NotNull
    public String toString() {
        return this.f64802b + ": " + this.f64802b.m32766G().keySet();
    }
}
