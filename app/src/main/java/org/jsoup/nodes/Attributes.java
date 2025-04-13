package org.jsoup.nodes;

import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

/* loaded from: classes3.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {

    /* renamed from: b */
    public int f68952b = 0;

    /* renamed from: c */
    public String[] f68953c = new String[3];

    /* renamed from: d */
    public Object[] f68954d = new Object[3];

    public static class Dataset extends AbstractMap<String, String> {

        /* renamed from: b */
        public static final /* synthetic */ int f68957b = 0;

        public class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            public DatasetIterator(C68751 c68751) {
                int i2 = Dataset.f68957b;
                Objects.requireNonNull(Dataset.this);
                throw null;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public Map.Entry<String, String> next() {
                throw null;
            }

            @Override // java.util.Iterator
            public void remove() {
                Dataset dataset = Dataset.this;
                int i2 = Dataset.f68957b;
                Objects.requireNonNull(dataset);
                throw null;
            }
        }

        public class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            public EntrySet(C68751 c68751) {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                Dataset.this.new DatasetIterator(null);
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Dataset.this.new DatasetIterator(null);
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new EntrySet(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            throw null;
        }
    }

    /* renamed from: D */
    public static String m34712D(String str) {
        return JsonPointer.SEPARATOR + str;
    }

    /* renamed from: e */
    public static String m34713e(@Nullable Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* renamed from: E */
    public final boolean m34714E(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* renamed from: F */
    public Attributes m34715F(String str, @Nullable String str2) {
        Validate.m34694g(str);
        int m34728y = m34728y(str);
        if (m34728y != -1) {
            this.f68954d[m34728y] = str2;
        } else {
            m34719b(str, str2);
        }
        return this;
    }

    /* renamed from: G */
    public Attributes m34716G(Attribute attribute) {
        Validate.m34694g(attribute);
        m34715F(attribute.f68949b, attribute.getValue());
        attribute.f68951d = this;
        return this;
    }

    /* renamed from: H */
    public final void m34717H(int i2) {
        Validate.m34688a(i2 >= this.f68952b);
        int i3 = (this.f68952b - i2) - 1;
        if (i3 > 0) {
            String[] strArr = this.f68953c;
            int i4 = i2 + 1;
            System.arraycopy(strArr, i4, strArr, i2, i3);
            Object[] objArr = this.f68954d;
            System.arraycopy(objArr, i4, objArr, i2, i3);
        }
        int i5 = this.f68952b - 1;
        this.f68952b = i5;
        this.f68953c[i5] = null;
        this.f68954d[i5] = null;
    }

    /* renamed from: a */
    public void m34718a(Attributes attributes) {
        int i2 = attributes.f68952b;
        if (i2 == 0) {
            return;
        }
        m34720d(this.f68952b + i2);
        boolean z = this.f68952b != 0;
        Iterator<Attribute> it = attributes.iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            if (z) {
                m34716G(next);
            } else {
                m34719b(next.f68949b, next.getValue());
            }
        }
    }

    /* renamed from: b */
    public final void m34719b(String str, @Nullable Object obj) {
        m34720d(this.f68952b + 1);
        String[] strArr = this.f68953c;
        int i2 = this.f68952b;
        strArr[i2] = str;
        this.f68954d[i2] = obj;
        this.f68952b = i2 + 1;
    }

    /* renamed from: d */
    public final void m34720d(int i2) {
        Validate.m34690c(i2 >= this.f68952b);
        String[] strArr = this.f68953c;
        int length = strArr.length;
        if (length >= i2) {
            return;
        }
        int i3 = length >= 3 ? this.f68952b * 2 : 3;
        if (i2 <= i3) {
            i2 = i3;
        }
        this.f68953c = (String[]) Arrays.copyOf(strArr, i2);
        this.f68954d = Arrays.copyOf(this.f68954d, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.f68952b != attributes.f68952b) {
            return false;
        }
        for (int i2 = 0; i2 < this.f68952b; i2++) {
            int m34728y = attributes.m34728y(this.f68953c[i2]);
            if (m34728y == -1) {
                return false;
            }
            Object obj2 = this.f68954d[i2];
            Object obj3 = attributes.f68954d[m34728y];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Attributes clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.f68952b = this.f68952b;
            attributes.f68953c = (String[]) Arrays.copyOf(this.f68953c, this.f68952b);
            attributes.f68954d = Arrays.copyOf(this.f68954d, this.f68952b);
            return attributes;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: g */
    public int m34722g(ParseSettings parseSettings) {
        int i2 = 0;
        if (this.f68952b == 0) {
            return 0;
        }
        boolean z = parseSettings.f69121b;
        int i3 = 0;
        while (i2 < this.f68953c.length) {
            int i4 = i2 + 1;
            int i5 = i4;
            while (true) {
                Object[] objArr = this.f68953c;
                if (i5 < objArr.length && objArr[i5] != null) {
                    if (!z || !objArr[i2].equals(objArr[i5])) {
                        if (!z) {
                            String[] strArr = this.f68953c;
                            if (!strArr[i2].equalsIgnoreCase(strArr[i5])) {
                            }
                        }
                        i5++;
                    }
                    i3++;
                    m34717H(i5);
                    i5--;
                    i5++;
                }
            }
            i2 = i4;
        }
        return i3;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f68954d) + (((this.f68952b * 31) + Arrays.hashCode(this.f68953c)) * 31);
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
        return new Iterator<Attribute>() { // from class: org.jsoup.nodes.Attributes.1

            /* renamed from: b */
            public int f68955b = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (true) {
                    int i2 = this.f68955b;
                    Attributes attributes = Attributes.this;
                    if (i2 >= attributes.f68952b || !attributes.m34714E(attributes.f68953c[i2])) {
                        break;
                    }
                    this.f68955b++;
                }
                return this.f68955b < Attributes.this.f68952b;
            }

            @Override // java.util.Iterator
            public Attribute next() {
                Attributes attributes = Attributes.this;
                String[] strArr = attributes.f68953c;
                int i2 = this.f68955b;
                Attribute attribute = new Attribute(strArr[i2], (String) attributes.f68954d[i2], attributes);
                this.f68955b++;
                return attribute;
            }

            @Override // java.util.Iterator
            public void remove() {
                Attributes attributes = Attributes.this;
                int i2 = this.f68955b - 1;
                this.f68955b = i2;
                attributes.m34717H(i2);
            }
        };
    }

    /* renamed from: r */
    public String m34723r(String str) {
        int m34728y = m34728y(str);
        return m34728y == -1 ? "" : m34713e(this.f68954d[m34728y]);
    }

    /* renamed from: s */
    public String m34724s(String str) {
        int m34729z = m34729z(str);
        return m34729z == -1 ? "" : m34713e(this.f68954d[m34729z]);
    }

    /* renamed from: t */
    public boolean m34725t(String str) {
        return m34728y(str) != -1;
    }

    public String toString() {
        StringBuilder m34700b = StringUtil.m34700b();
        try {
            m34727x(m34700b, new Document("").f68960k);
            return StringUtil.m34705g(m34700b);
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }

    /* renamed from: u */
    public boolean m34726u(String str) {
        return m34729z(str) != -1;
    }

    /* renamed from: x */
    public final void m34727x(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        String m34708a;
        int i2 = this.f68952b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (!m34714E(this.f68953c[i3]) && (m34708a = Attribute.m34708a(this.f68953c[i3], outputSettings.f68971i)) != null) {
                Attribute.m34709c(m34708a, (String) this.f68954d[i3], appendable.append(' '), outputSettings);
            }
        }
    }

    /* renamed from: y */
    public int m34728y(String str) {
        Validate.m34694g(str);
        for (int i2 = 0; i2 < this.f68952b; i2++) {
            if (str.equals(this.f68953c[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public final int m34729z(String str) {
        Validate.m34694g(str);
        for (int i2 = 0; i2 < this.f68952b; i2++) {
            if (str.equalsIgnoreCase(this.f68953c[i2])) {
                return i2;
            }
        }
        return -1;
    }
}
