package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.Values;
import com.google.firestore.p012v1.Value;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class FieldFilter extends Filter {

    /* renamed from: a */
    public final Operator f22695a;

    /* renamed from: b */
    public final Value f22696b;

    /* renamed from: c */
    public final FieldPath f22697c;

    /* renamed from: com.google.firebase.firestore.core.FieldFilter$1 */
    public static /* synthetic */ class C20861 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22698a;

        static {
            int[] iArr = new int[Operator.values().length];
            f22698a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22698a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22698a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22698a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22698a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22698a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Operator {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");


        /* renamed from: b */
        public final String f22710b;

        Operator(String str) {
            this.f22710b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f22710b;
        }
    }

    @Override // com.google.firebase.firestore.core.Filter
    /* renamed from: a */
    public FieldPath mo12392a() {
        if (m12396d()) {
            return this.f22697c;
        }
        return null;
    }

    @Override // com.google.firebase.firestore.core.Filter
    /* renamed from: b */
    public List<FieldFilter> mo12393b() {
        return Collections.singletonList(this);
    }

    /* renamed from: c */
    public String m12395c() {
        return this.f22697c.mo12428b() + this.f22695a.f22710b + Values.m12457a(this.f22696b);
    }

    /* renamed from: d */
    public boolean m12396d() {
        return Arrays.asList(Operator.LESS_THAN, Operator.LESS_THAN_OR_EQUAL, Operator.GREATER_THAN, Operator.GREATER_THAN_OR_EQUAL, Operator.NOT_EQUAL, Operator.NOT_IN).contains(this.f22695a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FieldFilter)) {
            return false;
        }
        FieldFilter fieldFilter = (FieldFilter) obj;
        return this.f22695a == fieldFilter.f22695a && this.f22697c.equals(fieldFilter.f22697c) && this.f22696b.equals(fieldFilter.f22696b);
    }

    public int hashCode() {
        return this.f22696b.hashCode() + ((this.f22697c.hashCode() + ((this.f22695a.hashCode() + 1147) * 31)) * 31);
    }

    public String toString() {
        return m12395c();
    }
}
