package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.C0000a;

@ExperimentalApi
/* loaded from: classes3.dex */
public final class EquivalentAddressGroup {

    /* renamed from: d */
    @ExperimentalApi
    public static final Attributes.Key<String> f58134d = new Attributes.Key<>("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: a */
    public final List<SocketAddress> f58135a;

    /* renamed from: b */
    public final Attributes f58136b;

    /* renamed from: c */
    public final int f58137c;

    @ExperimentalApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Attr {
    }

    public EquivalentAddressGroup(List<SocketAddress> list, Attributes attributes) {
        Preconditions.m11179c(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f58135a = unmodifiableList;
        Preconditions.m11187k(attributes, "attrs");
        this.f58136b = attributes;
        this.f58137c = unmodifiableList.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof EquivalentAddressGroup)) {
            return false;
        }
        EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup) obj;
        if (this.f58135a.size() != equivalentAddressGroup.f58135a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f58135a.size(); i2++) {
            if (!this.f58135a.get(i2).equals(equivalentAddressGroup.f58135a.get(i2))) {
                return false;
            }
        }
        return this.f58136b.equals(equivalentAddressGroup.f58136b);
    }

    public int hashCode() {
        return this.f58137c;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("[");
        m24u.append(this.f58135a);
        m24u.append("/");
        m24u.append(this.f58136b);
        m24u.append("]");
        return m24u.toString();
    }
}
