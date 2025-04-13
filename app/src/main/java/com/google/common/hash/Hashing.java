package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;
import java.util.Objects;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
/* loaded from: classes.dex */
public final class Hashing {

    /* renamed from: a */
    public static final int f21780a = (int) System.currentTimeMillis();

    @Immutable
    public enum ChecksumType implements ImmutableSupplier<Checksum> {
        CRC_32("Hashing.crc32()") { // from class: com.google.common.hash.Hashing.ChecksumType.1
            @Override // com.google.common.base.Supplier
            public Object get() {
                return new CRC32();
            }
        },
        ADLER_32("Hashing.adler32()") { // from class: com.google.common.hash.Hashing.ChecksumType.2
            @Override // com.google.common.base.Supplier
            public Object get() {
                return new Adler32();
            }
        };

        ChecksumType(String str) {
            new ChecksumHashFunction(this, 32, str);
        }
    }

    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ConcatenatedHashFunction)) {
                return false;
            }
            Objects.requireNonNull((ConcatenatedHashFunction) obj);
            return Arrays.equals((Object[]) null, (Object[]) null);
        }

        public int hashCode() {
            return Arrays.hashCode((Object[]) null);
        }
    }

    public static final class LinearCongruentialGenerator {
    }

    public static class Md5Holder {
        static {
            new MessageDigestHashFunction("MD5", "Hashing.md5()");
        }
    }

    public static class Sha1Holder {
        static {
            new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
        }
    }

    public static class Sha256Holder {
        static {
            new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
        }
    }

    public static class Sha384Holder {
        static {
            new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
        }
    }

    public static class Sha512Holder {
        static {
            new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
        }
    }
}
