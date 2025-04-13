package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import org.jetbrains.annotations.Nullable;

/* compiled from: KClasses.kt */
@Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class KClasses$isSubclassOf$1 extends PropertyReference1 {
    static {
        new KClasses$isSubclassOf$1();
    }

    @Override // kotlin.reflect.KProperty1
    @Nullable
    public Object get(@Nullable Object obj) {
        KClass receiver$0 = (KClass) obj;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        List<KType> mo32164a = receiver$0.mo32164a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = mo32164a.iterator();
        while (it.hasNext()) {
            KClassifier mo32219e = ((KType) it.next()).mo32219e();
            if (!(mo32219e instanceof KClass)) {
                mo32219e = null;
            }
            KClass kClass = (KClass) mo32219e;
            if (kClass != null) {
                arrayList.add(kClass);
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public String getName() {
        return "superclasses";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KDeclarationContainer getOwner() {
        return Reflection.m32194b(KClasses.class, "kotlin-reflect-api");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public String getSignature() {
        return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
    }
}
