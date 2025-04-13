package kotlin.ranges;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Progressions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/ranges/CharProgression;", "", "", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public class CharProgression implements Iterable<Character>, KMappedMarker {

    /* renamed from: b */
    public final char f63373b;

    /* renamed from: c */
    public final char f63374c;

    /* renamed from: d */
    public final int f63375d;

    /* compiled from: Progressions.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public CharProgression(char c2, char c3, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f63373b = c2;
        this.f63374c = (char) ProgressionUtilKt.m32132a(c2, c3, i2);
        this.f63375d = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CharProgression) {
            if (!isEmpty() || !((CharProgression) obj).isEmpty()) {
                CharProgression charProgression = (CharProgression) obj;
                if (this.f63373b != charProgression.f63373b || this.f63374c != charProgression.f63374c || this.f63375d != charProgression.f63375d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f63373b * 31) + this.f63374c) * 31) + this.f63375d;
    }

    public boolean isEmpty() {
        if (this.f63375d > 0) {
            if (Intrinsics.m32181j(this.f63373b, this.f63374c) > 0) {
                return true;
            }
        } else if (Intrinsics.m32181j(this.f63373b, this.f63374c) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new CharProgressionIterator(this.f63373b, this.f63374c, this.f63375d);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f63375d > 0) {
            sb = new StringBuilder();
            sb.append(this.f63373b);
            sb.append("..");
            sb.append(this.f63374c);
            sb.append(" step ");
            i2 = this.f63375d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f63373b);
            sb.append(" downTo ");
            sb.append(this.f63374c);
            sb.append(" step ");
            i2 = -this.f63375d;
        }
        sb.append(i2);
        return sb.toString();
    }
}
