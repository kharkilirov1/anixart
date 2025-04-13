package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: javaElements.kt */
/* loaded from: classes3.dex */
public interface JavaAnnotation extends JavaElement {
    @NotNull
    /* renamed from: c */
    Collection<JavaAnnotationArgument> mo32795c();

    @Nullable
    /* renamed from: g */
    ClassId mo32796g();

    @Nullable
    /* renamed from: t */
    JavaClass mo32797t();
}
