package io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import io.grpc.LoadBalancerProvider;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ServiceConfigUtil {

    public static final class LbConfig {

        /* renamed from: a */
        public final String f59139a;

        /* renamed from: b */
        public final Map<String, ?> f59140b;

        public boolean equals(Object obj) {
            if (!(obj instanceof LbConfig)) {
                return false;
            }
            LbConfig lbConfig = (LbConfig) obj;
            return this.f59139a.equals(lbConfig.f59139a) && this.f59140b.equals(lbConfig.f59140b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f59139a, this.f59140b});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("policyName", this.f59139a);
            m11166b.m11171e("rawConfigValue", this.f59140b);
            return m11166b.toString();
        }
    }

    public static final class PolicySelection {

        /* renamed from: a */
        public final LoadBalancerProvider f59141a;

        /* renamed from: b */
        @Nullable
        public final Object f59142b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PolicySelection.class != obj.getClass()) {
                return false;
            }
            PolicySelection policySelection = (PolicySelection) obj;
            return Objects.m11173a(this.f59141a, policySelection.f59141a) && Objects.m11173a(this.f59142b, policySelection.f59142b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f59141a, this.f59142b});
        }

        public String toString() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("provider", this.f59141a);
            m11166b.m11171e("config", this.f59142b);
            return m11166b.toString();
        }
    }
}
