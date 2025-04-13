package com.google.common.p010io;

import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.Base64Variants;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import kotlin.KotlinVersion;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;

@GwtCompatible
/* loaded from: classes2.dex */
public abstract class BaseEncoding {

    /* renamed from: a */
    public static final BaseEncoding f21808a = new Base64Encoding("base64()", Base64Variants.STD_BASE64_ALPHABET, '=');

    /* renamed from: b */
    public static final BaseEncoding f21809b;

    /* renamed from: com.google.common.io.BaseEncoding$1 */
    class C18841 extends ByteSink {
    }

    /* renamed from: com.google.common.io.BaseEncoding$2 */
    class C18852 extends ByteSource {
        @Override // com.google.common.p010io.ByteSource
        /* renamed from: a */
        public InputStream mo12038a() throws IOException {
            throw null;
        }
    }

    /* renamed from: com.google.common.io.BaseEncoding$5 */
    class C18885 extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw null;
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw null;
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            throw null;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Alphabet {

        /* renamed from: a */
        public final String f21816a;

        /* renamed from: b */
        public final char[] f21817b;

        /* renamed from: c */
        public final int f21818c;

        /* renamed from: d */
        public final int f21819d;

        /* renamed from: e */
        public final int f21820e;

        /* renamed from: f */
        public final int f21821f;

        /* renamed from: g */
        public final byte[] f21822g;

        /* renamed from: h */
        public final boolean[] f21823h;

        public Alphabet(String str, char[] cArr) {
            Objects.requireNonNull(str);
            this.f21816a = str;
            Objects.requireNonNull(cArr);
            this.f21817b = cArr;
            try {
                int m12060c = IntMath.m12060c(cArr.length, RoundingMode.UNNECESSARY);
                this.f21819d = m12060c;
                int min = Math.min(8, Integer.lowestOneBit(m12060c));
                try {
                    this.f21820e = 8 / min;
                    this.f21821f = m12060c / min;
                    this.f21818c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c2 = cArr[i2];
                        Preconditions.m11180d(c2 < 128, "Non-ASCII character: %s", c2);
                        Preconditions.m11180d(bArr[c2] == -1, "Duplicate character: %s", c2);
                        bArr[c2] = (byte) i2;
                    }
                    this.f21822g = bArr;
                    boolean[] zArr = new boolean[this.f21820e];
                    for (int i3 = 0; i3 < this.f21821f; i3++) {
                        zArr[IntMath.m12059b(i3 * 8, this.f21819d, RoundingMode.CEILING)] = true;
                    }
                    this.f21823h = zArr;
                } catch (ArithmeticException e2) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e2);
                }
            } catch (ArithmeticException e3) {
                throw new IllegalArgumentException(C0576a.m4111j(35, "Illegal alphabet length ", cArr.length), e3);
            }
        }

        /* renamed from: a */
        public int m12039a(char c2) throws DecodingException {
            if (c2 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c2));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f21822g[c2];
            if (b != -1) {
                return b;
            }
            if (c2 <= ' ' || c2 == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c2));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c2);
            throw new DecodingException(sb.toString());
        }

        /* renamed from: b */
        public boolean m12040b(int i2) {
            return this.f21823h[i2 % this.f21820e];
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof Alphabet) {
                return Arrays.equals(this.f21817b, ((Alphabet) obj).f21817b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f21817b);
        }

        public String toString() {
            return this.f21816a;
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {

        /* renamed from: e */
        public final char[] f21824e;

        public Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.f21824e = new char[RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN];
            Preconditions.m11178b(alphabet.f21817b.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                char[] cArr = this.f21824e;
                char[] cArr2 = alphabet.f21817b;
                cArr[i2] = cArr2[i2 >>> 4];
                cArr[i2 | 256] = cArr2[i2 & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p010io.BaseEncoding
        /* renamed from: b */
        public int mo12029b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Objects.requireNonNull(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException(C0576a.m4111j(32, "Invalid input length ", charSequence.length()));
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequence.length()) {
                bArr[i3] = (byte) ((this.f21828c.m12039a(charSequence.charAt(i2)) << 4) | this.f21828c.m12039a(charSequence.charAt(i2 + 1)));
                i2 += 2;
                i3++;
            }
            return i3;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p010io.BaseEncoding
        /* renamed from: e */
        public void mo12032e(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            Preconditions.m11190n(i2, i2 + i3, bArr.length);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = bArr[i2 + i4] & 255;
                appendable.append(this.f21824e[i5]);
                appendable.append(this.f21824e[i5 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        /* renamed from: l */
        public BaseEncoding mo12041l(Alphabet alphabet, @NullableDecl Character ch) {
            return new Base16Encoding(alphabet);
        }
    }

    public static final class DecodingException extends IOException {
        public DecodingException(String str) {
            super(str);
        }
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {

        /* renamed from: c */
        public final BaseEncoding f21825c;

        /* renamed from: d */
        public final String f21826d;

        /* renamed from: e */
        public final int f21827e;

        public SeparatedBaseEncoding(BaseEncoding baseEncoding, String str, int i2) {
            this.f21825c = baseEncoding;
            this.f21826d = str;
            this.f21827e = i2;
            Preconditions.m11181e(i2 > 0, "Cannot add a separator after every %s chars", i2);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: b */
        public int mo12029b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char charAt = charSequence.charAt(i2);
                if (this.f21826d.indexOf(charAt) < 0) {
                    sb.append(charAt);
                }
            }
            return this.f21825c.mo12029b(bArr, sb);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: e */
        public void mo12032e(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            BaseEncoding baseEncoding = this.f21825c;
            String str = this.f21826d;
            int i4 = this.f21827e;
            Objects.requireNonNull(str);
            Preconditions.m11178b(i4 > 0);
            baseEncoding.mo12032e(new Appendable(i4, appendable, str) { // from class: com.google.common.io.BaseEncoding.4

                /* renamed from: b */
                public int f21812b;

                /* renamed from: c */
                public final /* synthetic */ int f21813c;

                /* renamed from: d */
                public final /* synthetic */ Appendable f21814d;

                /* renamed from: e */
                public final /* synthetic */ String f21815e;

                {
                    this.f21813c = i4;
                    this.f21814d = appendable;
                    this.f21815e = str;
                    this.f21812b = i4;
                }

                @Override // java.lang.Appendable
                public Appendable append(char c2) throws IOException {
                    if (this.f21812b == 0) {
                        this.f21814d.append(this.f21815e);
                        this.f21812b = this.f21813c;
                    }
                    this.f21814d.append(c2);
                    this.f21812b--;
                    return this;
                }

                @Override // java.lang.Appendable
                public Appendable append(@NullableDecl CharSequence charSequence, int i5, int i6) throws IOException {
                    throw new UnsupportedOperationException();
                }

                @Override // java.lang.Appendable
                public Appendable append(@NullableDecl CharSequence charSequence) throws IOException {
                    throw new UnsupportedOperationException();
                }
            }, bArr, i2, i3);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: f */
        public int mo12033f(int i2) {
            return this.f21825c.mo12033f(i2);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: g */
        public int mo12034g(int i2) {
            int mo12034g = this.f21825c.mo12034g(i2);
            return (IntMath.m12059b(Math.max(0, mo12034g - 1), this.f21827e, RoundingMode.FLOOR) * this.f21826d.length()) + mo12034g;
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: h */
        public BaseEncoding mo12035h() {
            return this.f21825c.mo12035h().mo12037j(this.f21826d, this.f21827e);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: i */
        public CharSequence mo12036i(CharSequence charSequence) {
            return this.f21825c.mo12036i(charSequence);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: j */
        public BaseEncoding mo12037j(String str, int i2) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        public String toString() {
            String valueOf = String.valueOf(this.f21825c);
            String str = this.f21826d;
            return C0000a.m18o(C0576a.m4122u(C0576a.m4106e(str, valueOf.length() + 31), valueOf, ".withSeparator(\"", str, "\", "), this.f21827e, ")");
        }
    }

    static {
        new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new StandardBaseEncoding(new Alphabet("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new StandardBaseEncoding(new Alphabet("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        f21809b = new Base16Encoding(new Alphabet("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* renamed from: a */
    public final byte[] m12028a(CharSequence charSequence) {
        try {
            CharSequence mo12036i = mo12036i(charSequence);
            int mo12033f = mo12033f(mo12036i.length());
            byte[] bArr = new byte[mo12033f];
            int mo12029b = mo12029b(bArr, mo12036i);
            if (mo12029b == mo12033f) {
                return bArr;
            }
            byte[] bArr2 = new byte[mo12029b];
            System.arraycopy(bArr, 0, bArr2, 0, mo12029b);
            return bArr2;
        } catch (DecodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* renamed from: b */
    public abstract int mo12029b(byte[] bArr, CharSequence charSequence) throws DecodingException;

    /* renamed from: c */
    public String m12030c(byte[] bArr) {
        return m12031d(bArr, 0, bArr.length);
    }

    /* renamed from: d */
    public final String m12031d(byte[] bArr, int i2, int i3) {
        Preconditions.m11190n(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(mo12034g(i3));
        try {
            mo12032e(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: e */
    public abstract void mo12032e(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    /* renamed from: f */
    public abstract int mo12033f(int i2);

    /* renamed from: g */
    public abstract int mo12034g(int i2);

    /* renamed from: h */
    public abstract BaseEncoding mo12035h();

    /* renamed from: i */
    public CharSequence mo12036i(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return charSequence;
    }

    /* renamed from: j */
    public abstract BaseEncoding mo12037j(String str, int i2);

    /* renamed from: com.google.common.io.BaseEncoding$3 */
    class C18863 extends Reader {

        /* renamed from: b */
        public final /* synthetic */ Reader f21810b;

        /* renamed from: c */
        public final /* synthetic */ String f21811c;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f21810b.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int read;
            do {
                read = this.f21810b.read();
                if (read == -1) {
                    break;
                }
            } while (this.f21811c.indexOf((char) read) >= 0);
            return read;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Base64Encoding extends StandardBaseEncoding {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Base64Encoding(java.lang.String r2, java.lang.String r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Character r4) {
            /*
                r1 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = r0.f21817b
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L15
                r2 = 1
                goto L16
            L15:
                r2 = 0
            L16:
                com.google.common.base.Preconditions.m11178b(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.Base64Encoding.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p010io.BaseEncoding
        /* renamed from: b */
        public int mo12029b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Objects.requireNonNull(bArr);
            CharSequence mo12036i = mo12036i(charSequence);
            if (!this.f21828c.m12040b(mo12036i.length())) {
                throw new DecodingException(C0576a.m4111j(32, "Invalid input length ", mo12036i.length()));
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < mo12036i.length()) {
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                int m12039a = (this.f21828c.m12039a(mo12036i.charAt(i2)) << 18) | (this.f21828c.m12039a(mo12036i.charAt(i4)) << 12);
                int i6 = i3 + 1;
                bArr[i3] = (byte) (m12039a >>> 16);
                if (i5 < mo12036i.length()) {
                    int i7 = i5 + 1;
                    int m12039a2 = m12039a | (this.f21828c.m12039a(mo12036i.charAt(i5)) << 6);
                    i3 = i6 + 1;
                    bArr[i6] = (byte) ((m12039a2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    if (i7 < mo12036i.length()) {
                        i5 = i7 + 1;
                        i6 = i3 + 1;
                        bArr[i3] = (byte) ((m12039a2 | this.f21828c.m12039a(mo12036i.charAt(i7))) & KotlinVersion.MAX_COMPONENT_VALUE);
                    } else {
                        i2 = i7;
                    }
                }
                i3 = i6;
                i2 = i5;
            }
            return i3;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.p010io.BaseEncoding
        /* renamed from: e */
        public void mo12032e(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            int i4 = i2 + i3;
            Preconditions.m11190n(i2, i4, bArr.length);
            while (i3 >= 3) {
                int i5 = i2 + 1;
                int i6 = i5 + 1;
                int i7 = ((bArr[i2] & 255) << 16) | ((bArr[i5] & 255) << 8);
                int i8 = i7 | (bArr[i6] & 255);
                appendable.append(this.f21828c.f21817b[i8 >>> 18]);
                appendable.append(this.f21828c.f21817b[(i8 >>> 12) & 63]);
                appendable.append(this.f21828c.f21817b[(i8 >>> 6) & 63]);
                appendable.append(this.f21828c.f21817b[i8 & 63]);
                i3 -= 3;
                i2 = i6 + 1;
            }
            if (i2 < i4) {
                m12042k(appendable, bArr, i2, i4 - i2);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        /* renamed from: l */
        public BaseEncoding mo12041l(Alphabet alphabet, @NullableDecl Character ch) {
            return new Base64Encoding(alphabet, null);
        }

        public Base64Encoding(Alphabet alphabet, @NullableDecl Character ch) {
            super(alphabet, ch);
            Preconditions.m11178b(alphabet.f21817b.length == 64);
        }
    }

    public static class StandardBaseEncoding extends BaseEncoding {

        /* renamed from: c */
        public final Alphabet f21828c;

        /* renamed from: d */
        @NullableDecl
        public final Character f21829d;

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1 */
        class C18891 extends OutputStream {

            /* renamed from: b */
            public int f21830b;

            /* renamed from: c */
            public int f21831c;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (this.f21831c <= 0) {
                    throw null;
                }
                throw null;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                throw null;
            }

            @Override // java.io.OutputStream
            public void write(int i2) throws IOException {
                int i3 = this.f21830b << 8;
                this.f21830b = i3;
                this.f21830b = (i2 & KotlinVersion.MAX_COMPONENT_VALUE) | i3;
                this.f21831c += 8;
                throw null;
            }
        }

        public StandardBaseEncoding(Alphabet alphabet, @NullableDecl Character ch) {
            Objects.requireNonNull(alphabet);
            this.f21828c = alphabet;
            boolean z = true;
            if (ch != null) {
                char charValue = ch.charValue();
                byte[] bArr = alphabet.f21822g;
                if (charValue < bArr.length && bArr[charValue] != -1) {
                    z = false;
                }
            }
            Preconditions.m11184h(z, "Padding character %s was already in alphabet", ch);
            this.f21829d = ch;
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: b */
        public int mo12029b(byte[] bArr, CharSequence charSequence) throws DecodingException {
            Alphabet alphabet;
            Objects.requireNonNull(bArr);
            CharSequence mo12036i = mo12036i(charSequence);
            if (!this.f21828c.m12040b(mo12036i.length())) {
                throw new DecodingException(C0576a.m4111j(32, "Invalid input length ", mo12036i.length()));
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < mo12036i.length()) {
                long j2 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    alphabet = this.f21828c;
                    if (i4 >= alphabet.f21820e) {
                        break;
                    }
                    j2 <<= alphabet.f21819d;
                    if (i2 + i4 < mo12036i.length()) {
                        j2 |= this.f21828c.m12039a(mo12036i.charAt(i5 + i2));
                        i5++;
                    }
                    i4++;
                }
                int i6 = alphabet.f21821f;
                int i7 = (i6 * 8) - (i5 * alphabet.f21819d);
                int i8 = (i6 - 1) * 8;
                while (i8 >= i7) {
                    bArr[i3] = (byte) ((j2 >>> i8) & 255);
                    i8 -= 8;
                    i3++;
                }
                i2 += this.f21828c.f21820e;
            }
            return i3;
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: e */
        public void mo12032e(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            Preconditions.m11190n(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (i4 < i3) {
                m12042k(appendable, bArr, i2 + i4, Math.min(this.f21828c.f21821f, i3 - i4));
                i4 += this.f21828c.f21821f;
            }
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof StandardBaseEncoding)) {
                return false;
            }
            StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
            return this.f21828c.equals(standardBaseEncoding.f21828c) && com.google.common.base.Objects.m11173a(this.f21829d, standardBaseEncoding.f21829d);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: f */
        public int mo12033f(int i2) {
            return (int) (((this.f21828c.f21819d * i2) + 7) / 8);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: g */
        public int mo12034g(int i2) {
            Alphabet alphabet = this.f21828c;
            return IntMath.m12059b(i2, alphabet.f21821f, RoundingMode.CEILING) * alphabet.f21820e;
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: h */
        public BaseEncoding mo12035h() {
            return this.f21829d == null ? this : mo12041l(this.f21828c, null);
        }

        public int hashCode() {
            return this.f21828c.hashCode() ^ Arrays.hashCode(new Object[]{this.f21829d});
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: i */
        public CharSequence mo12036i(CharSequence charSequence) {
            Objects.requireNonNull(charSequence);
            Character ch = this.f21829d;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.p010io.BaseEncoding
        /* renamed from: j */
        public BaseEncoding mo12037j(String str, int i2) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                Alphabet alphabet = this.f21828c;
                char charAt = str.charAt(i3);
                byte[] bArr = alphabet.f21822g;
                Preconditions.m11184h(!(charAt < bArr.length && bArr[charAt] != -1), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch = this.f21829d;
            if (ch != null) {
                Preconditions.m11184h(str.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new SeparatedBaseEncoding(this, str, i2);
        }

        /* renamed from: k */
        public void m12042k(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            Preconditions.m11190n(i2, i2 + i3, bArr.length);
            int i4 = 0;
            Preconditions.m11178b(i3 <= this.f21828c.f21821f);
            long j2 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                j2 = (j2 | (bArr[i2 + i5] & 255)) << 8;
            }
            int i6 = ((i3 + 1) * 8) - this.f21828c.f21819d;
            while (i4 < i3 * 8) {
                Alphabet alphabet = this.f21828c;
                appendable.append(alphabet.f21817b[((int) (j2 >>> (i6 - i4))) & alphabet.f21818c]);
                i4 += this.f21828c.f21819d;
            }
            if (this.f21829d != null) {
                while (i4 < this.f21828c.f21821f * 8) {
                    appendable.append(this.f21829d.charValue());
                    i4 += this.f21828c.f21819d;
                }
            }
        }

        /* renamed from: l */
        public BaseEncoding mo12041l(Alphabet alphabet, @NullableDecl Character ch) {
            return new StandardBaseEncoding(alphabet, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f21828c.f21816a);
            if (8 % this.f21828c.f21819d != 0) {
                if (this.f21829d == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f21829d);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        /* renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2 */
        class C18902 extends InputStream {

            /* renamed from: b */
            public int f21832b;

            /* renamed from: c */
            public int f21833c;

            /* renamed from: d */
            public int f21834d;

            /* renamed from: e */
            public boolean f21835e;

            /* renamed from: f */
            public final /* synthetic */ Reader f21836f;

            /* renamed from: g */
            public final /* synthetic */ StandardBaseEncoding f21837g;

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f21836f.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                int i2;
                while (true) {
                    int read = this.f21836f.read();
                    if (read == -1) {
                        if (this.f21835e || this.f21837g.f21828c.m12040b(this.f21834d)) {
                            return -1;
                        }
                        throw new DecodingException(C0576a.m4111j(32, "Invalid input length ", this.f21834d));
                    }
                    this.f21834d++;
                    char c2 = (char) read;
                    Character ch = this.f21837g.f21829d;
                    if (ch == null || ch.charValue() != c2) {
                        if (this.f21835e) {
                            int i3 = this.f21834d;
                            StringBuilder sb = new StringBuilder(61);
                            sb.append("Expected padding character but found '");
                            sb.append(c2);
                            sb.append("' at index ");
                            sb.append(i3);
                            throw new DecodingException(sb.toString());
                        }
                        int i4 = this.f21832b;
                        Alphabet alphabet = this.f21837g.f21828c;
                        int i5 = i4 << alphabet.f21819d;
                        this.f21832b = i5;
                        int m12039a = alphabet.m12039a(c2) | i5;
                        this.f21832b = m12039a;
                        int i6 = this.f21833c + this.f21837g.f21828c.f21819d;
                        this.f21833c = i6;
                        if (i6 >= 8) {
                            int i7 = i6 - 8;
                            this.f21833c = i7;
                            return (m12039a >> i7) & KotlinVersion.MAX_COMPONENT_VALUE;
                        }
                    } else if (this.f21835e || ((i2 = this.f21834d) != 1 && this.f21837g.f21828c.m12040b(i2 - 1))) {
                        this.f21835e = true;
                    }
                }
                throw new DecodingException(C0576a.m4111j(41, "Padding cannot start at index ", this.f21834d));
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i4 = i3 + i2;
                Preconditions.m11190n(i2, i4, bArr.length);
                int i5 = i2;
                while (i5 < i4) {
                    int read = read();
                    if (read == -1) {
                        int i6 = i5 - i2;
                        if (i6 == 0) {
                            return -1;
                        }
                        return i6;
                    }
                    bArr[i5] = (byte) read;
                    i5++;
                }
                return i5 - i2;
            }
        }
    }
}
