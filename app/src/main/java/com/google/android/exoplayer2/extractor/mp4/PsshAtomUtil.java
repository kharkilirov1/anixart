package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.KotlinVersion;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public final class PsshAtomUtil {

    public static class PsshAtom {

        /* renamed from: a */
        public final UUID f11271a;

        /* renamed from: b */
        public final int f11272b;

        /* renamed from: c */
        public final byte[] f11273c;

        public PsshAtom(UUID uuid, int i2, byte[] bArr) {
            this.f11271a = uuid;
            this.f11272b = i2;
            this.f11273c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m6524a(UUID uuid, @Nullable byte[] bArr) {
        return m6525b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m6525b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    @Nullable
    /* renamed from: c */
    public static PsshAtom m6526c(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        if (parsableByteArray.f14700c < 32) {
            return null;
        }
        parsableByteArray.m7635F(0);
        if (parsableByteArray.m7642f() != parsableByteArray.m7637a() + 4 || parsableByteArray.m7642f() != 1886614376) {
            return null;
        }
        int m7642f = (parsableByteArray.m7642f() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
        if (m7642f > 1) {
            C0576a.m4123v(37, "Unsupported pssh version: ", m7642f, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(parsableByteArray.m7650n(), parsableByteArray.m7650n());
        if (m7642f == 1) {
            parsableByteArray.m7636G(parsableByteArray.m7660x() * 16);
        }
        int m7660x = parsableByteArray.m7660x();
        if (m7660x != parsableByteArray.m7637a()) {
            return null;
        }
        byte[] bArr2 = new byte[m7660x];
        System.arraycopy(parsableByteArray.f14698a, parsableByteArray.f14699b, bArr2, 0, m7660x);
        parsableByteArray.f14699b += m7660x;
        return new PsshAtom(uuid, m7642f, bArr2);
    }

    @Nullable
    /* renamed from: d */
    public static byte[] m6527d(byte[] bArr, UUID uuid) {
        PsshAtom m6526c = m6526c(bArr);
        if (m6526c == null) {
            return null;
        }
        if (uuid.equals(m6526c.f11271a)) {
            return m6526c.f11273c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(m6526c.f11271a);
        StringBuilder m4122u = C0576a.m4122u(valueOf2.length() + valueOf.length() + 33, "UUID mismatch. Expected: ", valueOf, ", got: ", valueOf2);
        m4122u.append(".");
        Log.w("PsshAtomUtil", m4122u.toString());
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static UUID m6528e(byte[] bArr) {
        PsshAtom m6526c = m6526c(bArr);
        if (m6526c == null) {
            return null;
        }
        return m6526c.f11271a;
    }

    /* renamed from: f */
    public static int m6529f(byte[] bArr) {
        PsshAtom m6526c = m6526c(bArr);
        if (m6526c == null) {
            return -1;
        }
        return m6526c.f11272b;
    }
}
