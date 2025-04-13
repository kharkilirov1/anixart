package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {

    /* renamed from: b */
    public static final DescriptorRenderer f65889b = DescriptorRenderer.f65768c.m33371a(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.1
        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            DescriptorRendererOptions descriptorRendererOptions2 = descriptorRendererOptions;
            descriptorRendererOptions2.mo33411e(false);
            descriptorRendererOptions2.mo33413f(true);
            descriptorRendererOptions2.mo33429n(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions2.mo33407c(DescriptorRendererModifier.f65803o);
            return Unit.f63088a;
        }
    });

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {

        /* renamed from: b */
        public static final NameAndTypeMemberComparator f65890b = new NameAndTypeMemberComparator();

        @Nullable
        /* renamed from: a */
        public static Integer m33487a(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int m33488b = m33488b(declarationDescriptor2) - m33488b(declarationDescriptor);
            if (m33488b != 0) {
                return Integer.valueOf(m33488b);
            }
            if (DescriptorUtils.m33478n(declarationDescriptor) && DescriptorUtils.m33478n(declarationDescriptor2)) {
                return 0;
            }
            int compareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        /* renamed from: b */
        public static int m33488b(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.m33478n(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).mo32492k0() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).mo32492k0() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        @Override // java.util.Comparator
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer m33487a = m33487a(declarationDescriptor, declarationDescriptor2);
            if (m33487a != null) {
                return m33487a.intValue();
            }
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r0 != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r3 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014a, code lost:
    
        if (r0 != 0) goto L11;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compare(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r13, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r14) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.compare(java.lang.Object, java.lang.Object):int");
    }
}
