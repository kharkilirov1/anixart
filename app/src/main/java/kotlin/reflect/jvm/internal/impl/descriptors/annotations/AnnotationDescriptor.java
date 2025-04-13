package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotationDescriptor.kt */
/* loaded from: classes3.dex */
public interface AnnotationDescriptor {

    /* compiled from: AnnotationDescriptor.kt */
    public static final class DefaultImpls {
        @Nullable
        /* renamed from: a */
        public static FqName m32589a(AnnotationDescriptor annotationDescriptor) {
            ClassDescriptor m33533f = DescriptorUtilsKt.m33533f(annotationDescriptor);
            if (m33533f == null) {
                return null;
            }
            if (ErrorUtils.m33654e(m33533f)) {
                m33533f = null;
            }
            if (m33533f != null) {
                return DescriptorUtilsKt.m33532e(m33533f);
            }
            return null;
        }
    }

    @NotNull
    /* renamed from: a */
    Map<Name, ConstantValue<?>> mo32586a();

    @Nullable
    /* renamed from: d */
    FqName mo32587d();

    @NotNull
    KotlinType getType();

    @NotNull
    /* renamed from: i */
    SourceElement mo32588i();
}
