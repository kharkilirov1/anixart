package kotlin.reflect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KMutableProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: KProperty.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/KMutableProperty0;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/KMutableProperty;", "Setter", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface KMutableProperty0<V> extends KProperty0<V>, KMutableProperty<V> {

    /* compiled from: KProperty.kt */
    @Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/KMutableProperty0$Setter;", "V", "Lkotlin/reflect/KMutableProperty$Setter;", "Lkotlin/Function1;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Setter<V> extends KMutableProperty.Setter<V>, Function1<V, Unit> {
    }

    @NotNull
    /* renamed from: getSetter */
    Setter<V> mo35059getSetter();
}
