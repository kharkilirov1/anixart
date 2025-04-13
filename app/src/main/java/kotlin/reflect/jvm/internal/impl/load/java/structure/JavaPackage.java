package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* compiled from: javaElements.kt */
/* loaded from: classes3.dex */
public interface JavaPackage extends JavaAnnotationOwner, JavaElement {
    @NotNull
    /* renamed from: d */
    FqName mo32829d();

    @NotNull
    /* renamed from: o */
    Collection<JavaClass> mo32830o(@NotNull Function1<? super Name, Boolean> function1);

    @NotNull
    /* renamed from: u */
    Collection<JavaPackage> mo32831u();
}
