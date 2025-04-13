package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes3.dex */
final class SignatureEnhancementBuilder {

    /* renamed from: a */
    public final Map<String, PredefinedFunctionEnhancementInfo> f64728a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class ClassEnhancementBuilder {

        /* renamed from: a */
        @NotNull
        public final String f64729a;

        /* renamed from: b */
        public final /* synthetic */ SignatureEnhancementBuilder f64730b;

        /* compiled from: predefinedEnhancementInfo.kt */
        public final class FunctionEnhancementBuilder {

            /* renamed from: a */
            public final List<Pair<String, TypeEnhancementInfo>> f64731a = new ArrayList();

            /* renamed from: b */
            public Pair<String, TypeEnhancementInfo> f64732b = new Pair<>("V", null);

            /* renamed from: c */
            @NotNull
            public final String f64733c;

            public FunctionEnhancementBuilder(String str) {
                this.f64733c = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public final void m32856a(@NotNull String type, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                TypeEnhancementInfo typeEnhancementInfo;
                Intrinsics.m32180i(type, "type");
                List<Pair<String, TypeEnhancementInfo>> list = this.f64731a;
                if (javaTypeQualifiersArr.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable m31956f0 = ArraysKt.m31956f0(javaTypeQualifiersArr);
                    int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(m31956f0, 10));
                    if (m32062g < 16) {
                        m32062g = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
                    Iterator it = ((IndexingIterable) m31956f0).iterator();
                    while (true) {
                        IndexingIterator indexingIterator = (IndexingIterator) it;
                        if (!indexingIterator.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f63147a), (JavaTypeQualifiers) indexedValue.f63148b);
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(new Pair<>(type, typeEnhancementInfo));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public final void m32857b(@NotNull String type, @NotNull JavaTypeQualifiers... javaTypeQualifiersArr) {
                Intrinsics.m32180i(type, "type");
                Iterable m31956f0 = ArraysKt.m31956f0(javaTypeQualifiersArr);
                int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(m31956f0, 10));
                if (m32062g < 16) {
                    m32062g = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g);
                Iterator it = ((IndexingIterable) m31956f0).iterator();
                while (true) {
                    IndexingIterator indexingIterator = (IndexingIterator) it;
                    if (!indexingIterator.hasNext()) {
                        this.f64732b = new Pair<>(type, new TypeEnhancementInfo(linkedHashMap));
                        return;
                    } else {
                        IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                        linkedHashMap.put(Integer.valueOf(indexedValue.f63147a), (JavaTypeQualifiers) indexedValue.f63148b);
                    }
                }
            }

            /* renamed from: c */
            public final void m32858c(@NotNull JvmPrimitiveType type) {
                Intrinsics.m32180i(type, "type");
                this.f64732b = new Pair<>(type.f65956d, null);
            }
        }

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, @NotNull String className) {
            Intrinsics.m32180i(className, "className");
            this.f64730b = signatureEnhancementBuilder;
            this.f64729a = className;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m32855a(@NotNull String str, @NotNull Function1<? super FunctionEnhancementBuilder, Unit> function1) {
            Map<String, PredefinedFunctionEnhancementInfo> map = this.f64730b.f64728a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(str);
            function1.invoke(functionEnhancementBuilder);
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f64806a;
            String str2 = this.f64729a;
            List<Pair<String, TypeEnhancementInfo>> list = functionEnhancementBuilder.f64731a;
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Pair) it.next()).f63055b);
            }
            String m32941j = signatureBuildingComponents.m32941j(str2, signatureBuildingComponents.m32940i(str, arrayList, functionEnhancementBuilder.f64732b.f63055b));
            TypeEnhancementInfo typeEnhancementInfo = functionEnhancementBuilder.f64732b.f63056c;
            List<Pair<String, TypeEnhancementInfo>> list2 = functionEnhancementBuilder.f64731a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).f63056c);
            }
            map.put(m32941j, new PredefinedFunctionEnhancementInfo(typeEnhancementInfo, arrayList2));
        }
    }
}
