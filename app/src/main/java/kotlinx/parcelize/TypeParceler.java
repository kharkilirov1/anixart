package kotlinx.parcelize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.Repeatable;
import kotlinx.parcelize.Parceler;

/* compiled from: TypeParceler.kt */
@Target({ElementType.TYPE})
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00010\u00032\u00020\u0004B\u0000¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/parcelize/TypeParceler;", "T", "P", "Lkotlinx/parcelize/Parceler;", "", "parcelize-runtime"}, m31885k = 1, m31886mv = {1, 4, 1}, m31888xi = 48)
@Repeatable
@kotlin.annotation.Target
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention
/* loaded from: classes3.dex */
public @interface TypeParceler<T, P extends Parceler<? super T>> {
}
