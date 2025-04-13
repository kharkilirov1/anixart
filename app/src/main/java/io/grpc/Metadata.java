package io.grpc;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.p010io.BaseEncoding;
import com.google.common.p010io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import p000a.C0000a;

@NotThreadSafe
/* loaded from: classes3.dex */
public final class Metadata {

    /* renamed from: c */
    public static final Logger f58204c = Logger.getLogger(Metadata.class.getName());

    /* renamed from: d */
    public static final AsciiMarshaller<String> f58205d = new AsciiMarshaller<String>() { // from class: io.grpc.Metadata.2
        @Override // io.grpc.Metadata.AsciiMarshaller
        /* renamed from: a */
        public String mo30908a(String str) {
            return str;
        }

        @Override // io.grpc.Metadata.AsciiMarshaller
        /* renamed from: b */
        public String mo30909b(String str) {
            return str;
        }
    };

    /* renamed from: e */
    public static final BaseEncoding f58206e = BaseEncoding.f21808a.mo12035h();

    /* renamed from: a */
    public Object[] f58207a;

    /* renamed from: b */
    public int f58208b;

    /* renamed from: io.grpc.Metadata$1 */
    public class C63011 implements BinaryMarshaller<byte[]> {
    }

    public static class AsciiKey<T> extends Key<T> {

        /* renamed from: e */
        public final AsciiMarshaller<T> f58209e;

        public AsciiKey(String str, boolean z, AsciiMarshaller asciiMarshaller, C63011 c63011) {
            super(str, z, asciiMarshaller, null);
            Preconditions.m11185i(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            Preconditions.m11187k(asciiMarshaller, "marshaller");
            this.f58209e = asciiMarshaller;
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: c */
        public T mo30910c(byte[] bArr) {
            return this.f58209e.mo30909b(new String(bArr, Charsets.f20502a));
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: d */
        public byte[] mo30911d(T t) {
            return this.f58209e.mo30908a(t).getBytes(Charsets.f20502a);
        }
    }

    public interface AsciiMarshaller<T> {
        /* renamed from: a */
        String mo30908a(T t);

        /* renamed from: b */
        T mo30909b(String str);
    }

    public static class BinaryKey<T> extends Key<T> {
        @Override // io.grpc.Metadata.Key
        /* renamed from: c */
        public T mo30910c(byte[] bArr) {
            throw null;
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: d */
        public byte[] mo30911d(T t) {
            throw null;
        }
    }

    public interface BinaryMarshaller<T> {
    }

    @ExperimentalApi
    public interface BinaryStreamMarshaller<T> {
        /* renamed from: a */
        InputStream m30912a(T t);

        /* renamed from: b */
        T m30913b(InputStream inputStream);
    }

    public final class IterableAt<T> implements Iterable<T> {
        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: io.grpc.Metadata.IterableAt.1

                /* renamed from: b */
                public boolean f58210b = true;

                /* renamed from: c */
                public int f58211c = 0;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f58210b) {
                        return true;
                    }
                    Objects.requireNonNull(IterableAt.this);
                    throw null;
                }

                @Override // java.util.Iterator
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f58210b = false;
                    Objects.requireNonNull(IterableAt.this);
                    this.f58211c++;
                    Objects.requireNonNull(IterableAt.this);
                    Logger logger = Metadata.f58204c;
                    throw null;
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }
    }

    @Immutable
    public static abstract class Key<T> {

        /* renamed from: d */
        public static final BitSet f58213d;

        /* renamed from: a */
        public final String f58214a;

        /* renamed from: b */
        public final byte[] f58215b;

        /* renamed from: c */
        public final Object f58216c;

        static {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
                bitSet.set(c3);
            }
            f58213d = bitSet;
        }

        public Key(String str, boolean z, Object obj, C63011 c63011) {
            Preconditions.m11187k(str, "name");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Preconditions.m11187k(lowerCase, "name");
            Preconditions.m11179c(!lowerCase.isEmpty(), "token must have at least 1 tchar");
            if (lowerCase.equals("connection")) {
                Metadata.f58204c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i2 = 0; i2 < lowerCase.length(); i2++) {
                char charAt = lowerCase.charAt(i2);
                if ((!z || charAt != ':' || i2 != 0) && !f58213d.get(charAt)) {
                    throw new IllegalArgumentException(Strings.m11218b("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
                }
            }
            this.f58214a = lowerCase;
            this.f58215b = lowerCase.getBytes(Charsets.f20502a);
            this.f58216c = obj;
        }

        /* renamed from: a */
        public static <T> Key<T> m30914a(String str, AsciiMarshaller<T> asciiMarshaller) {
            return new AsciiKey(str, false, asciiMarshaller, null);
        }

        /* renamed from: b */
        public static <T> Key<T> m30915b(String str, boolean z, TrustedAsciiMarshaller<T> trustedAsciiMarshaller) {
            return new TrustedAsciiKey(str, z, trustedAsciiMarshaller, null);
        }

        /* renamed from: c */
        public abstract T mo30910c(byte[] bArr);

        /* renamed from: d */
        public abstract byte[] mo30911d(T t);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f58214a.equals(((Key) obj).f58214a);
        }

        public final int hashCode() {
            return this.f58214a.hashCode();
        }

        public String toString() {
            return C0000a.m20q(C0000a.m24u("Key{name='"), this.f58214a, "'}");
        }
    }

    public static class LazyStreamBinaryKey<T> extends Key<T> {
        @Override // io.grpc.Metadata.Key
        /* renamed from: c */
        public T mo30910c(byte[] bArr) {
            new ByteArrayInputStream(bArr);
            throw null;
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: d */
        public byte[] mo30911d(T t) {
            throw null;
        }
    }

    public static final class LazyValue<T> {

        /* renamed from: a */
        public final BinaryStreamMarshaller<T> f58217a;

        /* renamed from: b */
        public final T f58218b;

        /* renamed from: c */
        public volatile byte[] f58219c;

        public LazyValue(BinaryStreamMarshaller<T> binaryStreamMarshaller, T t) {
            this.f58217a = binaryStreamMarshaller;
            this.f58218b = t;
        }

        @Nullable
        /* renamed from: a */
        public static <T> BinaryStreamMarshaller<T> m30916a(Key<T> key) {
            return (BinaryStreamMarshaller) (BinaryStreamMarshaller.class.isInstance(key.f58216c) ? BinaryStreamMarshaller.class.cast(key.f58216c) : null);
        }

        /* renamed from: b */
        public byte[] m30917b() {
            if (this.f58219c == null) {
                synchronized (this) {
                    if (this.f58219c == null) {
                        InputStream m30912a = this.f58217a.m30912a(this.f58218b);
                        Logger logger = Metadata.f58204c;
                        try {
                            this.f58219c = ByteStreams.m12046c(m30912a);
                        } catch (IOException e2) {
                            throw new RuntimeException("failure reading serialized stream", e2);
                        }
                    }
                }
            }
            return this.f58219c;
        }
    }

    public static final class TrustedAsciiKey<T> extends Key<T> {

        /* renamed from: e */
        public final TrustedAsciiMarshaller<T> f58220e;

        public TrustedAsciiKey(String str, boolean z, TrustedAsciiMarshaller trustedAsciiMarshaller, C63011 c63011) {
            super(str, z, trustedAsciiMarshaller, null);
            Preconditions.m11185i(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            Preconditions.m11187k(trustedAsciiMarshaller, "marshaller");
            this.f58220e = trustedAsciiMarshaller;
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: c */
        public T mo30910c(byte[] bArr) {
            return this.f58220e.mo30919b(bArr);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: d */
        public byte[] mo30911d(T t) {
            return this.f58220e.mo30918a(t);
        }
    }

    @Immutable
    public interface TrustedAsciiMarshaller<T> {
        /* renamed from: a */
        byte[] mo30918a(T t);

        /* renamed from: b */
        T mo30919b(byte[] bArr);
    }

    public Metadata(byte[]... bArr) {
        this.f58208b = bArr.length / 2;
        this.f58207a = bArr;
    }

    /* renamed from: a */
    public final int m30896a() {
        Object[] objArr = this.f58207a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @ExperimentalApi
    /* renamed from: b */
    public <T> void m30897b(Key<T> key) {
        if (m30900e()) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f58208b;
            if (i2 >= i4) {
                Arrays.fill(this.f58207a, i3 * 2, i4 * 2, (Object) null);
                this.f58208b = i3;
                return;
            }
            if (!Arrays.equals(key.f58215b, m30902g(i2))) {
                this.f58207a[i3 * 2] = m30902g(i2);
                m30905j(i3, m30904i(i2));
                i3++;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m30898c(int i2) {
        Object[] objArr = new Object[i2];
        if (!m30900e()) {
            System.arraycopy(this.f58207a, 0, objArr, 0, this.f58208b * 2);
        }
        this.f58207a = objArr;
    }

    @Nullable
    /* renamed from: d */
    public <T> T m30899d(Key<T> key) {
        for (int i2 = this.f58208b - 1; i2 >= 0; i2--) {
            if (Arrays.equals(key.f58215b, m30902g(i2))) {
                return (T) m30907l(i2, key);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m30900e() {
        return this.f58208b == 0;
    }

    /* renamed from: f */
    public void m30901f(Metadata metadata) {
        if (metadata.m30900e()) {
            return;
        }
        int m30896a = m30896a() - (this.f58208b * 2);
        if (m30900e() || m30896a < metadata.f58208b * 2) {
            m30898c((this.f58208b * 2) + (metadata.f58208b * 2));
        }
        System.arraycopy(metadata.f58207a, 0, this.f58207a, this.f58208b * 2, metadata.f58208b * 2);
        this.f58208b += metadata.f58208b;
    }

    /* renamed from: g */
    public final byte[] m30902g(int i2) {
        return (byte[]) this.f58207a[i2 * 2];
    }

    /* renamed from: h */
    public <T> void m30903h(Key<T> key, T t) {
        Preconditions.m11187k(key, "key");
        Preconditions.m11187k(t, "value");
        int i2 = this.f58208b * 2;
        if (i2 == 0 || i2 == m30896a()) {
            m30898c(Math.max(this.f58208b * 2 * 2, 8));
        }
        int i3 = this.f58208b;
        int i4 = i3 * 2;
        this.f58207a[i4] = key.f58215b;
        if (key instanceof LazyStreamBinaryKey) {
            BinaryStreamMarshaller m30916a = LazyValue.m30916a(key);
            Objects.requireNonNull(m30916a);
            m30905j(i3, new LazyValue(m30916a, t));
        } else {
            this.f58207a[i4 + 1] = key.mo30911d(t);
        }
        this.f58208b++;
    }

    /* renamed from: i */
    public final Object m30904i(int i2) {
        return this.f58207a[(i2 * 2) + 1];
    }

    /* renamed from: j */
    public final void m30905j(int i2, Object obj) {
        if (this.f58207a instanceof byte[][]) {
            m30898c(m30896a());
        }
        this.f58207a[(i2 * 2) + 1] = obj;
    }

    /* renamed from: k */
    public final byte[] m30906k(int i2) {
        Object obj = this.f58207a[(i2 * 2) + 1];
        return obj instanceof byte[] ? (byte[]) obj : ((LazyValue) obj).m30917b();
    }

    /* renamed from: l */
    public final <T> T m30907l(int i2, Key<T> key) {
        BinaryStreamMarshaller m30916a;
        Object obj = this.f58207a[(i2 * 2) + 1];
        if (obj instanceof byte[]) {
            return key.mo30910c((byte[]) obj);
        }
        LazyValue lazyValue = (LazyValue) obj;
        Objects.requireNonNull(lazyValue);
        Objects.requireNonNull(key);
        return (!(key instanceof LazyStreamBinaryKey) || (m30916a = LazyValue.m30916a(key)) == null) ? key.mo30910c(lazyValue.m30917b()) : (T) m30916a.m30913b(lazyValue.f58217a.m30912a(lazyValue.f58218b));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.f58208b; i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            byte[] m30902g = m30902g(i2);
            Charset charset = Charsets.f20502a;
            String str = new String(m30902g, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f58206e.m12030c(m30906k(i2)));
            } else {
                sb.append(new String(m30906k(i2), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public Metadata() {
    }
}
