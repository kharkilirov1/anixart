package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.OrderBy;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.FieldPath;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.p012v1.Value;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class Query {

    /* renamed from: k */
    public static final OrderBy f22726k;

    /* renamed from: l */
    public static final OrderBy f22727l;

    /* renamed from: a */
    public final List<OrderBy> f22728a;

    /* renamed from: b */
    public List<OrderBy> f22729b;

    /* renamed from: c */
    @Nullable
    public Target f22730c;

    /* renamed from: d */
    public final List<Filter> f22731d;

    /* renamed from: e */
    public final ResourcePath f22732e;

    /* renamed from: f */
    @Nullable
    public final String f22733f;

    /* renamed from: g */
    public final long f22734g;

    /* renamed from: h */
    public final LimitType f22735h;

    /* renamed from: i */
    @Nullable
    public final Bound f22736i;

    /* renamed from: j */
    @Nullable
    public final Bound f22737j;

    public enum LimitType {
        LIMIT_TO_FIRST,
        /* JADX INFO: Fake field, exist only in values array */
        LIMIT_TO_LAST
    }

    public static class QueryComparator implements Comparator<Document> {

        /* renamed from: b */
        public final List<OrderBy> f22740b;

        @Override // java.util.Comparator
        public int compare(Document document, Document document2) {
            int i2;
            int i3;
            int m12459c;
            Document document3 = document;
            Document document4 = document2;
            Iterator<OrderBy> it = this.f22740b.iterator();
            do {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                OrderBy next = it.next();
                if (next.f22721b.equals(FieldPath.f22858c)) {
                    i3 = next.f22720a.f22725b;
                    m12459c = document3.getKey().compareTo(document4.getKey());
                } else {
                    Value mo12439c = document3.mo12439c(next.f22721b);
                    Value mo12439c2 = document4.mo12439c(next.f22721b);
                    Assert.m12490b((mo12439c == null || mo12439c2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
                    i3 = next.f22720a.f22725b;
                    m12459c = Values.m12459c(mo12439c, mo12439c2);
                }
                i2 = m12459c * i3;
            } while (i2 == 0);
            return i2;
        }
    }

    static {
        OrderBy.Direction direction = OrderBy.Direction.ASCENDING;
        FieldPath fieldPath = FieldPath.f22858c;
        f22726k = new OrderBy(direction, fieldPath);
        f22727l = new OrderBy(OrderBy.Direction.DESCENDING, fieldPath);
    }

    /* renamed from: a */
    public FieldPath m12397a() {
        if (this.f22728a.isEmpty()) {
            return null;
        }
        return this.f22728a.get(0).f22721b;
    }

    /* renamed from: b */
    public List<OrderBy> m12398b() {
        FieldPath fieldPath;
        OrderBy.Direction direction;
        OrderBy.Direction direction2 = OrderBy.Direction.ASCENDING;
        if (this.f22729b == null) {
            Iterator<Filter> it = this.f22731d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fieldPath = null;
                    break;
                }
                fieldPath = it.next().mo12392a();
                if (fieldPath != null) {
                    break;
                }
            }
            FieldPath m12397a = m12397a();
            boolean z = false;
            if (fieldPath == null || m12397a != null) {
                ArrayList arrayList = new ArrayList();
                for (OrderBy orderBy : this.f22728a) {
                    arrayList.add(orderBy);
                    if (orderBy.f22721b.equals(FieldPath.f22858c)) {
                        z = true;
                    }
                }
                if (!z) {
                    if (this.f22728a.size() > 0) {
                        List<OrderBy> list = this.f22728a;
                        direction = list.get(list.size() - 1).f22720a;
                    } else {
                        direction = direction2;
                    }
                    arrayList.add(direction.equals(direction2) ? f22726k : f22727l);
                }
                this.f22729b = arrayList;
            } else if (fieldPath.m12447l()) {
                this.f22729b = Collections.singletonList(f22726k);
            } else {
                this.f22729b = Arrays.asList(new OrderBy(direction2, fieldPath), f22726k);
            }
        }
        return this.f22729b;
    }

    /* renamed from: c */
    public Target m12399c() {
        if (this.f22730c == null) {
            if (this.f22735h == LimitType.LIMIT_TO_FIRST) {
                this.f22730c = new Target(this.f22732e, this.f22733f, this.f22731d, m12398b(), this.f22734g, this.f22736i, this.f22737j);
            } else {
                ArrayList arrayList = new ArrayList();
                for (OrderBy orderBy : m12398b()) {
                    OrderBy.Direction direction = orderBy.f22720a;
                    OrderBy.Direction direction2 = OrderBy.Direction.DESCENDING;
                    if (direction == direction2) {
                        direction2 = OrderBy.Direction.ASCENDING;
                    }
                    arrayList.add(new OrderBy(direction2, orderBy.f22721b));
                }
                Bound bound = this.f22737j;
                Bound bound2 = bound != null ? new Bound(bound.f22678b, bound.f22677a) : null;
                Bound bound3 = this.f22736i;
                this.f22730c = new Target(this.f22732e, this.f22733f, this.f22731d, arrayList, this.f22734g, bound2, bound3 != null ? new Bound(bound3.f22678b, bound3.f22677a) : null);
            }
        }
        return this.f22730c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Query.class != obj.getClass()) {
            return false;
        }
        Query query = (Query) obj;
        if (this.f22735h != query.f22735h) {
            return false;
        }
        return m12399c().equals(query.m12399c());
    }

    public int hashCode() {
        return this.f22735h.hashCode() + (m12399c().hashCode() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Query(target=");
        m24u.append(m12399c().toString());
        m24u.append(";limitType=");
        m24u.append(this.f22735h.toString());
        m24u.append(")");
        return m24u.toString();
    }
}
