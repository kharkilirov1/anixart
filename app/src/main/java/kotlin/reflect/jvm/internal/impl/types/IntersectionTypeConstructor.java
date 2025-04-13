package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class IntersectionTypeConstructor implements TypeConstructor {

    /* renamed from: a */
    public final Set<KotlinType> f66323a;

    /* renamed from: b */
    public final int f66324b;

    public IntersectionTypeConstructor(Collection<KotlinType> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        this.f66323a = linkedHashSet;
        this.f66324b = linkedHashSet.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: a */
    public Collection<KotlinType> mo32602a() {
        return this.f66323a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: b */
    public ClassifierDescriptor mo32449b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: c */
    public boolean mo32450c() {
        return false;
    }

    /* renamed from: d */
    public MemberScope m33661d() {
        return TypeIntersectionScope.m33552h("member scope for intersection type " + this, this.f66323a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Set<KotlinType> set = this.f66323a;
        Set<KotlinType> set2 = ((IntersectionTypeConstructor) obj).f66323a;
        return set == null ? set2 == null : set.equals(set2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return Collections.emptyList();
    }

    public int hashCode() {
        return this.f66324b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: n */
    public KotlinBuiltIns mo32603n() {
        return this.f66323a.iterator().next().mo33515H0().mo32603n();
    }

    public String toString() {
        Set<KotlinType> set = this.f66323a;
        StringBuilder sb = new StringBuilder("{");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            sb.append(((KotlinType) it.next()).toString());
            if (it.hasNext()) {
                sb.append(" & ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
