package kotlin.reflect.jvm.internal.components;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.structure.ReflectJavaElement;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimeSourceElementFactory.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;", "RuntimeSourceElement", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    /* renamed from: a */
    public static final RuntimeSourceElementFactory f63709a = new RuntimeSourceElementFactory();

    /* compiled from: RuntimeSourceElementFactory.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory$RuntimeSourceElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* renamed from: b */
        @NotNull
        public final ReflectJavaElement f63710b;

        public RuntimeSourceElement(@NotNull ReflectJavaElement reflectJavaElement) {
            this.f63710b = reflectJavaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
        @NotNull
        /* renamed from: a */
        public SourceFile mo32339a() {
            return SourceFile.f63980a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        /* renamed from: b */
        public JavaElement mo32361b() {
            return this.f63710b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            C0576a.m4126y(RuntimeSourceElement.class, sb, ": ");
            sb.append(this.f63710b.toString());
            return sb.toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory
    @NotNull
    /* renamed from: a */
    public JavaSourceElement mo32360a(@NotNull JavaElement javaElement) {
        Intrinsics.m32180i(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
