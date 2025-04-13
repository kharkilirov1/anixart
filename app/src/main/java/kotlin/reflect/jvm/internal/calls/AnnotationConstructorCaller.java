package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "CallMode", "Origin", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class AnnotationConstructorCaller implements Caller {

    /* renamed from: a */
    @NotNull
    public final List<Type> f63644a;

    /* renamed from: b */
    public final List<Class<?>> f63645b;

    /* renamed from: c */
    public final List<Object> f63646c;

    /* renamed from: d */
    public final Class<?> f63647d;

    /* renamed from: e */
    public final List<String> f63648e;

    /* renamed from: f */
    public final CallMode f63649f;

    /* renamed from: g */
    public final List<Method> f63650g;

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "JAVA", "KOTLIN", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public AnnotationConstructorCaller(@NotNull Class<?> jClass, @NotNull List<String> parameterNames, @NotNull CallMode callMode, @NotNull Origin origin, @NotNull List<Method> methods) {
        Intrinsics.m32180i(jClass, "jClass");
        Intrinsics.m32180i(parameterNames, "parameterNames");
        Intrinsics.m32180i(callMode, "callMode");
        Intrinsics.m32180i(origin, "origin");
        Intrinsics.m32180i(methods, "methods");
        this.f63647d = jClass;
        this.f63648e = parameterNames;
        this.f63649f = callMode;
        this.f63650g = methods;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(methods, 10));
        Iterator<T> it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f63644a = arrayList;
        List<Method> list = this.f63650g;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            Intrinsics.m32175d(it3, "it");
            List<KClass<? extends Object>> list2 = ReflectClassUtilKt.f66541a;
            Class<? extends Object> cls = ReflectClassUtilKt.f66543c.get(it3);
            if (cls != null) {
                it3 = cls;
            }
            arrayList2.add(it3);
        }
        this.f63645b = arrayList2;
        List<Method> list3 = this.f63650g;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Method) it4.next()).getDefaultValue());
        }
        this.f63646c = arrayList3;
        if (this.f63649f == CallMode.POSITIONAL_CALL && origin == Origin.JAVA) {
            List<String> list4 = this.f63648e;
            Intrinsics.m32179h(list4, "<this>");
            ArrayList arrayList4 = new ArrayList(CollectionsKt.m32032m(list4, 10));
            Iterator<T> it5 = list4.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (!z && Intrinsics.m32174c(next, "value")) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList4.add(next);
                }
            }
            if (!arrayList4.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* renamed from: a */
    public List<Type> mo32328a() {
        return this.f63644a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r7.isInstance(r5) != false) goto L38;
     */
    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object call(@org.jetbrains.annotations.NotNull java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public /* bridge */ /* synthetic */ Member getMember() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    /* renamed from: getReturnType */
    public Type getF63674c() {
        return this.f63647d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r9, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r10, java.util.List r11, int r12) {
        /*
            r6 = this;
            r11 = r12 & 16
            if (r11 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.CollectionsKt.m32032m(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r0, r1)
            r11.add(r0)
            goto L13
        L2a:
            r11 = 0
        L2b:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.<init>(java.lang.Class, java.util.List, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin, java.util.List, int):void");
    }
}
