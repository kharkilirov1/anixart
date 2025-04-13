package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: javaElements.kt */
/* loaded from: classes3.dex */
public interface JavaMethod extends JavaMember, JavaTypeParameterListOwner {
    /* renamed from: E */
    boolean mo32826E();

    @NotNull
    /* renamed from: f */
    List<JavaValueParameter> mo32827f();

    @NotNull
    JavaType getReturnType();
}
