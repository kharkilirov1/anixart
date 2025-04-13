package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: javaElements.kt */
/* loaded from: classes3.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    /* renamed from: A */
    boolean mo32803A();

    @Nullable
    /* renamed from: B */
    LightClassOriginKind mo32804B();

    @NotNull
    /* renamed from: D */
    Collection<Name> mo32805D();

    @NotNull
    /* renamed from: F */
    Collection<JavaMethod> mo32806F();

    @NotNull
    /* renamed from: a */
    Collection<JavaClassifierType> mo32807a();

    @Nullable
    /* renamed from: d */
    FqName mo32808d();

    @Nullable
    /* renamed from: j */
    JavaClass mo32809j();

    @NotNull
    /* renamed from: l */
    Collection<JavaConstructor> mo32810l();

    /* renamed from: p */
    boolean mo32811p();

    /* renamed from: v */
    boolean mo32812v();

    @NotNull
    /* renamed from: x */
    Collection<JavaField> mo32813x();
}
