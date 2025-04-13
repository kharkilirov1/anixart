package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes3.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* renamed from: b */
    @NotNull
    public final String f64015b;

    AnnotationUseSiteTarget(String str) {
        if (str == null) {
            String name = name();
            if (name == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = name.toLowerCase();
            Intrinsics.m32175d(str, "(this as java.lang.String).toLowerCase()");
        }
        this.f64015b = str;
    }
}
