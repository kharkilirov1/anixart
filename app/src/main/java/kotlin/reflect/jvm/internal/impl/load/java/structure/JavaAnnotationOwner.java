package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: javaElements.kt */
/* loaded from: classes3.dex */
public interface JavaAnnotationOwner extends JavaElement {
    @NotNull
    Collection<JavaAnnotation> getAnnotations();

    @Nullable
    /* renamed from: h */
    JavaAnnotation mo32799h(@NotNull FqName fqName);

    /* renamed from: k */
    boolean mo32800k();
}
