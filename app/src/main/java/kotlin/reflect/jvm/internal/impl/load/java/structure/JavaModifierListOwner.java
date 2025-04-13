package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import org.jetbrains.annotations.NotNull;

/* compiled from: javaElements.kt */
/* loaded from: classes3.dex */
public interface JavaModifierListOwner extends JavaElement {
    @NotNull
    Visibility getVisibility();

    /* renamed from: i */
    boolean mo32828i();

    boolean isAbstract();

    boolean isFinal();
}
