package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReflectJavaModifierListOwner.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "", "isAbstract", "()Z", "isFinal", "isStatic", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "visibility", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface ReflectJavaModifierListOwner extends JavaModifierListOwner {

    /* compiled from: ReflectJavaModifierListOwner.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public static final class DefaultImpls {
        @NotNull
        /* renamed from: a */
        public static Visibility m33811a(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            int modifiers = reflectJavaModifierListOwner.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                Visibility visibility = Visibilities.f63988e;
                Intrinsics.m32175d(visibility, "Visibilities.PUBLIC");
                return visibility;
            }
            if (Modifier.isPrivate(modifiers)) {
                Visibility visibility2 = Visibilities.f63984a;
                Intrinsics.m32175d(visibility2, "Visibilities.PRIVATE");
                return visibility2;
            }
            if (Modifier.isProtected(modifiers)) {
                Visibility visibility3 = Modifier.isStatic(modifiers) ? JavaVisibilities.f64345b : JavaVisibilities.f64346c;
                Intrinsics.m32175d(visibility3, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return visibility3;
            }
            Visibility visibility4 = JavaVisibilities.f64344a;
            Intrinsics.m32175d(visibility4, "JavaVisibilities.PACKAGE_VISIBILITY");
            return visibility4;
        }
    }

    int getModifiers();
}
