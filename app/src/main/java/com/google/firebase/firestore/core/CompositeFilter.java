package com.google.firebase.firestore.core;

import android.text.TextUtils;
import com.google.firebase.firestore.model.FieldPath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CompositeFilter extends Filter {

    /* renamed from: a */
    public final List<Filter> f22679a;

    /* renamed from: b */
    public final Operator f22680b;

    /* renamed from: c */
    public List<FieldFilter> f22681c;

    public enum Operator {
        AND("and"),
        OR("or");


        /* renamed from: b */
        public final String f22685b;

        Operator(String str) {
            this.f22685b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f22685b;
        }
    }

    @Override // com.google.firebase.firestore.core.Filter
    /* renamed from: a */
    public FieldPath mo12392a() {
        FieldFilter fieldFilter;
        Iterator<FieldFilter> it = mo12393b().iterator();
        while (true) {
            if (!it.hasNext()) {
                fieldFilter = null;
                break;
            }
            fieldFilter = it.next();
            if (Boolean.valueOf(fieldFilter.m12396d()).booleanValue()) {
                break;
            }
        }
        if (fieldFilter != null) {
            return fieldFilter.f22697c;
        }
        return null;
    }

    @Override // com.google.firebase.firestore.core.Filter
    /* renamed from: b */
    public List<FieldFilter> mo12393b() {
        List<FieldFilter> list = this.f22681c;
        if (list != null) {
            return list;
        }
        this.f22681c = new ArrayList();
        Iterator<Filter> it = this.f22679a.iterator();
        while (it.hasNext()) {
            this.f22681c.addAll(it.next().mo12393b());
        }
        return this.f22681c;
    }

    /* renamed from: c */
    public String m12394c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22680b.f22685b + "(");
        sb.append(TextUtils.join(",", this.f22679a));
        sb.append(")");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CompositeFilter)) {
            return false;
        }
        CompositeFilter compositeFilter = (CompositeFilter) obj;
        return this.f22680b == compositeFilter.f22680b && this.f22679a.equals(compositeFilter.f22679a);
    }

    public int hashCode() {
        return this.f22679a.hashCode() + ((this.f22680b.hashCode() + 1147) * 31);
    }

    public String toString() {
        return m12394c();
    }
}
