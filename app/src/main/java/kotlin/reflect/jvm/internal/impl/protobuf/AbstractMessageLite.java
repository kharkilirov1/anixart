package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes3.dex */
public abstract class AbstractMessageLite implements MessageLite {

    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        @Override // 
        /* renamed from: g */
        public abstract BuilderType mo32986k();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        public static final class LimitedInputStream extends FilterInputStream {

            /* renamed from: b */
            public int f65616b;

            public LimitedInputStream(InputStream inputStream, int i2) {
                super(inputStream);
                this.f65616b = i2;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.f65616b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f65616b <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f65616b--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j2) throws IOException {
                long skip = super.skip(Math.min(j2, this.f65616b));
                if (skip >= 0) {
                    this.f65616b = (int) (this.f65616b - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i2, int i3) throws IOException {
                int i4 = this.f65616b;
                if (i4 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i2, Math.min(i3, i4));
                if (read >= 0) {
                    this.f65616b -= read;
                }
                return read;
            }
        }
    }
}
