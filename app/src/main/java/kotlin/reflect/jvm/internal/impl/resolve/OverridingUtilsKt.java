package kotlin.reflect.jvm.internal.impl.resolve;

import android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: overridingUtils.kt */
/* loaded from: classes3.dex */
public final class OverridingUtilsKt {
    /* renamed from: a */
    public static final <D extends CallableDescriptor> void m33511a(@NotNull Collection<D> collection) {
        Collection<?> m33512b = m33512b(collection, new Function1<D, D>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$retainMostSpecificInEachOverridableGroup$newResult$1
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                CallableDescriptor receiver$0 = (CallableDescriptor) obj;
                Intrinsics.m32180i(receiver$0, "receiver$0");
                return receiver$0;
            }
        });
        if (collection.size() == m33512b.size()) {
            return;
        }
        collection.retainAll(m33512b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: b */
    public static final <H> Collection<H> m33512b(@NotNull Collection<? extends H> receiver$0, @NotNull Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(descriptorByHandle, "descriptorByHandle");
        if (receiver$0.size() <= 1) {
            return receiver$0;
        }
        LinkedList linkedList = new LinkedList(receiver$0);
        SmartSet m33786a = SmartSet.f66512d.m33786a();
        while (!linkedList.isEmpty()) {
            Object m32044u = CollectionsKt.m32044u(linkedList);
            final SmartSet m33786a2 = SmartSet.f66512d.m33786a();
            Collection m33495f = OverridingUtil.m33495f(m32044u, linkedList, descriptorByHandle, new Function1<H, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Object it) {
                    SmartSet smartSet = SmartSet.this;
                    Intrinsics.m32175d(it, "it");
                    smartSet.add(it);
                    return Unit.f63088a;
                }
            });
            ArrayList arrayList = (ArrayList) m33495f;
            if (arrayList.size() == 1 && m33786a2.isEmpty()) {
                Object m32010W = CollectionsKt.m32010W(m33495f);
                Intrinsics.m32175d(m32010W, "overridableGroup.single()");
                m33786a.add(m32010W);
            } else {
                R.array arrayVar = (Object) OverridingUtil.m33504r(m33495f, descriptorByHandle);
                Intrinsics.m32175d(arrayVar, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                CallableDescriptor invoke = descriptorByHandle.invoke(arrayVar);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    R.array it2 = (Object) it.next();
                    Intrinsics.m32175d(it2, "it");
                    if (!OverridingUtil.m33499j(invoke, descriptorByHandle.invoke(it2))) {
                        m33786a2.add(it2);
                    }
                }
                if (!m33786a2.isEmpty()) {
                    m33786a.addAll(m33786a2);
                }
                m33786a.add(arrayVar);
            }
        }
        return m33786a;
    }
}
