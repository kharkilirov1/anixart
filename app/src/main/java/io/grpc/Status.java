package io.grpc;

import com.google.common.base.Charsets;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import io.grpc.Metadata;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import p000a.C0000a;

@CheckReturnValue
@Immutable
/* loaded from: classes3.dex */
public final class Status {

    /* renamed from: d */
    public static final List<Status> f58277d;

    /* renamed from: e */
    public static final Status f58278e;

    /* renamed from: f */
    public static final Status f58279f;

    /* renamed from: g */
    public static final Status f58280g;

    /* renamed from: h */
    public static final Status f58281h;

    /* renamed from: i */
    public static final Status f58282i;

    /* renamed from: j */
    public static final Status f58283j;

    /* renamed from: k */
    public static final Status f58284k;

    /* renamed from: l */
    public static final Status f58285l;

    /* renamed from: m */
    public static final Status f58286m;

    /* renamed from: n */
    public static final Status f58287n;

    /* renamed from: o */
    public static final Metadata.Key<Status> f58288o;

    /* renamed from: p */
    public static final Metadata.TrustedAsciiMarshaller<String> f58289p;

    /* renamed from: q */
    public static final Metadata.Key<String> f58290q;

    /* renamed from: a */
    public final Code f58291a;

    /* renamed from: b */
    public final String f58292b;

    /* renamed from: c */
    public final Throwable f58293c;

    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: b */
        public final int f58312b;

        /* renamed from: c */
        public final byte[] f58313c;

        Code(int i2) {
            this.f58312b = i2;
            this.f58313c = Integer.toString(i2).getBytes(Charsets.f20502a);
        }

        /* renamed from: a */
        public Status m30948a() {
            return Status.f58277d.get(this.f58312b);
        }
    }

    public static final class StatusCodeMarshaller implements Metadata.TrustedAsciiMarshaller<Status> {
        public StatusCodeMarshaller() {
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        /* renamed from: a */
        public byte[] mo30918a(Status status) {
            return status.f58291a.f58313c;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        /* renamed from: b */
        public Status mo30919b(byte[] bArr) {
            int i2;
            List<Status> list = Status.f58277d;
            char c2 = 1;
            if (bArr.length == 1 && bArr[0] == 48) {
                return Status.f58278e;
            }
            int length = bArr.length;
            if (length != 1) {
                i2 = (length == 2 && bArr[0] >= 48 && bArr[0] <= 57) ? 0 + ((bArr[0] - 48) * 10) : 0;
                Status status = Status.f58280g;
                StringBuilder m24u = C0000a.m24u("Unknown code ");
                m24u.append(new String(bArr, Charsets.f20502a));
                return status.m30947g(m24u.toString());
            }
            c2 = 0;
            if (bArr[c2] >= 48 && bArr[c2] <= 57) {
                int i3 = (bArr[c2] - 48) + i2;
                List<Status> list2 = Status.f58277d;
                if (i3 < list2.size()) {
                    return list2.get(i3);
                }
            }
            Status status2 = Status.f58280g;
            StringBuilder m24u2 = C0000a.m24u("Unknown code ");
            m24u2.append(new String(bArr, Charsets.f20502a));
            return status2.m30947g(m24u2.toString());
        }

        public StatusCodeMarshaller(C63131 c63131) {
        }
    }

    public static final class StatusMessageMarshaller implements Metadata.TrustedAsciiMarshaller<String> {

        /* renamed from: a */
        public static final byte[] f58314a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};

        public StatusMessageMarshaller() {
        }

        /* renamed from: c */
        public static boolean m30949c(byte b) {
            return b < 32 || b >= 126 || b == 37;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        /* renamed from: a */
        public byte[] mo30918a(String str) {
            byte[] bytes = str.getBytes(Charsets.f20504c);
            int i2 = 0;
            while (i2 < bytes.length) {
                if (m30949c(bytes[i2])) {
                    byte[] bArr = new byte[((bytes.length - i2) * 3) + i2];
                    if (i2 != 0) {
                        System.arraycopy(bytes, 0, bArr, 0, i2);
                    }
                    int i3 = i2;
                    while (i2 < bytes.length) {
                        byte b = bytes[i2];
                        if (m30949c(b)) {
                            bArr[i3] = 37;
                            byte[] bArr2 = f58314a;
                            bArr[i3 + 1] = bArr2[(b >> 4) & 15];
                            bArr[i3 + 2] = bArr2[b & 15];
                            i3 += 3;
                        } else {
                            bArr[i3] = b;
                            i3++;
                        }
                        i2++;
                    }
                    return Arrays.copyOf(bArr, i3);
                }
                i2++;
            }
            return bytes;
        }

        @Override // io.grpc.Metadata.TrustedAsciiMarshaller
        /* renamed from: b */
        public String mo30919b(byte[] bArr) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                byte b = bArr[i2];
                if (b < 32 || b >= 126 || (b == 37 && i2 + 2 < bArr.length)) {
                    ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                    int i3 = 0;
                    while (i3 < bArr.length) {
                        if (bArr[i3] == 37 && i3 + 2 < bArr.length) {
                            try {
                                allocate.put((byte) Integer.parseInt(new String(bArr, i3 + 1, 2, Charsets.f20502a), 16));
                                i3 += 3;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        allocate.put(bArr[i3]);
                        i3++;
                    }
                    return new String(allocate.array(), 0, allocate.position(), Charsets.f20504c);
                }
            }
            return new String(bArr, 0);
        }

        public StatusMessageMarshaller(C63131 c63131) {
        }
    }

    static {
        Boolean.parseBoolean(System.getProperty("io.grpc.Status.failOnEqualsForTest", "false"));
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.f58312b), new Status(code));
            if (status != null) {
                StringBuilder m24u = C0000a.m24u("Code value duplication between ");
                m24u.append(status.f58291a.name());
                m24u.append(" & ");
                m24u.append(code.name());
                throw new IllegalStateException(m24u.toString());
            }
        }
        f58277d = Collections.unmodifiableList(new ArrayList(treeMap.values()));
        f58278e = Code.OK.m30948a();
        f58279f = Code.CANCELLED.m30948a();
        f58280g = Code.UNKNOWN.m30948a();
        Code.INVALID_ARGUMENT.m30948a();
        f58281h = Code.DEADLINE_EXCEEDED.m30948a();
        Code.NOT_FOUND.m30948a();
        Code.ALREADY_EXISTS.m30948a();
        f58282i = Code.PERMISSION_DENIED.m30948a();
        f58283j = Code.UNAUTHENTICATED.m30948a();
        f58284k = Code.RESOURCE_EXHAUSTED.m30948a();
        Code.FAILED_PRECONDITION.m30948a();
        Code.ABORTED.m30948a();
        Code.OUT_OF_RANGE.m30948a();
        f58285l = Code.UNIMPLEMENTED.m30948a();
        f58286m = Code.INTERNAL.m30948a();
        f58287n = Code.UNAVAILABLE.m30948a();
        Code.DATA_LOSS.m30948a();
        f58288o = Metadata.Key.m30915b("grpc-status", false, new StatusCodeMarshaller(null));
        StatusMessageMarshaller statusMessageMarshaller = new StatusMessageMarshaller(null);
        f58289p = statusMessageMarshaller;
        f58290q = Metadata.Key.m30915b("grpc-message", false, statusMessageMarshaller);
    }

    public Status(Code code) {
        this.f58291a = code;
        this.f58292b = null;
        this.f58293c = null;
    }

    /* renamed from: b */
    public static String m30941b(Status status) {
        if (status.f58292b == null) {
            return status.f58291a.toString();
        }
        return status.f58291a + ": " + status.f58292b;
    }

    /* renamed from: c */
    public static Status m30942c(int i2) {
        if (i2 >= 0) {
            List<Status> list = f58277d;
            if (i2 <= list.size()) {
                return list.get(i2);
            }
        }
        return f58280g.m30947g("Unknown code " + i2);
    }

    /* renamed from: d */
    public static Status m30943d(Throwable th) {
        Preconditions.m11187k(th, "t");
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).f58315b;
            }
            if (th2 instanceof StatusRuntimeException) {
                return ((StatusRuntimeException) th2).f58318b;
            }
        }
        return f58280g.m30946f(th);
    }

    /* renamed from: a */
    public Status m30944a(String str) {
        return str == null ? this : this.f58292b == null ? new Status(this.f58291a, str, this.f58293c) : new Status(this.f58291a, C0000a.m21r(new StringBuilder(), this.f58292b, "\n", str), this.f58293c);
    }

    /* renamed from: e */
    public boolean m30945e() {
        return Code.OK == this.f58291a;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public Status m30946f(Throwable th) {
        return Objects.m11173a(this.f58293c, th) ? this : new Status(this.f58291a, this.f58292b, th);
    }

    /* renamed from: g */
    public Status m30947g(String str) {
        return Objects.m11173a(this.f58292b, str) ? this : new Status(this.f58291a, str, this.f58293c);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("code", this.f58291a.name());
        m11166b.m11171e("description", this.f58292b);
        Throwable th = this.f58293c;
        Object obj = th;
        if (th != null) {
            Object obj2 = Throwables.f20605a;
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        m11166b.m11171e("cause", obj);
        return m11166b.toString();
    }

    public Status(Code code, @Nullable String str, @Nullable Throwable th) {
        Preconditions.m11187k(code, "code");
        this.f58291a = code;
        this.f58292b = str;
        this.f58293c = th;
    }
}
