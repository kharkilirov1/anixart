package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class GeneralRange<T> implements Serializable {

    /* renamed from: b */
    public final Comparator<? super T> f20986b;

    /* renamed from: c */
    public final boolean f20987c;

    /* renamed from: d */
    @NullableDecl
    public final T f20988d;

    /* renamed from: e */
    public final BoundType f20989e;

    /* renamed from: f */
    public final boolean f20990f;

    /* renamed from: g */
    @NullableDecl
    public final T f20991g;

    /* renamed from: h */
    public final BoundType f20992h;

    /* JADX WARN: Multi-variable type inference failed */
    public GeneralRange(Comparator<? super T> comparator, boolean z, @NullableDecl T t, BoundType boundType, boolean z2, @NullableDecl T t2, BoundType boundType2) {
        Objects.requireNonNull(comparator);
        this.f20986b = comparator;
        this.f20987c = z;
        this.f20990f = z2;
        this.f20988d = t;
        Objects.requireNonNull(boundType);
        this.f20989e = boundType;
        this.f20991g = t2;
        Objects.requireNonNull(boundType2);
        this.f20992h = boundType2;
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            Preconditions.m11185i(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                Preconditions.m11178b((boundType != boundType3) | (boundType2 != boundType3));
            }
        }
    }

    /* renamed from: a */
    public boolean m11575a(@NullableDecl T t) {
        return (m11578d(t) || m11577c(t)) ? false : true;
    }

    /* renamed from: b */
    public GeneralRange<T> m11576b(GeneralRange<T> generalRange) {
        int compare;
        int compare2;
        T t;
        BoundType boundType;
        BoundType boundType2;
        int compare3;
        BoundType boundType3 = BoundType.OPEN;
        Preconditions.m11178b(this.f20986b.equals(generalRange.f20986b));
        boolean z = this.f20987c;
        T t2 = this.f20988d;
        BoundType boundType4 = this.f20989e;
        if (!z) {
            z = generalRange.f20987c;
            t2 = generalRange.f20988d;
            boundType4 = generalRange.f20989e;
        } else if (generalRange.f20987c && ((compare = this.f20986b.compare(t2, generalRange.f20988d)) < 0 || (compare == 0 && generalRange.f20989e == boundType3))) {
            t2 = generalRange.f20988d;
            boundType4 = generalRange.f20989e;
        }
        boolean z2 = z;
        boolean z3 = this.f20990f;
        T t3 = this.f20991g;
        BoundType boundType5 = this.f20992h;
        if (!z3) {
            z3 = generalRange.f20990f;
            t3 = generalRange.f20991g;
            boundType5 = generalRange.f20992h;
        } else if (generalRange.f20990f && ((compare2 = this.f20986b.compare(t3, generalRange.f20991g)) > 0 || (compare2 == 0 && generalRange.f20992h == boundType3))) {
            t3 = generalRange.f20991g;
            boundType5 = generalRange.f20992h;
        }
        boolean z4 = z3;
        T t4 = t3;
        if (z2 && z4 && ((compare3 = this.f20986b.compare(t2, t4)) > 0 || (compare3 == 0 && boundType4 == boundType3 && boundType5 == boundType3))) {
            boundType2 = BoundType.CLOSED;
            boundType = boundType3;
            t = t4;
        } else {
            t = t2;
            boundType = boundType4;
            boundType2 = boundType5;
        }
        return new GeneralRange<>(this.f20986b, z2, t, boundType, z4, t4, boundType2);
    }

    /* renamed from: c */
    public boolean m11577c(@NullableDecl T t) {
        if (!this.f20990f) {
            return false;
        }
        int compare = this.f20986b.compare(t, this.f20991g);
        return ((compare == 0) & (this.f20992h == BoundType.OPEN)) | (compare > 0);
    }

    /* renamed from: d */
    public boolean m11578d(@NullableDecl T t) {
        if (!this.f20987c) {
            return false;
        }
        int compare = this.f20986b.compare(t, this.f20988d);
        return ((compare == 0) & (this.f20989e == BoundType.OPEN)) | (compare < 0);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        return this.f20986b.equals(generalRange.f20986b) && this.f20987c == generalRange.f20987c && this.f20990f == generalRange.f20990f && this.f20989e.equals(generalRange.f20989e) && this.f20992h.equals(generalRange.f20992h) && com.google.common.base.Objects.m11173a(this.f20988d, generalRange.f20988d) && com.google.common.base.Objects.m11173a(this.f20991g, generalRange.f20991g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20986b, this.f20988d, this.f20989e, this.f20991g, this.f20992h});
    }

    public String toString() {
        String valueOf = String.valueOf(this.f20986b);
        BoundType boundType = this.f20989e;
        BoundType boundType2 = BoundType.CLOSED;
        char c2 = boundType == boundType2 ? '[' : '(';
        String valueOf2 = String.valueOf(this.f20987c ? this.f20988d : "-∞");
        String valueOf3 = String.valueOf(this.f20990f ? this.f20991g : "∞");
        char c3 = this.f20992h == boundType2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(valueOf3.length() + valueOf2.length() + valueOf.length() + 4);
        sb.append(valueOf);
        sb.append(":");
        sb.append(c2);
        sb.append(valueOf2);
        sb.append(',');
        sb.append(valueOf3);
        sb.append(c3);
        return sb.toString();
    }
}
