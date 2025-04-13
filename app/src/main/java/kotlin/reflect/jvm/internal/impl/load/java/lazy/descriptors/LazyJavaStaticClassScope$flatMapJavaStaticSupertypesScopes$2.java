package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* compiled from: LazyJavaStaticClassScope.kt */
/* loaded from: classes3.dex */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends DFS.AbstractNodeHandler<ClassDescriptor, Unit> {

    /* renamed from: a */
    public final /* synthetic */ ClassDescriptor f64608a;

    /* renamed from: b */
    public final /* synthetic */ Set f64609b;

    /* renamed from: c */
    public final /* synthetic */ Function1 f64610c;

    public LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ClassDescriptor classDescriptor, Set set, Function1 function1) {
        this.f64608a = classDescriptor;
        this.f64609b = set;
        this.f64610c = function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo32484a() {
        return Unit.f63088a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    /* renamed from: c */
    public boolean mo32251c(Object obj) {
        ClassDescriptor current = (ClassDescriptor) obj;
        Intrinsics.m32180i(current, "current");
        if (current == this.f64608a) {
            return true;
        }
        MemberScope mo32435Q = current.mo32435Q();
        Intrinsics.m32175d(mo32435Q, "current.staticScope");
        if (!(mo32435Q instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.f64609b.addAll((Collection) this.f64610c.invoke(mo32435Q));
        return false;
    }
}
