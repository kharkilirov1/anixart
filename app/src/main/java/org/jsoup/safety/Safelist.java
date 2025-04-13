package org.jsoup.safety;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class Safelist {

    /* renamed from: a */
    public final Set<TagName> f69280a = new HashSet();

    /* renamed from: b */
    public final Map<TagName, Set<AttributeKey>> f69281b = new HashMap();

    /* renamed from: c */
    public final Map<TagName, Map<AttributeKey, AttributeValue>> f69282c = new HashMap();

    /* renamed from: d */
    public final Map<TagName, Map<AttributeKey, Set<Protocol>>> f69283d = new HashMap();

    public static class AttributeKey extends TypedValue {
    }

    public static class AttributeValue extends TypedValue {
    }

    public static class Protocol extends TypedValue {
    }

    public static class TagName extends TypedValue {
    }

    public static abstract class TypedValue {

        /* renamed from: a */
        public final String f69284a;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TypedValue typedValue = (TypedValue) obj;
            String str = this.f69284a;
            return str == null ? typedValue.f69284a == null : str.equals(typedValue.f69284a);
        }

        public int hashCode() {
            String str = this.f69284a;
            return 31 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return this.f69284a;
        }
    }
}
