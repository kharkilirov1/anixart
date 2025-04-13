package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaPropertyInitializerEvaluator.kt */
/* loaded from: classes3.dex */
public interface JavaPropertyInitializerEvaluator {

    /* compiled from: JavaPropertyInitializerEvaluator.kt */
    public static final class DoNothing implements JavaPropertyInitializerEvaluator {

        /* renamed from: a */
        public static final DoNothing f64406a = new DoNothing();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator
        /* renamed from: a */
        public ConstantValue mo32702a(JavaField field, PropertyDescriptor descriptor) {
            Intrinsics.m32180i(field, "field");
            Intrinsics.m32180i(descriptor, "descriptor");
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    ConstantValue<?> mo32702a(@NotNull JavaField javaField, @NotNull PropertyDescriptor propertyDescriptor);
}
